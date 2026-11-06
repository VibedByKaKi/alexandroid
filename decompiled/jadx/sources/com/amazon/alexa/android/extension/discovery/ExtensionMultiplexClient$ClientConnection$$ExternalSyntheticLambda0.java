package com.amazon.alexa.android.extension.discovery;

import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;
import com.amazon.alexaext.ActivityDescriptor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ExtensionMultiplexClient.ClientConnection f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda0(ExtensionMultiplexClient.ClientConnection clientConnection, int i, ActivityDescriptor activityDescriptor, String str) {
        this.f$0 = clientConnection;
        this.f$1 = i;
        this.f$2 = activityDescriptor;
        this.f$3 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$L2_receiveV2$8(this.f$1, (ActivityDescriptor) this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$disconnectOnFailure$1((ExtensionMultiplexClient.ConnectionCallback) this.f$2, this.f$1, this.f$3);
                break;
        }
    }

    public /* synthetic */ ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda0(ExtensionMultiplexClient.ClientConnection clientConnection, ExtensionMultiplexClient.ConnectionCallback connectionCallback, int i, String str) {
        this.f$0 = clientConnection;
        this.f$2 = connectionCallback;
        this.f$1 = i;
        this.f$3 = str;
    }
}
