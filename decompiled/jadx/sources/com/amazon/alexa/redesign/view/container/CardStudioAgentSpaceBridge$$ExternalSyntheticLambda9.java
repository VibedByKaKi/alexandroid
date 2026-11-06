package com.amazon.alexa.redesign.view.container;

import android.view.View;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.redesign.view.ReactSurfaceContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardStudioAgentSpaceBridge$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CardStudioAgentSpaceBridge$$ExternalSyntheticLambda9(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit subscribeNativeRouteEvent$lambda$23$lambda$22;
        Unit addSurface$lambda$24$lambda$23;
        Unit addSurface$lambda$25;
        switch (this.$r8$classId) {
            case 0:
                subscribeNativeRouteEvent$lambda$23$lambda$22 = CardStudioAgentSpaceBridge.subscribeNativeRouteEvent$lambda$23$lambda$22((CardStudioAgentSpaceBridge) this.f$0, (Message) this.f$1);
                return subscribeNativeRouteEvent$lambda$23$lambda$22;
            case 1:
                addSurface$lambda$24$lambda$23 = CardStudioHomeViewController.addSurface$lambda$24$lambda$23((ReactSurfaceContainer) this.f$0, (CardStudioHomeViewController) this.f$1);
                return addSurface$lambda$24$lambda$23;
            default:
                addSurface$lambda$25 = CardStudioHomeViewController.addSurface$lambda$25((CardStudioHomeViewController) this.f$0, (View) this.f$1);
                return addSurface$lambda$25;
        }
    }
}
