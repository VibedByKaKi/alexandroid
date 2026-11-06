package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class DrawableUtils {
    private DrawableUtils() {
    }

    public static void applyIntrinsicBounds(@NonNull Drawable drawable) {
        drawable.setBounds(intrinsicBounds(drawable));
    }

    public static void applyIntrinsicBoundsIfEmpty(@NonNull Drawable drawable) {
        if (drawable.getBounds().isEmpty()) {
            drawable.setBounds(intrinsicBounds(drawable));
        }
    }

    @NonNull
    @CheckResult
    public static Rect intrinsicBounds(@NonNull Drawable drawable) {
        return new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
