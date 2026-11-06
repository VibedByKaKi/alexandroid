package org.jetbrains.kotlin.gradle.dsl;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsDiagnosticMode;", "", "mode", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMode", "()Ljava/lang/String;", "RUNTIME_DIAGNOSTIC_EXCEPTION", "RUNTIME_DIAGNOSTIC_LOG", "Companion", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum JsDiagnosticMode {
    RUNTIME_DIAGNOSTIC_EXCEPTION(AuthorizationDelegateAdapter.FAILURE_EXCEPTION),
    RUNTIME_DIAGNOSTIC_LOG("log");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String mode;

    JsDiagnosticMode(String str) {
        this.mode = str;
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsDiagnosticMode$Companion;", "", "()V", "fromMode", "Lorg/jetbrains/kotlin/gradle/dsl/JsDiagnosticMode;", "mode", "", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nJsDiagnosticMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsDiagnosticMode.kt\norg/jetbrains/kotlin/gradle/dsl/JsDiagnosticMode$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,19:1\n1282#2,2:20\n*S KotlinDebug\n*F\n+ 1 JsDiagnosticMode.kt\norg/jetbrains/kotlin/gradle/dsl/JsDiagnosticMode$Companion\n*L\n15#1:20,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsDiagnosticMode fromMode(@NotNull String mode) {
            JsDiagnosticMode jsDiagnosticMode;
            mode.getClass();
            JsDiagnosticMode[] values = JsDiagnosticMode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jsDiagnosticMode = null;
                    break;
                }
                jsDiagnosticMode = values[i];
                if (Intrinsics.areEqual(jsDiagnosticMode.getMode(), mode)) {
                    break;
                }
                i++;
            }
            if (jsDiagnosticMode != null) {
                return jsDiagnosticMode;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown JS diagnostic mode: ", mode));
            return null;
        }

        private Companion() {
        }
    }
}
