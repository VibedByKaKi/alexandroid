package com.amazon.alexa.ra.android.smartfragment.views;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SandboxView$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SandboxView f$0;

    public /* synthetic */ SandboxView$$ExternalSyntheticLambda1(SandboxView sandboxView, int i) {
        this.$r8$classId = i;
        this.f$0 = sandboxView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function2 mapTokenResponder$lambda$1;
        Unit tearDown$lambda$4;
        Unit tearDown$lambda$5;
        Unit tearDown$lambda$6;
        Unit tearDown$lambda$7;
        Unit tearDown$lambda$8;
        int i = this.$r8$classId;
        SandboxView sandboxView = this.f$0;
        switch (i) {
            case 0:
                mapTokenResponder$lambda$1 = SandboxView.mapTokenResponder$lambda$1(sandboxView);
                return mapTokenResponder$lambda$1;
            case 1:
                tearDown$lambda$4 = SandboxView.tearDown$lambda$4(sandboxView);
                return tearDown$lambda$4;
            case 2:
                tearDown$lambda$5 = SandboxView.tearDown$lambda$5(sandboxView);
                return tearDown$lambda$5;
            case 3:
                tearDown$lambda$6 = SandboxView.tearDown$lambda$6(sandboxView);
                return tearDown$lambda$6;
            case 4:
                tearDown$lambda$7 = SandboxView.tearDown$lambda$7(sandboxView);
                return tearDown$lambda$7;
            default:
                tearDown$lambda$8 = SandboxView.tearDown$lambda$8(sandboxView);
                return tearDown$lambda$8;
        }
    }
}
