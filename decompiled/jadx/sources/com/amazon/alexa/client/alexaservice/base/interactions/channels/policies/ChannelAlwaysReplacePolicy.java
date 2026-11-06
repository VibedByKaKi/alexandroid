package com.amazon.alexa.client.alexaservice.base.interactions.channels.policies;

import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionLifecycle;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.Channel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ChannelAlwaysReplacePolicy implements ChannelSchedulePolicy {
    private ChannelAlwaysReplacePolicy() {
    }

    public static ChannelAlwaysReplacePolicy create() {
        return new ChannelAlwaysReplacePolicy();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelSchedulePolicy
    public void schedule(Channel channel, InteractionLifecycle interactionLifecycle) {
        if (channel.isEmpty()) {
            channel.push(interactionLifecycle);
        } else {
            channel.replaceTop(interactionLifecycle).stop();
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelSchedulePolicy
    public void unschedule(Channel channel, InteractionIdentifier interactionIdentifier) {
        channel.remove(interactionIdentifier);
    }
}
