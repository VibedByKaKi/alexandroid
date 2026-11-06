package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface RenderProps {
    <T> void clear(@NonNull Prop<T> prop);

    void clearAll();

    @Nullable
    <T> T get(@NonNull Prop<T> prop);

    @NonNull
    <T> T get(@NonNull Prop<T> prop, @NonNull T t);

    <T> void set(@NonNull Prop<T> prop, @Nullable T t);
}
