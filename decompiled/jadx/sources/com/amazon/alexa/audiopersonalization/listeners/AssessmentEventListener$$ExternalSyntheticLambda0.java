package com.amazon.alexa.audiopersonalization.listeners;

import com.amazon.alexa.audiopersonalization.api.ErrorDelegate;
import com.amazon.alexa.audiopersonalization.api.SuccessDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AssessmentEventListener$$ExternalSyntheticLambda0 implements SuccessDelegate, ErrorDelegate {
    public final /* synthetic */ AssessmentEventListener f$0;

    public /* synthetic */ AssessmentEventListener$$ExternalSyntheticLambda0(AssessmentEventListener assessmentEventListener) {
        this.f$0 = assessmentEventListener;
    }

    @Override // com.amazon.alexa.audiopersonalization.api.ErrorDelegate
    public void onError() {
        this.f$0.lambda$sendAssessmentMode$2();
    }

    @Override // com.amazon.alexa.audiopersonalization.api.SuccessDelegate
    public void onSuccess(Object obj) {
        this.f$0.lambda$sendAssessmentMode$1((Integer) obj);
    }
}
