package com.amazon.alexa.routing.api;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum FABVisibility {
    SHOW,
    HIDE,
    DEFAULT;

    private static final String PARSE_FAILURE_WARN_TEMPLATE = "Unexpected FABVisibility value found. %s is not a recognized value for the enum. Returning DEFAULT.";
    private static final String TAG = "FABVisibility";

    public static FABVisibility parse(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return valueOf(str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException e) {
                Log.w(TAG, "Unexpected FABVisibility value found. " + str + " is not a recognized value for the enum. Returning DEFAULT.", e);
            }
        }
        return DEFAULT;
    }
}
