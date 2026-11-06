package com.amazon.alexa.ra.android.smartfragment.bridge;

import com.amazon.alexa.photos.metrics.MetricsValidator$$ExternalSyntheticLambda0;
import com.amazon.alexa.ra.android.smartfragment.util.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "", "count", "", "event", "", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface BridgeMetrics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String ERROR_DROPPED = "SmartFragment.Bridge.ErrorDropped";

    @NotNull
    public static final String ERROR_REJECTED_PREFIX = "SmartFragment.Bridge.ErrorRejected.";

    @NotNull
    public static final String JSI_INSTALL_ABANDONED = "SmartFragment.Bridge.JsiInstallAbandoned";

    @NotNull
    public static final String JSI_INSTALL_FAILURE = "SmartFragment.Bridge.JsiInstallFailure";

    @NotNull
    public static final String LIFECYCLE_FAILURE = "SmartFragment.Bridge.LifecycleFailure";

    @NotNull
    public static final String MESSAGE_REJECTED_PREFIX = "SmartFragment.Bridge.MessageRejected.";

    @NotNull
    public static final String POOL_EVICTION = "SmartFragment.Pool.Eviction";

    @NotNull
    public static final String POOL_EXHAUSTED = "SmartFragment.Pool.Exhausted";

    @NotNull
    public static final String POOL_TEARDOWN_TIMEOUT = "SmartFragment.Pool.TeardownTimeout";

    @NotNull
    public static final String STARTUP_TIMEOUT = "SmartFragment.Bridge.StartupTimeout";

    @NotNull
    public static final String TEARDOWN_FAILURE = "SmartFragment.Bridge.TeardownFailure";

    @NotNull
    public static final String URL_BUNDLE_REJECTED = "SmartFragment.Bridge.UrlBundleRejected";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics$Companion;", "", "<init>", "()V", "JSI_INSTALL_FAILURE", "", "JSI_INSTALL_ABANDONED", "URL_BUNDLE_REJECTED", "STARTUP_TIMEOUT", "ERROR_DROPPED", "TEARDOWN_FAILURE", "LIFECYCLE_FAILURE", "MESSAGE_REJECTED_PREFIX", "ERROR_REJECTED_PREFIX", "POOL_EVICTION", "POOL_EXHAUSTED", "POOL_TEARDOWN_TIMEOUT", "LOGGING", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "getLOGGING", "()Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String ERROR_DROPPED = "SmartFragment.Bridge.ErrorDropped";

        @NotNull
        public static final String ERROR_REJECTED_PREFIX = "SmartFragment.Bridge.ErrorRejected.";

        @NotNull
        public static final String JSI_INSTALL_ABANDONED = "SmartFragment.Bridge.JsiInstallAbandoned";

        @NotNull
        public static final String JSI_INSTALL_FAILURE = "SmartFragment.Bridge.JsiInstallFailure";

        @NotNull
        public static final String LIFECYCLE_FAILURE = "SmartFragment.Bridge.LifecycleFailure";

        @NotNull
        public static final String MESSAGE_REJECTED_PREFIX = "SmartFragment.Bridge.MessageRejected.";

        @NotNull
        public static final String POOL_EVICTION = "SmartFragment.Pool.Eviction";

        @NotNull
        public static final String POOL_EXHAUSTED = "SmartFragment.Pool.Exhausted";

        @NotNull
        public static final String POOL_TEARDOWN_TIMEOUT = "SmartFragment.Pool.TeardownTimeout";

        @NotNull
        public static final String STARTUP_TIMEOUT = "SmartFragment.Bridge.StartupTimeout";

        @NotNull
        public static final String TEARDOWN_FAILURE = "SmartFragment.Bridge.TeardownFailure";

        @NotNull
        public static final String URL_BUNDLE_REJECTED = "SmartFragment.Bridge.UrlBundleRejected";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final BridgeMetrics LOGGING = new MetricsValidator$$ExternalSyntheticLambda0(24);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void LOGGING$lambda$0(String str) {
            str.getClass();
            Logger.INSTANCE.info("bridge metric " + str);
        }

        @NotNull
        public final BridgeMetrics getLOGGING() {
            return LOGGING;
        }
    }

    void count(@NotNull String event);
}
