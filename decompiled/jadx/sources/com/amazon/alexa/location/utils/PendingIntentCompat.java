package com.amazon.alexa.location.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class PendingIntentCompat {
    private PendingIntentCompat() {
    }

    public static PendingIntent getForegroundService(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getForegroundService(context, i, intent, i2);
    }
}
