makeropen-app
=====
refactor cordova sources to src/main/cordova 

## Get Things Done
- 2015-2-3
refactor cordova sources to src/main/cordova 

- 2015-1-3
proxies in ionic.project with edgewar

完成js端HangoutManager远程查询功能时，遇到CORS问题：
浏览器禁止跨源请求，因为ionic serve和springmvc后端是不同的服务器和端口号，
如果不解决非常影响开发测试阶段的效率，
在测试浏览器设置里允许CORS是可以但不安全的方案，经寻求方案后比较好地解决了：
开源力量大，有个老外给ionic项目贡献了个 pull request，在ionic.project里设置proxies,
让 ionic 启动的webserver可以将某路径下的请求转代理到springmvc服务器处，在浏览器看来就同源了

在官方 https://github.com/driftyco/ionic-cli/ 的"Service Proxies"有这用法说明
https://github.com/zhoufenglokki/makeropen-app/blob/master/ionic.project

## 参考资料
### ionic
- http://ionicframework.com
- http://codepen.io/ionic/

### angularjs
- http://www.w3cschool.cc/angularjs/
- http://docs.angularjs.cn/

### cordova
- http://cordova.apache.org
