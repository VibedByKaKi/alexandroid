package com.mapbox.maps.plugin.indoorselector;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class IndoorSelectorViewImpl$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IndoorSelectorViewImpl f$0;

    public /* synthetic */ IndoorSelectorViewImpl$$ExternalSyntheticLambda2(IndoorSelectorViewImpl indoorSelectorViewImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = indoorSelectorViewImpl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        IndoorSelectorViewImpl indoorSelectorViewImpl = this.f$0;
        switch (i) {
            case 0:
                IndoorSelectorViewImpl._init_$lambda$5(indoorSelectorViewImpl, view);
                break;
            case 1:
                IndoorSelectorViewImpl._init_$lambda$6(indoorSelectorViewImpl, view);
                break;
            default:
                IndoorSelectorViewImpl.createBuildingButton$lambda$19$lambda$18(indoorSelectorViewImpl, view);
                break;
        }
    }
}
