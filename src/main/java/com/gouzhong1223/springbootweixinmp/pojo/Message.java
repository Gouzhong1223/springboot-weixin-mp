package com.gouzhong1223.springbootweixinmp.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 消息实体类
 * @Date : create by QingSong in 2019-12-25 2:10 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
@ApiModel(value = "com-gouzhong1223-springbootweixinmp-pojo-Message")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    /**
     * 消息主键
     */
    @ApiModelProperty(value = "消息主键")
    private Integer MsgId;

    /**
     * 文本消息内容
     */
    @ApiModelProperty(value = "文本消息内容")
    private String Content;

    /**
     * 消息类型，文本为text
     */
    @ApiModelProperty(value = "消息类型，文本为text")
    private String MsgType;

    /**
     * 消息创建时间 （整型）
     */
    @ApiModelProperty(value = "消息创建时间 （整型）")
    private LocalDateTime CreateTime;

    /**
     * 发送方帐号（一个OpenID）
     */
    @ApiModelProperty(value = "发送方帐号（一个OpenID）")
    private String FromUserName;

    /**
     * 开发者微信号
     */
    @ApiModelProperty(value = "开发者微信号")
    private String ToUserName;

    private static final long serialVersionUID = 1L;
}