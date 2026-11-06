package org.jetbrains.kotlin.gradle.plugin.mpp;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.gradle.api.Named;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.target.KonanTarget;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType, still in use, count: 1, list:
  (r0v0 org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType) from 0x0022: FILLED_NEW_ARRAY 
  (r1v1 org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType)
  (r0v0 org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType)
 A[WRAPPED] (LINE:35) elemType: org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/mpp/NativeBuildType;", "", "Lorg/gradle/api/Named;", "optimized", "", "debuggable", "(Ljava/lang/String;IZZ)V", "getDebuggable", "()Z", "getOptimized", "embedBitcode", "Lorg/jetbrains/kotlin/gradle/plugin/mpp/BitcodeEmbeddingMode;", "target", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "getName", "", "RELEASE", "DEBUG", "Companion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class NativeBuildType implements Named {
    RELEASE(true, false),
    DEBUG(false, true);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<NativeBuildType> DEFAULT_BUILD_TYPES;
    private final boolean debuggable;
    private final boolean optimized;

    static {
        DEFAULT_BUILD_TYPES = SetsKt.setOf((Object[]) new NativeBuildType[]{r1, new NativeBuildType(true, false)});
    }

    private NativeBuildType(boolean z, boolean z2) {
        this.optimized = z;
        this.debuggable = z2;
    }

    public static NativeBuildType valueOf(String str) {
        return (NativeBuildType) Enum.valueOf(NativeBuildType.class, str);
    }

    public static NativeBuildType[] values() {
        return (NativeBuildType[]) $VALUES.clone();
    }

    @Deprecated(message = "Default BitcodeEmbeddingMode is BitcodeEmbeddingMode.DISABLE", replaceWith = @ReplaceWith(expression = "BitcodeEmbeddingMode.DISABLE", imports = {}))
    @NotNull
    public final BitcodeEmbeddingMode embedBitcode(@NotNull KonanTarget target) {
        target.getClass();
        return BitcodeEmbeddingMode.DISABLE;
    }

    public final boolean getDebuggable() {
        return this.debuggable;
    }

    @NotNull
    public String getName() {
        String name = name();
        Locale locale = Locale.ENGLISH;
        return TableInfo$$ExternalSyntheticOutline0.m(locale, name, locale);
    }

    public final boolean getOptimized() {
        return this.optimized;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/mpp/NativeBuildType$Companion;", "", "()V", "DEFAULT_BUILD_TYPES", "", "Lorg/jetbrains/kotlin/gradle/plugin/mpp/NativeBuildType;", "getDEFAULT_BUILD_TYPES", "()Ljava/util/Set;", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<NativeBuildType> getDEFAULT_BUILD_TYPES() {
            return NativeBuildType.DEFAULT_BUILD_TYPES;
        }

        private Companion() {
        }
    }
}
