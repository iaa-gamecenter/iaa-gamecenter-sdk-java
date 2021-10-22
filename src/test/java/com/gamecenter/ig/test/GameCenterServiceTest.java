package com.gamecenter.ig.test;

import com.alibaba.fastjson.JSONObject;
import com.gamecenter.ig.api.GameCenterConfigStorage;
import com.gamecenter.ig.api.GameCenterService;
import com.gamecenter.ig.bean.CreateWithDrawVo;

public class GameCenterServiceTest
{
    public static void  main(String[] args){
        GameCenterConfigStorage gameCenterConfigStorage = new GameCenterConfigStorage();
        gameCenterConfigStorage.setAppId("13213");
        //gameCenterConfigStorage.setAppId("a4kZXqXgwEC1");
        gameCenterConfigStorage.setAppKey("123123");
        //gameCenterConfigStorage.setAppKey("YeNtPCJFuCgeNQFQPCEIPWIlUlq8sjptMlrNQQvClwFCDzlC2mK9Tgl1QnbQtc2F");
        GameCenterService gameCenterService = new GameCenterService();
        gameCenterService.setGameCenterConfigStorage(gameCenterConfigStorage);
        //JSONObject test = gameCenterService.GetTicket("gapp","t11YhiH9md2Vk22hXkCmd");
        //JSONObject test1 = gameCenterService.AddCoin("u11YfBiAp2DPJHHAC5JMd",11,"test"+ DateUtil.getTimeUnix());
        //JSONObject test1 = gameCenterService.BalanceCoin("u11YfBiAp2DPJHHAC5JMd");
        //JSONObject test1 = gameCenterService.SubCoin("u11YfBiAp2DPJHHAC5JMd",11,"test"+ DateUtil.getTimeUnix());
        //JSONObject test1 = gameCenterService.QueryDeviceInfo("u11YfBiAp2DPJHHAC5JMd");
        //JSONObject test1 = gameCenterService.ShowWithDraw("u11YfBiAp2DPJHHAC5JMd");
        //JSONObject test1 = gameCenterService.QueryWithDraw("u11YfeuCWacpBqXkQ9aZD","20210929-1527534111-11Yfeur6EEhgQtnr8mUj","aa7cd627ee2a4f62b4aa095015ea234d");
        CreateWithDrawVo createWithDrawVo = new CreateWithDrawVo();
        createWithDrawVo.setOpenId("u11YfBiAp2DPJHHAC5JMd");
        createWithDrawVo.setAmount(30);
        createWithDrawVo.setCpOrderNo("aa7cd627ee2a4f62b4aa095015ea234d11323");
        createWithDrawVo.setNotifyUrl("ndb");
        createWithDrawVo.setTpWay("2000");
        createWithDrawVo.setTuid("FZvp3SDtjETPSXBmRi1nMg");
        createWithDrawVo.setTk("ACEVm-ndIO2MRM9JcGZGLWcyXx9NZf7baz5pZ3dkZHl5");
        createWithDrawVo.setRemark("test");
        createWithDrawVo.setShipDelay(1);
        JSONObject test1 = gameCenterService.CreateWithDraw(createWithDrawVo);
        System.out.println(test1);
    }
}
