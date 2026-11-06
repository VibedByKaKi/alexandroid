package com.amazon.photos.uploader.cds.observer;

import com.amazon.photos.uploader.UploadErrorCategory;
import com.amazon.photos.uploader.UploadRequest;
import com.amazon.photos.uploader.internal.UploadRequestUpdatesNotifier;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CdsUploadNotifier$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;
    public final /* synthetic */ UploadRequest f$1;
    public final /* synthetic */ Throwable f$2;
    public final /* synthetic */ UploadErrorCategory f$3;

    public /* synthetic */ CdsUploadNotifier$$ExternalSyntheticLambda0(Map.Entry entry, UploadRequest uploadRequest, Throwable th, UploadErrorCategory uploadErrorCategory, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
        this.f$1 = uploadRequest;
        this.f$2 = th;
        this.f$3 = uploadErrorCategory;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CdsUploadNotifier.onUploadFailed$lambda$1$lambda$0(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                UploadRequestUpdatesNotifier.onUploadFailed$lambda$13$lambda$12(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
