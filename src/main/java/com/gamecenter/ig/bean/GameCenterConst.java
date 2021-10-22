package com.gamecenter.ig.bean;

public class GameCenterConst
{
    public static final String SIGN = "sign";

    /**
     * 正式环境URL
     */
    public static final String HTTPS_URL = "https://api.iggrowth.cn";
    /**
     * 获取登录信息
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_account?id=ticket%e8%8e%b7%e5%8f%96%e6%96%b9%e5%bc%8f
     */
    public static final String User_Ticket = "/x/open/user/ticket";
    /**
     * 增加金币
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_coin?id=%e5%a2%9e%e5%8a%a0%e9%87%91%e5%b8%81
     */
    public static final String Add_Coin = "/x/open/coin/add";
    /**
     * 扣减金币
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_coin?id=%e6%89%a3%e5%87%8f%e9%87%91%e5%b8%81
     */
    public static final String Sub_Coin = "/x/open/coin/sub";
    /**
     * 查询金币
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_coin?id=%e6%9f%a5%e8%af%a2%e9%87%91%e5%b8%81
     */
    public static final String Balance_Coin = "/x/open/coin/balance";
    /**
     * 设备信息查询【判断该用户是否是负毛利用户】
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_device_info
     */
    public static final String DeviceInfo_Query = "/x/open/deviceinfo/query";
    /**
     * 用户绑定信息及支持的提现方式查询
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_withdraw?id=show_withdraw
     */
    public static final String Show_Withdraw ="/x/gapp/withdraw/show";
    /**
     * 提现下单接口
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_withdraw?id=do_withdraw
     */
    public static final String Create_Withdraw ="/x/gapp/withdraw/create";
    /**
     * 查询提现订单接口
     * http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_withdraw?id=%e6%9f%a5%e8%af%a2%e6%8f%90%e7%8e%b0%e8%ae%a2%e5%8d%95%e6%8e%a5%e5%8f%a3
     */
    public static final String Query_Withdraw ="/x/gapp/withdraw/query";


}
