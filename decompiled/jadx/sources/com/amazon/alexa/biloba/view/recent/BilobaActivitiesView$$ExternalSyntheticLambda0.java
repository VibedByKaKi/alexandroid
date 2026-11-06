package com.amazon.alexa.biloba.view.recent;

import androidx.lifecycle.Observer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class BilobaActivitiesView$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BilobaActivitiesView f$0;

    public /* synthetic */ BilobaActivitiesView$$ExternalSyntheticLambda0(BilobaActivitiesView bilobaActivitiesView, int i) {
        this.$r8$classId = i;
        this.f$0 = bilobaActivitiesView;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        BilobaActivitiesView bilobaActivitiesView = this.f$0;
        switch (i) {
            case 0:
                bilobaActivitiesView.updateListView((List) obj);
                break;
            default:
                bilobaActivitiesView.updateRefreshing((Boolean) obj);
                break;
        }
    }
}
