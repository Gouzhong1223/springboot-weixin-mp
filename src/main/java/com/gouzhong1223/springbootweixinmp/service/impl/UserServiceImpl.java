package com.gouzhong1223.springbootweixinmp.service.impl;

import com.gouzhong1223.springbootweixinmp.mapper.UserMapper;
import com.gouzhong1223.springbootweixinmp.pojo.User;
import com.gouzhong1223.springbootweixinmp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : 用户操作接口实现类
 * @Date : create by QingSong in 2019-12-26 5:20 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.springbootweixinmp.service.impl
 * @ProjectName : springboot-weixin-mp
 * @Version : 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean checkUser(String token) {
        User oneByUserToken = userMapper.selectOneByUserToken(token);
        if (oneByUserToken != null) {
            return true;
        }
        return false;
    }
}
