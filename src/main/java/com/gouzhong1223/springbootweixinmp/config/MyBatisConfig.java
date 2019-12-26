package com.gouzhong1223.springbootweixinmp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : MyBatis配置类
 * @Date : create by QingSong in 2019-12-25 9:46 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
@MapperScan(value = "com.gouzhong1223.springbootweixinmp.mapper")
@Configuration
@Transactional
public class MyBatisConfig {
}
