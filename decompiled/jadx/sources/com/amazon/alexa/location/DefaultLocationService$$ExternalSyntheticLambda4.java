package com.amazon.alexa.location;

import com.amazon.alexa.identity.api.UserIdentity;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultLocationService$$ExternalSyntheticLambda4 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultLocationService f$0;

    public /* synthetic */ DefaultLocationService$$ExternalSyntheticLambda4(DefaultLocationService defaultLocationService, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultLocationService;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        DefaultLocationService defaultLocationService = this.f$0;
        switch (i) {
            case 0:
                defaultLocationService.lambda$couldRefreshAuthToken$29((Throwable) obj);
                break;
            case 1:
                defaultLocationService.lambda$observeFeatureAvailability$36((UserIdentity) obj);
                break;
            case 2:
                defaultLocationService.lambda$observeFeatureAvailability$37((Throwable) obj);
                break;
            case 3:
                defaultLocationService.lambda$startRecordingAvailableFeatures$44((UserIdentity) obj);
                break;
            default:
                defaultLocationService.lambda$startRecordingAvailableFeatures$45((Throwable) obj);
                break;
        }
    }
}
