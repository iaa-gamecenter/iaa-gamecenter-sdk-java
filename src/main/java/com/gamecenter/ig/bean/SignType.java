package com.gamecenter.ig.bean;

import java.util.*;

/**
 * @author zhufeng02
 */
public interface SignType
{



    /**
     * 签名
     * @param appId
     * @param appKey
     * @param characterEncoding 加密参数
     * @return 签名值
     */
    String createSign(String appId, String appKey, Map<String,Object> characterEncoding);
}
