package com.course.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetApiUrl {
    private String url;
    private ResourceBundle bundle;
    private CookieStore cookieStore;

    @BeforeTest
    public void beforeTest() {
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void testGetcookies() throws IOException {
        String result;
        String uri = bundle.getString("getCookie.uri");
        String testUrl = this.url + uri;

        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

        //获取cookies信息
        this.cookieStore = client.getCookieStore();
        List<Cookie> cookieList = cookieStore.getCookies();
        for (Cookie cookie : cookieList
        ) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println();

        }

    }

    @Test(dependsOnMethods = "testGetcookies")
    public void testPostMethod() throws IOException {
        String uri = bundle.getString("test.get.with.cookies");
        //拼接最终的测试地址
        String testUrl = this.url + uri;
        //声明一个client对象，用来进行方法执行
        DefaultHttpClient client = new DefaultHttpClient();
        //声明一个方法，这个方法就是post方法；
        HttpPost post = new HttpPost(testUrl);
        //添加参数
        JSONObject param = new JSONObject();
        param.put("name", "huhansan");
        param.put("age", "18");

        //设置请求头信息,设置header
        post.setHeader("content-type", "application/json");
        //将参数信息添加到方法中
        StringEntity entity = new StringEntity(param.toString());
        post.setEntity(entity);
        //声明一个对象来进行响应结果的存储
        String result;
        //设置cookies信息
        client.setCookieStore(this.cookieStore);
        //执行post方法
        HttpResponse response = client.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
        //讲返回的响应结果字符串转换为json对象
        JSONObject resultJson = new JSONObject(result);
        //获取到结果值
        String success = (String) resultJson.get("huhansan");
        //具体的判断返回结果的值
        Assert.assertEquals("success", success);


    }


}
