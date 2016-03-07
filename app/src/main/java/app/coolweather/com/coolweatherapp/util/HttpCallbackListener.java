package app.coolweather.com.coolweatherapp.util;

/**
 * Created by lee on 16/3/6.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
