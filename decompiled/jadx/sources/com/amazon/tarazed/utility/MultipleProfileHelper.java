package com.amazon.tarazed.utility;

import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import com.amazon.alexa.lifecycle.api.LifecycleEvent;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/tarazed/utility/MultipleProfileHelper;", "", "()V", "startServiceAsActiveUser", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", LifecycleEvent.IS_FOREGROUND, "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class MultipleProfileHelper {

    @NotNull
    public static final MultipleProfileHelper INSTANCE = new MultipleProfileHelper();

    private MultipleProfileHelper() {
    }

    public static /* synthetic */ void startServiceAsActiveUser$default(MultipleProfileHelper multipleProfileHelper, Context context, Intent intent, boolean z, int i, Object obj) throws Exception {
        if ((i & 4) != 0) {
            z = false;
        }
        multipleProfileHelper.startServiceAsActiveUser(context, intent, z);
    }

    public final void startServiceAsActiveUser(@NotNull Context context, @NotNull Intent intent, boolean isForeground) throws Exception {
        context.getClass();
        intent.getClass();
        ReflectionHelper reflectionHelper = ReflectionHelper.INSTANCE;
        Object hiddenStaticFieldValue = reflectionHelper.getHiddenStaticFieldValue(UserHandle.class, "CURRENT");
        hiddenStaticFieldValue.getClass();
        UserHandle userHandle = (UserHandle) hiddenStaticFieldValue;
        Method hiddenMethod = isForeground ? reflectionHelper.getHiddenMethod(context.getClass(), "startForegroundServiceAsUser") : reflectionHelper.getHiddenMethod(context.getClass(), "startServiceAsUser");
        hiddenMethod.getClass();
        hiddenMethod.setAccessible(true);
        hiddenMethod.invoke(context, intent, userHandle);
    }
}
