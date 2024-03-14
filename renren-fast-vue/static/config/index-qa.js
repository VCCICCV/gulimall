/*
 * @Author: vcciccv chaochen497@gmail.com
 * @Date: 2023-12-29 10:08:02
 * @LastEditors: vcciccv chaochen497@gmail.com
 * @LastEditTime: 2024-03-11 22:24:18
 * @FilePath: \renren-fast-vue\static\config\index-qa.js
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @Author: vcciccv chaochen497@gmail.com
 * @Date: 2023-12-29 10:08:02
 * @LastEditors: vcciccv chaochen497@gmail.com
 * @LastEditTime: 2024-03-06 22:10:46
 * @FilePath: \renren-fast-vue\static\config\index-qa.js
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/**
 * 测试环境
 */
;(function () {
  window.SITE_CONFIG = {};

  // api接口请求地址
  window.SITE_CONFIG['baseUrl'] = 'http://localhost:88/api';

  // cdn地址 = 域名 + 版本号
  window.SITE_CONFIG['domain']  = './'; // 域名
  window.SITE_CONFIG['version'] = '';   // 版本号(年月日时分)
  window.SITE_CONFIG['cdnUrl']  = window.SITE_CONFIG.domain + window.SITE_CONFIG.version;
})();
