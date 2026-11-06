package io.noties.markwon.utils;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes9.dex */
public abstract class DrawableUtils {
    private DrawableUtils() {
    }

    public static void intrinsicBounds(@NonNull Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
