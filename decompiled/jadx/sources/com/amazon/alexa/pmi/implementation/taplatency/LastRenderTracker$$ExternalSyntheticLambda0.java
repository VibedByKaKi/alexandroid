package com.amazon.alexa.pmi.implementation.taplatency;

import com.amazon.alexa.pmi.implementation.taplatency.LastRenderTracker;
import com.amazon.alexa.pmi.implementation.taplatency.TapAttributionBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LastRenderTracker$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LastRenderTracker$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LastRenderTracker) this.f$0).deliver((LastRenderTracker.Closed) this.f$1);
                break;
            case 1:
                ((TapAttributionBuffer) this.f$0).settle((TapAttributionBuffer.TapRecord) this.f$1);
                break;
            default:
                ((ArmedInteractionState) this.f$0).onTimeout((Armed) this.f$1);
                break;
        }
    }
}
