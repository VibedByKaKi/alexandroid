package com.amazon.alexa.handsfree.metrics.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.metrics.utils.AnonymousDeviceIdProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsAnonymousDeviceIdProvider implements AnonymousDeviceIdProvider {

    @VisibleForTesting
    static final String ANONYMOUS_DEVICE_ID_KEY = "InstallationId";

    @VisibleForTesting
    static final String EMPTY_DEVICE_ID = "";

    @VisibleForTesting
    static final String SHARED_PREFERENCES_FILE = "mobilytics.installation-id";
    private final Context mContext;

    public MobilyticsAnonymousDeviceIdProvider(@NonNull Context context) {
        this.mContext = context;
    }

    @Override // com.amazon.alexa.handsfree.protocols.metrics.utils.AnonymousDeviceIdProvider
    public String getAnonymousDeviceId() {
        return this.mContext.getSharedPreferences(SHARED_PREFERENCES_FILE, 0).getString("InstallationId", "");
    }
}
