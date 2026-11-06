package com.amazon.alexa.handsfree.storage.initialization;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DspApkVersionCodeStore {

    @VisibleForTesting
    static final String DSP_APK_VERSION_CODE_KEY = "com.amazon.alexa.handsfree.metrics.utils.dsp_apk_version_code";
    public static final int MIN_ANDROID_VERSION_CODE = 1;

    @VisibleForTesting
    static final String SHARED_PREFERENCES_FILE = "com.amazon.alexa.handsfree.storage.initialization.DspApkVersionCodeStore";

    @Inject
    public DspApkVersionCodeStore() {
    }

    public int getDspApkVersionCode(@NonNull Context context) {
        return getSharedPreferences(context).getInt(DSP_APK_VERSION_CODE_KEY, 1);
    }

    @VisibleForTesting
    public SharedPreferences getSharedPreferences(@NonNull Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_FILE, 0);
    }

    public void setDspApkVersionCode(@NonNull Context context, int i) {
        getSharedPreferences(context).edit().putInt(DSP_APK_VERSION_CODE_KEY, i).apply();
    }
}
