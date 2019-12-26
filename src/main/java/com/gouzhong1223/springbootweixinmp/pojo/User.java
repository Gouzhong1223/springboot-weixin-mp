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
 * @Description : 用户实体类
 * @Date : create by QingSong in 2019-12-26 3:33 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.springbootweixinmp.pojo
 * @ProjectName : springboot-weixin-mp
 * @Version : 1.0.0
 */
@ApiModel(value = "com-gouzhong1223-springbootweixinmp-pojo-User")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer userid;

    /**
     * 用户token
     */
    @ApiModelProperty(value = "用户token")
    private String userToken;

    /**
     * 用户创建时间
     */
    @ApiModelProperty(value = "用户创建时间")
    private LocalDateTime userCreatetime;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    private static final long serialVersionUID = 1L;
}