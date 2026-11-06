package com.amazon.alexa.biloba.view.alertsv2;

import androidx.lifecycle.Observer;
import com.amazon.alexa.biloba.view.alertsv2.actions.AlertActivityView;
import com.amazon.alexa.biloba.view.alertsv2.devices.DevicesListView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CustomAlertsListView$$ExternalSyntheticLambda2 implements Observer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CustomAlertsListView$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CustomAlertsListView.lambda$new$0((Throwable) obj);
                break;
            case 1:
                AlertActivityView.lambda$new$1((Boolean) obj);
                break;
            case 2:
                AlertActivityView.lambda$new$2((Throwable) obj);
                break;
            default:
                DevicesListView.lambda$new$1((Throwable) obj);
                break;
        }
    }
}
