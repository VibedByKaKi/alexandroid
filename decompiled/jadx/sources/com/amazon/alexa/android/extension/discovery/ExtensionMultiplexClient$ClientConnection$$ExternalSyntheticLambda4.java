package com.amazon.alexa.android.extension.discovery;

import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExtensionMultiplexClient.ClientConnection f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda4(ExtensionMultiplexClient.ClientConnection clientConnection, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = clientConnection;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$L2_connectionAccept$2((ExtensionMultiplexClient.ConnectionCallback) this.f$1);
                break;
            case 1:
                this.f$0.lambda$registerCallback$0((ExtensionMultiplexClient.ConnectionCallback) this.f$1);
                break;
            default:
                this.f$0.lambda$L2_receiveBroadcast$5((String) this.f$1);
                break;
        }
    }
}
