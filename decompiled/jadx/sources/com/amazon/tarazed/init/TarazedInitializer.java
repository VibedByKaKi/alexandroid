package com.amazon.tarazed.init;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.tarazed.activity.ActivityTracker;
import com.amazon.tarazed.dagger.injectors.LibraryInjector;
import com.amazon.tarazed.logging.TarazedLogger;
import com.amazon.tarazed.utility.DeviceInfoUtilityAndroid;
import com.dee.app.contacts.common.constants.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0007J\u0015\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@GX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@GX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0014@GX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/amazon/tarazed/init/TarazedInitializer;", "", "()V", "INITIALIZED", "Ljava/util/concurrent/atomic/AtomicBoolean;", Constants.LOG_TAG, "", "<set-?>", "Lcom/amazon/tarazed/activity/ActivityTracker;", "activityTracker", "getActivityTracker", "()Lcom/amazon/tarazed/activity/ActivityTracker;", "setActivityTracker", "(Lcom/amazon/tarazed/activity/ActivityTracker;)V", "Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid;", "deviceInfoUtility", "getDeviceInfoUtility", "()Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid;", "setDeviceInfoUtility", "(Lcom/amazon/tarazed/utility/DeviceInfoUtilityAndroid;)V", "Lcom/amazon/tarazed/logging/TarazedLogger;", "logger", "getLogger", "()Lcom/amazon/tarazed/logging/TarazedLogger;", "setLogger", "(Lcom/amazon/tarazed/logging/TarazedLogger;)V", "init", "", "context", "Landroid/content/Context;", "reset", "setInitialized", "state", "", "setInitialized$TarazedAndroidLibrary_release", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TarazedInitializer {

    @NotNull
    private static final String TAG = "TarazedInitializer";
    public static ActivityTracker activityTracker;
    public static DeviceInfoUtilityAndroid deviceInfoUtility;
    public static TarazedLogger logger;

    @NotNull
    public static final TarazedInitializer INSTANCE = new TarazedInitializer();

    @NotNull
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();

    private TarazedInitializer() {
    }

    @NotNull
    public final ActivityTracker getActivityTracker() {
        ActivityTracker activityTracker2 = activityTracker;
        if (activityTracker2 != null) {
            return activityTracker2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityTracker");
        return null;
    }

    @NotNull
    public final DeviceInfoUtilityAndroid getDeviceInfoUtility() {
        DeviceInfoUtilityAndroid deviceInfoUtilityAndroid = deviceInfoUtility;
        if (deviceInfoUtilityAndroid != null) {
            return deviceInfoUtilityAndroid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceInfoUtility");
        return null;
    }

    @NotNull
    public final TarazedLogger getLogger() {
        TarazedLogger tarazedLogger = logger;
        if (tarazedLogger != null) {
            return tarazedLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    public final void init(@NotNull Context context) {
        context.getClass();
        if (INITIALIZED.getAndSet(true)) {
            getLogger().w(TAG, "Initializer called after initialization, ignoring.");
            return;
        }
        LibraryInjector.initComponent(context);
        LibraryInjector.getComponent().inject(this);
        getLogger().i(TAG, "Initializing Tarazed");
    }

    @VisibleForTesting
    public final void reset() {
        INITIALIZED.set(false);
    }

    @Inject
    public final void setActivityTracker(@NotNull ActivityTracker activityTracker2) {
        activityTracker2.getClass();
        activityTracker = activityTracker2;
    }

    @Inject
    public final void setDeviceInfoUtility(@NotNull DeviceInfoUtilityAndroid deviceInfoUtilityAndroid) {
        deviceInfoUtilityAndroid.getClass();
        deviceInfoUtility = deviceInfoUtilityAndroid;
    }

    @VisibleForTesting
    public final void setInitialized$TarazedAndroidLibrary_release(boolean state) {
        INITIALIZED.set(state);
    }

    @Inject
    public final void setLogger(@NotNull TarazedLogger tarazedLogger) {
        tarazedLogger.getClass();
        logger = tarazedLogger;
    }
}
