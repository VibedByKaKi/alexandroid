package com.amazon.alexa.redesign.view.header;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeHeader$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeHeader f$0;

    public /* synthetic */ HomeHeader$$ExternalSyntheticLambda4(HomeHeader homeHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = homeHeader;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        HomeHeader homeHeader = this.f$0;
        switch (i) {
            case 0:
                homeHeader.lambda$loadHomeModesIconFromCache$18(view);
                break;
            case 1:
                homeHeader.lambda$handleModeIconUpdateEvent$28(view);
                break;
            case 2:
                homeHeader.lambda$initNotificationCenter$9(view);
                break;
            case 3:
                homeHeader.lambda$initQuickAdd$6(view);
                break;
            case 4:
                homeHeader.lambda$updateYourProfile$7(view);
                break;
            default:
                homeHeader.lambda$loadHomeModesDefaultSubscriptions$23(view);
                break;
        }
    }
}
