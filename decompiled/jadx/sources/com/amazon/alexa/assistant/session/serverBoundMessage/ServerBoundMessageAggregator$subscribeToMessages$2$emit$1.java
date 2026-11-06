package com.amazon.alexa.assistant.session.serverBoundMessage;

import com.amazon.alexa.assistant.foundation.model.CapabilityAgent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2", f = "ServerBoundMessageAggregator.kt", i = {0, 0, 0}, l = {FTPReply.ENTERING_EPSV_MODE}, m = "emit", n = {"this", "subscriptionJobs", "messageSources"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
public final class ServerBoundMessageAggregator$subscribeToMessages$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServerBoundMessageAggregator$subscribeToMessages$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ServerBoundMessageAggregator$subscribeToMessages$2$emit$1(ServerBoundMessageAggregator$subscribeToMessages$2<? super T> serverBoundMessageAggregator$subscribeToMessages$2, Continuation<? super ServerBoundMessageAggregator$subscribeToMessages$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = serverBoundMessageAggregator$subscribeToMessages$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((List<? extends CapabilityAgent>) null, (Continuation<? super Unit>) this);
    }
}
