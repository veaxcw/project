package com.chengw.teacherInfoAnnualFillingSystem.util;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author chengw
 */
public class CallJspToHtml {

    public static final String  PATH = "http://localhost:8080";

    //这个方法适当重载，就可以省去一些参数传递。

    public static void CallOnePage(String basePath,String fileName, String path,

                                   String realName, String realPath) {
        try {


            String str = PATH + basePath+"/toHtmlPath?file_name="
                    + fileName + "&path=" + path + "&realName=" + realName
                    + "&realPath=" + realPath;
            int httpResult; //请求返回码
            //URL发送指定连接请求
            URL url = new URL(str);
            URLConnection connection = url.openConnection();
            connection.connect();

            HttpURLConnection httpURLConnection = (HttpURLConnection) connection;

            httpResult = httpURLConnection.getResponseCode();
            //返回码为200则连接成功
            if (httpResult != HttpURLConnection.HTTP_OK) {
                System.out.println("没有连接成功!");
            } else {
                System.out.println("连接成功了!!!!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
