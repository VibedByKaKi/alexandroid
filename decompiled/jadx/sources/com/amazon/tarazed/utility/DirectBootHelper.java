package com.amazon.tarazed.utility;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.UserManager;
import com.amazon.tarazed.metrics.TarazedMetricsHelper;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/tarazed/utility/DirectBootHelper;", "", "()V", "METRIC_DIRECT_BOOT_CONTEXT_UNSUPPORTED", "", "MIN_SUPPORTED_DIRECT_BOOT_SDK", "", Constants.LOG_TAG, "getDirectBootContext", "Landroid/content/Context;", "context", "metricsHelper", "Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;", "isDeviceInDirectBootMode", "", "isDirectBootSupported", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DirectBootHelper {

    @NotNull
    public static final DirectBootHelper INSTANCE = new DirectBootHelper();

    @NotNull
    private static final String METRIC_DIRECT_BOOT_CONTEXT_UNSUPPORTED = "DirectBootContextUnsupported";
    private static final int MIN_SUPPORTED_DIRECT_BOOT_SDK = 24;

    @NotNull
    private static final String TAG = "DirectBootHelper";

    private DirectBootHelper() {
    }

    @NotNull
    public final Context getDirectBootContext(@NotNull Context context, @NotNull TarazedMetricsHelper metricsHelper) {
        context.getClass();
        metricsHelper.getClass();
        if (isDirectBootSupported(context)) {
            Context createDeviceProtectedStorageContext = context.getApplicationContext().createDeviceProtectedStorageContext();
            createDeviceProtectedStorageContext.getClass();
            return createDeviceProtectedStorageContext;
        }
        metricsHelper.addCount(TAG, METRIC_DIRECT_BOOT_CONTEXT_UNSUPPORTED, 1.0d);
        Buffer$$ExternalSyntheticBUOutline0.m$1("Unable to get direct boot context. Direct boot is not supported for this device");
        return null;
    }

    public final boolean isDeviceInDirectBootMode(@NotNull Context context) {
        context.getClass();
        context.getSystemService("user").getClass();
        return !((UserManager) r0).isUserUnlocked();
    }

    public final boolean isDirectBootSupported(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("device_policy");
        systemService.getClass();
        return ((DevicePolicyManager) systemService).getStorageEncryptionStatus() == 5;
    }
}
