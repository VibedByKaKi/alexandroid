package org.jetbrains.kotlin.konan.target;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.konan.target.KonanTarget;
import org.jetbrains.kotlin.konan.util.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u001d\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u001c./0123456789:;<=>?@ABCDEFGHI¨\u0006J"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "Lorg/jetbrains/kotlin/konan/util/Named;", "Ljava/io/Serializable;", "name", "", "family", "Lorg/jetbrains/kotlin/konan/target/Family;", "architecture", "Lorg/jetbrains/kotlin/konan/target/Architecture;", "(Ljava/lang/String;Lorg/jetbrains/kotlin/konan/target/Family;Lorg/jetbrains/kotlin/konan/target/Architecture;)V", "getArchitecture", "()Lorg/jetbrains/kotlin/konan/target/Architecture;", "getFamily", "()Lorg/jetbrains/kotlin/konan/target/Family;", "getName", "()Ljava/lang/String;", "toString", "ANDROID_ARM32", "ANDROID_ARM64", "ANDROID_X64", "ANDROID_X86", "Companion", "IOS_ARM32", "IOS_ARM64", "IOS_SIMULATOR_ARM64", "IOS_X64", "LINUX_ARM32_HFP", "LINUX_ARM64", "LINUX_MIPS32", "LINUX_MIPSEL32", "LINUX_X64", "MACOS_ARM64", "MACOS_X64", "MINGW_X64", "MINGW_X86", "TVOS_ARM64", "TVOS_SIMULATOR_ARM64", "TVOS_X64", "WASM32", "WATCHOS_ARM32", "WATCHOS_ARM64", "WATCHOS_DEVICE_ARM64", "WATCHOS_SIMULATOR_ARM64", "WATCHOS_X64", "WATCHOS_X86", "ZEPHYR", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_ARM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_X86;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_ARM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_SIMULATOR_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_ARM32_HFP;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_MIPS32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_MIPSEL32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$MACOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$MACOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$MINGW_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$MINGW_X86;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$TVOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$TVOS_SIMULATOR_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$TVOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$WASM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_ARM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_DEVICE_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_SIMULATOR_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_X86;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$ZEPHYR;", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class KonanTarget implements Named, Serializable {

    @NotNull
    private static final Set<KonanTarget> deprecatedTargets;

    @NotNull
    private static final Set<LINUX_ARM32_HFP> toleratedDeprecatedTargets;

    @NotNull
    private final Architecture architecture;

    @NotNull
    private final Family family;

    @NotNull
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Map<String, KonanTarget>> predefinedTargets$delegate = LazyKt.lazy(new Function0<Map<String, ? extends KonanTarget>>() { // from class: org.jetbrains.kotlin.konan.target.KonanTarget$Companion$predefinedTargets$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends KonanTarget> invoke() {
            List listOf = CollectionsKt.listOf((Object[]) new KonanTarget[]{KonanTarget.ANDROID_X64.INSTANCE, KonanTarget.ANDROID_X86.INSTANCE, KonanTarget.ANDROID_ARM32.INSTANCE, KonanTarget.ANDROID_ARM64.INSTANCE, KonanTarget.IOS_ARM32.INSTANCE, KonanTarget.IOS_ARM64.INSTANCE, KonanTarget.IOS_X64.INSTANCE, KonanTarget.IOS_SIMULATOR_ARM64.INSTANCE, KonanTarget.WATCHOS_ARM32.INSTANCE, KonanTarget.WATCHOS_ARM64.INSTANCE, KonanTarget.WATCHOS_X86.INSTANCE, KonanTarget.WATCHOS_X64.INSTANCE, KonanTarget.WATCHOS_SIMULATOR_ARM64.INSTANCE, KonanTarget.WATCHOS_DEVICE_ARM64.INSTANCE, KonanTarget.TVOS_ARM64.INSTANCE, KonanTarget.TVOS_X64.INSTANCE, KonanTarget.TVOS_SIMULATOR_ARM64.INSTANCE, KonanTarget.LINUX_X64.INSTANCE, KonanTarget.MINGW_X86.INSTANCE, KonanTarget.MINGW_X64.INSTANCE, KonanTarget.MACOS_X64.INSTANCE, KonanTarget.MACOS_ARM64.INSTANCE, KonanTarget.LINUX_ARM64.INSTANCE, KonanTarget.LINUX_ARM32_HFP.INSTANCE, KonanTarget.LINUX_MIPS32.INSTANCE, KonanTarget.LINUX_MIPSEL32.INSTANCE, KonanTarget.WASM32.INSTANCE});
            LinkedHashMap linkedHashMap = new LinkedHashMap(BitVector$$ExternalSyntheticOutline0.m(listOf, 10, 16));
            for (Object obj : listOf) {
                linkedHashMap.put(((KonanTarget) obj).getName(), obj);
            }
            return linkedHashMap;
        }
    });

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_ARM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ANDROID_ARM32 extends KonanTarget {

        @NotNull
        public static final ANDROID_ARM32 INSTANCE = new ANDROID_ARM32();

        private ANDROID_ARM32() {
            super("android_arm32", Family.ANDROID, Architecture.ARM32, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ANDROID_ARM64 extends KonanTarget {

        @NotNull
        public static final ANDROID_ARM64 INSTANCE = new ANDROID_ARM64();

        private ANDROID_ARM64() {
            super("android_arm64", Family.ANDROID, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ANDROID_X64 extends KonanTarget {

        @NotNull
        public static final ANDROID_X64 INSTANCE = new ANDROID_X64();

        private ANDROID_X64() {
            super("android_x64", Family.ANDROID, Architecture.X64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$ANDROID_X86;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ANDROID_X86 extends KonanTarget {

        @NotNull
        public static final ANDROID_X86 INSTANCE = new ANDROID_X86();

        private ANDROID_X86() {
            super("android_x86", Family.ANDROID, Architecture.X86, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_ARM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class IOS_ARM32 extends KonanTarget {

        @NotNull
        public static final IOS_ARM32 INSTANCE = new IOS_ARM32();

        private IOS_ARM32() {
            super("ios_arm32", Family.IOS, Architecture.ARM32, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class IOS_ARM64 extends KonanTarget {

        @NotNull
        public static final IOS_ARM64 INSTANCE = new IOS_ARM64();

        private IOS_ARM64() {
            super("ios_arm64", Family.IOS, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_SIMULATOR_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class IOS_SIMULATOR_ARM64 extends KonanTarget {

        @NotNull
        public static final IOS_SIMULATOR_ARM64 INSTANCE = new IOS_SIMULATOR_ARM64();

        private IOS_SIMULATOR_ARM64() {
            super("ios_simulator_arm64", Family.IOS, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$IOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class IOS_X64 extends KonanTarget {

        @NotNull
        public static final IOS_X64 INSTANCE = new IOS_X64();

        private IOS_X64() {
            super("ios_x64", Family.IOS, Architecture.X64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_ARM32_HFP;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LINUX_ARM32_HFP extends KonanTarget {

        @NotNull
        public static final LINUX_ARM32_HFP INSTANCE = new LINUX_ARM32_HFP();

        private LINUX_ARM32_HFP() {
            super("linux_arm32_hfp", Family.LINUX, Architecture.ARM32, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LINUX_ARM64 extends KonanTarget {

        @NotNull
        public static final LINUX_ARM64 INSTANCE = new LINUX_ARM64();

        private LINUX_ARM64() {
            super("linux_arm64", Family.LINUX, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_MIPS32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LINUX_MIPS32 extends KonanTarget {

        @NotNull
        public static final LINUX_MIPS32 INSTANCE = new LINUX_MIPS32();

        private LINUX_MIPS32() {
            super("linux_mips32", Family.LINUX, Architecture.MIPS32, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_MIPSEL32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LINUX_MIPSEL32 extends KonanTarget {

        @NotNull
        public static final LINUX_MIPSEL32 INSTANCE = new LINUX_MIPSEL32();

        private LINUX_MIPSEL32() {
            super("linux_mipsel32", Family.LINUX, Architecture.MIPSEL32, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LINUX_X64 extends KonanTarget {

        @NotNull
        public static final LINUX_X64 INSTANCE = new LINUX_X64();

        private LINUX_X64() {
            super("linux_x64", Family.LINUX, Architecture.X64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$MACOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MACOS_ARM64 extends KonanTarget {

        @NotNull
        public static final MACOS_ARM64 INSTANCE = new MACOS_ARM64();

        private MACOS_ARM64() {
            super("macos_arm64", Family.OSX, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$MACOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MACOS_X64 extends KonanTarget {

        @NotNull
        public static final MACOS_X64 INSTANCE = new MACOS_X64();

        private MACOS_X64() {
            super("macos_x64", Family.OSX, Architecture.X64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$MINGW_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MINGW_X64 extends KonanTarget {

        @NotNull
        public static final MINGW_X64 INSTANCE = new MINGW_X64();

        private MINGW_X64() {
            super("mingw_x64", Family.MINGW, Architecture.X64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$MINGW_X86;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MINGW_X86 extends KonanTarget {

        @NotNull
        public static final MINGW_X86 INSTANCE = new MINGW_X86();

        private MINGW_X86() {
            super("mingw_x86", Family.MINGW, Architecture.X86, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$TVOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TVOS_ARM64 extends KonanTarget {

        @NotNull
        public static final TVOS_ARM64 INSTANCE = new TVOS_ARM64();

        private TVOS_ARM64() {
            super("tvos_arm64", Family.TVOS, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$TVOS_SIMULATOR_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TVOS_SIMULATOR_ARM64 extends KonanTarget {

        @NotNull
        public static final TVOS_SIMULATOR_ARM64 INSTANCE = new TVOS_SIMULATOR_ARM64();

        private TVOS_SIMULATOR_ARM64() {
            super("tvos_simulator_arm64", Family.TVOS, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$TVOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TVOS_X64 extends KonanTarget {

        @NotNull
        public static final TVOS_X64 INSTANCE = new TVOS_X64();

        private TVOS_X64() {
            super("tvos_x64", Family.TVOS, Architecture.X64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$WASM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WASM32 extends KonanTarget {

        @NotNull
        public static final WASM32 INSTANCE = new WASM32();

        private WASM32() {
            super("wasm32", Family.WASM, Architecture.WASM32, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_ARM32;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WATCHOS_ARM32 extends KonanTarget {

        @NotNull
        public static final WATCHOS_ARM32 INSTANCE = new WATCHOS_ARM32();

        private WATCHOS_ARM32() {
            super("watchos_arm32", Family.WATCHOS, Architecture.ARM32, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WATCHOS_ARM64 extends KonanTarget {

        @NotNull
        public static final WATCHOS_ARM64 INSTANCE = new WATCHOS_ARM64();

        private WATCHOS_ARM64() {
            super("watchos_arm64", Family.WATCHOS, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_DEVICE_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WATCHOS_DEVICE_ARM64 extends KonanTarget {

        @NotNull
        public static final WATCHOS_DEVICE_ARM64 INSTANCE = new WATCHOS_DEVICE_ARM64();

        private WATCHOS_DEVICE_ARM64() {
            super("watchos_device_arm64", Family.WATCHOS, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_SIMULATOR_ARM64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WATCHOS_SIMULATOR_ARM64 extends KonanTarget {

        @NotNull
        public static final WATCHOS_SIMULATOR_ARM64 INSTANCE = new WATCHOS_SIMULATOR_ARM64();

        private WATCHOS_SIMULATOR_ARM64() {
            super("watchos_simulator_arm64", Family.WATCHOS, Architecture.ARM64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_X64;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WATCHOS_X64 extends KonanTarget {

        @NotNull
        public static final WATCHOS_X64 INSTANCE = new WATCHOS_X64();

        private WATCHOS_X64() {
            super("watchos_x64", Family.WATCHOS, Architecture.X64, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$WATCHOS_X86;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "()V", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WATCHOS_X86 extends KonanTarget {

        @NotNull
        public static final WATCHOS_X86 INSTANCE = new WATCHOS_X86();

        private WATCHOS_X86() {
            super("watchos_x86", Family.WATCHOS, Architecture.X86, null);
        }
    }

    static {
        LINUX_ARM32_HFP linux_arm32_hfp = LINUX_ARM32_HFP.INSTANCE;
        deprecatedTargets = SetsKt.setOf((Object[]) new KonanTarget[]{WATCHOS_X86.INSTANCE, IOS_ARM32.INSTANCE, linux_arm32_hfp, MINGW_X86.INSTANCE, LINUX_MIPS32.INSTANCE, LINUX_MIPSEL32.INSTANCE, WASM32.INSTANCE});
        toleratedDeprecatedTargets = SetsKt.setOf(linux_arm32_hfp);
    }

    private KonanTarget(String str, Family family, Architecture architecture) {
        this.name = str;
        this.family = family;
        this.architecture = architecture;
    }

    @NotNull
    public final Architecture getArchitecture() {
        return this.architecture;
    }

    @NotNull
    public final Family getFamily() {
        return this.family;
    }

    @Override // org.jetbrains.kotlin.konan.util.Named
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String toString() {
        return getName();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$Companion;", "", "()V", "deprecatedTargets", "", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "getDeprecatedTargets", "()Ljava/util/Set;", "predefinedTargets", "", "", "getPredefinedTargets", "()Ljava/util/Map;", "predefinedTargets$delegate", "Lkotlin/Lazy;", "toleratedDeprecatedTargets", "Lorg/jetbrains/kotlin/konan/target/KonanTarget$LINUX_ARM32_HFP;", "getToleratedDeprecatedTargets", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<KonanTarget> getDeprecatedTargets() {
            return KonanTarget.deprecatedTargets;
        }

        @NotNull
        public final Map<String, KonanTarget> getPredefinedTargets() {
            return (Map) KonanTarget.predefinedTargets$delegate.getValue();
        }

        @NotNull
        public final Set<LINUX_ARM32_HFP> getToleratedDeprecatedTargets() {
            return KonanTarget.toleratedDeprecatedTargets;
        }

        private Companion() {
        }
    }

    public /* synthetic */ KonanTarget(String str, Family family, Architecture architecture, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, family, architecture);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/KonanTarget$ZEPHYR;", "Lorg/jetbrains/kotlin/konan/target/KonanTarget;", "subName", "", "genericName", "(Ljava/lang/String;Ljava/lang/String;)V", "getGenericName", "()Ljava/lang/String;", "getSubName", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ZEPHYR extends KonanTarget {

        @NotNull
        private final String genericName;

        @NotNull
        private final String subName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZEPHYR(@NotNull String str, @NotNull String str2) {
            super(str2 + '_' + str, Family.ZEPHYR, Architecture.ARM32, null);
            str.getClass();
            str2.getClass();
            this.subName = str;
            this.genericName = str2;
        }

        @NotNull
        public final String getGenericName() {
            return this.genericName;
        }

        @NotNull
        public final String getSubName() {
            return this.subName;
        }

        public /* synthetic */ ZEPHYR(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "zephyr" : str2);
        }
    }
}
