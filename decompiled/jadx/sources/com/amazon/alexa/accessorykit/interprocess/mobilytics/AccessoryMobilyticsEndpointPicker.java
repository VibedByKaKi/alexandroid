package com.amazon.alexa.accessorykit.interprocess.mobilytics;

import android.content.Context;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.interprocess.environment.AccessoryEnvironmentServicePreferences;
import com.amazon.alexa.mobilytics.identity.MobilyticsEndpointPicker;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AccessoryMobilyticsEndpointPicker implements MobilyticsEndpointPicker {
    private final Context context;

    public AccessoryMobilyticsEndpointPicker(Context context) {
        Preconditions.notNull(context, "context");
        this.context = context;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEndpointPicker
    public <T> T getEndpoint(Map<String, T> map) {
        String aWSRegion = AccessoryEnvironmentServicePreferences.getInstance(this.context).getAWSRegion();
        if (map.containsKey(aWSRegion)) {
            return map.get(aWSRegion);
        }
        return null;
    }
}
