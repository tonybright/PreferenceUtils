package com.tonybright.preferenceutils.context;

import android.content.Context;

/**
 * Created by on 16/2/27
 *
 * @author liang.tong
 * @version 1.0.0
 */
public class ContextUtils {
    private static Context sContext;

    public static void setContext(Context context) {
        sContext = context;
    }

    public static Context getContext() {
        return sContext;
    }
}