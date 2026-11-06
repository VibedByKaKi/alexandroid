package com.amazon.alexa.accessorykit.utils;

import com.amazon.alexa.accessorykit.findmy.AccessoryGooglePlayLocationProvider;
import com.amazon.alexa.marketplace.api.Marketplace;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.SingleEmitter;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class MarketplaceServiceUtils$$ExternalSyntheticLambda1 implements OnCompleteListener, Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SingleEmitter f$0;

    public /* synthetic */ MarketplaceServiceUtils$$ExternalSyntheticLambda1(SingleEmitter singleEmitter, int i) {
        this.$r8$classId = i;
        this.f$0 = singleEmitter;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        int i = this.$r8$classId;
        SingleEmitter singleEmitter = this.f$0;
        switch (i) {
            case 0:
                MarketplaceServiceUtils.lambda$getMarketplace$0(singleEmitter, (Marketplace) obj);
                break;
            default:
                singleEmitter.onError((Throwable) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        AccessoryGooglePlayLocationProvider.lambda$getLatestLocation$0(this.f$0, task);
    }
}
