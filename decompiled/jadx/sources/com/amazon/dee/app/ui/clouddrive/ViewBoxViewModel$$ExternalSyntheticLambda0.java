package com.amazon.dee.app.ui.clouddrive;

import com.amazon.dee.app.services.alexadevicebackground.BackgroundImage;
import com.amazon.dee.app.services.photos.PhotoService;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ViewBoxViewModel$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ViewBoxViewModel f$0;

    public /* synthetic */ ViewBoxViewModel$$ExternalSyntheticLambda0(ViewBoxViewModel viewBoxViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = viewBoxViewModel;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        ViewBoxViewModel viewBoxViewModel = this.f$0;
        switch (i) {
            case 0:
                viewBoxViewModel.lambda$sendImageIdToDevice$2((BackgroundImage) obj);
                break;
            case 1:
                viewBoxViewModel.lambda$sendImageIdToDevice$3((Throwable) obj);
                break;
            case 2:
                viewBoxViewModel.lambda$uploadFile$0((PhotoService.UploadResponse) obj);
                break;
            case 3:
                viewBoxViewModel.lambda$uploadFile$1((Throwable) obj);
                break;
            case 4:
                viewBoxViewModel.lambda$monitorDownloadOnDevice$4((BackgroundImage) obj);
                break;
            default:
                viewBoxViewModel.lambda$monitorDownloadOnDevice$5((Throwable) obj);
                break;
        }
    }
}
