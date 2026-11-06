package org.jetbrains.kotlin.konan.target;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\b"}, d2 = {"isSimulator", "", "Lorg/jetbrains/kotlin/konan/target/TargetTriple;", "(Lorg/jetbrains/kotlin/konan/target/TargetTriple;)Z", "withOSVersion", "osVersion", "", "withoutVendor", "kotlin-native-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nTargetTriple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetTriple.kt\norg/jetbrains/kotlin/konan/target/TargetTripleKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes11.dex */
public final class TargetTripleKt {
    public static final boolean isSimulator(@NotNull TargetTriple targetTriple) {
        targetTriple.getClass();
        return Intrinsics.areEqual(targetTriple.getEnvironment(), "simulator");
    }

    @NotNull
    public static final TargetTriple withOSVersion(@NotNull TargetTriple targetTriple, @NotNull String str) {
        targetTriple.getClass();
        str.getClass();
        return TargetTriple.copy$default(targetTriple, null, null, targetTriple.getOs() + str, null, 11, null);
    }

    @NotNull
    public static final String withoutVendor(@NotNull TargetTriple targetTriple) {
        String str;
        targetTriple.getClass();
        if (targetTriple.getEnvironment() != null) {
            str = "-" + targetTriple.getEnvironment();
        } else {
            str = "";
        }
        return targetTriple.getArchitecture() + '-' + targetTriple.getOs() + str;
    }
}
