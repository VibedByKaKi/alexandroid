package org.jetbrains.kotlin.gradle.dsl;

import com.amazon.alexa.assistant.toolkit.session.davs.filters.DAVSWakeWordFilterConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.target.Android;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 org.jetbrains.kotlin.gradle.dsl.JvmTarget, still in use, count: 1, list:
  (r0v0 org.jetbrains.kotlin.gradle.dsl.JvmTarget) from 0x00bc: SPUT (r0v0 org.jetbrains.kotlin.gradle.dsl.JvmTarget) (LINE:189) org.jetbrains.kotlin.gradle.dsl.JvmTarget.DEFAULT org.jetbrains.kotlin.gradle.dsl.JvmTarget
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JvmTarget;", "", "target", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTarget", "()Ljava/lang/String;", "JVM_1_8", "JVM_9", "JVM_10", "JVM_11", "JVM_12", "JVM_13", "JVM_14", "JVM_15", "JVM_16", "JVM_17", "JVM_18", "JVM_19", "JVM_20", "JVM_21", "Companion", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class JvmTarget {
    JVM_1_8("1.8"),
    JVM_9("9"),
    JVM_10("10"),
    JVM_11("11"),
    JVM_12("12"),
    JVM_13("13"),
    JVM_14("14"),
    JVM_15("15"),
    JVM_16(DAVSWakeWordFilterConstants.ENGINE_COMPATIBILITY_ID_LIST),
    JVM_17("17"),
    JVM_18("18"),
    JVM_19("19"),
    JVM_20("20"),
    JVM_21(Android.API);


    @NotNull
    private static final JvmTarget DEFAULT = new JvmTarget("1.8");

    @NotNull
    private final String target;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    static {
    }

    private JvmTarget(String str) {
        this.target = str;
    }

    public static JvmTarget valueOf(String str) {
        return (JvmTarget) Enum.valueOf(JvmTarget.class, str);
    }

    public static JvmTarget[] values() {
        return (JvmTarget[]) $VALUES.clone();
    }

    @NotNull
    public final String getTarget() {
        return this.target;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JvmTarget$Companion;", "", "()V", "DEFAULT", "Lorg/jetbrains/kotlin/gradle/dsl/JvmTarget;", "getDEFAULT", "()Lorg/jetbrains/kotlin/gradle/dsl/JvmTarget;", "fromTarget", "target", "", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nJvmTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmTarget.kt\norg/jetbrains/kotlin/gradle/dsl/JvmTarget$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,33:1\n1282#2,2:34\n*S KotlinDebug\n*F\n+ 1 JvmTarget.kt\norg/jetbrains/kotlin/gradle/dsl/JvmTarget$Companion\n*L\n27#1:34,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JvmTarget fromTarget(@NotNull String target) {
            JvmTarget jvmTarget;
            target.getClass();
            JvmTarget[] values = JvmTarget.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jvmTarget = null;
                    break;
                }
                jvmTarget = values[i];
                if (Intrinsics.areEqual(jvmTarget.getTarget(), target)) {
                    break;
                }
                i++;
            }
            if (jvmTarget != null) {
                return jvmTarget;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown Kotlin JVM target: ", target));
            return null;
        }

        @NotNull
        public final JvmTarget getDEFAULT() {
            return JvmTarget.DEFAULT;
        }

        private Companion() {
        }
    }
}
