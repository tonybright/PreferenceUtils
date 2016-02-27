package com.tonybright.preferenceutils;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.tonybright.preferenceutils.preference.ChatPreferences;
import com.tonybright.preferenceutils.preference.UserPreferences;

public class MainActivity extends Activity {

    @Bind(R.id.tv_chat_enabled)
    TextView mTvChatEnabled;
    @Bind(R.id.tv_user_name)
    TextView mTvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setConfiguration();
        refreshViews();
    }

    private void setConfiguration() {
        ChatPreferences.getInstance().setChatEnabled(true);
        UserPreferences.getInstance().setUserName("tony bright");
    }


    private void refreshViews() {
        mTvChatEnabled.setText(getString(R.string.chat_enabled, ChatPreferences.getInstance().isChatEnabled(false)));
        mTvUserName.setText(getString(R.string.user_name, UserPreferences.getInstance().getUserName()));
    }
}
