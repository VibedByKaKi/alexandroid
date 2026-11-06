package com.amazon.alexa.biloba.view.dashboard;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.amazon.alexa.biloba.model.Card;
import com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CardTransformer$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ CardTransformer$$ExternalSyntheticLambda5(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((CardTransformer) this.f$0).lambda$getClickListenerForRoute$0((Card) this.f$1, (String) this.f$2, (String) this.f$3, view);
                break;
            default:
                ((FeedbackComponent) this.f$0).lambda$create$1((FeedbackComponent.FeedbackItem) this.f$1, (Context) this.f$2, (LinearLayout) this.f$3, view);
                break;
        }
    }
}
