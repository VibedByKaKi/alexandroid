package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import com.amazon.alexa.voice.ui.onedesign.widget.TextViewWithLink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class NewUserPrimerController$$ExternalSyntheticLambda0 implements TextViewWithLink.OnEmbeddedLinkClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NewUserPrimerController f$0;

    public /* synthetic */ NewUserPrimerController$$ExternalSyntheticLambda0(NewUserPrimerController newUserPrimerController, int i) {
        this.$r8$classId = i;
        this.f$0 = newUserPrimerController;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.widget.TextViewWithLink.OnEmbeddedLinkClickListener
    public final void onEmbeddedLinkClick() {
        int i = this.$r8$classId;
        NewUserPrimerController newUserPrimerController = this.f$0;
        switch (i) {
            case 0:
                newUserPrimerController.lambda$getGeoLocationInfoClickListener$1();
                break;
            default:
                newUserPrimerController.lambda$getRationaleClickListener$0();
                break;
        }
    }
}
