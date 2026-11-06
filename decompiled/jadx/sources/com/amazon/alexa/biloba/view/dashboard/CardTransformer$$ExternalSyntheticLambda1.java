package com.amazon.alexa.biloba.view.dashboard;

import android.view.View;
import com.amazon.alexa.biloba.model.Card;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CardTransformer$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardTransformer f$0;
    public final /* synthetic */ Card f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CardTransformer$$ExternalSyntheticLambda1(CardTransformer cardTransformer, Card card, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = cardTransformer;
        this.f$1 = card;
        this.f$2 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getClickListenerForCall$1(this.f$1, this.f$2, view);
                break;
            case 1:
                this.f$0.lambda$getClickListenerForRemoteAssist$3(this.f$1, this.f$2, view);
                break;
            default:
                this.f$0.lambda$getClickListenerForDropIn$2(this.f$1, this.f$2, view);
                break;
        }
    }
}
