package com.amazon.deecomms.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.CommsEventSender$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsSharedPreferences {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CommsSharedPreferences.class);
    private static final String PREFS_FILE_NAME = "COMMS_SHARED_PREFS";
    private Context mContext;

    @Inject
    public CommsSharedPreferences(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private SharedPreferences getSharedPreferences() {
        return this.mContext.getSharedPreferences(PREFS_FILE_NAME, 0);
    }

    public synchronized void clearAll() {
        CommsLogger commsLogger = LOG;
        commsLogger.i("Caesar: clearAll");
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            commsLogger.e("Unable to fetch shared prefs.");
        } else {
            sharedPreferences.edit().clear().apply();
        }
    }

    public synchronized boolean containsKey(@NonNull String str) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            if (sharedPreferences.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public synchronized String getString(@NonNull String str, String str2) {
        CommsLogger commsLogger = LOG;
        CommsEventSender$$ExternalSyntheticOutline0.m(commsLogger, "Caesar: getString: key: ", str);
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            commsLogger.e("Unable to fetch secured shared preference from context");
            return str2;
        }
        return sharedPreferences.getString(str, str2);
    }

    public void putNonEmptyString(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LOG.i("Caesar: Empty key/value");
        } else {
            putString(str, str2);
        }
    }

    public synchronized void putString(@NonNull String str, @NonNull String str2) {
        CommsLogger commsLogger = LOG;
        CommsEventSender$$ExternalSyntheticOutline0.m(commsLogger, "Caesar: putString: key: ", str);
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            commsLogger.e("Unable to fetch secured shared preference from context");
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }
}
