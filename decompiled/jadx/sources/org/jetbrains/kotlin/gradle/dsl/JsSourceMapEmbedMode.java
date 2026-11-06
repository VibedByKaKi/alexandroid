package org.jetbrains.kotlin.gradle.dsl;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsSourceMapEmbedMode;", "", "mode", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMode", "()Ljava/lang/String;", "SOURCE_MAP_SOURCE_CONTENT_INLINING", "SOURCE_MAP_SOURCE_CONTENT_NEVER", "SOURCE_MAP_SOURCE_CONTENT_ALWAYS", "Companion", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum JsSourceMapEmbedMode {
    SOURCE_MAP_SOURCE_CONTENT_INLINING("inlining"),
    SOURCE_MAP_SOURCE_CONTENT_NEVER("never"),
    SOURCE_MAP_SOURCE_CONTENT_ALWAYS("always");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String mode;

    JsSourceMapEmbedMode(String str) {
        this.mode = str;
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsSourceMapEmbedMode$Companion;", "", "()V", "fromMode", "Lorg/jetbrains/kotlin/gradle/dsl/JsSourceMapEmbedMode;", "mode", "", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nJsSourceMapEmbedMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsSourceMapEmbedMode.kt\norg/jetbrains/kotlin/gradle/dsl/JsSourceMapEmbedMode$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1282#2,2:21\n*S KotlinDebug\n*F\n+ 1 JsSourceMapEmbedMode.kt\norg/jetbrains/kotlin/gradle/dsl/JsSourceMapEmbedMode$Companion\n*L\n16#1:21,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsSourceMapEmbedMode fromMode(@NotNull String mode) {
            JsSourceMapEmbedMode jsSourceMapEmbedMode;
            mode.getClass();
            JsSourceMapEmbedMode[] values = JsSourceMapEmbedMode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jsSourceMapEmbedMode = null;
                    break;
                }
                jsSourceMapEmbedMode = values[i];
                if (Intrinsics.areEqual(jsSourceMapEmbedMode.getMode(), mode)) {
                    break;
                }
                i++;
            }
            if (jsSourceMapEmbedMode != null) {
                return jsSourceMapEmbedMode;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown JS source map embed mode: ", mode));
            return null;
        }

        private Companion() {
        }
    }
}
