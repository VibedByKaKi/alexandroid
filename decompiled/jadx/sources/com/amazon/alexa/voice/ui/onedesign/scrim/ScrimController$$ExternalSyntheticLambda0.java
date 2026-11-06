package com.amazon.alexa.voice.ui.onedesign.scrim;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ScrimController$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrimController f$0;

    public /* synthetic */ ScrimController$$ExternalSyntheticLambda0(ScrimController scrimController, int i) {
        this.$r8$classId = i;
        this.f$0 = scrimController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        ScrimController scrimController = this.f$0;
        switch (i) {
            case 0:
                scrimController.lambda$onCreateView$0(view);
                break;
            default:
                scrimController.lambda$showCancelButton$1(view);
                break;
        }
    }
}
