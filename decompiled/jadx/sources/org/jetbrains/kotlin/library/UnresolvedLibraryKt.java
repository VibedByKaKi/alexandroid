package org.jetbrains.kotlin.library;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"UnresolvedLibrary", "Lorg/jetbrains/kotlin/library/RequiredUnresolvedLibrary;", "path", "", "libraryVersion", "Lorg/jetbrains/kotlin/library/UnresolvedLibrary;", "lenient", "", "kotlin-util-klib"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class UnresolvedLibraryKt {
    @NotNull
    public static final UnresolvedLibrary UnresolvedLibrary(@NotNull String str, @Nullable String str2, boolean z) {
        str.getClass();
        return z ? new LenientUnresolvedLibrary(str, str2) : new RequiredUnresolvedLibrary(str, str2);
    }

    @NotNull
    public static final RequiredUnresolvedLibrary UnresolvedLibrary(@NotNull String str, @Nullable String str2) {
        str.getClass();
        return new RequiredUnresolvedLibrary(str, str2);
    }
}
