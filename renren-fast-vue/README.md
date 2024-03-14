## renren-fast-vue
- renren-fast-vue基于vue、element-ui构建开发，实现[renren-fast](https://gitee.com/renrenio/renren-fast)后台管理前端功能，提供一套更优的前端解决方案
- 前后端分离，通过token进行数据交互，可独立部署
- 主题定制，通过scss变量统一一站式定制
- 动态菜单，通过菜单管理统一管理访问路由
- 数据切换，通过mock配置对接口数据／mock模拟数据进行切换
- 发布时，可动态配置CDN静态资源／切换新旧版本
- 演示地址：[http://demo.open.renren.io/renren-fast](http://demo.open.renren.io/renren-fast) (账号密码：admin/admin)

![输入图片说明](https://images.gitee.com/uploads/images/2019/0305/133529_ff15f192_63154.png "01.png")
![输入图片说明](https://images.gitee.com/uploads/images/2019/0305/133537_7a1b2d85_63154.png "02.png")


## 说明文档
项目开发、部署等说明都在[wiki](https://github.com/renrenio/renren-fast-vue/wiki)中。


## 更新日志
每个版本的详细更改都记录在[release notes](https://github.com/renrenio/renren-fast-vue/releases)中。
首先node版本和npm版本一定要一样
建议使用nvm管理node,一定要卸载原来的node和全局安装的npm,使用nvm use nodeVersion,node默认有npm，全局安装的npm会因为node版本不一样使用不了（这个自己找教程）
安装node10.16.3
`nvm install 10.16.3`
查看已安装node
`nvm list`
使用node
`nvm use 10.16.3`
安装python3 想不到吧这个sass还要用到python
先试一下`npm install` `npm run dev`下一步报错再来这里，有的人电脑里可能有,安装vsStudio2019的C++桌面开发，node-sass编译要用到
克隆库，记得把.git文件删掉
`![img](file:///C:\Users\chaochen\AppData\Roaming\Tencent\QQTempSys\[5UQ[BL(6~BS2JV6W}N6[%S.png)https://gitee.com/renrenio/renren-fast-vue.git`
在package.json里把node-asaa版本改为4.14.1，sass-loader改为6.0.6
这个时候
`npm install`
`npm run dev`
如果报错chromedriver,先删除项目里的node_nodules
报错的信息里有个chromedriver的链接，点进去就可以下，没有就下我这个链接，不建议直接在npm install chromedriver
`![img](file:///C:\Users\chaochen\AppData\Roaming\Tencent\QQTempSys\%W@GJ$ACOF(TYDYECOKVDYB.png)https://registry.npmmirror.com/-/binary/chromedriver/2.27/chromedriver_win32.zip`
下载后安装
`npm install chromedriver --chromedriver_filepath=D:\Development\chromedriver_win32.zip`改成自己的下载位置
再次
`npm install`
`npm run dev`