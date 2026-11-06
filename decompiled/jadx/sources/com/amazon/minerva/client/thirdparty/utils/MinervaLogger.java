package com.amazon.minerva.client.thirdparty.utils;

import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MinervaLogger {
    private static final int MAX_TAG_LENGTH_ON_FOS6_AND_BELOW = 23;
    private static final String TAG = "MinervaLogger";
    private String mTagToUse;

    public MinervaLogger(String str) {
        this.mTagToUse = makeTagSafe(str);
    }

    private String makeTagSafe(String str) {
        if (str == null) {
            Log.e(TAG, "Null tag passed in, using empty instead. Make sure to change, null tags should not be used");
            return "";
        }
        if (str.length() <= 23) {
            return str;
        }
        String substring = str.substring(0, 23);
        ParcelCompat$$ExternalSyntheticOutline0.m7657m("Tag truncated, used to be ", str, ", now is ", substring, TAG);
        return substring;
    }

    public void debug(String str) {
        Log.isLoggable(this.mTagToUse, 3);
    }

    public void error(String str) {
        Log.e(this.mTagToUse, str);
    }

    public void info(String str) {
        Log.i(this.mTagToUse, str);
    }

    public boolean isDebugEnabled() {
        return Log.isLoggable(this.mTagToUse, 3);
    }

    public void verbose(String str) {
        Log.isLoggable(this.mTagToUse, 2);
    }

    public void warn(String str) {
        Log.w(this.mTagToUse, str);
    }

    public void wtf(String str) {
        Log.wtf(this.mTagToUse, str);
    }
}
