package com.amazon.alexa.aamb.proxy;

import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class RetryTimer {
    private static final int decreasePercentage = 50;
    private static final int increasePercentage = 50;
    private static final int[] retryTable = {50, 100, 200, 400};
    private int mRetryCount = 0;

    public void reset() {
        this.mRetryCount = 0;
    }

    public long timeToRetry() {
        int i = this.mRetryCount;
        int[] iArr = retryTable;
        if (i >= iArr.length) {
            this.mRetryCount = iArr.length - 1;
        } else if (i < 0) {
            this.mRetryCount = 0;
        }
        int i2 = this.mRetryCount;
        int i3 = iArr[i2];
        this.mRetryCount = i2 + 1;
        int i4 = (i3 * 66) / 100;
        return ThreadLocalRandom.current().nextInt((((i3 * 150) / 100) - i4) + 1) + i4;
    }
}
