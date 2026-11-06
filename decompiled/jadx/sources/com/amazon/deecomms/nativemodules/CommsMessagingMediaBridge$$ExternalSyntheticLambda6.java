package com.amazon.deecomms.nativemodules;

import com.amazon.deecomms.media.photos.CloudDriveService;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import java.util.concurrent.atomic.AtomicInteger;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsMessagingMediaBridge$$ExternalSyntheticLambda6 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WritableArray f$0;
    public final /* synthetic */ AmazonPhotosUploadRequest f$1;
    public final /* synthetic */ AtomicInteger f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ Promise f$4;

    public /* synthetic */ CommsMessagingMediaBridge$$ExternalSyntheticLambda6(WritableArray writableArray, AmazonPhotosUploadRequest amazonPhotosUploadRequest, AtomicInteger atomicInteger, int i, Promise promise, int i2) {
        this.$r8$classId = i2;
        this.f$0 = writableArray;
        this.f$1 = amazonPhotosUploadRequest;
        this.f$2 = atomicInteger;
        this.f$3 = i;
        this.f$4 = promise;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CommsMessagingMediaBridge.lambda$uploadFilesToCDSInternal$5(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CloudDriveService.UploadResponse) obj);
                break;
            case 1:
                CommsMessagingMediaBridge.lambda$uploadFilesToCDSInternal$6(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Throwable) obj);
                break;
            case 2:
                CommsMessagingMediaDelegate.lambda$uploadFilesToCDSInternal$5(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CloudDriveService.UploadResponse) obj);
                break;
            default:
                CommsMessagingMediaDelegate.lambda$uploadFilesToCDSInternal$6(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Throwable) obj);
                break;
        }
    }
}
