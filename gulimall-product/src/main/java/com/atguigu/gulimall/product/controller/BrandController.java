package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.common.utils.R;
import com.atguigu.gulimall.common.valid.UpdateStatusGroup;
import com.atguigu.gulimall.common.validator.group.AddGroup;
import com.atguigu.gulimall.common.validator.group.UpdateGroup;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;




/**
 * 品牌
 *
 * @author vcciccv
 * @email chaochen497@gmail.com
 * @date 2024-02-27 20:44:22
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     * @Validated指定校验分组
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand
//                  , BindingResult result
    ){

//         Map<String,String> map = new HashMap<>();
//
//         if (result.hasErrors()) {
//             //获取效验错误结果
//             result.getFieldErrors().forEach((item)-> {
//                 //获取到错误提示
//                 String message = item.getDefaultMessage();
//                 //获取错误的属性的名字
//                 String field = item.getField();
//                 map.put(field,message);
//             });
//             return R.error(400,"提交的数据不合法").put("data",map);
//         } else {
//
//         }
        brandService.save(brand);


        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@Validated({UpdateGroup.class}) @RequestBody BrandEntity brand){
        brandService.updateDetail(brand);

        return R.ok();
    }

    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    //@RequiresPermissions("product:brand:update")
    public R updateStatus(@Validated(UpdateStatusGroup.class) @RequestBody BrandEntity brand){
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
