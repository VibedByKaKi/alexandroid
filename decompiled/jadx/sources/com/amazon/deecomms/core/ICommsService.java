package com.amazon.deecomms.core;

import com.amazon.alexa.protocols.features.FeatureFilter;
import com.amazon.deecomms.api.CommsManager;
import com.amazon.deecomms.conversation.CommsDeviceSupport;
import com.amazon.deecomms.conversation.CommsDynamicFeatureService;
import com.amazon.deecomms.conversation.ConversationService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ICommsService {
    CommsDeviceSupport getCommsDeviceSupport();

    CommsDynamicFeatureService getCommsDynamicFeatureService();

    FeatureFilter getCommsFeatureFilter();

    CommsManager getCommsManager();

    ConversationService getConversationService();
}
