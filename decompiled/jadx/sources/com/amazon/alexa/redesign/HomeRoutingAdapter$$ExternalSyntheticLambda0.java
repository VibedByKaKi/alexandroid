package com.amazon.alexa.redesign;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeRoutingAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeRoutingAdapter f$0;

    public /* synthetic */ HomeRoutingAdapter$$ExternalSyntheticLambda0(HomeRoutingAdapter homeRoutingAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = homeRoutingAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        HomeRoutingAdapter homeRoutingAdapter = this.f$0;
        switch (i) {
            case 0:
                HomeRoutingAdapter.onUserChanged$lambda$10(homeRoutingAdapter);
                break;
            default:
                HomeRoutingAdapter.exit$lambda$6(homeRoutingAdapter);
                break;
        }
    }
}
