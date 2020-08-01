package com.course.httpclient.cookie;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookieForGet {
    private String url;
    private ResourceBundle bundle;
    @BeforeTest
    public void BeforeTest(){
        bundle=ResourceBundle.getBundle("appliction", Locale.CHINA);
        url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookie() throws IOException {
        String result;
        //从配置文件中，拼接测试的uri
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url+ uri;
        //编写逻辑代码书写
        HttpGet get = new HttpGet(testUrl);
        HttpClient client = new DefaultHttpClient();
        //修改org.apache.http的主机名验证解决问题
       // SSLSocketFactory.getSocketFactory().setHostnameVerifier(new AllowAllHostnameVerifier());
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
}
