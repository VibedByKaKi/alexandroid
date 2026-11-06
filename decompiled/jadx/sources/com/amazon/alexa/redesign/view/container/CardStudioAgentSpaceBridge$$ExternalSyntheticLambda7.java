package com.amazon.alexa.redesign.view.container;

import com.amazon.alexa.redesign.view.container.CardStudioSurfaceHealth;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class CardStudioAgentSpaceBridge$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CardStudioAgentSpaceBridge$$ExternalSyntheticLambda7(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                CardStudioHomeViewController.postServicesCanStart$lambda$8((CardStudioHomeViewController) obj);
                break;
            case 2:
                ((CardStudioHomeViewController) obj).reportSurfaceHealth$AlexaMobileAndroidHomeChannel_release(CardStudioSurfaceHealth.Stage.SETTLE);
                break;
            default:
                ((CardStudioHomeViewController) obj).hideLoadingView$AlexaMobileAndroidHomeChannel_release();
                break;
        }
    }
}
