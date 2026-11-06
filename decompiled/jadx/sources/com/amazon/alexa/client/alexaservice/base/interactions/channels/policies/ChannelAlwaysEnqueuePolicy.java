package com.amazon.alexa.client.alexaservice.base.interactions.channels.policies;

import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionLifecycle;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.Channel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ChannelAlwaysEnqueuePolicy implements ChannelSchedulePolicy {
    private ChannelAlwaysEnqueuePolicy() {
    }

    public static ChannelAlwaysEnqueuePolicy create() {
        return new ChannelAlwaysEnqueuePolicy();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelSchedulePolicy
    public void schedule(Channel channel, InteractionLifecycle interactionLifecycle) {
        channel.enqueue(interactionLifecycle);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelSchedulePolicy
    public void unschedule(Channel channel, InteractionIdentifier interactionIdentifier) {
        channel.remove(interactionIdentifier);
    }
}
