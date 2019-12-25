package com.gouzhong1223.springbootweixinmp.mapper;

import com.gouzhong1223.springbootweixinmp.pojo.Xml;
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

    int insert(Xml record);

    int insertOrUpdate(Xml record);

    int insertOrUpdateSelective(Xml record);

    int insertSelective(Xml record);

    Xml selectByPrimaryKey(Integer MsgId);

    int updateByPrimaryKeySelective(Xml record);

    int updateByPrimaryKey(Xml record);

    int updateBatch(List<Xml> list);

    int updateBatchSelective(List<Xml> list);

    int batchInsert(@Param("list") List<Xml> list);
}