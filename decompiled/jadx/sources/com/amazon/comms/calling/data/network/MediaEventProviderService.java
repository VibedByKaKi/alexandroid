package com.amazon.comms.calling.data.network;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/data/network/MediaEventProviderService;", "", "eventsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/data/network/MediaEvent;", "checkIfLocalVideoEnabled", "", "checkIfRemoteVideoEnabled", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface MediaEventProviderService {
    boolean checkIfLocalVideoEnabled();

    boolean checkIfRemoteVideoEnabled();

    @NotNull
    Flow<MediaEvent> eventsFlow();
}
