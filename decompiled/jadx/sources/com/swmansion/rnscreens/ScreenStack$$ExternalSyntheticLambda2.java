package com.swmansion.rnscreens;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.mobile.assistant.client.auth.TokenFetch;
import com.amazon.alexa.ra.rtvi.ScreenCaptureModule;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceModuleListener;
import com.amazon.rtvi.device.camera.DeviceCameraModule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class ScreenStack$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref.ObjectRef f$0;

    public /* synthetic */ ScreenStack$$ExternalSyntheticLambda2(Ref.ObjectRef objectRef, int i) {
        this.$r8$classId = i;
        this.f$0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean onUpdate$lambda$9;
        Unit pushOnce$lambda$11$lambda$9;
        Unit startCapture$lambda$2;
        Unit startCapture$lambda$3;
        boolean onUpdate$lambda$20$lambda$12;
        boolean onUpdate$lambda$20$lambda$15;
        int i = this.$r8$classId;
        Ref.ObjectRef objectRef = this.f$0;
        switch (i) {
            case 0:
                onUpdate$lambda$9 = ScreenStack.onUpdate$lambda$9(objectRef, (ScreenStackFragmentWrapper) obj);
                return Boolean.valueOf(onUpdate$lambda$9);
            case 1:
                pushOnce$lambda$11$lambda$9 = AuthorizationDelegateAdapter.pushOnce$lambda$11$lambda$9(objectRef, (TokenFetch.Failure) obj);
                return pushOnce$lambda$11$lambda$9;
            case 2:
                startCapture$lambda$2 = ScreenCaptureModule.startCapture$lambda$2(objectRef, (ICaptureSourceModuleListener) obj);
                return startCapture$lambda$2;
            case 3:
                startCapture$lambda$3 = DeviceCameraModule.startCapture$lambda$3(objectRef, (ICaptureSourceModuleListener) obj);
                return startCapture$lambda$3;
            case 4:
                onUpdate$lambda$20$lambda$12 = ScreenStack.onUpdate$lambda$20$lambda$12(objectRef, (ScreenFragmentWrapper) obj);
                return Boolean.valueOf(onUpdate$lambda$20$lambda$12);
            default:
                onUpdate$lambda$20$lambda$15 = ScreenStack.onUpdate$lambda$20$lambda$15(objectRef, (ScreenFragmentWrapper) obj);
                return Boolean.valueOf(onUpdate$lambda$20$lambda$15);
        }
    }
}
