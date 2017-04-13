/*
 * Copyright (c) 2017 Gowtham Parimelazhagan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gm.mvpdemo.data.prefs;

import android.content.Context;

import com.gm.common.session.BaseSharedPreference;
import com.gm.common.session.SessionConstants;
import com.gm.mvpdemo.data.DataManager;
import com.gm.mvpdemo.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Name       : Gowtham
 * Created on : 13/4/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

@Singleton
public class AppPreferencesHelper extends BaseSharedPreference implements SessionConstants, PreferencesHelper {

    private final Long NULL_INDEX = -1L;

    @Inject
    protected AppPreferencesHelper(@ApplicationContext Context con) {
        super(con);
    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return getIntValues(PREF_USER_LOGIN_MODE,
                DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType());

    }

    @Override
    public void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode) {
        putIntValues(PREF_USER_LOGIN_MODE, mode.getType());
    }

    @Override
    public Long getCurrentUserId() {
        long userId = getLongValues(PREF_USER_ID, NULL_INDEX);
        return userId == NULL_INDEX ? null : userId;
    }

    @Override
    public void setCurrentUserId(Long userId) {
        long id = userId == null ? NULL_INDEX : userId;
        putLongValues(PREF_USER_ID, id);
    }

    @Override
    public String getCurrentUserName() {
        return getStringValues(PREF_USER_NAME);
    }

    @Override
    public void setCurrentUserName(String userName) {
        putStringValues(PREF_USER_NAME, userName);
    }

    @Override
    public String getCurrentUserEmail() {
        return getStringValues(PREF_USER_EMAIL);
    }

    @Override
    public void setCurrentUserEmail(String email) {
        putStringValues(PREF_USER_EMAIL, email);
    }

    @Override
    public String getCurrentUserProfilePicUrl() {
        return getStringValues(PREF_USER_PROFILE_PIC);
    }

    @Override
    public void setCurrentUserProfilePicUrl(String profilePicUrl) {
        putStringValues(PREF_USER_PROFILE_PIC, profilePicUrl);
    }

    @Override
    public String getAccessToken() {
        return getStringValues(PREF_ACCESS_TOKEN);
    }

    @Override
    public void setAccessToken(String accessToken) {
        putStringValues(PREF_ACCESS_TOKEN, accessToken);
    }
}
