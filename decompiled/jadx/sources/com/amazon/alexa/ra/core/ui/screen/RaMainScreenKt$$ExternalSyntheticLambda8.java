package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class RaMainScreenKt$$ExternalSyntheticLambda8 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RaMainScreenKt$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                RaMainScreenKt.screenShownObserver$lambda$56((ShownScreen) obj, lifecycleOwner, event);
                break;
            case 1:
                LiveModeFtueActiveHeartbeatKt.LiveModeFtueActiveHeartbeat$lambda$4$lambda$3$lambda$1((State) obj, lifecycleOwner, event);
                break;
            default:
                LiveModeOobeScreenKt.LiveModeOobeScreen$lambda$18$lambda$17$lambda$15((Function1) obj, lifecycleOwner, event);
                break;
        }
    }
}
