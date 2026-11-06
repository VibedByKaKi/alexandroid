package com.amazon.comms.calling.infrastructure.telecom;

import android.telecom.Connection;
import com.amazon.comms.calling.domain.model.BeginCallPayload;
import com.amazon.comms.calling.domain.model.DisconnectReason;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&J\b\u0010\u0016\u001a\u00020\tH&J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\tH&J\b\u0010\u001b\u001a\u00020\tH&J\b\u0010\u001c\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/TelecomProviderService;", "", "connection", "Landroid/telecom/Connection;", "getConnection", "()Landroid/telecom/Connection;", "setConnection", "(Landroid/telecom/Connection;)V", "makeCall", "", "beginCallPayload", "Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", "(Lcom/amazon/comms/calling/domain/model/BeginCallPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addIncomingCall", "callerName", "", "isVideoCall", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "telecomEventsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "informConnectionActive", "informConnectionDisconnected", "disconnectReason", "Lcom/amazon/comms/calling/domain/model/DisconnectReason;", "destroy", "endNativeCall", "acceptNativeCall", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface TelecomProviderService {
    void acceptNativeCall();

    @Nullable
    Object addIncomingCall(@NotNull String str, boolean z, @NotNull Continuation<? super Unit> continuation);

    void destroy();

    void endNativeCall();

    @Nullable
    Connection getConnection();

    void informConnectionActive();

    void informConnectionDisconnected(@NotNull DisconnectReason disconnectReason);

    @Nullable
    Object makeCall(@NotNull BeginCallPayload beginCallPayload, @NotNull Continuation<? super Unit> continuation);

    void setConnection(@Nullable Connection connection);

    @NotNull
    Flow<TelecomEvent> telecomEventsFlow();
}
