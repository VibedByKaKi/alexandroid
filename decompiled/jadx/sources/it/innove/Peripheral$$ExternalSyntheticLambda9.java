package it.innove;

import com.facebook.react.bridge.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Peripheral$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Peripheral f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Callback f$2;

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda9(Peripheral peripheral, int i, Callback callback) {
        this.f$0 = peripheral;
        this.f$1 = i;
        this.f$2 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$requestConnectionPriority$19(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$requestMTU$20(this.f$2, this.f$1);
                break;
        }
    }

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda9(Peripheral peripheral, Callback callback, int i) {
        this.f$0 = peripheral;
        this.f$2 = callback;
        this.f$1 = i;
    }
}
