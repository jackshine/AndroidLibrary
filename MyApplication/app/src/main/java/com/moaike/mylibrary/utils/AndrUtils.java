package com.moaike.mylibrary.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;


/**
 * 获取andoird系统信息
*/
public final class AndrUtils {

   private AndrUtils() {

    }

    public static TelephonyManager getTelephonyManager(Context context) {
        return (TelephonyManager) context
                .getSystemService(Context.TELEPHONY_SERVICE);
    }
}
