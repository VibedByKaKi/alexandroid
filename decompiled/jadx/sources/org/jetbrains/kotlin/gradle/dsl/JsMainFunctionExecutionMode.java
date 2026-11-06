package org.jetbrains.kotlin.gradle.dsl;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsMainFunctionExecutionMode;", "", "mode", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMode", "()Ljava/lang/String;", "CALL", "NO_CALL", "Companion", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum JsMainFunctionExecutionMode {
    CALL("call"),
    NO_CALL("noCall");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String mode;

    JsMainFunctionExecutionMode(String str) {
        this.mode = str;
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsMainFunctionExecutionMode$Companion;", "", "()V", "fromMode", "Lorg/jetbrains/kotlin/gradle/dsl/JsMainFunctionExecutionMode;", "mode", "", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nJsMainFunctionExecutionMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsMainFunctionExecutionMode.kt\norg/jetbrains/kotlin/gradle/dsl/JsMainFunctionExecutionMode$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,19:1\n1282#2,2:20\n*S KotlinDebug\n*F\n+ 1 JsMainFunctionExecutionMode.kt\norg/jetbrains/kotlin/gradle/dsl/JsMainFunctionExecutionMode$Companion\n*L\n15#1:20,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsMainFunctionExecutionMode fromMode(@NotNull String mode) {
            JsMainFunctionExecutionMode jsMainFunctionExecutionMode;
            mode.getClass();
            JsMainFunctionExecutionMode[] values = JsMainFunctionExecutionMode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jsMainFunctionExecutionMode = null;
                    break;
                }
                jsMainFunctionExecutionMode = values[i];
                if (Intrinsics.areEqual(jsMainFunctionExecutionMode.getMode(), mode)) {
                    break;
                }
                i++;
            }
            if (jsMainFunctionExecutionMode != null) {
                return jsMainFunctionExecutionMode;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown main function execution mode: ", mode));
            return null;
        }

        private Companion() {
        }
    }
}
