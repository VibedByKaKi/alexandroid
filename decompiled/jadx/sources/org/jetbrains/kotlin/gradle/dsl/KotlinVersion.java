package org.jetbrains.kotlin.gradle.dsl;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 org.jetbrains.kotlin.gradle.dsl.KotlinVersion, still in use, count: 1, list:
  (r0v9 org.jetbrains.kotlin.gradle.dsl.KotlinVersion) from 0x00a2: SPUT (r0v9 org.jetbrains.kotlin.gradle.dsl.KotlinVersion) (LINE:163) org.jetbrains.kotlin.gradle.dsl.KotlinVersion.DEFAULT org.jetbrains.kotlin.gradle.dsl.KotlinVersion
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinVersion;", "", "version", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "KOTLIN_1_0", "KOTLIN_1_1", "KOTLIN_1_2", "KOTLIN_1_3", "KOTLIN_1_4", "KOTLIN_1_5", "KOTLIN_1_6", "KOTLIN_1_7", "KOTLIN_1_8", "KOTLIN_1_9", "KOTLIN_2_0", "KOTLIN_2_1", "Companion", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KotlinVersion {
    KOTLIN_1_0("1.0"),
    KOTLIN_1_1("1.1"),
    KOTLIN_1_2("1.2"),
    KOTLIN_1_3("1.3"),
    KOTLIN_1_4("1.4"),
    KOTLIN_1_5("1.5"),
    KOTLIN_1_6("1.6"),
    KOTLIN_1_7("1.7"),
    KOTLIN_1_8("1.8"),
    KOTLIN_1_9("1.9"),
    KOTLIN_2_0("2.0"),
    KOTLIN_2_1("2.1");


    @NotNull
    private static final KotlinVersion DEFAULT = new KotlinVersion("1.9");

    @NotNull
    private final String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    static {
    }

    private KotlinVersion(String str) {
        this.version = str;
    }

    public static KotlinVersion valueOf(String str) {
        return (KotlinVersion) Enum.valueOf(KotlinVersion.class, str);
    }

    public static KotlinVersion[] values() {
        return (KotlinVersion[]) $VALUES.clone();
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/KotlinVersion$Companion;", "", "()V", "DEFAULT", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinVersion;", "getDEFAULT", "()Lorg/jetbrains/kotlin/gradle/dsl/KotlinVersion;", "fromVersion", "version", "", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nKotlinVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinVersion.kt\norg/jetbrains/kotlin/gradle/dsl/KotlinVersion$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,31:1\n1282#2,2:32\n*S KotlinDebug\n*F\n+ 1 KotlinVersion.kt\norg/jetbrains/kotlin/gradle/dsl/KotlinVersion$Companion\n*L\n25#1:32,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KotlinVersion fromVersion(@NotNull String version) {
            KotlinVersion kotlinVersion;
            version.getClass();
            KotlinVersion[] values = KotlinVersion.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    kotlinVersion = null;
                    break;
                }
                kotlinVersion = values[i];
                if (Intrinsics.areEqual(kotlinVersion.getVersion(), version)) {
                    break;
                }
                i++;
            }
            if (kotlinVersion != null) {
                return kotlinVersion;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown Kotlin version: ", version));
            return null;
        }

        @NotNull
        public final KotlinVersion getDEFAULT() {
            return KotlinVersion.DEFAULT;
        }

        private Companion() {
        }
    }
}
