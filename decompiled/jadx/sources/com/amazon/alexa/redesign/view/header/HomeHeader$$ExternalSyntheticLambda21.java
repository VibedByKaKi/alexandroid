package com.amazon.alexa.redesign.view.header;

import android.widget.ImageView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeHeader$$ExternalSyntheticLambda21 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeHeader f$0;
    public final /* synthetic */ ImageView f$1;

    public /* synthetic */ HomeHeader$$ExternalSyntheticLambda21(HomeHeader homeHeader, ImageView imageView, int i) {
        this.$r8$classId = i;
        this.f$0 = homeHeader;
        this.f$1 = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadHomeModesIconFromCache$19(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setValidAssetToHomeModeIcon$14(this.f$1);
                break;
            default:
                this.f$0.lambda$loadHomeModesDefaultSubscriptions$24(this.f$1);
                break;
        }
    }
}
