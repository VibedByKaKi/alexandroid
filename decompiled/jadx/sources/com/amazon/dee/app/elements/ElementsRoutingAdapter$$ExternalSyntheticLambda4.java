package com.amazon.dee.app.elements;

import com.amazon.alexa.routing.api.Route;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ElementsRoutingAdapter$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ElementsRoutingAdapter f$0;
    public final /* synthetic */ Route f$1;
    public final /* synthetic */ Route f$2;

    public /* synthetic */ ElementsRoutingAdapter$$ExternalSyntheticLambda4(ElementsRoutingAdapter elementsRoutingAdapter, Route route, Route route2, int i) {
        this.$r8$classId = i;
        this.f$0 = elementsRoutingAdapter;
        this.f$1 = route;
        this.f$2 = route2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$enter$5(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$leave$6(this.f$1, this.f$2);
                break;
        }
    }
}
