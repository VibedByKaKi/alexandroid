package com.amazon.alexa.redesign.view.header;

import android.widget.ImageView;
import com.dee.app.cachemanager.AppDataCacheEntry;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeHeader$$ExternalSyntheticLambda5 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ HomeHeader f$0;
    public final /* synthetic */ ImageView f$1;
    public final /* synthetic */ ImageView f$2;

    public /* synthetic */ HomeHeader$$ExternalSyntheticLambda5(HomeHeader homeHeader, ImageView imageView, ImageView imageView2, int i) {
        this.$r8$classId = i;
        this.f$0 = homeHeader;
        this.f$1 = imageView;
        this.f$2 = imageView2;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$handleModeIconUpdateEvent$30(this.f$1, this.f$2, (AppDataCacheEntry) obj);
                break;
            default:
                this.f$0.lambda$loadHomeModesIconFromCache$20(this.f$1, this.f$2, (AppDataCacheEntry) obj);
                break;
        }
    }
}
