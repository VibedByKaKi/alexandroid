package com.amazon.alexa.biloba.view.alertsv2;

import androidx.lifecycle.Observer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CustomAlertsListView$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CustomAlertsListView f$0;

    public /* synthetic */ CustomAlertsListView$$ExternalSyntheticLambda1(CustomAlertsListView customAlertsListView, int i) {
        this.$r8$classId = i;
        this.f$0 = customAlertsListView;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        CustomAlertsListView customAlertsListView = this.f$0;
        switch (i) {
            case 0:
                customAlertsListView.updateRefreshing((Boolean) obj);
                break;
            default:
                customAlertsListView.lambda$new$3((List) obj);
                break;
        }
    }
}
