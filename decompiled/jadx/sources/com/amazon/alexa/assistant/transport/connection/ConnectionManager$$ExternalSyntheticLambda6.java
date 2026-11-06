package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.transport.connection.ConnectionManager$sendEvent$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConnectionManager$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Call f$0;

    public /* synthetic */ ConnectionManager$$ExternalSyntheticLambda6(Call call, int i) {
        this.$r8$classId = i;
        this.f$0 = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit executeWithDuplexFallback$lambda$12;
        Unit invokeSuspend$lambda$0;
        Unit invokeSuspend$lambda$6;
        int i = this.$r8$classId;
        Call call = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                executeWithDuplexFallback$lambda$12 = ConnectionManager.executeWithDuplexFallback$lambda$12(call, th);
                return executeWithDuplexFallback$lambda$12;
            case 1:
                invokeSuspend$lambda$0 = ConnectionManager$establishDownchannelAndHold$job$1.invokeSuspend$lambda$0(call, th);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$6 = ConnectionManager$sendEvent$2.AnonymousClass1.invokeSuspend$lambda$6(call, th);
                return invokeSuspend$lambda$6;
        }
    }
}
