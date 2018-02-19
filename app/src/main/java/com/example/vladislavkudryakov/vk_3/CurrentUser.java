package com.example.vladislavkudryakov.vk_3;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKSdk;

/**
 * Created by Melo on 19.02.2018.
 */


    public class CurrentUser {

        public static String getAccessToken() {
            if (VKAccessToken.currentToken() == null) {
                return null;
            }

            return VKAccessToken.currentToken().accessToken;
        }

        public static String getId() {
            if (VKAccessToken.currentToken() != null) {
                return VKAccessToken.currentToken().userId;
            }

            return null;
        }

        public static boolean isAuthorized() {
            return VKSdk.isLoggedIn()
                    && VKAccessToken.currentToken() != null
                    && !VKAccessToken.currentToken().isExpired();
        }

    }

