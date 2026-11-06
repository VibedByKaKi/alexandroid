package com.amazon.alexa.audiopersonalization.components;

import com.amazon.alexa.accessory.protocol.StateOuterClass;
import com.amazon.alexa.audiopersonalization.api.CompletableDelegate;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AmaApiImpl$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CompletableDelegate f$0;

    public /* synthetic */ AmaApiImpl$$ExternalSyntheticLambda1(CompletableDelegate completableDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = completableDelegate;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        CompletableDelegate completableDelegate = this.f$0;
        switch (i) {
            case 0:
                AmaApiImpl.lambda$setFeatureStatus$0(completableDelegate, (Throwable) obj);
                break;
            case 1:
                AmaApiImpl.lambda$subscribeToAudioAssessmentAbort$9(completableDelegate, (StateOuterClass.State) obj);
                break;
            case 2:
                AmaApiImpl.lambda$setPersonalizationLevel$3(completableDelegate, (Throwable) obj);
                break;
            case 3:
                AmaApiImpl.lambda$setAssessmentMode$6(completableDelegate, (Throwable) obj);
                break;
            default:
                AmaApiImpl.lambda$setAudioProfile$11(completableDelegate, (Throwable) obj);
                break;
        }
    }
}
