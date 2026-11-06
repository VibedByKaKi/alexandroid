package com.facebook.drawee.components;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class RetryManager {
    private static final int MAX_TAP_TO_RETRY_ATTEMPTS = 4;
    private int mMaxTapToRetryAttempts;
    private int mTapToRetryAttempts;
    private boolean mTapToRetryEnabled;

    public RetryManager() {
        init();
    }

    public static RetryManager newInstance() {
        return new RetryManager();
    }

    public void init() {
        this.mTapToRetryEnabled = false;
        this.mMaxTapToRetryAttempts = 4;
        reset();
    }

    public boolean isTapToRetryEnabled() {
        return this.mTapToRetryEnabled;
    }

    public void notifyTapToRetry() {
        this.mTapToRetryAttempts++;
    }

    public void reset() {
        this.mTapToRetryAttempts = 0;
    }

    public void setMaxTapToRetryAttemps(int i) {
        this.mMaxTapToRetryAttempts = i;
    }

    public void setTapToRetryEnabled(boolean z) {
        this.mTapToRetryEnabled = z;
    }

    public boolean shouldRetryOnTap() {
        return this.mTapToRetryEnabled && this.mTapToRetryAttempts < this.mMaxTapToRetryAttempts;
    }
}
