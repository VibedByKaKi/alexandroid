package com.amazon.alexa.mobilytics.configuration;

import com.amazon.alexa.mobilytics.identity.MobilyticsCredentialKeyProvider;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazonaws.regions.Regions;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class CognitoPoolManager {
    private static final String TAG = Log.tag((Class<?>) CognitoPoolManager.class);

    private CognitoPoolManager() {
    }

    public static Map<Regions, String> cognitoPool(Map<MobilyticsCredentialKeyProvider.MobilyticsRegions, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<MobilyticsCredentialKeyProvider.MobilyticsRegions, String> entry : map.entrySet()) {
            hashMap.put(Regions.fromName(entry.getKey().getName()), entry.getValue());
        }
        return hashMap;
    }
}
