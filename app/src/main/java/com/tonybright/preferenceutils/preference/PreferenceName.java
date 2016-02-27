package com.tonybright.preferenceutils.preference;

/**
 * Created by on 16/2/27
 *
 * enumeration of preference file name corresponding to application modules
 *
 * @author liang.tong
 * @version 1.0.0
 */
public enum PreferenceName {
    /**
     * for chat module
     */
    CHAT("chat"),

    /**
     * for user module
     */
    USER("user");


    private String mName;

    PreferenceName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }
}
