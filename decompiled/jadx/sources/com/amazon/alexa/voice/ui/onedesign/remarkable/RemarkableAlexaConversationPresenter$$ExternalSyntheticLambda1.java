package com.amazon.alexa.voice.ui.onedesign.remarkable;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RemarkableAlexaConversationPresenter$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RemarkableAlexaConversationPresenter f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ RemarkableAlexaConversationPresenter$$ExternalSyntheticLambda1(RemarkableAlexaConversationPresenter remarkableAlexaConversationPresenter, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = remarkableAlexaConversationPresenter;
        this.f$1 = str;
        this.f$2 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$createFeedbackViewForCards$21;
        Void lambda$createFeedbackViewForCards$22;
        Void lambda$createFeedbackViewForResponses$18;
        Void lambda$createFeedbackViewForResponses$19;
        switch (this.$r8$classId) {
            case 0:
                lambda$createFeedbackViewForCards$21 = this.f$0.lambda$createFeedbackViewForCards$21(this.f$1, this.f$2);
                return lambda$createFeedbackViewForCards$21;
            case 1:
                lambda$createFeedbackViewForCards$22 = this.f$0.lambda$createFeedbackViewForCards$22(this.f$1, this.f$2);
                return lambda$createFeedbackViewForCards$22;
            case 2:
                lambda$createFeedbackViewForResponses$18 = this.f$0.lambda$createFeedbackViewForResponses$18(this.f$1, this.f$2);
                return lambda$createFeedbackViewForResponses$18;
            default:
                lambda$createFeedbackViewForResponses$19 = this.f$0.lambda$createFeedbackViewForResponses$19(this.f$1, this.f$2);
                return lambda$createFeedbackViewForResponses$19;
        }
    }
}
