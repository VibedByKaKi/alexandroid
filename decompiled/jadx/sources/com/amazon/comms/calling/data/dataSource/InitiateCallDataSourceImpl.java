package com.amazon.comms.calling.data.dataSource;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0017J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/InitiateCallDataSourceImpl;", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallDataSource;", "<init>", "()V", "resultChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;", "initiateCallEventsFlow", "Lkotlinx/coroutines/flow/Flow;", "update", "", "event", "(Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class InitiateCallDataSourceImpl implements InitiateCallDataSource {

    @NotNull
    private Channel<InitiateCallEvent> resultChannel = ChannelKt.Channel$default(0, null, null, 7, null);

    @Inject
    public InitiateCallDataSourceImpl() {
    }

    @Override // com.amazon.comms.calling.data.dataSource.InitiateCallDataSource
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<InitiateCallEvent> initiateCallEventsFlow() {
        return FlowKt.flow(new InitiateCallDataSourceImpl$initiateCallEventsFlow$1(this, null));
    }

    @Override // com.amazon.comms.calling.data.dataSource.InitiateCallDataSource
    @Nullable
    public Object update(@NotNull InitiateCallEvent initiateCallEvent, @NotNull Continuation<? super Unit> continuation) {
        Object send = this.resultChannel.send(initiateCallEvent, continuation);
        return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
    }
}
