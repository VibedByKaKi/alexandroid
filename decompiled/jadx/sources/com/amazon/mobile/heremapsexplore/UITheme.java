package com.amazon.mobile.heremapsexplore;

import android.graphics.Color;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
enum UITheme {
    DarkTheme(-16725249, -15394528);

    private final int controlActive;
    private final int textPrimaryInverse;

    UITheme(int i, int i2) {
        this.controlActive = i;
        this.textPrimaryInverse = i2;
    }

    public int getControlActive() {
        return this.controlActive;
    }

    public int getControlActiveWithAlpha(float f) {
        return Color.argb(Math.round(Color.alpha(this.controlActive) * f), Color.red(this.controlActive), Color.green(this.controlActive), Color.blue(this.controlActive));
    }

    public int getTextPrimaryInverse() {
        return this.textPrimaryInverse;
    }
}
