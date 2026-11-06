package com.amazon.comms.calling.presentation.ui.extensions;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"setFlagsToHandleScreenLock", "", "Landroid/app/Activity;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ActivityExtKt {
    public static final void setFlagsToHandleScreenLock(@NotNull Activity activity) {
        activity.getClass();
        activity.setShowWhenLocked(true);
        activity.setTurnScreenOn(true);
        activity.getWindow().addFlags(128);
    }
}
