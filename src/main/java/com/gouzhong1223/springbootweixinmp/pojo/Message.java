package com.gouzhong1223.springbootweixinmp.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;


/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 消息实体类
 * @Date : create by QingSong in 2019-12-25 2:10 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
@ApiModel(value = "com-gouzhong1223-springbootweixinmp-pojo-Xml")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class Message implements Serializable {


    /**
     * 文本消息内容
     */
    @XmlElement(name = "Content")
    @ApiModelProperty(value = "文本消息内容")
    private String Content;

    /**
     * 消息创建时间 （整型）
     */
    @XmlElement(name = "CreateTime")
    @ApiModelProperty(value = "消息创建时间 （整型）")
    private Integer CreateTime;

    /**
     * 开发者微信号
     */
    @XmlElement(name = "ToUserName")
    @ApiModelProperty(value = "开发者微信号")
    private String ToUserName;

    /**
     * 发送方帐号（一个OpenID）
     */
    @XmlElement(name = "FromUserName")
    @ApiModelProperty(value = "发送方帐号（一个OpenID）")
    private String FromUserName;

    /**
     * 消息类型，文本为text
     */
    @XmlElement(name = "MsgType")
    @ApiModelProperty(value = "消息类型，文本为text")
    private String MsgType;

    /**
     * 消息主键
     */
    @XmlElement(name = "MsgId")
    @ApiModelProperty(value = "消息主键")
    private Integer MsgId;


    private static final long serialVersionUID = 1L;
}