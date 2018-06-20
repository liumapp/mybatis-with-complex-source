package com.liumapp.demo.mybatis.complex.api.db.testb.mapper;

import com.liumapp.demo.mybatis.complex.api.db.testb.domain.Trade;
import com.liumapp.demo.mybatis.complex.api.db.testb.domain.TradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeMapper {
    long countByExample(TradeExample example);

    int deleteByExample(TradeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trade record);

    int insertSelective(Trade record);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByExample(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}