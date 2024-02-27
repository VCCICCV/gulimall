package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import com.atguigu.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author vcciccv
 * @email chaochen497@gmail.com
 * @date 2024-02-27 19:53:45
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

