package com.tonybright.preferenceutils;

import android.app.Application;
import com.tonybright.preferenceutils.context.ContextUtils;

/**
 * Created by on 16/2/27
 *
 * @author liang.tong
 * @version 1.0.0
 */
public class PreferenceApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ContextUtils.setContext(this);
    }
}
