package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.common.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;

import com.atguigu.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author vcciccv
 * @email chaochen497@gmail.com
 * @date 2024-02-27 19:53:45
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

