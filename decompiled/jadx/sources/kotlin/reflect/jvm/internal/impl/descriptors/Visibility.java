package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class Visibility {
    private final boolean isPublicAPI;

    @NotNull
    private final String name;

    public Visibility(@NotNull String str, boolean z) {
        str.getClass();
        this.name = str;
        this.isPublicAPI = z;
    }

    @Nullable
    public Integer compareTo(@NotNull Visibility visibility) {
        visibility.getClass();
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.name;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    @NotNull
    public final String toString() {
        return getInternalDisplayName();
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }
}
