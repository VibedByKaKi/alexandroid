package com.amazon.alexa.voice.ui.onedesign.empty;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class EmptyController$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EmptyController f$0;

    public /* synthetic */ EmptyController$$ExternalSyntheticLambda0(EmptyController emptyController, int i) {
        this.$r8$classId = i;
        this.f$0 = emptyController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        EmptyController emptyController = this.f$0;
        switch (i) {
            case 0:
                emptyController.lambda$showManageButton$1(view);
                break;
            default:
                emptyController.lambda$onCreateView$0(view);
                break;
        }
    }
}
