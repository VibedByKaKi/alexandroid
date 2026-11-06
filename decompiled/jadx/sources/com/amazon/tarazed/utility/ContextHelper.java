package com.amazon.tarazed.utility;

import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import com.amazon.alexa.lifecycle.api.LifecycleEvent;
import com.amazon.tarazed.dagger.injectors.LibraryInjector;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/amazon/tarazed/utility/ContextHelper;", "", "()V", "<set-?>", "Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "deviceInfoUtility", "getDeviceInfoUtility$TarazedAndroidLibrary_release", "()Lcom/amazon/tarazed/utility/DeviceInfoUtility;", "setDeviceInfoUtility$TarazedAndroidLibrary_release", "(Lcom/amazon/tarazed/utility/DeviceInfoUtility;)V", "startService", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", LifecycleEvent.IS_FOREGROUND, "", "startService1P", "startService3P", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ContextHelper {

    @NotNull
    public static final ContextHelper INSTANCE;
    public static DeviceInfoUtility deviceInfoUtility;

    static {
        ContextHelper contextHelper = new ContextHelper();
        INSTANCE = contextHelper;
        LibraryInjector.getComponent().inject(contextHelper);
    }

    private ContextHelper() {
    }

    public static /* synthetic */ void startService$default(ContextHelper contextHelper, Context context, Intent intent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        contextHelper.startService(context, intent, z);
    }

    private final void startService1P(Context context, Intent intent, boolean isForeground) {
        ReflectionHelper reflectionHelper = ReflectionHelper.INSTANCE;
        Object hiddenStaticFieldValue = reflectionHelper.getHiddenStaticFieldValue(UserHandle.class, "CURRENT");
        hiddenStaticFieldValue.getClass();
        UserHandle userHandle = (UserHandle) hiddenStaticFieldValue;
        Method hiddenMethod = isForeground ? reflectionHelper.getHiddenMethod(context.getClass(), "startForegroundServiceAsUser") : reflectionHelper.getHiddenMethod(context.getClass(), "startServiceAsUser");
        hiddenMethod.getClass();
        hiddenMethod.setAccessible(true);
        hiddenMethod.invoke(context, intent, userHandle);
    }

    private final void startService3P(Context context, Intent intent, boolean isForeground) {
        if (isForeground) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @NotNull
    public final DeviceInfoUtility getDeviceInfoUtility$TarazedAndroidLibrary_release() {
        DeviceInfoUtility deviceInfoUtility2 = deviceInfoUtility;
        if (deviceInfoUtility2 != null) {
            return deviceInfoUtility2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deviceInfoUtility");
        return null;
    }

    @Inject
    public final void setDeviceInfoUtility$TarazedAndroidLibrary_release(@NotNull DeviceInfoUtility deviceInfoUtility2) {
        deviceInfoUtility2.getClass();
        deviceInfoUtility = deviceInfoUtility2;
    }

    public final void startService(@NotNull Context context, @NotNull Intent intent, boolean isForeground) {
        context.getClass();
        intent.getClass();
        if (getDeviceInfoUtility$TarazedAndroidLibrary_release().is1PDevice()) {
            startService1P(context, intent, isForeground);
        } else {
            startService3P(context, intent, isForeground);
        }
    }
}
