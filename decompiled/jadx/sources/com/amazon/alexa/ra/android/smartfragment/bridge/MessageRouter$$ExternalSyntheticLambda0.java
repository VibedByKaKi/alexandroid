package com.amazon.alexa.ra.android.smartfragment.bridge;

import com.amazon.alexa.ra.android.smartfragment.bridge.MessageRouter;
import com.amazon.alexa.ra.android.smartfragment.react.ViewClaim;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class MessageRouter$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ViewClaim f$0;

    public /* synthetic */ MessageRouter$$ExternalSyntheticLambda0(ViewClaim viewClaim, int i) {
        this.$r8$classId = i;
        this.f$0 = viewClaim;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean unregister$lambda$4$lambda$3;
        int i = this.$r8$classId;
        ViewClaim viewClaim = this.f$0;
        MessageRouter.Registration registration = (MessageRouter.Registration) obj;
        switch (i) {
            case 0:
                unregister$lambda$4$lambda$3 = MessageRouter.unregister$lambda$4$lambda$3(viewClaim, registration);
                break;
            default:
                unregister$lambda$4$lambda$3 = MessageRouter.register$lambda$2$lambda$1(viewClaim, registration);
                break;
        }
        return Boolean.valueOf(unregister$lambda$4$lambda$3);
    }
}
