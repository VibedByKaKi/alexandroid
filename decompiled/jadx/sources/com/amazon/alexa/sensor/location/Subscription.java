package com.amazon.alexa.sensor.location;

import android.location.Location;
import androidx.annotation.NonNull;
import com.amazon.alexa.sensor.api.location.LocationConfigurationRequest;
import com.amazon.alexa.sensor.api.location.LocationEventHandler;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Subscription {
    LocationConfigurationRequest configuration;
    LocationEventHandler delegate;
    Runnable expirationCallback;
    String featureId;
    long forcedForegroundStartTime;
    boolean isExpired;
    Location lastSentPosition;
    long lastSentTime;
    long lastUpdateTime;

    public static String buildSubscriptionKey(@NonNull String str, int i) {
        return a$$ExternalSyntheticOutline0.m$1(str, ".", i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "ALL_CHANGES" : "ALL_CHANGES_DURING_FOREGROUND" : "SIGNIFICANT_CHANGES_ONLY" : "SINGLE_LOCATION");
    }
}
