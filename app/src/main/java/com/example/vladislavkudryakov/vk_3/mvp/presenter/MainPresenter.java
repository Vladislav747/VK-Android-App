package com.example.vladislavkudryakov.vk_3.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.vladislavkudryakov.vk_3.CurrentUser;

import com.example.vladislavkudryakov.vk_3.mvp.view.MainView;

/**
 * Created by Melo on 19.02.2018.
 */

    @InjectViewState
    public class MainPresenter extends MvpPresenter<MainView> {

        public void checkAuth() {
            if (!CurrentUser.isAuthorized()) {
                getViewState().startSignIn();
            } else {
                getViewState().signedIn();
            }
        }
    }

