package com.amazon.alexa.accessory.frames.accessproof;

import com.amazon.alexa.accessory.Accessory;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessProofManager$$ExternalSyntheticLambda8 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessProofManager f$0;

    public /* synthetic */ AccessProofManager$$ExternalSyntheticLambda8(AccessProofManager accessProofManager, int i) {
        this.$r8$classId = i;
        this.f$0 = accessProofManager;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AccessProofManager accessProofManager = this.f$0;
        switch (i) {
            case 0:
                accessProofManager.lambda$attach$17((Long) obj);
                break;
            case 1:
                accessProofManager.lambda$observeSessions$0((Accessory) obj);
                break;
            case 2:
                accessProofManager.lambda$observeSessions$1((Accessory) obj);
                break;
            case 3:
                accessProofManager.lambda$observeSessions$2((Accessory) obj);
                break;
            default:
                accessProofManager.lambda$attachActiveSessions$10((Accessory) obj);
                break;
        }
    }
}
