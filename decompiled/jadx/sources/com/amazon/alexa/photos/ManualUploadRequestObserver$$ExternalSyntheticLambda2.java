package com.amazon.alexa.photos;

import android.app.Notification;
import com.amazon.photos.uploader.UploadRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ManualUploadRequestObserver$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ManualUploadRequestObserver f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ManualUploadRequestObserver$$ExternalSyntheticLambda2(ManualUploadRequestObserver manualUploadRequestObserver, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = manualUploadRequestObserver;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$makeUploaderOperationsLongRunning$25((Notification) this.f$1);
                break;
            default:
                this.f$0.lambda$onUploadStarted$3((UploadRequest) this.f$1);
                break;
        }
    }
}
