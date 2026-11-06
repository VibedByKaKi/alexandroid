package com.amazon.alexa.voice.ui.onedesign.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazon.regulator.ViewController;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class IntentUtils {
    private IntentUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static void openLinkUrl(Context context, String str) {
        if (context == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot open url, context is null.");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Logger.error("Failed to start activity to open " + str, e);
        }
    }

    public static void openLinkUrl(ViewController viewController, String str) {
        if (viewController.getContext() != null) {
            openLinkUrl(viewController.getContext(), str);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot open url when a controller is destroyed");
        }
    }
}
