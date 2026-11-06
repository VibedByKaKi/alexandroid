package kotlinx.metadata.internal.metadata.jvm.deserialization;

import kotlin.Metadata;
import kotlinx.metadata.internal.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lkotlinx/metadata/internal/metadata/jvm/deserialization/JvmFlags;", "", "()V", "IS_COMPILED_IN_COMPATIBILITY_MODE", "Lkotlinx/metadata/internal/metadata/deserialization/Flags$BooleanFlagField;", "kotlin.jvm.PlatformType", "getIS_COMPILED_IN_COMPATIBILITY_MODE", "()Lorg/jetbrains/kotlin/metadata/deserialization/Flags$BooleanFlagField;", "IS_COMPILED_IN_JVM_DEFAULT_MODE", "getIS_COMPILED_IN_JVM_DEFAULT_MODE", "IS_MOVED_FROM_INTERFACE_COMPANION", "getIS_MOVED_FROM_INTERFACE_COMPANION", "getClassFlags", "", "isAllInterfaceBodiesInside", "", "isCompatibilityMode", "getPropertyFlags", "isMovedFromInterfaceCompanion", "metadata.jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmFlags {
    private static final Flags.BooleanFlagField IS_COMPILED_IN_COMPATIBILITY_MODE;
    private static final Flags.BooleanFlagField IS_COMPILED_IN_JVM_DEFAULT_MODE;

    @NotNull
    public static final JvmFlags INSTANCE = new JvmFlags();
    private static final Flags.BooleanFlagField IS_MOVED_FROM_INTERFACE_COMPANION = Flags.FlagField.booleanFirst();

    static {
        Flags.BooleanFlagField booleanFirst = Flags.FlagField.booleanFirst();
        IS_COMPILED_IN_JVM_DEFAULT_MODE = booleanFirst;
        IS_COMPILED_IN_COMPATIBILITY_MODE = Flags.FlagField.booleanAfter(booleanFirst);
    }

    private JvmFlags() {
    }

    public final int getClassFlags(boolean isAllInterfaceBodiesInside, boolean isCompatibilityMode) {
        return IS_COMPILED_IN_JVM_DEFAULT_MODE.toFlags(Boolean.valueOf(isAllInterfaceBodiesInside)) | IS_COMPILED_IN_COMPATIBILITY_MODE.toFlags(Boolean.valueOf(isCompatibilityMode));
    }

    public final Flags.BooleanFlagField getIS_COMPILED_IN_COMPATIBILITY_MODE() {
        return IS_COMPILED_IN_COMPATIBILITY_MODE;
    }

    public final Flags.BooleanFlagField getIS_COMPILED_IN_JVM_DEFAULT_MODE() {
        return IS_COMPILED_IN_JVM_DEFAULT_MODE;
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return IS_MOVED_FROM_INTERFACE_COMPANION;
    }

    public final int getPropertyFlags(boolean isMovedFromInterfaceCompanion) {
        return IS_MOVED_FROM_INTERFACE_COMPANION.toFlags(Boolean.valueOf(isMovedFromInterfaceCompanion));
    }
}
