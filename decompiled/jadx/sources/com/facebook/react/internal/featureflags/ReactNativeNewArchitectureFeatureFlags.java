package com.facebook.react.internal.featureflags;

import android.annotation.SuppressLint;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.common.build.ReactBuildConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeNewArchitectureFeatureFlags;", "", "<init>", "()V", "isNewArchitectureStrictModeEnabled", "", "enableBridgelessArchitecture", "enableFabricRenderer", "useFabricInterop", "useTurboModuleInterop", "useTurboModules", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UseReactNativeNewArchitectureFeatureFlagDetector"})
/* loaded from: classes6.dex */
public final class ReactNativeNewArchitectureFeatureFlags {

    @NotNull
    public static final ReactNativeNewArchitectureFeatureFlags INSTANCE = new ReactNativeNewArchitectureFeatureFlags();

    private ReactNativeNewArchitectureFeatureFlags() {
    }

    @JvmStatic
    public static final boolean enableBridgelessArchitecture() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.enableBridgelessArchitecture();
        }
        Assertions.assertCondition(ReactNativeFeatureFlags.enableBridgelessArchitecture(), "ReactNativeFeatureFlags.enableBridgelessArchitecture() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    @JvmStatic
    public static final boolean enableFabricRenderer() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.enableFabricRenderer();
        }
        Assertions.assertCondition(ReactNativeFeatureFlags.enableFabricRenderer(), "ReactNativeFeatureFlags.enableFabricRenderer() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    @JvmStatic
    public static final boolean isNewArchitectureStrictModeEnabled() {
        return ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE;
    }

    @JvmStatic
    public static final boolean useFabricInterop() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useFabricInterop();
        }
        Assertions.assertCondition(!ReactNativeFeatureFlags.useFabricInterop(), "ReactNativeFeatureFlags.useFabricInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    @JvmStatic
    public static final boolean useTurboModuleInterop() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useTurboModuleInterop();
        }
        Assertions.assertCondition(!ReactNativeFeatureFlags.useTurboModuleInterop(), "ReactNativeFeatureFlags.useTurboModuleInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    @JvmStatic
    public static final boolean useTurboModules() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useTurboModules();
        }
        Assertions.assertCondition(ReactNativeFeatureFlags.useTurboModules(), "ReactNativeFeatureFlags.useTurboModules() should be set to TRUE when Strict Mode is enabled");
        return true;
    }
}
