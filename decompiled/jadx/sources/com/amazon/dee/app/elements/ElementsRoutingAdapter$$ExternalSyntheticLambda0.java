package com.amazon.dee.app.elements;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ElementsRoutingAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ElementsRoutingAdapter f$0;

    public /* synthetic */ ElementsRoutingAdapter$$ExternalSyntheticLambda0(ElementsRoutingAdapter elementsRoutingAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = elementsRoutingAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ElementsRoutingAdapter elementsRoutingAdapter = this.f$0;
        switch (i) {
            case 0:
                elementsRoutingAdapter.lambda$reenter$4();
                break;
            default:
                elementsRoutingAdapter.lambda$exit$7();
                break;
        }
    }
}
