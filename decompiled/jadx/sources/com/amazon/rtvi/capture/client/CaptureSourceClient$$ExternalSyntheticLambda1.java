package com.amazon.rtvi.capture.client;

import com.amazon.rtvi.capture.client.exception.DisconnectReason;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class CaptureSourceClient$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CaptureSourceClient f$0;

    public /* synthetic */ CaptureSourceClient$$ExternalSyntheticLambda1(CaptureSourceClient captureSourceClient, int i) {
        this.$r8$classId = i;
        this.f$0 = captureSourceClient;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        CaptureSourceClient captureSourceClient = this.f$0;
        switch (i) {
            case 0:
                captureSourceClient.onDisconnected((DisconnectReason) obj);
                break;
            default:
                captureSourceClient.lambda$attemptAutoReconnect$8((ICaptureSourceConsumer) obj);
                break;
        }
    }
}
