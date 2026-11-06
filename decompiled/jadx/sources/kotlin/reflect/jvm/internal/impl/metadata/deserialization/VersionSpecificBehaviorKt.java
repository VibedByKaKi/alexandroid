package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return (binaryVersion.getMajor() == 1 && binaryVersion.getMinor() >= 4) || binaryVersion.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return isKotlin1Dot4OrLater(binaryVersion);
    }
}
