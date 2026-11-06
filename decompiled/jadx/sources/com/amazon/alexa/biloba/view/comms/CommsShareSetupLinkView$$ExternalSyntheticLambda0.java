package com.amazon.alexa.biloba.view.comms;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CommsShareSetupLinkView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CommsShareSetupLinkView f$0;

    public /* synthetic */ CommsShareSetupLinkView$$ExternalSyntheticLambda0(CommsShareSetupLinkView commsShareSetupLinkView, int i) {
        this.$r8$classId = i;
        this.f$0 = commsShareSetupLinkView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        CommsShareSetupLinkView commsShareSetupLinkView = this.f$0;
        switch (i) {
            case 0:
                commsShareSetupLinkView.lambda$getViewGuideText$1(view);
                break;
            default:
                commsShareSetupLinkView.lambda$getShareLinkText$0(view);
                break;
        }
    }
}
