package com.tonybright.preferenceutils.preference;

import android.content.Context;
import android.content.SharedPreferences;
import com.tonybright.preferenceutils.context.ContextUtils;

/**
 * Created by on 16/2/27
 * <p/>
 * Base class for Application Preferences, corresponding module
 * configurations should be defined in subclasses
 *
 * @author liang.tong
 * @version 1.0.0
 */
public class BasePreferences {
    private SharedPreferences mSharedPreferences;
    private AccessHelper mAccessHelper;

    public BasePreferences(String fileName) {
        mSharedPreferences = ContextUtils.getContext().getSharedPreferences(fileName, Context.MODE_PRIVATE);
        mAccessHelper = new AccessHelper();
    }

    public AccessHelper getAccessHelper() {
        return mAccessHelper;
    }

    class AccessHelper {

        public boolean getBoolean(String preferenceId, boolean defaultValue) {
            return mSharedPreferences.getBoolean(preferenceId, defaultValue);
        }

        public void putBoolean(String preferenceId, boolean value) {
            mSharedPreferences.edit().putBoolean(preferenceId, value).apply();
        }

        public String getString(String preferenceId, String defaultValue) {
            return mSharedPreferences.getString(preferenceId, defaultValue);
        }

        public void putString(String preferenceId, String value) {
            mSharedPreferences.edit().putString(preferenceId, value).apply();
        }

        public int getInt(String preferenceId, int defaultValue) {
            return mSharedPreferences.getInt(preferenceId, defaultValue);
        }

        public void putInt(String preferenceId, int value) {
            mSharedPreferences.edit().putInt(preferenceId, value).apply();
        }

        public long getLong(String preferenceId, long defaultValue) {
            return mSharedPreferences.getLong(preferenceId, defaultValue);
        }

        public void putLong(String preferenceId, long value) {
            mSharedPreferences.edit().putLong(preferenceId, value).apply();
        }

        public float getFloat(String preferenceId, float defaultValue) {
            return mSharedPreferences.getFloat(preferenceId, defaultValue);
        }

        public void putFloat(String preferenceId, float value) {
            mSharedPreferences.edit().putFloat(preferenceId, value).apply();
        }
    }

}
