package org.jetbrains.kotlin.library;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004H&R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/library/UnresolvedLibrary;", "", "()V", "libraryVersion", "", "getLibraryVersion", "()Ljava/lang/String;", "path", "getPath", "substitutePath", "newPath", "Lorg/jetbrains/kotlin/library/LenientUnresolvedLibrary;", "Lorg/jetbrains/kotlin/library/RequiredUnresolvedLibrary;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UnresolvedLibrary {
    public /* synthetic */ UnresolvedLibrary(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract String getLibraryVersion();

    @NotNull
    public abstract String getPath();

    @NotNull
    public abstract UnresolvedLibrary substitutePath(@NotNull String newPath);

    private UnresolvedLibrary() {
    }
}
