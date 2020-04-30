package com.xfor.passport.repository.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xfor.passport.model.PassportAuthCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Mapper
public interface IPassportAuthCategoryMyBatisDAO extends BaseMapper<PassportAuthCategory> {
}
