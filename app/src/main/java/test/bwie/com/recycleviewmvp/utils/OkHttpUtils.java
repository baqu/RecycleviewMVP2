package test.bwie.com.recycleviewmvp.utils;

import android.os.Handler;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 类的用途 ：
 * zhangjiale
 * {DATE}
 */

public class OkHttpUtils {
    private static OkHttpClient okHttpClient;
    private static Handler handler = new Handler();

    public static void doGet(String url, final SendData callBack){
        okHttpClient = new OkHttpClient.Builder()
                //添加拦截器等等
                .build();
        //请求体
        Request request = new Request.Builder().url(url).build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String string = response.body().string();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        callBack.sendData(string);
                    }
                });
            }
        });
    }

    public interface SendData{
        void sendData(String result);
    }

}
