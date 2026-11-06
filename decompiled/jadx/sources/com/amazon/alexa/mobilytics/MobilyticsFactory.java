package com.amazon.alexa.mobilytics;

import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.dependencies.MobilyticsModule;
import com.amazon.alexa.mobilytics.util.Log;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class MobilyticsFactory {
    private MobilyticsFactory() {
    }

    public static Mobilytics getMobilytics(@Nullable MobilyticsConfiguration mobilyticsConfiguration) {
        try {
            Preconditions.checkNotNull(mobilyticsConfiguration);
            if (!mobilyticsConfiguration.isDebug()) {
                Log.enforceReleaseLogging();
            }
            return DaggerMobilyticsComponent.builder().mobilyticsModule(new MobilyticsModule(mobilyticsConfiguration)).build().mobilytics();
        } catch (Exception e) {
            throw new MobilyticsException("error initializing Mobilytics", e);
        }
    }
}
