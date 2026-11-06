package com.amazon.alexa.audiopersonalization.components;

import com.amazon.alexa.audiopersonalization.api.ErrorMessageDelegate;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AmaApiImpl$$ExternalSyntheticLambda7 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ErrorMessageDelegate f$0;

    public /* synthetic */ AmaApiImpl$$ExternalSyntheticLambda7(ErrorMessageDelegate errorMessageDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = errorMessageDelegate;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        ErrorMessageDelegate errorMessageDelegate = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                AmaApiImpl.lambda$getFeatureStatus$2(errorMessageDelegate, th);
                break;
            default:
                AmaApiImpl.lambda$getAudioProfile$13(errorMessageDelegate, th);
                break;
        }
    }
}
