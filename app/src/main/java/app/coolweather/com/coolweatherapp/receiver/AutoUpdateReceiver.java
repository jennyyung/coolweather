package app.coolweather.com.coolweatherapp.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import app.coolweather.com.coolweatherapp.service.AutoUpdateService;

/**
 * Created by lee on 16/3/8.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
