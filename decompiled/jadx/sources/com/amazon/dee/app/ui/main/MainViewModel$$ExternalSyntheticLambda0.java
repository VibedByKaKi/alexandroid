package com.amazon.dee.app.ui.main;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainViewModel$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MainViewModel f$0;

    public /* synthetic */ MainViewModel$$ExternalSyntheticLambda0(MainViewModel mainViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = mainViewModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MainViewModel mainViewModel = this.f$0;
        switch (i) {
            case 0:
                mainViewModel.registerElementsRoutingAdapterIfOwner();
                break;
            case 1:
                mainViewModel.lambda$showSettingsSearchCoachMark$10();
                break;
            case 2:
                mainViewModel.lambda$updateUIForUser$6();
                break;
            case 3:
                mainViewModel.lambda$registerRoutingAdapters$5();
                break;
            case 4:
                mainViewModel.reclassifyIngressSurface();
                break;
            case 5:
                mainViewModel.lambda$showMicIngressCoachMarks$20();
                break;
            case 6:
                mainViewModel.lambda$scheduleNonCriticalTasks$15();
                break;
            case 7:
                mainViewModel.reevaluateEdgeToEdgeForCurrentRoute();
                break;
            default:
                mainViewModel.lambda$create$1();
                break;
        }
    }
}
