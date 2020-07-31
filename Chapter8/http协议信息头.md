# http协议信息头学习
## HTTP协议请求头信息和响应头信息

  > - 请求行 GET  /test/hello.html HTTP/1.1
  > - 消息头(并不是每一次请求都一样)
  > - 空行
  > - 内容(内容名字=内容体)
### 常用请头信息
   > - Accept:text/html,image/*(告诉服务器，浏览器可以接受文本，网页图片)
   > - Accept-Charaset:ISO-8859-1 [接受字符编码：iso-8859-1]
   > - Accept-Encoding:gzip,compress[可以接受  gzip,compress压缩后数据]
   > - Accept-Language:zh-cn[浏览器支持的语言]   
   > - Host:localhost:8080[浏览器要找的主机]
   > - IF-MODIFIED-Since:Tue,11Jul 2000 18:23:51[告诉服务器我这缓存中有这个文件,该文件的时间]
   > - Referer:http://localhost:8080/test/abc.html[告诉服务器我来自哪里,常用于防止下载，盗链]
   > - User-Agent:Nozilla/4.0(Com...)[告诉服务器我的浏览器内核、版本信息等]
   > - Cookie：[Cookie，常用于认证]
   > - Connection:close/Keep-Alive [保持链接，发完数据后，我不关闭链接]
   > - Date:[浏览器发送数据的请求时间，告诉服务器游览器的访问时间]
   
### 常用响应头信息
     > - location:http://www.baidu.org/index.jsp[告诉浏览器去找谁，配合302状态码的使用]
     > - server:apache tomcat [告诉浏览器服务器的类型，这里是我是tomcat]
     > - Content-Encoding:gzip[告诉浏览器我使用了gzip]
     > - Content-Lenght:80 [告诉浏览器回送的数据大小]
     > - Content-Language:zh-cn[支持中文]
     > - Content-Type:text/html;charset=gb2312[回送给客户端的内容格式和编码]
     > - Last-Modified:Tue,11 Juj,2000 18 18:29:20[告诉浏览器该资源上次更新
　　　　　　　时间是多少]
     > - Refresh:1;url=http://www.baidu.com[控制浏览器的定时刷新，过多久刷新到哪里去（股票）]
     > - Content-Disposition;attachment;filename=aaa.zip[告诉浏览器有文件下载，告诉浏览器需要以下载方法打开回送的数据]
     > - Transfer-Encoding:chunked［传输编码，告诉浏览器数据是以分块形式回送的］
    ### Set-Cookie:
     > - Expires:-1[告诉浏览器如何缓存页面]
     > - cache-Control:[告诉浏览器如何缓存页面(因为浏览器的兼容性最好设置两个)]
     > - pragma:no-cache
     > - Connection:close/Keep-Alive
     > - Date:Tue,11 Jul 2000 18:23:51
     
### (1)有些网站对及时性比较高，我们不缓存页面
> - response.setDateHeader("Expires",-1);
//为了保证兼容性
> - response.setHeader("Cache-Control","no-cache")
> - response.setHeader("Pragma","no-cache")

### (2)有些网站要求网页缓存一定时间，比如缓存一个小时
> - response.setDateHeader("Expires",System.currentimeMillis()*3600*1000*24);


### 通用信息头
> - Cache-Control:no-cache
> - Pragma:no-cache
> - Connection:close/Keep-Alive
> - Date:时间