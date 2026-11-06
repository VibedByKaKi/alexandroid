package com.amazon.alexa.android.extension.discovery;

import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExtensionMultiplexClient.ClientConnection f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda6(ExtensionMultiplexClient.ClientConnection clientConnection, int i, String str, int i2) {
        this.$r8$classId = i2;
        this.f$0 = clientConnection;
        this.f$1 = i;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$L2_onRequestResource$7(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$L2_receive$4(this.f$1, this.f$2);
                break;
        }
    }
}
