package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.product.vo.AttrRespVo;
import com.atguigu.gulimall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author vcciccv
 * @email chaochen497@gmail.com
 * @date 2024-02-27 19:53:45
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);


    void saveAttr(AttrVo attr);


    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String attrType);



    AttrRespVo getAttrInfo(Long attrId);
//
//    void updateAttrById(AttrVo attr);
//
//    /**
//     * 根据分组id找到关联的所有属性
//     * @param attrgroupId
//     * @return
//     */
//    List<AttrEntity> getRelationAttr(Long attrgroupId);
//
//    void deleteRelation(AttrGroupRelationVo[] vos);
//
//    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
//
//    /**
//     * 在指定的所有属性集合里面，挑出检索属性
//     * @param attrIds
//     * @return
//     */
//    List<Long> selectSearchAttrs(List<Long> attrIds);
}

