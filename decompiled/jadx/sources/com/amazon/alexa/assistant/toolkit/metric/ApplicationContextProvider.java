package com.amazon.alexa.assistant.toolkit.metric;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.core.content.pm.PackageInfoCompat;
import com.amazon.alexa.assistant.foundation.BuildConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/ApplicationContextProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cached", "Lcom/amazon/alexa/assistant/toolkit/metric/ApplicationContextHolder;", "provide", "provide$toolkit_release", "buildContext", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ApplicationContextProvider {

    @NotNull
    private final ApplicationContextHolder cached;

    public ApplicationContextProvider(@NotNull Context context) {
        context.getClass();
        this.cached = buildContext(context);
    }

    private final ApplicationContextHolder buildContext(Context context) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        String obj = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        String packageName = context.getPackageName();
        packageName.getClass();
        String processName = Application.getProcessName();
        processName.getClass();
        return new ApplicationContextHolder(null, obj, packageName, processName, packageInfo.versionName, String.valueOf(PackageInfoCompat.getLongVersionCode(packageInfo)), BuildConfig.SDK_NAME, BuildConfig.SDK_VERSION, null, 257, null);
    }

    @NotNull
    /* renamed from: provide$toolkit_release, reason: from getter */
    public final ApplicationContextHolder getCached() {
        return this.cached;
    }
}
