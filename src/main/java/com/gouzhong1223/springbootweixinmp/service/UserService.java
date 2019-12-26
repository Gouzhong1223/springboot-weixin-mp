package com.gouzhong1223.springbootweixinmp.service;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 用户操作接口
 * @Date : create by QingSong in 2019-12-26 5:19 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.springbootweixinmp.service
 * @ProjectName : springboot-weixin-mp
 * @Version : 1.0.0
 */
public interface UserService {
    /**
     * 根据token查询是否有该用户
     *
     * @param token
     * @return
     */
    boolean checkUser(String token);
}
