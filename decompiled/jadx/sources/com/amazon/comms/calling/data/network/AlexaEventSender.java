package com.amazon.comms.calling.data.network;

import com.amazon.comms.calling.domain.model.pcc.EventSenderModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/data/network/AlexaEventSender;", "", "sendEvent", "", "eventSenderModel", "Lcom/amazon/comms/calling/domain/model/pcc/EventSenderModel;", "awaitAlexaServicesConnection", "Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent;", "retryCount", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connectAlexaServicesConnection", "disconnectAlexaServicesConnection", "acquireCommsFocus", "releaseCommsFocus", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface AlexaEventSender {
    void acquireCommsFocus();

    @Nullable
    Object awaitAlexaServicesConnection(int i, @NotNull Continuation<? super AlexaServiceConnectionEvent> continuation);

    void connectAlexaServicesConnection();

    void disconnectAlexaServicesConnection();

    void releaseCommsFocus();

    void sendEvent(@NotNull EventSenderModel eventSenderModel);
}
