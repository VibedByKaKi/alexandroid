package com.facebook.react.common.annotations.internal;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogger;", "", "<init>", "()V", "assertLegacyArchitecture", "", "name", "", "logLevel", "Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;", "executeAssert", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyArchitectureLogger {

    @NotNull
    public static final LegacyArchitectureLogger INSTANCE = new LegacyArchitectureLogger();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyArchitectureLogLevel.values().length];
            try {
                iArr[LegacyArchitectureLogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyArchitectureLogLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LegacyArchitectureLogger() {
    }

    @JvmStatic
    public static final void assertLegacyArchitecture(@NotNull String name, @NotNull LegacyArchitectureLogLevel logLevel) {
        name.getClass();
        logLevel.getClass();
        if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            INSTANCE.executeAssert(name, logLevel);
        }
    }

    public static /* synthetic */ void assertLegacyArchitecture$default(String str, LegacyArchitectureLogLevel legacyArchitectureLogLevel, int i, Object obj) {
        if ((i & 2) != 0) {
            legacyArchitectureLogLevel = LegacyArchitectureLogLevel.WARNING;
        }
        assertLegacyArchitecture(str, legacyArchitectureLogLevel);
    }

    private final void executeAssert(String name, LegacyArchitectureLogLevel logLevel) {
        if (ReactBuildConfig.DEBUG) {
            int i = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
            if (i == 1) {
                throw new AssertionException(BitVector$$ExternalSyntheticOutline0.m(name, " is being executed when app is fully running on the NEW Architecture."));
            }
            if (i == 2) {
                ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(BitVector$$ExternalSyntheticOutline0.m(name, " is being executed when app is fully running on the NEW Architecture.")));
            } else {
                PathKt$$ExternalSyntheticBUOutline0.m();
            }
        }
    }

    public static /* synthetic */ void executeAssert$default(LegacyArchitectureLogger legacyArchitectureLogger, String str, LegacyArchitectureLogLevel legacyArchitectureLogLevel, int i, Object obj) {
        if ((i & 2) != 0) {
            legacyArchitectureLogLevel = LegacyArchitectureLogLevel.WARNING;
        }
        legacyArchitectureLogger.executeAssert(str, legacyArchitectureLogLevel);
    }
}
