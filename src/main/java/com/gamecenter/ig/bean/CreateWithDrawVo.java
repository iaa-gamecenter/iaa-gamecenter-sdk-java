package com.gamecenter.ig.bean;

/**
 * @author zhufeng02
 */
public class CreateWithDrawVo
{
    /**
     * 用户在当前项目内的唯一标示
     */
    private String OpenId;
    /**
     * 打款金额，单位：分
     */
    private Integer Amount;
    /**
     * 延迟打款时间，单位秒，至少传1，否则会报参数错误
     */
    private Integer ShipDelay;
    /**
     * 回调url，具体解释在http://dev.iggrowth.cn/sdk/docs/index.html#/server/api_withdraw?id=show_withdraw
     */
    private String NotifyUrl;
    /**
     * 客户端从sdk获取的tk值
     */
    private String Tk;
    /**
     * 客户端从sdk获取的tuid值
     */
    private String Tuid;
    /**
     * 提现方式，20000:微信 20001:支付宝
     */
    private String TpWay;
    /**
     * 游戏方的订单id，需要保证唯一
     */
    private String CpOrderNo;
    /**
     * 游戏方需要回传的信息
     */
    private String Remark;

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String openId) {
        OpenId = openId;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public Integer getShipDelay() {
        return ShipDelay;
    }

    public void setShipDelay(Integer shipDelay) {
        ShipDelay = shipDelay;
    }

    public String getNotifyUrl() {
        return NotifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        NotifyUrl = notifyUrl;
    }

    public String getTk() {
        return Tk;
    }

    public void setTk(String tk) {
        Tk = tk;
    }

    public String getTuid() {
        return Tuid;
    }

    public void setTuid(String tuid) {
        Tuid = tuid;
    }

    public String getTpWay() {
        return TpWay;
    }

    public void setTpWay(String tpWay) {
        TpWay = tpWay;
    }

    public String getCpOrderNo() {
        return CpOrderNo;
    }

    public void setCpOrderNo(String cpOrderNo) {
        CpOrderNo = cpOrderNo;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }




}
