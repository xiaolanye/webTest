package com.web.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author 作者 zym:
 * @version 创建时间：2019年6月25日 下午4:23:13
 * 类说明
 */
public class HttpServiceUtil {

    public static String getResult(String url){

        String output="";
        try {
            URL targetUrl = new URL(url);
            HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("POST");
//            httpConnection.setUseCaches(false);
//            httpConnection.setRequestProperty("Charset", "utf-8");
//            httpConnection.setRequestProperty("Content-Type","application/json");
//            //httpConnection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
//            httpConnection.setRequestProperty("Accept-Charset", "utf-8");
//            httpConnection.setReadTimeout(5000);
//            httpConnection.setConnectTimeout(5000);
//            httpConnection.connect();

            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            //BufferedReader responseBuffer = new BufferedReader(new InputStreamReader(httpConnection.getInputStream(), Charset.forName("UTF-8")));
            output = responseBuffer.readLine();
            System.out.println("-------output--------->"+output);
            httpConnection.disconnect();
        }catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return output;
        /*return "error";*/
    }
}