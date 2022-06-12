package com.mhw.middleware.model.mapper;

import com.mhw.middleware.model.entity.Item;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    Item selectByCode(@Param("code") String code);
}