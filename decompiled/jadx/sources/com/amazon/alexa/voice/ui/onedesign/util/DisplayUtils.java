package com.amazon.alexa.voice.ui.onedesign.util;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DisplayUtils {
    private DisplayUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static int transformDpiToPx(Context context, int i) {
        return (int) Math.ceil(i * context.getResources().getDisplayMetrics().density);
    }
}
