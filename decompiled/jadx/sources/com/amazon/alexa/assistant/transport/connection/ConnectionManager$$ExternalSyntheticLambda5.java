package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.toolkit.model.EventRequest;
import com.amazon.alexa.assistant.transport.connection.ConnectionManager$sendEvent$2;
import com.amazon.alexa.assistant.transport.model.ConnectionDisconnectedReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConnectionManager$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ ConnectionManager f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ConnectionManager$$ExternalSyntheticLambda5(EventRequest eventRequest, ConnectionManager connectionManager) {
        this.f$1 = eventRequest;
        this.f$0 = connectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long handleDownchannelFailure$lambda$11;
        Unit invokeSuspend$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                handleDownchannelFailure$lambda$11 = ConnectionManager.handleDownchannelFailure$lambda$11(this.f$0, (ConnectionDisconnectedReason) this.f$1);
                return Long.valueOf(handleDownchannelFailure$lambda$11);
            default:
                invokeSuspend$lambda$4 = ConnectionManager$sendEvent$2.AnonymousClass1.invokeSuspend$lambda$4((EventRequest) this.f$1, this.f$0);
                return invokeSuspend$lambda$4;
        }
    }

    public /* synthetic */ ConnectionManager$$ExternalSyntheticLambda5(ConnectionManager connectionManager, ConnectionDisconnectedReason connectionDisconnectedReason) {
        this.f$0 = connectionManager;
        this.f$1 = connectionDisconnectedReason;
    }
}
