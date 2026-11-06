package com.bumptech.glide.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface RequestListener<R> {
    boolean onLoadFailed(@Nullable GlideException glideException, @Nullable Object obj, @NonNull Target<R> target, boolean z);

    boolean onResourceReady(@NonNull R r, @NonNull Object obj, Target<R> target, @NonNull DataSource dataSource, boolean z);
}
