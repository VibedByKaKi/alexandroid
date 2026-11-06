package org.jetbrains.kotlin.library.impl;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/BuiltInsPlatform;", "", "(Ljava/lang/String;I)V", "JVM", "JS", "NATIVE", "WASM", CodePackage.COMMON, "Companion", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum BuiltInsPlatform {
    JVM,
    JS,
    NATIVE,
    WASM,
    COMMON;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/library/impl/BuiltInsPlatform$Companion;", "", "()V", "parseFromString", "Lorg/jetbrains/kotlin/library/impl/BuiltInsPlatform;", "name", "", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nKotlinLibraryWriterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinLibraryWriterImpl.kt\norg/jetbrains/kotlin/library/impl/BuiltInsPlatform$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,189:1\n1282#2,2:190\n*S KotlinDebug\n*F\n+ 1 KotlinLibraryWriterImpl.kt\norg/jetbrains/kotlin/library/impl/BuiltInsPlatform$Companion\n*L\n183#1:190,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final BuiltInsPlatform parseFromString(@NotNull String name) {
            name.getClass();
            for (BuiltInsPlatform builtInsPlatform : BuiltInsPlatform.values()) {
                if (Intrinsics.areEqual(builtInsPlatform.name(), name)) {
                    return builtInsPlatform;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
