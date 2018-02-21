package com.example.vladislavkudryakov.vk_3;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.widget.Toast;

/*import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.user.fandroidvktest.consts.ApiConstants;
import com.example.user.fandroidvktest.MainPresenter;
import com.example.user.fandroidvktest.MainView;
*/
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

import com.example.vladislavkudryakov.vk_3.consts.ApiConstants;
import com.example.vladislavkudryakov.vk_3.mvp.presenter.MainPresenter;
import com.example.vladislavkudryakov.vk_3.mvp.view.MainView;


public class MainActivity extends MvpAppCompatActivity implements MainView {
    @InjectPresenter
    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
//Hide the code - need only for one use code vor VK app
/*
        String[] fingerprints = VKUtil.getCertificateFingerprint(this, this.getPackageName());
        Log.d("MainActivity", "Fingerprint: " + Arrays.toString(fingerprints));


        */
/*
        @Override
        protected void attachBaseContext(Context base) {
            super.attachBaseContext(base);
            MultiDex.install(this);
        }*/

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
// Пользователь успешно авторизовался
mPresenter.checkAuth();
    }




    //После результата выполнения Activity - авторизация VK

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
                // Пользователь успешно авторизовался
                mPresenter.checkAuth();
            }

            @Override
            public void onError(VKError error) {
                // Произошла ошибка авторизации (например, пользователь запретил авторизацию)
            }
        })) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void startSignIn() {
        VKSdk.login(this, ApiConstants.DEFAULT_LOGIN_SCOPE);
    }

    @Override
    public void signedIn() {
        Toast.makeText(this, "Current user id: " + CurrentUser.getId(), Toast.LENGTH_LONG).show();
    }




}
