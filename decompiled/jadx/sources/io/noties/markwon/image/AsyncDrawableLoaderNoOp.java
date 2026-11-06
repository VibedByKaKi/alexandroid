package io.noties.markwon.image;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class AsyncDrawableLoaderNoOp extends AsyncDrawableLoader {
    @Override // io.noties.markwon.image.AsyncDrawableLoader
    @Nullable
    public Drawable placeholder(@NonNull AsyncDrawable asyncDrawable) {
        return null;
    }

    @Override // io.noties.markwon.image.AsyncDrawableLoader
    public void cancel(@NonNull AsyncDrawable asyncDrawable) {
    }

    @Override // io.noties.markwon.image.AsyncDrawableLoader
    public void load(@NonNull AsyncDrawable asyncDrawable) {
    }
}
