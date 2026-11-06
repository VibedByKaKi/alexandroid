package com.amazon.alexa.smarthomecameras.orientation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"hostActivity", "Landroid/app/Activity;", "Landroid/view/View;", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ActivityExtensionsKt {
    @Nullable
    public static final Activity hostActivity(@NotNull View view) {
        view.getClass();
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
