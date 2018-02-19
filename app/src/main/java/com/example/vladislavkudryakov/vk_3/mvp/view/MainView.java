package com.example.vladislavkudryakov.vk_3.mvp.view;

import com.arellomobile.mvp.MvpView;

/**
 * Created by Melo on 19.02.2018.
 */


    public interface MainView extends MvpView {
        void startSignIn();
        void signedIn();
    }

