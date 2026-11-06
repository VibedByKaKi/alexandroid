package org.jetbrains.kotlin.konan.target;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.library.KotlinLibraryUtilsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/CompilerOutputKind;", "", "(Ljava/lang/String;I)V", "prefix", "", "target", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "suffix", "PROGRAM", "DYNAMIC", "STATIC", "FRAMEWORK", "LIBRARY", "BITCODE", "TEST_BUNDLE", "DYNAMIC_CACHE", "STATIC_CACHE", "PRELIMINARY_CACHE", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum CompilerOutputKind {
    PROGRAM { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.PROGRAM
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            StringBuilder sb = new StringBuilder(".");
            target.getClass();
            sb.append(target.getFamily().getExeSuffix());
            return sb.toString();
        }
    },
    DYNAMIC { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.DYNAMIC
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String prefix(@Nullable KonanTarget target) {
            target.getClass();
            return target.getFamily().getDynamicPrefix();
        }

        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            StringBuilder sb = new StringBuilder(".");
            target.getClass();
            sb.append(target.getFamily().getDynamicSuffix());
            return sb.toString();
        }
    },
    STATIC { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.STATIC
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String prefix(@Nullable KonanTarget target) {
            target.getClass();
            return target.getFamily().getStaticPrefix();
        }

        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            StringBuilder sb = new StringBuilder(".");
            target.getClass();
            sb.append(target.getFamily().getStaticSuffix());
            return sb.toString();
        }
    },
    FRAMEWORK { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.FRAMEWORK
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            return ".framework";
        }
    },
    LIBRARY { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.LIBRARY
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            return KotlinLibraryUtilsKt.KLIB_FILE_EXTENSION_WITH_DOT;
        }
    },
    BITCODE { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.BITCODE
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            return ".bc";
        }
    },
    TEST_BUNDLE { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.TEST_BUNDLE
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            return ".xctest";
        }
    },
    DYNAMIC_CACHE { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.DYNAMIC_CACHE
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String prefix(@Nullable KonanTarget target) {
            target.getClass();
            return target.getFamily().getDynamicPrefix();
        }

        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            StringBuilder sb = new StringBuilder(".");
            target.getClass();
            sb.append(target.getFamily().getDynamicSuffix());
            return sb.toString();
        }
    },
    STATIC_CACHE { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.STATIC_CACHE
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String prefix(@Nullable KonanTarget target) {
            target.getClass();
            return target.getFamily().getStaticPrefix();
        }

        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            StringBuilder sb = new StringBuilder(".");
            target.getClass();
            sb.append(target.getFamily().getStaticSuffix());
            return sb.toString();
        }
    },
    PRELIMINARY_CACHE { // from class: org.jetbrains.kotlin.konan.target.CompilerOutputKind.PRELIMINARY_CACHE
        @Override // org.jetbrains.kotlin.konan.target.CompilerOutputKind
        @NotNull
        public String suffix(@Nullable KonanTarget target) {
            return "";
        }
    };

    /* synthetic */ CompilerOutputKind(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String prefix$default(CompilerOutputKind compilerOutputKind, KonanTarget konanTarget, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: prefix");
            return null;
        }
        if ((i & 1) != 0) {
            konanTarget = null;
        }
        return compilerOutputKind.prefix(konanTarget);
    }

    public static /* synthetic */ String suffix$default(CompilerOutputKind compilerOutputKind, KonanTarget konanTarget, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: suffix");
            return null;
        }
        if ((i & 1) != 0) {
            konanTarget = null;
        }
        return compilerOutputKind.suffix(konanTarget);
    }

    @NotNull
    public String prefix(@Nullable KonanTarget target) {
        return "";
    }

    @NotNull
    public abstract String suffix(@Nullable KonanTarget target);
}
