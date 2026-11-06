package kotlinx.metadata.internal.metadata.deserialization;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"isKotlin1Dot4OrLater", "", "version", "Lkotlinx/metadata/internal/metadata/deserialization/BinaryVersion;", "isVersionRequirementTableWrittenCorrectly", "metadata"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return binaryVersion.getMajor() == 1 && binaryVersion.getMinor() >= 4;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion binaryVersion) {
        binaryVersion.getClass();
        return isKotlin1Dot4OrLater(binaryVersion);
    }
}
