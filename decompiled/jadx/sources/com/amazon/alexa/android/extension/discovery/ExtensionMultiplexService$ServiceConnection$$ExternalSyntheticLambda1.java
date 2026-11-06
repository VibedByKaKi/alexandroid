package com.amazon.alexa.android.extension.discovery;

import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExtensionMultiplexService.ServiceConnection f$0;
    public final /* synthetic */ ExtensionMultiplexService.ConnectionID f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda1(ExtensionMultiplexService.ServiceConnection serviceConnection, ExtensionMultiplexService.ConnectionID connectionID, int i, String str, int i2) {
        this.$r8$classId = i2;
        this.f$0 = serviceConnection;
        this.f$1 = connectionID;
        this.f$2 = i;
        this.f$3 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$disconnectOnFailure$0(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$L2_receive$3(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$L2_onResourceUnavailable$10(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
