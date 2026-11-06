package it.innove;

import com.facebook.react.bridge.Callback;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class Peripheral$$ExternalSyntheticLambda16 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Peripheral f$0;
    public final /* synthetic */ UUID f$1;
    public final /* synthetic */ UUID f$2;
    public final /* synthetic */ Callback f$3;

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda16(Peripheral peripheral, Callback callback, UUID uuid, UUID uuid2) {
        this.f$0 = peripheral;
        this.f$3 = callback;
        this.f$1 = uuid;
        this.f$2 = uuid2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeNotify$10(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$read$11(this.f$3, this.f$1, this.f$2);
                break;
        }
    }

    public /* synthetic */ Peripheral$$ExternalSyntheticLambda16(Peripheral peripheral, UUID uuid, UUID uuid2, Callback callback) {
        this.f$0 = peripheral;
        this.f$1 = uuid;
        this.f$2 = uuid2;
        this.f$3 = callback;
    }
}
