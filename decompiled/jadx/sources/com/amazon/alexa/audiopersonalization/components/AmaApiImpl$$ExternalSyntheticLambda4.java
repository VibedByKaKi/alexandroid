package com.amazon.alexa.audiopersonalization.components;

import com.amazon.alexa.audiopersonalization.api.ErrorDelegate;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AmaApiImpl$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ErrorDelegate f$0;

    public /* synthetic */ AmaApiImpl$$ExternalSyntheticLambda4(ErrorDelegate errorDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = errorDelegate;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        ErrorDelegate errorDelegate = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                AmaApiImpl.lambda$getBudsInEar$15(errorDelegate, th);
                break;
            case 1:
                AmaApiImpl.lambda$getAssessmentMode$8(errorDelegate, th);
                break;
            default:
                AmaApiImpl.lambda$getPersonalizationLevel$5(errorDelegate, th);
                break;
        }
    }
}
