package com.amazon.alexa.biloba.view.dashboard;

import androidx.lifecycle.Observer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class BilobaDashboardView$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BilobaDashboardView f$0;

    public /* synthetic */ BilobaDashboardView$$ExternalSyntheticLambda1(BilobaDashboardView bilobaDashboardView, int i) {
        this.$r8$classId = i;
        this.f$0 = bilobaDashboardView;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        BilobaDashboardView bilobaDashboardView = this.f$0;
        switch (i) {
            case 0:
                bilobaDashboardView.updateListView((List) obj);
                break;
            case 1:
                bilobaDashboardView.updateCards((List) obj);
                break;
            case 2:
                bilobaDashboardView.updateRefreshing((Boolean) obj);
                break;
            case 3:
                bilobaDashboardView.setUpIngressButtons((List) obj);
                break;
            case 4:
                bilobaDashboardView.clearTTCFOnError((Throwable) obj);
                break;
            default:
                bilobaDashboardView.updateSettingsButtonForBanner((Boolean) obj);
                break;
        }
    }
}
