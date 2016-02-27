package com.tonybright.preferenceutils.preference;


/**
 * Created by on 16/2/27
 * <p/>
 * Preference for Chat Module
 *
 * @author liang.tong
 * @version 1.0.0
 */
public class ChatPreferences extends BasePreferences {

    public static ChatPreferences getInstance() {
        return ChatPreferencesHolder.sPreferences;
    }

    static class ChatPreferencesHolder {
        static ChatPreferences sPreferences = new ChatPreferences(PreferenceName.CHAT.getName());
    }

    private ChatPreferences(String fileName) {
        super(fileName);
    }


    private static final String CHAT_ENABLED = "chat_enabled";

    /**
     * @param enabled true:enable chat, false:disable chat
     */
    public void setChatEnabled(boolean enabled) {
        getAccessHelper().putBoolean(CHAT_ENABLED, enabled);
    }

    /**
     * whether chat is enabled
     *
     * @param defaultValue default value
     * @return true/false
     */
    public boolean isChatEnabled(boolean defaultValue) {
        return getAccessHelper().getBoolean(CHAT_ENABLED, defaultValue);
    }
}
