package com.amazon.rtvi.capture.client;

import com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class CaptureSourceClient$$ExternalSyntheticLambda4 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CaptureSourceClient f$0;

    public /* synthetic */ CaptureSourceClient$$ExternalSyntheticLambda4(CaptureSourceClient captureSourceClient, int i) {
        this.$r8$classId = i;
        this.f$0 = captureSourceClient;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Void lambda$attemptAutoReconnect$9;
        Void lambda$connect$3;
        Void lambda$connect$2;
        int i = this.$r8$classId;
        CaptureSourceClient captureSourceClient = this.f$0;
        switch (i) {
            case 0:
                lambda$attemptAutoReconnect$9 = captureSourceClient.lambda$attemptAutoReconnect$9((Throwable) obj);
                return lambda$attemptAutoReconnect$9;
            case 1:
                lambda$connect$3 = captureSourceClient.lambda$connect$3((Throwable) obj);
                return lambda$connect$3;
            default:
                lambda$connect$2 = captureSourceClient.lambda$connect$2((ICaptureSourceConsumer) obj);
                return lambda$connect$2;
        }
    }
}
