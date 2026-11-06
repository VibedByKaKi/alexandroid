package com.amazon.deecomms.nativemodules;

import com.amazon.deecomms.media.photos.CloudDriveService;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import java.util.concurrent.atomic.AtomicInteger;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsMessagingMediaBridge$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WritableArray f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ AtomicInteger f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ Promise f$7;

    public /* synthetic */ CommsMessagingMediaBridge$$ExternalSyntheticLambda0(WritableArray writableArray, String str, String str2, String str3, String str4, AtomicInteger atomicInteger, int i, Promise promise, int i2) {
        this.$r8$classId = i2;
        this.f$0 = writableArray;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = atomicInteger;
        this.f$6 = i;
        this.f$7 = promise;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CommsMessagingMediaBridge.lambda$downloadFilesFromCDSInternal$7(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (CloudDriveService.DownloadResponse) obj);
                break;
            default:
                CommsMessagingMediaDelegate.lambda$downloadFilesFromCDSInternal$7(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (CloudDriveService.DownloadResponse) obj);
                break;
        }
    }
}
