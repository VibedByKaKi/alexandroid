package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.data.dataSource.InitiateCallEvent;
import com.amazon.comms.calling.domain.model.BeginCallPayload;
import com.amazon.deecomms.calling.api.CallRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\rJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/InitiateCallRepository;", "", "initiateCall", "Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", "callRequest", "Lcom/amazon/deecomms/calling/api/CallRequest;", "(Lcom/amazon/deecomms/calling/api/CallRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInitiateCallInformation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;", "updateInitiateCall", "", "payload", "(Lcom/amazon/comms/calling/domain/model/BeginCallPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "errorCode", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface InitiateCallRepository {
    @NotNull
    Flow<InitiateCallEvent> getInitiateCallInformation();

    @Nullable
    Object initiateCall(@NotNull CallRequest callRequest, @NotNull Continuation<? super BeginCallPayload> continuation);

    @Nullable
    Object updateInitiateCall(int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateInitiateCall(@NotNull BeginCallPayload beginCallPayload, @NotNull Continuation<? super Unit> continuation);
}
