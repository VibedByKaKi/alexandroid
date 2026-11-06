package com.amazon.deecomms.calling.controller;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.model.BeginCallPayload;
import com.amazon.deecomms.calling.model.InitiateOutboundCallRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface CallingFacade {
    void beginCall(@NonNull BeginCallPayload beginCallPayload);

    void beginCall(@NonNull InitiateOutboundCallRequest initiateOutboundCallRequest);
}
