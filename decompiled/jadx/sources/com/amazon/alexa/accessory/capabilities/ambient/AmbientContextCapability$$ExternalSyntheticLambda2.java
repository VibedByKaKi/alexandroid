package com.amazon.alexa.accessory.capabilities.ambient;

import com.amazon.alexa.accessory.capabilities.ambient.AmbientContextCapability;
import com.amazon.alexa.accessory.repositories.Producer;
import com.amazon.alexa.accessory.streams.control.ControlStream;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AmbientContextCapability$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AmbientContextCapability$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                AmbientContextCapability.lambda$getNotifyAmbientContextSignalsHandler$4((ControlStream) obj2, (Throwable) obj);
                break;
            case 1:
                AmbientContextCapability.AmbientContextActionHandler.lambda$handleGetSupportedSignals$5((Producer.Result) obj2, (List) obj);
                break;
            default:
                AmbientContextCapability.AmbientContextActionHandler.lambda$handleGetSupportedSignals$6((Producer.Result) obj2, (Throwable) obj);
                break;
        }
    }
}
