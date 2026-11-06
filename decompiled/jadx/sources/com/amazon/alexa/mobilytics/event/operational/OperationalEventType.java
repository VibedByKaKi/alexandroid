package com.amazon.alexa.mobilytics.event.operational;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes18.dex */
public @interface OperationalEventType {
    public static final String COUNTER = "counter";
    public static final String DATA = "data";
    public static final String DIAGNOSTIC = "diagnostic";
    public static final String ERROR = "error";
    public static final String SESSION = "session";
    public static final String TIMER = "timer";
}
