package com.amazon.alexa.client.alexaservice.base.interactions.channels;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import com.amazon.alexa.client.alexaservice.base.interactions.VisualInteractionLifecycle;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.policies.ChannelSchedulePolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VisualChannels {
    private static final String TAG = "VisualChannels";
    private final Map<VisualChannelType, VisualChannel> channels = new TreeMap();
    private final Map<VisualChannel, ChannelSchedulePolicy> schedulePolicies = new HashMap();

    public synchronized void add(VisualChannelType visualChannelType, VisualInteractionLifecycle visualInteractionLifecycle) {
        if (this.channels.containsKey(visualChannelType)) {
            VisualChannel visualChannel = this.channels.get(visualChannelType);
            this.schedulePolicies.get(visualChannel).schedule(visualChannel, visualInteractionLifecycle);
        }
    }

    public synchronized void addChannel(VisualChannel visualChannel, ChannelSchedulePolicy channelSchedulePolicy) {
        this.channels.put(visualChannel.getType(), visualChannel);
        this.schedulePolicies.put(visualChannel, channelSchedulePolicy);
    }

    public synchronized void clear() {
        Iterator<VisualChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
    }

    public synchronized boolean contains(InteractionIdentifier interactionIdentifier) {
        Iterator<VisualChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().contains(interactionIdentifier)) {
                return true;
            }
        }
        return false;
    }

    public synchronized Set<VisualInteractionLifecycle> getAllInteractions() {
        HashSet hashSet;
        hashSet = new HashSet();
        Iterator<VisualChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll(it2.next().getAllInteractions());
        }
        return hashSet;
    }

    @VisibleForTesting
    public VisualChannel getChannelForInteractionIdentifier(InteractionIdentifier interactionIdentifier) {
        for (VisualChannel visualChannel : this.channels.values()) {
            if (visualChannel.contains(interactionIdentifier)) {
                return visualChannel;
            }
        }
        return null;
    }

    public synchronized Map<VisualChannelType, ChannelState> getStateReport() {
        HashMap hashMap;
        hashMap = new HashMap();
        for (VisualChannelType visualChannelType : this.channels.keySet()) {
            ChannelState channelState = this.channels.get(visualChannelType).getChannelState();
            if (channelState != null) {
                hashMap.put(visualChannelType, channelState);
            }
        }
        return hashMap;
    }

    public synchronized boolean isEmpty() {
        boolean z;
        Iterator<VisualChannel> it2 = this.channels.values().iterator();
        z = true;
        while (it2.hasNext()) {
            z &= it2.next().isEmpty();
        }
        return z;
    }

    public synchronized VisualInteractionLifecycle peek() {
        VisualChannel next;
        Iterator<VisualChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!next.isEmpty()) {
            }
        }
        throw new IllegalStateException("Must call isEmpty before calling peek.");
        return next.peek();
    }

    public synchronized VisualInteractionLifecycle pop() {
        VisualChannel next;
        Iterator<VisualChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!next.isEmpty()) {
            }
        }
        throw new IllegalStateException("Must call isEmpty before calling pop.");
        return next.pop();
    }

    public synchronized void remove(InteractionIdentifier interactionIdentifier) {
        VisualChannel channelForInteractionIdentifier = getChannelForInteractionIdentifier(interactionIdentifier);
        if (channelForInteractionIdentifier != null) {
            this.schedulePolicies.get(channelForInteractionIdentifier).unschedule(channelForInteractionIdentifier, interactionIdentifier);
        }
    }

    public synchronized void stopAllChannels() {
        Iterator<VisualChannel> it2 = this.channels.values().iterator();
        while (it2.hasNext()) {
            it2.next().stopAll();
        }
    }
}
