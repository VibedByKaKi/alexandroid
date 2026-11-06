package com.amazon.dee.app.ui.clouddrive;

import com.amazon.dee.app.services.photos.PhotoService;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AlexaDeviceBackgroundImageViewModel$$ExternalSyntheticLambda1 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaDeviceBackgroundImageViewModel f$0;

    public /* synthetic */ AlexaDeviceBackgroundImageViewModel$$ExternalSyntheticLambda1(AlexaDeviceBackgroundImageViewModel alexaDeviceBackgroundImageViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaDeviceBackgroundImageViewModel;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        AlexaDeviceBackgroundImageViewModel alexaDeviceBackgroundImageViewModel = this.f$0;
        switch (i) {
            case 0:
                alexaDeviceBackgroundImageViewModel.lambda$initializePhotoService$1((Throwable) obj);
                break;
            case 1:
                alexaDeviceBackgroundImageViewModel.lambda$removeBackgroundImage$3((Throwable) obj);
                break;
            case 2:
                alexaDeviceBackgroundImageViewModel.lambda$removeImagefromAmazonDrive$4((PhotoService.DeleteResponse) obj);
                break;
            default:
                alexaDeviceBackgroundImageViewModel.lambda$removeImagefromAmazonDrive$5((Throwable) obj);
                break;
        }
    }
}
