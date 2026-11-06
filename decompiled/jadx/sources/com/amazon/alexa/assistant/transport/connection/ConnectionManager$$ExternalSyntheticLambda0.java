package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.transport.connection.ConnectionManager$sendEvent$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class ConnectionManager$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ConnectionManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit establishDownchannelAndHold$lambda$5;
        Unit invokeSuspend$lambda$9$lambda$7;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                establishDownchannelAndHold$lambda$5 = ConnectionManager.establishDownchannelAndHold$lambda$5((CompletableDeferred) obj2, (Throwable) obj);
                return establishDownchannelAndHold$lambda$5;
            default:
                invokeSuspend$lambda$9$lambda$7 = ConnectionManager$sendEvent$2.AnonymousClass1.invokeSuspend$lambda$9$lambda$7((Ref.ObjectRef) obj2, (Exception) obj);
                return invokeSuspend$lambda$9$lambda$7;
        }
    }
}
