package com.gamecenter.ig.util;

public class DateUtil
{
    /**
     * @desc 获取时间戳
     * @return
     */
    public static String getTimeUnix(){
        return Long.toString(System.currentTimeMillis()/1000);
    }
}
