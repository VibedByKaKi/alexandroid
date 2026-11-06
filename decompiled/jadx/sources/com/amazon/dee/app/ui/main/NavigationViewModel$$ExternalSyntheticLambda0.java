package com.amazon.dee.app.ui.main;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NavigationViewModel$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavigationViewModel f$0;

    public /* synthetic */ NavigationViewModel$$ExternalSyntheticLambda0(NavigationViewModel navigationViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = navigationViewModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        NavigationViewModel navigationViewModel = this.f$0;
        switch (i) {
            case 0:
                navigationViewModel.lambda$updatePersistentAlexaPlusUpsellVisibility$10();
                break;
            case 1:
                navigationViewModel.lambda$updatePersistentAlexaPlusUpsellVisibility$7();
                break;
            case 2:
                navigationViewModel.lambda$updatePersistentAlexaPlusUpsellVisibility$12();
                break;
            default:
                navigationViewModel.lambda$onRouteChanged$13();
                break;
        }
    }
}
