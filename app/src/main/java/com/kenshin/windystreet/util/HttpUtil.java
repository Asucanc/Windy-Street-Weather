package com.kenshin.windystreet.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Kenshin on 2017/4/3.
 * 和服务器交互，传入请求地址，注册回调来处理服务器响应
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
