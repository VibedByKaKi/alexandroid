package com.amazon.alexa.pmi.implementation.taplatency;

import com.amazon.alexa.pmi.implementation.taplatency.LastRenderTracker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LastRenderTracker$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ LastRenderTracker$$ExternalSyntheticLambda3(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LastRenderTracker.start$lambda$3((LastRenderTracker) this.f$0, (LastRenderTracker.Track) this.f$1, this.f$2);
                break;
            case 1:
                ((ArmedInteractionState) this.f$0).onResolved((Armed) this.f$1, this.f$2);
                break;
            case 2:
                GlobalTapLatencyMonitor.onInteractionEvent$lambda$20((Installation) this.f$0, (String) this.f$1, this.f$2);
                break;
            default:
                LastRenderTracker.close$lambda$7((LastRenderTracker) this.f$0, (TtlrCloseReason) this.f$1, this.f$2);
                break;
        }
    }
}
