package com.amazon.rtvi.capture.client;

import com.amazon.rtvi.capture.client.ConsumerServiceConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class CaptureSourceClient$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CaptureSourceClient$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((CaptureSourceClient) obj).lambda$close$0();
                break;
            case 1:
                ((CaptureSourceClient) obj).lambda$connect$1();
                break;
            default:
                ((ConsumerServiceConnection.AnonymousClass1) obj).lambda$binderDied$0();
                break;
        }
    }
}
