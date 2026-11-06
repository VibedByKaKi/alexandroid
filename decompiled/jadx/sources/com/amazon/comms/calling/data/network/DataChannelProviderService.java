package com.amazon.comms.calling.data.network;

import com.amazon.comms.calling.domain.model.dataChannel.DataChannelModel;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/data/network/DataChannelProviderService;", "", "sendData", "", "dataChannelModel", "Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelModel;", "dataChannelEventsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/data/network/CallingDataChannelEvent;", "realTimeTextEventsFlow", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface DataChannelProviderService {
    @NotNull
    Flow<CallingDataChannelEvent> dataChannelEventsFlow();

    @NotNull
    Flow<CallingDataChannelEvent> realTimeTextEventsFlow();

    void sendData(@NotNull DataChannelModel dataChannelModel);
}
