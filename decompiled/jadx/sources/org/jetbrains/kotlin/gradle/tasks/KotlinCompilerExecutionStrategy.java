package org.jetbrains.kotlin.gradle.tasks;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/KotlinCompilerExecutionStrategy;", "", "propertyValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPropertyValue", "()Ljava/lang/String;", "DAEMON", "IN_PROCESS", "OUT_OF_PROCESS", "Companion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum KotlinCompilerExecutionStrategy {
    DAEMON("daemon"),
    IN_PROCESS("in-process"),
    OUT_OF_PROCESS("out-of-process");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String propertyValue;

    KotlinCompilerExecutionStrategy(String str) {
        this.propertyValue = str;
    }

    @NotNull
    public final String getPropertyValue() {
        return this.propertyValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/tasks/KotlinCompilerExecutionStrategy$Companion;", "", "()V", "fromProperty", "Lorg/jetbrains/kotlin/gradle/tasks/KotlinCompilerExecutionStrategy;", "value", "", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nCompileUsingKotlinDaemon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompileUsingKotlinDaemon.kt\norg/jetbrains/kotlin/gradle/tasks/KotlinCompilerExecutionStrategy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KotlinCompilerExecutionStrategy fromProperty(@Nullable String value) {
            KotlinCompilerExecutionStrategy kotlinCompilerExecutionStrategy;
            if (value == null) {
                return KotlinCompilerExecutionStrategy.DAEMON;
            }
            KotlinCompilerExecutionStrategy[] values = KotlinCompilerExecutionStrategy.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    kotlinCompilerExecutionStrategy = null;
                    break;
                }
                kotlinCompilerExecutionStrategy = values[i];
                if (StringsKt.equals(kotlinCompilerExecutionStrategy.getPropertyValue(), value, true)) {
                    break;
                }
                i++;
            }
            if (kotlinCompilerExecutionStrategy != null) {
                return kotlinCompilerExecutionStrategy;
            }
            PathKt$$ExternalSyntheticBUOutline0.m("Unknown value '", value, "' is passed for Kotlin compiler execution strategy");
            return null;
        }

        private Companion() {
        }
    }
}
