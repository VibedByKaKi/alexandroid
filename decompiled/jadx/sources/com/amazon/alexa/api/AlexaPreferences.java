package com.amazon.alexa.api;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaPreferences {
    private static final String KEY_PREFER_DISPLAY_OVER_LOCKSCREEN_WITH_VERIFIED_VOICE = "displayOverLockscreenWithVerifiedVoice";
    private final boolean preferenceBoolean;

    public AlexaPreferences(Bundle bundle) {
        this.preferenceBoolean = bundle.getBoolean(KEY_PREFER_DISPLAY_OVER_LOCKSCREEN_WITH_VERIFIED_VOICE);
    }

    public static Builder builder() {
        return new Builder();
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(KEY_PREFER_DISPLAY_OVER_LOCKSCREEN_WITH_VERIFIED_VOICE, this.preferenceBoolean);
        return bundle;
    }

    public boolean preferDisplayOverLockscreenWithVerifiedVoice() {
        return this.preferenceBoolean;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean preferenceBoolean;

        public AlexaPreferences build() {
            return new AlexaPreferences(this);
        }

        public Builder setPreferDisplayOverLockscreenWithVerifiedVoice(boolean z) {
            this.preferenceBoolean = z;
            return this;
        }

        private Builder() {
        }
    }

    private AlexaPreferences(Builder builder) {
        this.preferenceBoolean = builder.preferenceBoolean;
    }
}
