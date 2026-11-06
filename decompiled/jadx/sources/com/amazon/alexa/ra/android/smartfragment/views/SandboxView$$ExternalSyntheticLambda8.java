package com.amazon.alexa.ra.android.smartfragment.views;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SandboxView$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SandboxView f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SandboxView$$ExternalSyntheticLambda8(SandboxView sandboxView, Function1 function1) {
        this.f$0 = sandboxView;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit wrapMessage$lambda$19;
        Unit wrapError$lambda$20;
        switch (this.$r8$classId) {
            case 0:
                wrapMessage$lambda$19 = SandboxView.wrapMessage$lambda$19(this.f$0, this.f$1, (Map) obj);
                return wrapMessage$lambda$19;
            default:
                wrapError$lambda$20 = SandboxView.wrapError$lambda$20(this.f$1, this.f$0, (Map) obj);
                return wrapError$lambda$20;
        }
    }

    public /* synthetic */ SandboxView$$ExternalSyntheticLambda8(Function1 function1, SandboxView sandboxView) {
        this.f$1 = function1;
        this.f$0 = sandboxView;
    }
}
