package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.data.network.CallingDataChannelEvent;
import com.amazon.comms.calling.domain.model.dataChannel.DataChannelModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\u000b"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/DataChannelRepository;", "", "sendData", "", "dataChannelModel", "Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelModel;", "(Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataChannelEventsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent;", "getRealTimeTextEventsFlow", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface DataChannelRepository {
    @NotNull
    Flow<CallingDataChannelEvent> getDataChannelEventsFlow();

    @NotNull
    Flow<CallingDataChannelEvent> getRealTimeTextEventsFlow();

    @Nullable
    Object sendData(@NotNull DataChannelModel dataChannelModel, @NotNull Continuation<? super Unit> continuation);
}
