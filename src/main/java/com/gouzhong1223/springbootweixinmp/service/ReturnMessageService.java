package com.gouzhong1223.springbootweixinmp.service;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 消息服务接口
 * @Date : create by QingSong in 2019-12-26 3:00 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
public interface ReturnMessageService {
    /**
     * 接收消息并组装返回的xml消息
     *
     * @param xml 接收到的xml消息
     * @return 组装好的需要返回的xml
     */
    String reciveMessage(String xml);
}
