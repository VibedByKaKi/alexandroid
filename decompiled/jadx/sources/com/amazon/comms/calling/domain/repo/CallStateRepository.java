package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.data.dataSource.CallingEvent;
import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.deecomms.calling.api.enums.CallState;
import com.amazon.deecomms.calling.phonecallcontroller.PCCConstants;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J1\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\bH¦@¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0002\u0010\u0010J\u000e\u0010 \u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0010J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020\"H&R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001cj\b\u0012\u0004\u0012\u00020\u000f`\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/CallStateRepository;", "", "getCallInformation", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "updateCall", "", "updator", "Lkotlin/Function1;", "Lcom/amazon/comms/calling/domain/model/CallModel;", "Lkotlin/ParameterName;", "name", PCCConstants.PHONE_CALL_CONTROLLER_CURRENT_CALL_KEY, "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteParticipantNameForIncomingCall", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callState", "Lcom/amazon/deecomms/calling/api/enums/CallState;", "getCallState", "()Lcom/amazon/deecomms/calling/api/enums/CallState;", "setCallState", "(Lcom/amazon/deecomms/calling/api/enums/CallState;)V", "getCurrentCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "setCurrentCall", "(Lcom/amazon/comms/calling/domain/model/CallModel;)V", "receivedCallsIds", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getReceivedCallsIds", "()Ljava/util/HashSet;", "refreshCallEventsFlow", "isAlexaCallInProgress", "", "isPCCCallInProgress", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface CallStateRepository {
    @NotNull
    Flow<CallingEvent> getCallInformation();

    @NotNull
    CallState getCallState();

    @Nullable
    CallModel getCurrentCall();

    @NotNull
    HashSet<String> getReceivedCallsIds();

    @Nullable
    Object getRemoteParticipantNameForIncomingCall(@NotNull Continuation<? super String> continuation);

    boolean isAlexaCallInProgress();

    boolean isPCCCallInProgress();

    @Nullable
    Object refreshCallEventsFlow(@NotNull Continuation<? super Unit> continuation);

    void setCallState(@NotNull CallState callState);

    void setCurrentCall(@Nullable CallModel callModel);

    @Nullable
    Object updateCall(@NotNull Function1<? super CallModel, CallModel> function1, @NotNull Continuation<? super Unit> continuation);
}
