package com.amazon.alexa.navigation.menu.viewcontroller;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class NavigationViewController$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavigationViewController f$0;

    public /* synthetic */ NavigationViewController$$ExternalSyntheticLambda2(NavigationViewController navigationViewController, int i) {
        this.$r8$classId = i;
        this.f$0 = navigationViewController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        NavigationViewController navigationViewController = this.f$0;
        switch (i) {
            case 0:
                navigationViewController.lambda$initYourProfile$2(view);
                break;
            default:
                navigationViewController.lambda$setUpMoreTitle$0(view);
                break;
        }
    }
}
