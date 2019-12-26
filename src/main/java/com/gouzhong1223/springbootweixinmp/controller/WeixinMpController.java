package com.gouzhong1223.springbootweixinmp.controller;

import com.gouzhong1223.springbootweixinmp.service.ReturnMessageService;
import com.gouzhong1223.springbootweixinmp.service.UserService;
import com.gouzhong1223.springbootweixinmp.util.CheckStringUrlUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ReturnMessageService returnMessageService;

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
        if (StringUtils.isNotEmpty(xml)) {
            return returnMessageService.reciveMessage(xml);
        }
        return null;
    }
}
