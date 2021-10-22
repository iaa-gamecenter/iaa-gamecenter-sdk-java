# 简介
iaa-gamecenter-sdk是IG服务对外提供的GO版本的接入包，目标是让业务方在接入IG服务时候像调用本地服务方法一样简单，而且集成了熔断，重试等能力，以提升也业务方接入效率。
# 特性
- 不依赖任何 mvc 框架，依赖极少:httpclient，fastjson,log4j,com.google.zxing，项目精简，不用担心项目迁移问题
- 也不依赖 servlet，仅仅作为工具使用，可轻松嵌入到任何系统里
- 简单快速完成业务对接
# 平台文档
- 平台相关文档（https://dev.iggrowth.cn/sdk/docs/index.html#/server/README）
# 开发注意事项
- 必填项  --- 必填项如果为空，会报参数校验错误。
- 开发对接，有问题请联系对应商务运营，游戏的 app_id （渠道参数）和通信的 app_key （加密参数）可通过开放平台自主获取
- 超时和重试默认值 ---超时和重试定义上有备注默认值的，一般来说无需修改，可以不做任何传参修改的。方法级别的配置比初始化中的配置优先级更高。
# 上线注意事项
-  业务方接入注意做好灰度验收。
-  业务方注意超时和重试等默认配置是否合适
# 接入API案例
```aidl
        GameCenterConfigStorage gameCenterConfigStorage = new GameCenterConfigStorage();
        //初始化appId和appKey
        gameCenterConfigStorage.setAppId("13213");
        gameCenterConfigStorage.setAppKey("123123");
        GameCenterService gameCenterService = new GameCenterService();
        gameCenterService.setGameCenterConfigStorage(gameCenterConfigStorage);
        //请求创建订单
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
        
```