package com.amazon.alexa.home.viewprovider.react;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ReactViewModule$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactViewModule f$0;

    public /* synthetic */ ReactViewModule$$ExternalSyntheticLambda7(ReactViewModule reactViewModule, int i) {
        this.$r8$classId = i;
        this.f$0 = reactViewModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ReactViewModule reactViewModule = this.f$0;
        switch (i) {
            case 0:
                reactViewModule.lambda$cleanUp$6();
                break;
            default:
                reactViewModule.lambda$cleanUp$7();
                break;
        }
    }
}
