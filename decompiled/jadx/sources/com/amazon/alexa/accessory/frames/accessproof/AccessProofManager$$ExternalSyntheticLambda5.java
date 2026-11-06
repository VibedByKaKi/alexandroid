package com.amazon.alexa.accessory.frames.accessproof;

import com.amazon.alexa.accessory.frames.accessproof.AccessProofManager;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessProofManager$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessProofManager$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                AccessProofManager.lambda$attach$15((AccessProofManager.SessionAttachment) obj2, (Set) obj);
                break;
            case 1:
                ((Runnable) obj2).run();
                break;
            default:
                AccessProofManager.lambda$resubscribing$7((String) obj2, (Throwable) obj);
                break;
        }
    }
}
