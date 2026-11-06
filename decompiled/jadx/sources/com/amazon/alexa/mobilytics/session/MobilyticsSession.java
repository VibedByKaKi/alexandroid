package com.amazon.alexa.mobilytics.session;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsSession {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final int ERROR = 4;
        public static final int PAUSED = 2;
        public static final int RESUMED = 3;
        public static final int STARTED = 1;
        public static final int STOPPED = 0;
    }

    long elapsedTime();

    @Nullable
    String id();

    Observable<String> onIdChanged();

    long startTime();

    int state();

    long stopTime();
}
