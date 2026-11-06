package io.noties.markwon.image;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AsyncDrawableLoader {
    @NonNull
    public static AsyncDrawableLoader noOp() {
        return new AsyncDrawableLoaderNoOp();
    }

    public abstract void cancel(@NonNull AsyncDrawable asyncDrawable);

    public abstract void load(@NonNull AsyncDrawable asyncDrawable);

    @Nullable
    public abstract Drawable placeholder(@NonNull AsyncDrawable asyncDrawable);
}
