package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class Prop<T> {
    private final String name;

    public Prop(@NonNull String str) {
        this.name = str;
    }

    @NonNull
    public static <T> Prop<T> of(@NonNull Class<T> cls, @NonNull String str) {
        return new Prop<>(str);
    }

    public void clear(@NonNull RenderProps renderProps) {
        renderProps.clear(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((Prop) obj).name);
    }

    @Nullable
    public T get(@NonNull RenderProps renderProps) {
        return (T) renderProps.get(this);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @NonNull
    public String name() {
        return this.name;
    }

    @NonNull
    public T require(@NonNull RenderProps renderProps) {
        T t = get(renderProps);
        if (t != null) {
            return t;
        }
        Single$$ExternalSyntheticBUOutline0.m$1(this.name);
        return null;
    }

    public void set(@NonNull RenderProps renderProps, @Nullable T t) {
        renderProps.set(this, t);
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("Prop{name='"), this.name, "'}");
    }

    @NonNull
    public T get(@NonNull RenderProps renderProps, @NonNull T t) {
        return (T) renderProps.get(this, t);
    }

    @NonNull
    public static <T> Prop<T> of(@NonNull String str) {
        return new Prop<>(str);
    }
}
