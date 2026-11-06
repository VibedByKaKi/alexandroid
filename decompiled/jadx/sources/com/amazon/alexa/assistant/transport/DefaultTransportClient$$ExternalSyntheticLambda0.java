package com.amazon.alexa.assistant.transport;

import com.amazon.alexa.assistant.transport.DefaultTransportClient$startNetworkStateObserver$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class DefaultTransportClient$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultTransportClient f$0;

    public /* synthetic */ DefaultTransportClient$$ExternalSyntheticLambda0(DefaultTransportClient defaultTransportClient, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultTransportClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean connectionWaiter$lambda$6;
        Unit handleDisconnectedReason$lambda$25;
        int i = this.$r8$classId;
        DefaultTransportClient defaultTransportClient = this.f$0;
        switch (i) {
            case 0:
                connectionWaiter$lambda$6 = DefaultTransportClient.connectionWaiter$lambda$6(defaultTransportClient);
                break;
            case 1:
                connectionWaiter$lambda$6 = DefaultTransportClient$startNetworkStateObserver$1.AnonymousClass1.emit$lambda$0(defaultTransportClient);
                break;
            default:
                handleDisconnectedReason$lambda$25 = DefaultTransportClient.handleDisconnectedReason$lambda$25(defaultTransportClient);
                return handleDisconnectedReason$lambda$25;
        }
        return Boolean.valueOf(connectionWaiter$lambda$6);
    }
}
