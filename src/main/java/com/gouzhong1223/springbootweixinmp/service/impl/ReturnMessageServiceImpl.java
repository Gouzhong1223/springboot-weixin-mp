package com.gouzhong1223.springbootweixinmp.service.impl;

import com.alibaba.fastjson.JSON;
import com.gouzhong1223.springbootweixinmp.pojo.Message;
import com.gouzhong1223.springbootweixinmp.pojo.XmlObject;
import com.gouzhong1223.springbootweixinmp.service.ReturnMessageService;
import com.gouzhong1223.springbootweixinmp.service.UserService;
import com.gouzhong1223.springbootweixinmp.util.XsteamUtil;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 消息服务实现类
 * @Date : create by QingSong in 2019-12-26 3:00 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
@Service
public class ReturnMessageServiceImpl implements ReturnMessageService {

    @Autowired
    private UserService userService;

    @Override
    public String reciveMessage(String xml) {
        JSONObject jsonObject = XML.toJSONObject(xml);
        com.alibaba.fastjson.JSONObject newjsonobject = com.alibaba.fastjson.JSONObject.parseObject(jsonObject.toString());
        Message message = JSON.toJavaObject(newjsonobject, XmlObject.class).getXml();
        Message returnmessage = new Message();
        returnmessage.setCreateTime((int) System.currentTimeMillis());
        returnmessage.setFromUserName(message.getToUserName());
        returnmessage.setToUserName(message.getFromUserName());
        returnmessage.setMsgId(1);
        returnmessage.setMsgType("text");
        if ("时间".equals(message.getContent())) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
            String format = simpleDateFormat.format(new Date());
            returnmessage.setContent("你好，现在的时间是：" + format);
            return XsteamUtil.convertToXml(returnmessage);
        }
        returnmessage.setContent("你好，你的token是" + message.getFromUserName());
        return XsteamUtil.convertToXml(returnmessage);
    }

}
