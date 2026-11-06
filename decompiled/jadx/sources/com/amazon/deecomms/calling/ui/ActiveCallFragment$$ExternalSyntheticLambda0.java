package com.amazon.deecomms.calling.ui;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ActiveCallFragment$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActiveCallFragment f$0;

    public /* synthetic */ ActiveCallFragment$$ExternalSyntheticLambda0(ActiveCallFragment activeCallFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = activeCallFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        ActiveCallFragment activeCallFragment = this.f$0;
        switch (i) {
            case 0:
                activeCallFragment.lambda$setupRTT$5(view);
                break;
            case 1:
                activeCallFragment.lambda$new$0(view);
                break;
            case 2:
                activeCallFragment.lambda$init$2(view);
                break;
            case 3:
                activeCallFragment.lambda$init$3(view);
                break;
            default:
                activeCallFragment.lambda$init$4(view);
                break;
        }
    }
}
