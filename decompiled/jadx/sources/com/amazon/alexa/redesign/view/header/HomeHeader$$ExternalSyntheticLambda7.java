package com.amazon.alexa.redesign.view.header;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeHeader$$ExternalSyntheticLambda7 implements View.OnLongClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeHeader f$0;

    public /* synthetic */ HomeHeader$$ExternalSyntheticLambda7(HomeHeader homeHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = homeHeader;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean lambda$applyHeaderRefreshStyling$5;
        boolean lambda$initAlexaSmile$0;
        int i = this.$r8$classId;
        HomeHeader homeHeader = this.f$0;
        switch (i) {
            case 0:
                lambda$applyHeaderRefreshStyling$5 = homeHeader.lambda$applyHeaderRefreshStyling$5(view);
                return lambda$applyHeaderRefreshStyling$5;
            default:
                lambda$initAlexaSmile$0 = homeHeader.lambda$initAlexaSmile$0(view);
                return lambda$initAlexaSmile$0;
        }
    }
}
