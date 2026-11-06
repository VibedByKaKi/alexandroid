package com.mapbox.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import com.dee.app.contacts.common.constants.Constants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mapbox/common/TelemetryInitializer;", "", "()V", "CHINESE_APP_STORE_PACKAGE_NAMES", "", "", Constants.LOG_TAG, "getInstallerPackageName", "context", "Landroid/content/Context;", "isEarlyTelemetryInitializationEnabledForPlatform", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes8.dex */
public final class TelemetryInitializer {

    @NotNull
    private static final String TAG = "TelemetryInitializer";

    @NotNull
    public static final TelemetryInitializer INSTANCE = new TelemetryInitializer();

    @NotNull
    private static final Set<String> CHINESE_APP_STORE_PACKAGE_NAMES = SetsKt.setOf((Object[]) new String[]{"com.huawei.appmarket", "com.xiaomi.market", "com.xiaomi.mipicks", "com.tencent.android.qqdownloader", "com.oppo.market", "com.heytap.market", "com.bbk.appstore", "com.baidu.appsearch", "com.qihoo.appstore", "com.wandoujia.phoenix2", "com.meizu.mstore", "com.pp.assistant"});

    private TelemetryInitializer() {
    }

    private final String getInstallerPackageName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : packageManager.getInstallerPackageName(context.getPackageName());
    }

    @JvmStatic
    public static final boolean isEarlyTelemetryInitializationEnabledForPlatform() {
        try {
            String installerPackageName = INSTANCE.getInstallerPackageName(MapboxSDKCommon.INSTANCE.getContext());
            if (installerPackageName != null) {
                if (CHINESE_APP_STORE_PACKAGE_NAMES.contains(installerPackageName)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            Log.warning("Unable to determine installer package name: " + th.getMessage(), TAG);
            return true;
        }
    }
}
