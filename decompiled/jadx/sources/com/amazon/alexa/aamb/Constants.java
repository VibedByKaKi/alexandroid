package com.amazon.alexa.aamb;

import android.content.Context;
import android.preference.PreferenceManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class Constants {
    public static final String ALEXA_MOBILE_BRIDGE_CONSENT_TOKEN = "AlexaMobileBridgeConsentToken";
    public static final UUID BT_AAMB_SERVICE_UUID = UUID.fromString("8989063a-c9af-463a-b3f1-f21d9b2b827b");
    public static final int TRANSPORT_BLUETOOTH_CONNECTOR = 0;
    public static final int TRANSPORT_WIFI_HOTSPOT_CONNECTOR = 1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransportType {
    }

    private Constants() {
    }

    public static String getConsentToken(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString(ALEXA_MOBILE_BRIDGE_CONSENT_TOKEN, null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(ALEXA_MOBILE_BRIDGE_CONSENT_TOKEN, uuid).apply();
        return uuid;
    }
}
