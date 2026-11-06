package com.amazon.rtvi.capture.client;

import android.content.ComponentName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ConsumerServiceConnection$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConsumerServiceConnection f$0;
    public final /* synthetic */ ComponentName f$1;

    public /* synthetic */ ConsumerServiceConnection$$ExternalSyntheticLambda0(ConsumerServiceConnection consumerServiceConnection, ComponentName componentName, int i) {
        this.$r8$classId = i;
        this.f$0 = consumerServiceConnection;
        this.f$1 = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNullBinding$3(this.f$1);
                break;
            case 1:
                this.f$0.lambda$onServiceDisconnected$1(this.f$1);
                break;
            default:
                this.f$0.lambda$onBindingDied$2(this.f$1);
                break;
        }
    }
}
