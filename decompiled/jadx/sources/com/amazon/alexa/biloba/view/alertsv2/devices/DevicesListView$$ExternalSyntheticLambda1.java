package com.amazon.alexa.biloba.view.alertsv2.devices;

import androidx.lifecycle.Observer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class DevicesListView$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DevicesListView f$0;

    public /* synthetic */ DevicesListView$$ExternalSyntheticLambda1(DevicesListView devicesListView, int i) {
        this.$r8$classId = i;
        this.f$0 = devicesListView;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        DevicesListView devicesListView = this.f$0;
        switch (i) {
            case 0:
                devicesListView.updateRefreshing((Boolean) obj);
                break;
            default:
                devicesListView.lambda$new$3((List) obj);
                break;
        }
    }
}
