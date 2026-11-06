package com.amazon.photos.uploader.internal;

import com.amazon.photos.uploader.UploadRequest;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class UploadRequestUpdatesNotifier$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map.Entry f$0;
    public final /* synthetic */ UploadRequest f$1;

    public /* synthetic */ UploadRequestUpdatesNotifier$$ExternalSyntheticLambda4(Map.Entry entry, UploadRequest uploadRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = entry;
        this.f$1 = uploadRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                UploadRequestUpdatesNotifier.onUploadStarted$lambda$3$lambda$2(this.f$0, this.f$1);
                break;
            default:
                UploadRequestUpdatesNotifier.onRequestAdded$lambda$1$lambda$0(this.f$0, this.f$1);
                break;
        }
    }
}
