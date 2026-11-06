package com.amazon.alexa.redesign.view;

import com.amazon.alexa.redesign.entity.CardModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeRedesignViewController$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeRedesignViewController f$0;
    public final /* synthetic */ CardModel f$1;

    public /* synthetic */ HomeRedesignViewController$$ExternalSyntheticLambda3(HomeRedesignViewController homeRedesignViewController, CardModel cardModel, int i) {
        this.$r8$classId = i;
        this.f$0 = homeRedesignViewController;
        this.f$1 = cardModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processRemovingNextCard$28(this.f$1);
                break;
            default:
                this.f$0.lambda$processAddingNextCard$27(this.f$1);
                break;
        }
    }
}
