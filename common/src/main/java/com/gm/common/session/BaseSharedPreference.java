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

package com.gm.common.session;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Name       : Gowtham
 * Created on : 13/4/17.
 * Email      : goutham.gm11@gmail.com
 * GitHub     : https://github.com/goutham106
 */

public class BaseSharedPreference {
    private final SharedPreferences sharedpre;
    private final Context context;
    private final String DEFALUT_STRING_VALUE = "";
    private final int DEFALUT_INT_VALUE = 0;
    private final long DEFAULT_LONG_VALUE = 0;
    private final boolean DEFALUT_BOOLEAN_VALUE = false;

    public static final String SHAREDPREFERENCES_NAME = "DEMO_PREFERENCES";


    protected BaseSharedPreference(Context con) {
        context = con;
        sharedpre = con.getSharedPreferences(SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
    }

    public SharedPreferences getPreference(Context con) {
        return sharedpre != null ? sharedpre : con.getSharedPreferences(SHAREDPREFERENCES_NAME,
                Context.MODE_PRIVATE);
    }

    public void putStringValues(String Tag, String Value) {
        SharedPreferences.Editor saveuser = sharedpre.edit();
        saveuser.putString(Tag, Value);
        saveuser.apply();
    }

    public void putIntValues(String Tag, int Value) {
        SharedPreferences.Editor saveuser = sharedpre.edit();
        saveuser.putInt(Tag, Value);
        saveuser.apply();
    }

    public void putLongValues(String Tag, long Value) {
        SharedPreferences.Editor saveuser = sharedpre.edit();
        saveuser.putLong(Tag, Value);
        saveuser.apply();
    }

    public void putBooleanValues(String Tag, boolean Value) {
        SharedPreferences.Editor saveuser = sharedpre.edit();
        saveuser.putBoolean(Tag, Value);
        saveuser.apply();
    }

    public String getStringValues(String Tag) {
        return sharedpre.getString(Tag, DEFALUT_STRING_VALUE);
    }

    public String getStringValues(String Tag, String Defalut) {
        return sharedpre.getString(Tag, Defalut);
    }

    public String getStringValuesForNull(String Tag, String Defalut) {
        return sharedpre.getString(Tag, Defalut);
    }

    public int getIntValues(String Tag) {
        return sharedpre.getInt(Tag, DEFALUT_INT_VALUE);
    }

    public Long getLongValues(String Tag) {
        return sharedpre.getLong(Tag, DEFAULT_LONG_VALUE);
    }

    public int getIntValues(String Tag, int Defalut) {
        return sharedpre.getInt(Tag, Defalut);
    }

    public Long getLongValues(String Tag, long Defalut) {
        return sharedpre.getLong(Tag, Defalut);
    }

    public boolean getBooleanValues(String Tag) {
        return sharedpre.getBoolean(Tag, DEFALUT_BOOLEAN_VALUE);
    }

    public boolean getBooleanValues(String Tag, boolean Defalut) {
        return sharedpre.getBoolean(Tag, Defalut);
    }

    public void clearAll() {
        sharedpre.edit().clear().apply();
    }

    public void clearValues(String Tag) {
        sharedpre.edit().remove(Tag).apply();
    }

}



