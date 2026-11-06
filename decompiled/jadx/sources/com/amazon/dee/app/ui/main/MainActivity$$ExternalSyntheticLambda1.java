package com.amazon.dee.app.ui.main;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainActivity f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda1(MainActivity mainActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$initializeMoreMenuSwipeGesture$3;
        int i = this.$r8$classId;
        MainActivity mainActivity = this.f$0;
        switch (i) {
            case 0:
                lambda$initializeMoreMenuSwipeGesture$3 = mainActivity.lambda$initializeMoreMenuSwipeGesture$3((Float) obj);
                return lambda$initializeMoreMenuSwipeGesture$3;
            default:
                return Boolean.valueOf(mainActivity.dispatchTouchEventToViewHierarchy((MotionEvent) obj));
        }
    }
}
