package com.amazon.alexa.mobilytics.timeline;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes18.dex */
public @interface TimelineState {
    public static final int ABORTED = 4;
    public static final int PAUSED = 1;
    public static final int RESUMED = 2;
    public static final int STARTED = 0;
    public static final int STOPPED = 3;
}
