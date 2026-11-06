package com.amazon.apl.android;

import android.view.View;
import com.amazon.apl.android.APLLayout;
import com.amazon.common.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLLayout$APLViewPresenterImpl$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ APLLayout.APLViewPresenterImpl f$0;

    public /* synthetic */ APLLayout$APLViewPresenterImpl$$ExternalSyntheticLambda2(APLLayout.APLViewPresenterImpl aPLViewPresenterImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = aPLViewPresenterImpl;
    }

    @Override // com.amazon.common.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        APLLayout.APLViewPresenterImpl aPLViewPresenterImpl = this.f$0;
        switch (i) {
            case 0:
                aPLViewPresenterImpl.lambda$inflateComponentHierarchy$2((Component) obj);
                break;
            default:
                aPLViewPresenterImpl.disassociate((View) obj);
                break;
        }
    }
}
