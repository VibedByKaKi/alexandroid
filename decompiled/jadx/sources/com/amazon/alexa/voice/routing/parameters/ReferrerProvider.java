package com.amazon.alexa.voice.routing.parameters;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReferrerProvider {
    public static final String REFERER_KEY = "referer";
    private String referrer = "UNKNOWN";
    private String lastKnownReferrer = "UNKNOWN";

    @VisibleForTesting
    public String getReferrer() {
        return this.referrer;
    }

    public String provideAndReset() {
        String str = this.referrer;
        reset();
        return str;
    }

    public String provideLastKnownReferrer() {
        return this.lastKnownReferrer;
    }

    public void reset() {
        this.referrer = "UNKNOWN";
    }

    public void update(Intent intent) {
        String stringExtra = intent.getStringExtra("referer");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.referrer = stringExtra;
        this.lastKnownReferrer = stringExtra;
    }
}
