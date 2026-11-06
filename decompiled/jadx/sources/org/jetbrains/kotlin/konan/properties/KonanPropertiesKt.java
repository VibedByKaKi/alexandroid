package org.jetbrains.kotlin.konan.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.kotlin.konan.target.KonanTarget;
import org.jetbrains.kotlin.konan.util.ArchiveType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"defaultArchiveTypeByHost", "Lorg/jetbrains/kotlin/konan/util/ArchiveType;", "host", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "kotlin-native-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class KonanPropertiesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ArchiveType defaultArchiveTypeByHost(KonanTarget konanTarget) {
        if (Intrinsics.areEqual(konanTarget, KonanTarget.LINUX_X64.INSTANCE) ? true : Intrinsics.areEqual(konanTarget, KonanTarget.MACOS_X64.INSTANCE) ? true : Intrinsics.areEqual(konanTarget, KonanTarget.MACOS_ARM64.INSTANCE)) {
            return ArchiveType.TAR_GZ;
        }
        if (Intrinsics.areEqual(konanTarget, KonanTarget.MINGW_X64.INSTANCE)) {
            return ArchiveType.ZIP;
        }
        throw new IllegalStateException((konanTarget + " can't be a host platform!").toString());
    }
}
