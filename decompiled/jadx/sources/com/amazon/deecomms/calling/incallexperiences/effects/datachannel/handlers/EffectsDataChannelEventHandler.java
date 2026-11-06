package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.handlers;

import com.amazon.deecomms.calling.datachannel.CommsDataChannelEvent;
import com.amazon.deecomms.calling.incallexperiences.effects.datachannel.listeners.EffectsDataChannelEventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface EffectsDataChannelEventHandler {
    void apply(String str);

    void openMenu();

    boolean processAckEvent(CommsDataChannelEvent commsDataChannelEvent);

    void processBeginEffectsSessionEvent(CommsDataChannelEvent commsDataChannelEvent);

    void processCurrentStatusEvent(CommsDataChannelEvent commsDataChannelEvent);

    void registerEffectsDataChannelEventListener(EffectsDataChannelEventListener effectsDataChannelEventListener);

    void remove(String str);

    void sendMetricEvent(String str, Long l, String str2);

    void unregisterEffectsDataChannelEventListener();
}
