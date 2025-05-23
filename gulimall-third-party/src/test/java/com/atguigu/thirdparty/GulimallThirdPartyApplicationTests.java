package com.atguigu.thirdparty;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {
    @Test
    public void contextLoads() {
    }
	@Autowired
	OSS ossClient;

	@Test
	public void testUpload() throws FileNotFoundException {
		//上传文件流。
		InputStream inputStream = new FileInputStream("D:\\BaiduNetdiskDownload\\谷粒商城\\课件和文档\\基础篇\\资料\\pics\\5b5e74d0978360a1.jpg");
		ossClient.putObject("gulimall-vcciccv", "5b5e74d0978360a1.jpg", inputStream);

		// 关闭OSSClient。
		ossClient.shutdown();
		System.out.println("上传成功.");
	}

}