package org.webrtc;

import org.webrtc.Camera1Session;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final /* synthetic */ class Camera1Session$4$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Camera1Session.AnonymousClass4 f$0;
    public final /* synthetic */ byte[] f$1;

    public /* synthetic */ Camera1Session$4$$ExternalSyntheticLambda0(Camera1Session.AnonymousClass4 anonymousClass4, byte[] bArr, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
        this.f$1 = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onPreviewFrame$0(this.f$1);
                break;
            default:
                this.f$0.lambda$onPreviewFrame$1(this.f$1);
                break;
        }
    }
}
