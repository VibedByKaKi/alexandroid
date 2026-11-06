package com.amazon.alexa.hho.cache;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessorykit.cloudpairing.DefaultAutoSetupInteractor;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MediaFileCacheManager$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ MediaFileCacheManager$$ExternalSyntheticLambda0(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaFileCacheManager) this.f$0).lambda$reserveSpace$0((String) this.f$1, this.f$2);
                break;
            default:
                ((DefaultAutoSetupInteractor) this.f$0).lambda$createSession$3((Accessory) this.f$1, this.f$2);
                break;
        }
    }
}
