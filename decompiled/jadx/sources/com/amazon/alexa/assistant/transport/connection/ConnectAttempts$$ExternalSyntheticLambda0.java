package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.transport.model.ConnectionState;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConnectAttempts$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConnectAttempts f$0;
    public final /* synthetic */ ConnectionState f$1;

    public /* synthetic */ ConnectAttempts$$ExternalSyntheticLambda0(ConnectAttempts connectAttempts, ConnectionState connectionState, int i) {
        this.$r8$classId = i;
        this.f$0 = connectAttempts;
        this.f$1 = connectionState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean report$lambda$6;
        switch (this.$r8$classId) {
            case 0:
                report$lambda$6 = ConnectAttempts.report$lambda$6(this.f$0, this.f$1);
                break;
            default:
                report$lambda$6 = ConnectAttempts.step$lambda$7(this.f$0, this.f$1);
                break;
        }
        return Boolean.valueOf(report$lambda$6);
    }
}
