package com.amazon.alexa.presence.service;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.presence.library.storage.PersistentLocalStorage;
import com.amazon.alexa.protocols.features.FeatureQuery;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceForegroundServiceStateAdviser {
    private static final String TAG = "com.amazon.alexa.presence.service.PresenceForegroundServiceStateAdviser";
    private final PresenceServiceConfiguration config;
    private final Context ctx;

    public PresenceForegroundServiceStateAdviser(Context context) {
        this(context, PresenceServiceConfiguration.defaultConfiguration());
    }

    private boolean isBluetoothReady(Intent intent) {
        String action = intent == null ? "" : intent.getAction();
        if (!TextUtils.isEmpty(action) && action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            return intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 12;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return this.ctx.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public boolean isBleConnEnabled(PresenceServiceConfiguration presenceServiceConfiguration) {
        return presenceServiceConfiguration.isForegroundServiceEnabled();
    }

    @Deprecated
    public boolean isBleConnV2Enabled() {
        return true;
    }

    public boolean isFeatureEnabled(String str) {
        FeatureQuery featureQuery = (FeatureQuery) Automotive$$ExternalSyntheticOutline0.m(FeatureQuery.class);
        if (featureQuery != null) {
            featureQuery.isActive(str);
        }
        return featureQuery != null && featureQuery.isActive(str);
    }

    public boolean serviceShouldBeRunning(Intent intent) {
        return isBleConnEnabled(this.config) && PersistentLocalStorage.presenceRequested(this.ctx) && isBluetoothReady(intent);
    }

    public PresenceForegroundServiceStateAdviser(Context context, PresenceServiceConfiguration presenceServiceConfiguration) {
        this.ctx = context;
        this.config = presenceServiceConfiguration;
    }

    public boolean serviceShouldBeRunning() {
        return serviceShouldBeRunning(null);
    }
}
