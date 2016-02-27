package com.tonybright.preferenceutils.preference;

/**
 * Created by on 16/2/27
 *
 * Preferences for User Module
 *
 * @author liang.tong
 * @version 1.0.0
 */
public class UserPreferences extends BasePreferences {

    public static UserPreferences getInstance() {
        return UserPreferencesHolder.sPreferences;
    }

    static class UserPreferencesHolder {
        static UserPreferences sPreferences = new UserPreferences(PreferenceName.USER.getName());
    }

    private UserPreferences(String preferenceName) {
        super(preferenceName);
    }

    private static final String USER_NAME = "user_name";
    /**
     * set user name in preference file named "user"
     * @param userName user name
     */
    public void setUserName(String userName) {
        getAccessHelper().putString(USER_NAME, userName);
    }

    /**
     * get user name from preference file named "user"
     * @return user name
     */
    public String getUserName() {
        return getAccessHelper().getString(USER_NAME, "");
    }
}
