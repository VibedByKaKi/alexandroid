package com.amazon.alexa.accessory.frames.accessproof;

import com.amazon.alexa.accessory.frames.accessproof.AccessProofCoordinator;
import com.amazon.alexa.accessory.repositories.accessproof.AccessProofRepository;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessProofManager$$ExternalSyntheticLambda21 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessProofManager$$ExternalSyntheticLambda21(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        ObservableSource lambda$resubscribing$5;
        SingleSource lambda$attach$2;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$resubscribing$5 = AccessProofManager.lambda$resubscribing$5((AtomicInteger) obj2, (Throwable) obj);
                return lambda$resubscribing$5;
            default:
                lambda$attach$2 = AccessProofCoordinator.lambda$attach$2((AccessProofRepository) obj2, (AccessProofCoordinator.Answer) obj);
                return lambda$attach$2;
        }
    }
}
