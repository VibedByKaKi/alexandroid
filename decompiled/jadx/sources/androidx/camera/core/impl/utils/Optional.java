package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    @NonNull
    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    @NonNull
    public static <T> Optional<T> fromNullable(@Nullable T t) {
        return t == null ? absent() : new Present(t);
    }

    @NonNull
    public static <T> Optional<T> of(@NonNull T t) {
        return new Present(Preconditions.checkNotNull(t));
    }

    public abstract boolean equals(@Nullable Object obj);

    @NonNull
    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    @NonNull
    public abstract Optional<T> or(@NonNull Optional<? extends T> optional);

    @NonNull
    public abstract T or(@NonNull Supplier<? extends T> supplier);

    @NonNull
    public abstract T or(@NonNull T t);

    @Nullable
    public abstract T orNull();

    @NonNull
    public abstract String toString();
}
