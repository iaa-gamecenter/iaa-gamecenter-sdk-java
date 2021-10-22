package com.gamecenter.ig.util;

import com.gamecenter.ig.bean.SignType;

import java.util.Map;
import static com.gamecenter.ig.util.SignTextUtil.parameterText;
import static com.gamecenter.ig.util.SignTextUtil.getMD5;

/**
 * @author zhufeng02
 */
public class SignUtil implements SignType
{

    @Override
    public  String createSign(String appId, String appKey, Map<String,Object> characterEncoding) {
        String hashed = "";
        try {
            hashed = getMD5(parameterText(appId,appKey,characterEncoding));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashed;
    }
}
