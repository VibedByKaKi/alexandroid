package com.amazon.alexa.hho.stickynotes;

import android.util.Log;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
enum StickyNoteMediaType {
    VIDEO,
    THUMBNAIL,
    IMAGE;

    private static final String TAG = "StickyNoteMediaType";

    @Nullable
    public static StickyNoteMediaType fromString(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unsupported media type: " + str, e);
            return null;
        }
    }
}
