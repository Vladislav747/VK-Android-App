package com.example.vladislavkudryakov.vk_3;

import android.app.Application;
import com.vk.sdk.VKSdk;
/**
 * Created by Melo on 19.02.2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {

        super.onCreate();
        //Метод запускает работу этого объекта. Инициализирует его.
        VKSdk.initialize(this);
    }
}
