package com.gamecenter.ig.api;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.gamecenter.ig.bean.CreateWithDrawVo;
import com.gamecenter.ig.util.HttpUtil;
import com.gamecenter.ig.util.SignUtil;
import com.gamecenter.ig.util.DateUtil;
import com.gamecenter.ig.util.StringUtil;

import static com.gamecenter.ig.bean.GameCenterConst.*;

/**
 * @author zhufeng02
 */
public class GameCenterService
{

    protected GameCenterConfigStorage gameCenterConfigStorage;


    /**
     * @desc 设置参数存储
     * @param gameCenterConfig
     */
    public void setGameCenterConfigStorage(GameCenterConfigStorage gameCenterConfig){
       this.gameCenterConfigStorage = gameCenterConfig;
    }

    /**
     * 生成并设置签名
     *
     * @param parameters 请求参数
     * @return 请求参数
     */
    protected Map<String, Object> setSign(Map<String, Object> parameters) {
        SignUtil signUtil = new SignUtil();
        String sign = signUtil.createSign(this.gameCenterConfigStorage.getAppId(),this.gameCenterConfigStorage.getAppKey(),parameters);

        parameters.put(SIGN, sign);
        return parameters;
    }


    /**
     * 获取openId相关信息
     *
     * @param platform 平台标示 (游戏app登录返回信息中获取)
     * @param ticket   获取用户信息临时标识，24小时有效(游戏app登录返回信息中获取)
     * @return
     */
    public JSONObject GetTicket(String platform, String ticket){
        Map<String,Object> params = new HashMap<String,Object>();

        params.put("platform",platform);
        params.put("ticket",ticket);
        params.put("time", DateUtil.getTimeUnix());

        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doGet(HTTPS_URL+User_Ticket,parameter);
    }


    /**
     * 增加金币
     *
     * @param openId  用户在当前项目内的唯一标示
     * @param coinNum 增加金币数目
     * @param tradeNo 订单号
     * @return
     */
    public JSONObject AddCoin(String openId,Integer coinNum,String tradeNo){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("open_id",openId);
        params.put("coin_num",coinNum);
        params.put("trade_no",tradeNo);
        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doPost(HTTPS_URL+Add_Coin,parameter);
    }

    /**
     * 扣减金币
     *
     * @param openId  用户在当前项目内的唯一标示
     * @param coinNum 扣减金币数目
     * @param tradeNo 订单号
     * @return
     */
    public JSONObject SubCoin(String openId,Integer coinNum,String tradeNo){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("open_id",openId);
        params.put("coin_num",coinNum);
        params.put("trade_no",tradeNo);
        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doPost(HTTPS_URL+Sub_Coin,parameter);
    }

    /**
     * 查询金币
     *
     * @param openId 用户在当前项目内的唯一标示
     * @return
     */
    public JSONObject BalanceCoin(String openId){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("open_id",openId);
        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doPost(HTTPS_URL+Balance_Coin,parameter);
    }


    /**
     * 设备信息查询【判断该用户是否是负毛利用户】
     *
     * @param tuid sdk获取的tuid值(设备标识)
     * @return
     */
    public JSONObject QueryDeviceInfo(String tuid){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("tuid",tuid);
        params.put("timestamp", DateUtil.getTimeUnix());
        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doGet(HTTPS_URL+DeviceInfo_Query,parameter);

    }

    /**
     * 用户绑定信息及支持的提现方式查询
     *
     * @param openId
     * @return
     */
    public JSONObject ShowWithDraw(String openId){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("open_id",openId);
        params.put("timestamp", DateUtil.getTimeUnix());
        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doPost(HTTPS_URL+Show_Withdraw,parameter);
    }

    /**
     * 提现下单接口
     *
     * @param createWithDrawVo
     * @return
     */
    public JSONObject CreateWithDraw(CreateWithDrawVo createWithDrawVo){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("open_id", createWithDrawVo.getOpenId());
        params.put("amount",createWithDrawVo.getAmount());
        params.put("ship_delay",createWithDrawVo.getShipDelay());
        params.put("notify_url",createWithDrawVo.getNotifyUrl());
        params.put("tk",createWithDrawVo.getTk());
        params.put("tuid",createWithDrawVo.getTuid());
        params.put("tp_way",createWithDrawVo.getTpWay());
        params.put("cp_order_no",createWithDrawVo.getCpOrderNo());
        if (StringUtil.isEmpty(createWithDrawVo.getRemark())){
            params.put("remark",createWithDrawVo.getRemark());
        }
        params.put("timestamp", DateUtil.getTimeUnix());
        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doPost(HTTPS_URL+Create_Withdraw,parameter);
    }


    /**
     * 查询提现订单接口
     *
     * @param openId      用户在当前项目内的唯一标示
     * @param orderNo     游戏中心的订单id（与cp_order_no必须要有一个，优先传order_no字段）
     * @param cpOrderNo   游戏方的订单id（与order_no必须要有一个），使用cp_order_no查询最多支持近2个月的查询
     * @return
     */
    public JSONObject QueryWithDraw(String openId,String orderNo,String cpOrderNo){
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("open_id", openId);
        params.put("order_no",orderNo);
        params.put("cp_order_no",cpOrderNo);
        params.put("timestamp", DateUtil.getTimeUnix());
        Map<String,Object> parameter =  setSign(params);

        return HttpUtil.doPost(HTTPS_URL+Query_Withdraw,parameter);
    }

}
