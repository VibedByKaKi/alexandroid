package it.innove;

import com.facebook.react.bridge.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Peripheral$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Peripheral f$0;
    public final /* synthetic */ Callback f$1;

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda2(Peripheral peripheral, Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = peripheral;
        this.f$1 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$retrieveServices$16(this.f$1);
                break;
            case 1:
                this.f$0.lambda$readRSSI$14(this.f$1);
                break;
            default:
                this.f$0.lambda$refreshCache$15(this.f$1);
                break;
        }
    }
}
