package org.jetbrains.kotlin.library;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lorg/jetbrains/kotlin/library/RequiredUnresolvedLibrary;", "Lorg/jetbrains/kotlin/library/UnresolvedLibrary;", "path", "", "libraryVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "getLibraryVersion", "()Ljava/lang/String;", "getPath", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "substitutePath", "newPath", "toString", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RequiredUnresolvedLibrary extends UnresolvedLibrary {

    @Nullable
    private final String libraryVersion;

    @NotNull
    private final String path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredUnresolvedLibrary(@NotNull String str, @Nullable String str2) {
        super(null);
        str.getClass();
        this.path = str;
        this.libraryVersion = str2;
    }

    public static /* synthetic */ RequiredUnresolvedLibrary copy$default(RequiredUnresolvedLibrary requiredUnresolvedLibrary, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requiredUnresolvedLibrary.path;
        }
        if ((i & 2) != 0) {
            str2 = requiredUnresolvedLibrary.libraryVersion;
        }
        return requiredUnresolvedLibrary.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLibraryVersion() {
        return this.libraryVersion;
    }

    @NotNull
    public final RequiredUnresolvedLibrary copy(@NotNull String path, @Nullable String libraryVersion) {
        path.getClass();
        return new RequiredUnresolvedLibrary(path, libraryVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequiredUnresolvedLibrary)) {
            return false;
        }
        RequiredUnresolvedLibrary requiredUnresolvedLibrary = (RequiredUnresolvedLibrary) other;
        return Intrinsics.areEqual(this.path, requiredUnresolvedLibrary.path) && Intrinsics.areEqual(this.libraryVersion, requiredUnresolvedLibrary.libraryVersion);
    }

    @Override // org.jetbrains.kotlin.library.UnresolvedLibrary
    @Nullable
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

    @Override // org.jetbrains.kotlin.library.UnresolvedLibrary
    @NotNull
    public String getPath() {
        return this.path;
    }

    public int hashCode() {
        int hashCode = this.path.hashCode() * 31;
        String str = this.libraryVersion;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // org.jetbrains.kotlin.library.UnresolvedLibrary
    @NotNull
    public RequiredUnresolvedLibrary substitutePath(@NotNull String newPath) {
        newPath.getClass();
        return copy$default(this, newPath, null, 2, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RequiredUnresolvedLibrary(path=");
        sb.append(this.path);
        sb.append(", libraryVersion=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.libraryVersion, sb);
    }
}
