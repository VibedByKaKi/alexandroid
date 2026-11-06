package org.jetbrains.kotlin.konan.target;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"hostTargetSuffix", "", "host", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "target", "kotlin-native-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class TargetManagerKt {
    @NotNull
    public static final String hostTargetSuffix(@NotNull KonanTarget konanTarget, @NotNull KonanTarget konanTarget2) {
        konanTarget.getClass();
        konanTarget2.getClass();
        if (Intrinsics.areEqual(konanTarget2, konanTarget)) {
            return konanTarget.getName();
        }
        return konanTarget.getName() + '-' + konanTarget2.getName();
    }
}
