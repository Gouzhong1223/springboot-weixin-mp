package com.gouzhong1223.springbootweixinmp.mapper;

import com.gouzhong1223.springbootweixinmp.pojo.Message;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description : MessageMapper
 * @Date : create by QingSong in 2019-12-25 2:10 下午
 * @Email : 1162864960@qq.com
 * @Since : JDK 1.8
 * @ProjectName : springboot-weixin-mp
 */
public interface MessageMapper {
    int deleteByPrimaryKey(Integer MsgId);

    int insert(Message record);

    int insertOrUpdate(Message record);

    int insertOrUpdateSelective(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer MsgId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    int updateBatch(List<Message> list);

    int updateBatchSelective(List<Message> list);

    int batchInsert(@Param("list") List<Message> list);
}