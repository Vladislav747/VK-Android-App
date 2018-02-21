package com.example.vladislavkudryakov.vk_3.ui;

import android.support.annotation.LayoutRes;

/**
 * Created by Melo on 20.02.2018.
 */

abstract class BaseActivity {
//Обозначает, что ожидается, что значение параметра целочисленного параметра, поля или метода будет ссылкой на ресурс компоновки
    @LayoutRes

    protected abstract int getMainContentLayout();
}
