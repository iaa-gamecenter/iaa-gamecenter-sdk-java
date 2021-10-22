package com.gamecenter.ig.api;

/**
 * @author zhufeng02
 */
public class GameCenterConfigStorage
{
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    private String appId;


    private String appKey;
}
