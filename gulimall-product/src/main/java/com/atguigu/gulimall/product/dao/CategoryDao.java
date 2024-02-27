package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author vcciccv
 * @email chaochen497@gmail.com
 * @date 2024-02-27 19:53:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
