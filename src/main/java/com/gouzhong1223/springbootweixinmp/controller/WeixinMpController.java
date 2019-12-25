package com.gouzhong1223.springbootweixinmp.controller;

import com.gouzhong1223.springbootweixinmp.util.CheckStringUrlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
@RequestMapping(value = "weixinmp")
public class WeixinMpController {

    @RequestMapping(value = "checkurl", method = RequestMethod.GET)
    @ResponseBody
    public String checkUrl(String signature, String timestamp, String nonce, String echostr) {
        if (CheckStringUrlUtil.sort(signature, timestamp, nonce)) {
            return echostr;
        }
        return null;
    }
}
