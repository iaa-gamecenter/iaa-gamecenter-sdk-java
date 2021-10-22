package com.gamecenter.ig.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author zhufeng02
 */
public final class SignTextUtil
{
    /**
     * @desc  拼接加密字符串
     * @param appId
     * @param appKey
     * @param val
     * @return
     */
    public static String parameterText(String appId, String appKey, Map<String,Object> val){
        val.put("app_id",appId);
        val.remove("sign");
        val.put("app_key", appKey);
        ArrayList<String> keys = new ArrayList<>();
        for (String key : val.keySet()) {
            keys.add(key);
        }
        keys.sort(new Comparator<String>() {
            @Override
            public int compare(String l,String r) {
                int i = l.compareTo(r);
                if (i>0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        String r = "";
        String hashed = "";
        for (String i : keys) {
            r += i+val.get(i);
        }

        return r;
    }

    /**
     * @desc md5签名
     * @param need2Encode
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String getMD5(String need2Encode) throws NoSuchAlgorithmException {
        byte[] buf = need2Encode.getBytes();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(buf);
        byte[] tmp = md5.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : tmp) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
}
