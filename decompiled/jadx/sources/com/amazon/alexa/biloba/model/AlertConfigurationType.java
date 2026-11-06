package com.amazon.alexa.biloba.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes17.dex */
public @interface AlertConfigurationType {
    public static final int ANY_ACTIVITY_DETECTED = 2;
    public static final int FIRST_ACTIVITY_DETECTED = 1;
    public static final int NO_ACTIVITY_DETECTED = 0;
    public static final int PAUSE_NOTIFICATION = 4;
    public static final int SMART_HOME_ACTIVITY_DETECTED = 3;
    public static final int UNKNOWN = -1;
}
