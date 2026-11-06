package com.amazon.alexa.android.extension.discovery;

import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExtensionMultiplexService.ServiceConnection f$0;
    public final /* synthetic */ ExtensionMultiplexService.ConnectionID f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ExtensionMultiplexService$ServiceConnection$$ExternalSyntheticLambda0(ExtensionMultiplexService.ServiceConnection serviceConnection, ExtensionMultiplexService.ConnectionID connectionID, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = serviceConnection;
        this.f$1 = connectionID;
        this.f$2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$L2_onFocusGained$5(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$L2_onExit$8(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$L2_onFocusLost$4(this.f$1, this.f$2);
                break;
            case 3:
                this.f$0.lambda$L2_onResume$7(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$L2_onPause$6(this.f$1, this.f$2);
                break;
        }
    }
}
