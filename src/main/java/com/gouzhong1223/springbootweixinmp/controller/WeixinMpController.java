package com.gouzhong1223.springbootweixinmp.controller;

import com.alibaba.fastjson.JSON;
import com.gouzhong1223.springbootweixinmp.pojo.Xml;
import com.gouzhong1223.springbootweixinmp.pojo.XmlObject;
import com.gouzhong1223.springbootweixinmp.util.CheckStringUrlUtil;
import com.gouzhong1223.springbootweixinmp.util.XsteamUtil;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 微信请求接口
 * @Date : create by QingSong in 2019-12-25 12:57 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
@Controller
@RequestMapping(value = "api")
public class WeixinMpController {

    @RequestMapping(value = "weixinmp", method = RequestMethod.GET)
    @ResponseBody
    public String checkUrl(String signature, String timestamp, String nonce, String echostr) {
        if (CheckStringUrlUtil.sort(signature, timestamp, nonce)) {
            return echostr;
        }
        return null;
    }

    @PostMapping(value = "weixinmp")
    @ResponseBody
    public String reciveMessage(@RequestBody String xml) {
        JSONObject jsonObject = XML.toJSONObject(xml);
        com.alibaba.fastjson.JSONObject newjsonobject = com.alibaba.fastjson.JSONObject.parseObject(jsonObject.toString());
        Xml message = JSON.toJavaObject(newjsonobject, XmlObject.class).getXml();
        Xml returnmessage = new Xml();
        returnmessage.setCreateTime((int) System.currentTimeMillis());
        returnmessage.setFromUserName(message.getToUserName());
        returnmessage.setToUserName(message.getFromUserName());
        returnmessage.setMsgId(1);
        returnmessage.setMsgType("text");
        returnmessage.setContent("baci");
        return XsteamUtil.convertToXml(returnmessage);
    }
}
