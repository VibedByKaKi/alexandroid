package com.amazon.alexa.accessory.notificationpublisher.utils;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.Properties;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AvsProperties {
    private static final String AVS_PROPERTIES_FILE = "avs.properties";
    private static final String AVS_PROPERTIES_KEY_AVS_ENDPOINT = "avs_endpoint";
    private static final String TAG = "AvsProperties";
    private String aveEndpoint;

    @VisibleForTesting
    public AvsProperties(Context context, String str) {
        try {
            Properties properties = new Properties();
            properties.load(context.getAssets().open(str));
            readProperties(properties);
        } catch (IOException e) {
            Log.e(TAG, "Fatal exception while reading file " + str + ": ", e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }

    private void readProperties(Properties properties) {
        String property = properties.getProperty(AVS_PROPERTIES_KEY_AVS_ENDPOINT);
        this.aveEndpoint = property;
        if (property != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unable to read property avs_endpoint");
    }

    public String getAveEndpoint() {
        return this.aveEndpoint;
    }

    public AvsProperties(Context context) {
        this(context, AVS_PROPERTIES_FILE);
    }
}
