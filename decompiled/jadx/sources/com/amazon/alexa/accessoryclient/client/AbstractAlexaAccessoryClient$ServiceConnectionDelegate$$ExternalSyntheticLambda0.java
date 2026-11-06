package com.amazon.alexa.accessoryclient.client;

import android.content.ComponentName;
import com.amazon.alexa.accessoryclient.client.AbstractAlexaAccessoryClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AbstractAlexaAccessoryClient$ServiceConnectionDelegate$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractAlexaAccessoryClient f$0;
    public final /* synthetic */ ComponentName f$1;

    public /* synthetic */ AbstractAlexaAccessoryClient$ServiceConnectionDelegate$$ExternalSyntheticLambda0(AbstractAlexaAccessoryClient abstractAlexaAccessoryClient, ComponentName componentName, int i) {
        this.$r8$classId = i;
        this.f$0 = abstractAlexaAccessoryClient;
        this.f$1 = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AbstractAlexaAccessoryClient.ServiceConnectionDelegate.onBindingDied$lambda$1(this.f$0, this.f$1);
                break;
            case 1:
                AbstractAlexaAccessoryClient.ServiceConnectionDelegate.onNullBinding$lambda$2(this.f$0, this.f$1);
                break;
            default:
                AbstractAlexaAccessoryClient.ServiceConnectionDelegate.onServiceDisconnected$lambda$0(this.f$0, this.f$1);
                break;
        }
    }
}
