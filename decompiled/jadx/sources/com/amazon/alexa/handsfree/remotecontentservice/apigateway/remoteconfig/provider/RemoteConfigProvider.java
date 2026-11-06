package com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.provider;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class RemoteConfigProvider {

    @VisibleForTesting
    static final String KEY_REMOTE_CONFIG_VALUES = "com.amazon.alexa.handsfree.rcs.apigateway.RemoteConfig.VALUES";

    @VisibleForTesting
    static final String SHARED_PREFERENCES_FILE_NAME = "com.amazon.alexa.handsfree.rcs.apigateway.RemoteConfig";
    private final Context mContext;

    @Inject
    public RemoteConfigProvider(Context context) {
        this.mContext = context;
    }

    public String getRemoteConfig() {
        return this.mContext.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, 0).getString(KEY_REMOTE_CONFIG_VALUES, null);
    }

    public void setRemoteConfig(String str) {
        this.mContext.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, 0).edit().putString(KEY_REMOTE_CONFIG_VALUES, str).apply();
    }
}
