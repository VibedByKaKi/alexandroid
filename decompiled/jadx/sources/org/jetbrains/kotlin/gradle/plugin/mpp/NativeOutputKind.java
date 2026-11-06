package org.jetbrains.kotlin.gradle.plugin.mpp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.target.CompilerOutputKind;
import org.jetbrains.kotlin.konan.target.KonanTarget;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EXECUTABLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/mpp/NativeOutputKind;", "", "compilerOutputKind", "Lorg/jetbrains/kotlin/konan/target/CompilerOutputKind;", "taskNameClassifier", "", "description", "(Ljava/lang/String;ILorg/jetbrains/kotlin/konan/target/CompilerOutputKind;Ljava/lang/String;Ljava/lang/String;)V", "getCompilerOutputKind", "()Lorg/jetbrains/kotlin/konan/target/CompilerOutputKind;", "getDescription", "()Ljava/lang/String;", "getTaskNameClassifier", "availableFor", "", "target", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "EXECUTABLE", "TEST", "DYNAMIC", "STATIC", "FRAMEWORK", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public class NativeOutputKind {
    private static final /* synthetic */ NativeOutputKind[] $VALUES;
    public static final NativeOutputKind DYNAMIC;
    public static final NativeOutputKind EXECUTABLE;
    public static final NativeOutputKind FRAMEWORK;
    public static final NativeOutputKind STATIC;
    public static final NativeOutputKind TEST;

    @NotNull
    private final CompilerOutputKind compilerOutputKind;

    @NotNull
    private final String description;

    @NotNull
    private final String taskNameClassifier;

    private static final /* synthetic */ NativeOutputKind[] $values() {
        return new NativeOutputKind[]{EXECUTABLE, TEST, DYNAMIC, STATIC, FRAMEWORK};
    }

    static {
        CompilerOutputKind compilerOutputKind = CompilerOutputKind.PROGRAM;
        EXECUTABLE = new NativeOutputKind("EXECUTABLE", 0, compilerOutputKind, "executable", "an executable");
        TEST = new NativeOutputKind("TEST", 1, compilerOutputKind, "test", "a test executable");
        DYNAMIC = new NativeOutputKind("DYNAMIC", 2) { // from class: org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind.DYNAMIC
            {
                CompilerOutputKind compilerOutputKind2 = CompilerOutputKind.DYNAMIC;
                String str = "a dynamic library";
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str2 = "shared";
            }

            @Override // org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind
            public boolean availableFor(@NotNull KonanTarget target) {
                target.getClass();
                return !Intrinsics.areEqual(target, KonanTarget.WASM32.INSTANCE);
            }
        };
        STATIC = new NativeOutputKind("STATIC", 3) { // from class: org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind.STATIC
            {
                CompilerOutputKind compilerOutputKind2 = CompilerOutputKind.STATIC;
                String str = "a static library";
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str2 = "static";
            }

            @Override // org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind
            public boolean availableFor(@NotNull KonanTarget target) {
                target.getClass();
                return !Intrinsics.areEqual(target, KonanTarget.WASM32.INSTANCE);
            }
        };
        FRAMEWORK = new NativeOutputKind("FRAMEWORK", 4) { // from class: org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind.FRAMEWORK
            {
                CompilerOutputKind compilerOutputKind2 = CompilerOutputKind.FRAMEWORK;
                String str = "a framework";
                DefaultConstructorMarker defaultConstructorMarker = null;
                String str2 = "framework";
            }

            @Override // org.jetbrains.kotlin.gradle.plugin.mpp.NativeOutputKind
            public boolean availableFor(@NotNull KonanTarget target) {
                target.getClass();
                return target.getFamily().isAppleFamily();
            }
        };
        $VALUES = $values();
    }

    private NativeOutputKind(String str, int i, CompilerOutputKind compilerOutputKind, String str2, String str3) {
        this.compilerOutputKind = compilerOutputKind;
        this.taskNameClassifier = str2;
        this.description = str3;
    }

    public static NativeOutputKind valueOf(String str) {
        return (NativeOutputKind) Enum.valueOf(NativeOutputKind.class, str);
    }

    public static NativeOutputKind[] values() {
        return (NativeOutputKind[]) $VALUES.clone();
    }

    public boolean availableFor(@NotNull KonanTarget target) {
        target.getClass();
        return true;
    }

    @NotNull
    public final CompilerOutputKind getCompilerOutputKind() {
        return this.compilerOutputKind;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTaskNameClassifier() {
        return this.taskNameClassifier;
    }

    public /* synthetic */ NativeOutputKind(String str, int i, CompilerOutputKind compilerOutputKind, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, compilerOutputKind, str2, str3);
    }

    public /* synthetic */ NativeOutputKind(String str, int i, CompilerOutputKind compilerOutputKind, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, compilerOutputKind, str2, (i2 & 4) != 0 ? str2 : str3);
    }
}
