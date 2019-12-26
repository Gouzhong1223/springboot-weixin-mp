package com.gouzhong1223.springbootweixinmp.mapper;

import com.gouzhong1223.springbootweixinmp.pojo.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : UserMapper
 * @Date : create by QingSong in 2019-12-26 3:33 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.springbootweixinmp.mapper
 * @ProjectName : springboot-weixin-mp
 * @Version : 1.0.0
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertOrUpdate(User record);

    int insertOrUpdateSelective(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(@Param("list") List<User> list);
}