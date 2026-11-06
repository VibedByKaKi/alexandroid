package com.amazon.alexa.sensor.api.location;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes19.dex */
public @interface LocationMode {
    public static final int ALL_CHANGES = 3;
    public static final int ALL_CHANGES_DURING_FOREGROUND = 2;
    public static final int SIGNIFICANT_CHANGES_ONLY = 1;
    public static final int SINGLE_LOCATION = 0;
}
