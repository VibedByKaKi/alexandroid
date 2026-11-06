package com.amazon.alexa.mobilytics.configuration;

import androidx.media3.common.PlaybackException;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class ThrottleConfig {
    private static final int INIT_THROTTLE_CREDIT = 6001;
    private static final int MAX_THROTTLE_CREDIT = 8001;
    private static final int THROTTLE_CREDIT_PER_HOUR = 6001;
    private int initThrottleCredit = PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
    private int maxThrottleCredit = MAX_THROTTLE_CREDIT;
    private int throttleCreditPerHour = PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;

    public int initThrottleCredit() {
        return this.initThrottleCredit;
    }

    public int maxThrottleCredit() {
        return this.maxThrottleCredit;
    }

    public int throttleCreditPerHour() {
        return this.throttleCreditPerHour;
    }
}
