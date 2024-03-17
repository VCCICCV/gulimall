package com.atguigu.gulimall.product;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.dao.AttrGroupDao;
import com.atguigu.gulimall.product.dao.SkuSaleAttrValueDao;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
//import com.atguigu.gulimall.product.vo.SkuItemSaleAttrVo;
//import com.atguigu.gulimall.product.vo.SpuItemAttrGroupVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
//	@Test
//	public void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
////		brandEntity.setName("xiaomi");
////		brandService.save(brandEntity);
////		System.out.println("保存成功");
//
////		brandEntity.setBrandId(1762480820527112194L);
////		brandEntity.setDescript("redmi");
////		brandService.updateById(brandEntity);
//		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1762480820527112194L));
//		list.forEach((item)->{
//			System.out.println(item);
//		});
//	}

    //	OSS
    @Autowired
    OSS ossClient;
    @Test
    public void testUpload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-huhehaote.aliyuncs.com";
//        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "LTAI5tArfhHXUDWdX4wKuFts";
//        String accessKeySecret = "0hlAjLQ8sKoqHEE2JboIvZ1xUbh8wp";

        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件流。
        InputStream inputStream;

        {
            try {
                inputStream = new FileInputStream("D:\\BaiduNetdiskDownload\\谷粒商城\\课件和文档\\基础篇\\资料\\pics\\5b5e74d0978360a1.jpg");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        ossClient.putObject("gulimall-vcciccv", "5b5e74d0978360a1.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功...");
    }

}
