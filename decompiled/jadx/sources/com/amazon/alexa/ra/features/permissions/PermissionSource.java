package com.amazon.alexa.ra.features.permissions;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.ra.core.data.model.PermissionState;
import com.amazon.alexa.ra.core.features.permissions.PermissionSourceApi;
import com.amazon.alexa.ra.core.features.permissions.Permissions;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/features/permissions/PermissionSource;", "Lcom/amazon/alexa/ra/core/features/permissions/PermissionSourceApi;", "applicationContext", "Landroid/content/Context;", "activityProvider", "Lkotlin/Function0;", "Landroid/app/Activity;", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "hasPermission", "Lcom/amazon/alexa/ra/core/data/model/PermissionState;", "permissionName", "", "checkOverlayPermissionState", "checkMicrophonePermissionState", "checkNotificationPermissionState", "isBackgroundRestricted", "", "start", "", "stop", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionSource.kt\ncom/amazon/alexa/ra/features/permissions/PermissionSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes18.dex */
public final class PermissionSource implements PermissionSourceApi {
    public static final int $stable = 8;

    @NotNull
    private final Function0<Activity> activityProvider;

    @NotNull
    private final Context applicationContext;

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionSource(@NotNull Context context, @NotNull Function0<? extends Activity> function0) {
        context.getClass();
        function0.getClass();
        this.applicationContext = context;
        this.activityProvider = function0;
    }

    private final PermissionState checkMicrophonePermissionState() {
        Activity activity;
        if (ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.RECORD_AUDIO") == 0) {
            return PermissionState.GRANTED;
        }
        Activity invoke = this.activityProvider.invoke();
        WeakReference weakReference = invoke != null ? new WeakReference(invoke) : null;
        return (weakReference == null || (activity = (Activity) weakReference.get()) == null) ? true : ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.RECORD_AUDIO") ? PermissionState.DENIED : PermissionState.NOT_GRANTED;
    }

    private final PermissionState checkNotificationPermissionState() {
        return Build.VERSION.SDK_INT < 33 ? PermissionState.GRANTED : ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.POST_NOTIFICATIONS") == 0 ? PermissionState.GRANTED : PermissionState.NOT_GRANTED;
    }

    private final PermissionState checkOverlayPermissionState() {
        return Settings.canDrawOverlays(this.applicationContext) ? PermissionState.GRANTED : PermissionState.NOT_GRANTED;
    }

    @Override // com.amazon.alexa.ra.core.features.permissions.PermissionSourceApi
    @NotNull
    public PermissionState hasPermission(@NotNull String permissionName) {
        permissionName.getClass();
        int hashCode = permissionName.hashCode();
        if (hashCode != -1091287984) {
            if (hashCode != 595233003) {
                if (hashCode == 1370921258 && permissionName.equals(Permissions.MICROPHONE)) {
                    return checkMicrophonePermissionState();
                }
            } else if (permissionName.equals("notification")) {
                return checkNotificationPermissionState();
            }
        } else if (permissionName.equals("overlay")) {
            return checkOverlayPermissionState();
        }
        return PermissionState.INVALID;
    }

    @Override // com.amazon.alexa.ra.core.features.permissions.PermissionSourceApi
    public boolean isBackgroundRestricted() {
        Object systemService = this.applicationContext.getSystemService("activity");
        systemService.getClass();
        return ((ActivityManager) systemService).isBackgroundRestricted();
    }

    @Override // com.amazon.alexa.ra.core.features.permissions.PermissionSourceApi
    public void start() {
    }

    @Override // com.amazon.alexa.ra.core.features.permissions.PermissionSourceApi
    public void stop() {
    }
}
