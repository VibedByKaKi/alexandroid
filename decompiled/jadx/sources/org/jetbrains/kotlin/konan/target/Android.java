package org.jetbrains.kotlin.konan.target;

import com.facebook.soloader.MinElf;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.target.KonanTarget;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/Android;", "", "()V", "API", "", "architectureMap", "", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "architectureDirForTarget", "target", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class Android {

    @NotNull
    public static final String API = "21";

    @NotNull
    public static final Android INSTANCE = new Android();

    @NotNull
    private static final Map<KonanTarget, String> architectureMap = MapsKt.mapOf(TuplesKt.to(KonanTarget.ANDROID_X86.INSTANCE, MinElf.ISA.X86), TuplesKt.to(KonanTarget.ANDROID_X64.INSTANCE, MinElf.ISA.X86_64), TuplesKt.to(KonanTarget.ANDROID_ARM32.INSTANCE, "arm"), TuplesKt.to(KonanTarget.ANDROID_ARM64.INSTANCE, "arm64"));

    private Android() {
    }

    @NotNull
    public final String architectureDirForTarget(@NotNull KonanTarget target) {
        target.getClass();
        return "android-21/arch-" + ((String) MapsKt.getValue(architectureMap, target));
    }
}
