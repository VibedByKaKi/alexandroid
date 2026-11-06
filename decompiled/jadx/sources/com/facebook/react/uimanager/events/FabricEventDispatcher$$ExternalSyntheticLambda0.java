package com.facebook.react.uimanager.events;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class FabricEventDispatcher$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FabricEventDispatcher f$0;

    public /* synthetic */ FabricEventDispatcher$$ExternalSyntheticLambda0(FabricEventDispatcher fabricEventDispatcher, int i) {
        this.$r8$classId = i;
        this.f$0 = fabricEventDispatcher;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        FabricEventDispatcher fabricEventDispatcher = this.f$0;
        switch (i) {
            case 0:
                fabricEventDispatcher.cancelDispatchOfBatchedEvents();
                break;
            default:
                FabricEventDispatcher.dispatchEventsRunnable$lambda$0(fabricEventDispatcher);
                break;
        }
    }
}
