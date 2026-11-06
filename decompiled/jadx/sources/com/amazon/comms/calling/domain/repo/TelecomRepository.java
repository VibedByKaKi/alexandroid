package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.domain.model.BeginCallPayload;
import com.amazon.comms.calling.infrastructure.telecom.TelecomEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/TelecomRepository;", "", "addIncomingCall", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "callerName", "", "isVideoCall", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeCall", "beginCallPayload", "Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", "(Lcom/amazon/comms/calling/domain/model/BeginCallPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endNativeCall", "", "acceptNativeCall", "informConnectionDisconnected", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface TelecomRepository {
    void acceptNativeCall();

    @Nullable
    Object addIncomingCall(@NotNull String str, boolean z, @NotNull Continuation<? super Flow<? extends TelecomEvent>> continuation);

    void endNativeCall();

    void informConnectionDisconnected();

    @Nullable
    Object makeCall(@NotNull BeginCallPayload beginCallPayload, @NotNull Continuation<? super Flow<? extends TelecomEvent>> continuation);
}
