package org.jetbrains.kotlin.library;

import com.amazon.alexa.presence.utils.MetricsUtil;
import com.amazon.comms.ringservice.Sdp;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.file.File;
import org.jetbrains.kotlin.library.KotlinLibrary;
import org.jetbrains.kotlin.util.WithLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H&¢\u0006\u0002\u0010\u0019J!\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH&¢\u0006\u0002\u0010\u001eR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/library/SearchPathResolver;", "L", "Lorg/jetbrains/kotlin/library/KotlinLibrary;", "Lorg/jetbrains/kotlin/util/WithLogger;", "searchRoots", "", "Lorg/jetbrains/kotlin/konan/file/File;", "getSearchRoots", "()Ljava/util/List;", "defaultLinks", "noStdLib", "", "noDefaultLibs", "noEndorsedLibs", "isProvidedByDefault", "unresolved", "Lorg/jetbrains/kotlin/library/UnresolvedLibrary;", "libraryMatch", Sdp.ATTRIBUTE_CANDIDATE, "(Lorg/jetbrains/kotlin/library/KotlinLibrary;Lorg/jetbrains/kotlin/library/UnresolvedLibrary;)Z", "resolutionSequence", "Lkotlin/sequences/Sequence;", "givenPath", "", MetricsUtil.MetricsId.RESOLVE, "(Ljava/lang/String;)Lorg/jetbrains/kotlin/library/KotlinLibrary;", "Lorg/jetbrains/kotlin/library/LenientUnresolvedLibrary;", "isDefaultLink", "(Lorg/jetbrains/kotlin/library/LenientUnresolvedLibrary;Z)Lorg/jetbrains/kotlin/library/KotlinLibrary;", "Lorg/jetbrains/kotlin/library/RequiredUnresolvedLibrary;", "(Lorg/jetbrains/kotlin/library/RequiredUnresolvedLibrary;Z)Lorg/jetbrains/kotlin/library/KotlinLibrary;", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface SearchPathResolver<L extends KotlinLibrary> extends WithLogger {
    static /* synthetic */ KotlinLibrary resolve$default(SearchPathResolver searchPathResolver, LenientUnresolvedLibrary lenientUnresolvedLibrary, boolean z, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: resolve");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return searchPathResolver.resolve(lenientUnresolvedLibrary, z);
    }

    @NotNull
    List<L> defaultLinks(boolean noStdLib, boolean noDefaultLibs, boolean noEndorsedLibs);

    @NotNull
    List<File> getSearchRoots();

    default boolean isProvidedByDefault(@NotNull UnresolvedLibrary unresolved) {
        unresolved.getClass();
        return false;
    }

    boolean libraryMatch(@NotNull L candidate, @NotNull UnresolvedLibrary unresolved);

    @NotNull
    Sequence<File> resolutionSequence(@NotNull String givenPath);

    @NotNull
    L resolve(@NotNull String givenPath);

    @Nullable
    L resolve(@NotNull LenientUnresolvedLibrary unresolved, boolean isDefaultLink);

    @NotNull
    L resolve(@NotNull RequiredUnresolvedLibrary unresolved, boolean isDefaultLink);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <L extends KotlinLibrary> boolean isProvidedByDefault(@NotNull SearchPathResolver<L> searchPathResolver, @NotNull UnresolvedLibrary unresolvedLibrary) {
            unresolvedLibrary.getClass();
            return SearchPathResolver.super.isProvidedByDefault(unresolvedLibrary);
        }
    }

    static /* synthetic */ KotlinLibrary resolve$default(SearchPathResolver searchPathResolver, RequiredUnresolvedLibrary requiredUnresolvedLibrary, boolean z, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: resolve");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return searchPathResolver.resolve(requiredUnresolvedLibrary, z);
    }
}
