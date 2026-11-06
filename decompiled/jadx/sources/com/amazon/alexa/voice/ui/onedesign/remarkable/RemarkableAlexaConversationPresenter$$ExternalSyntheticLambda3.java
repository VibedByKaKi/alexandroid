package com.amazon.alexa.voice.ui.onedesign.remarkable;

import android.view.View;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RemarkableAlexaConversationPresenter$$ExternalSyntheticLambda3 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RemarkableAlexaConversationPresenter f$0;
    public final /* synthetic */ View f$1;

    public /* synthetic */ RemarkableAlexaConversationPresenter$$ExternalSyntheticLambda3(RemarkableAlexaConversationPresenter remarkableAlexaConversationPresenter, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = remarkableAlexaConversationPresenter;
        this.f$1 = view;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$createFeedbackViewForResponses$17(this.f$1);
            default:
                return this.f$0.lambda$createFeedbackViewForRequests$23(this.f$1);
        }
    }
}
