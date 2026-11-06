package com.amazon.alexa.android.extension.discovery;

import android.os.Binder;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexClient;
import com.amazon.alexa.android.extension.discovery.ExtensionMultiplexService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Binder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ ExtensionMultiplexClient$ClientConnection$$ExternalSyntheticLambda2(Binder binder, Object obj, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = binder;
        this.f$1 = obj;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ExtensionMultiplexClient.ClientConnection) this.f$0).lambda$L2_connectionClosed$3((ExtensionMultiplexClient.ConnectionCallback) this.f$1, this.f$2);
                break;
            case 1:
                ((ExtensionMultiplexService.ServiceConnection) this.f$0).lambda$L2_connectionClosed$2((ExtensionMultiplexService.ConnectionID) this.f$1, this.f$2);
                break;
            default:
                ((ExtensionMultiplexService.ServiceConnection) this.f$0).lambda$L2_connect$1((ExtensionMultiplexService.ConnectionID) this.f$1, this.f$2);
                break;
        }
    }
}
