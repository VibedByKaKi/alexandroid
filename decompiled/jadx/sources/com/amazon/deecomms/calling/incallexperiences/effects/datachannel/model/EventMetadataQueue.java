package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.model;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EventMetadataQueue extends ConcurrentLinkedQueue {

    @VisibleForTesting
    static final int DATA_CHANNEL_TIMEOUT_MS = 1500;
    private static EventMetadataQueue callCaptioningMetadataQueue;
    private static EventMetadataQueue effectsMetadataQueue;
    private static EventMetadataQueue reactionsMetadataQueue;

    public static EventMetadataQueue getCallCaptioningMetadataQueue() {
        if (callCaptioningMetadataQueue == null) {
            callCaptioningMetadataQueue = new EventMetadataQueue();
        }
        return callCaptioningMetadataQueue;
    }

    public static EventMetadataQueue getEffectsInstance() {
        if (effectsMetadataQueue == null) {
            effectsMetadataQueue = new EventMetadataQueue();
        }
        return effectsMetadataQueue;
    }

    public static EventMetadataQueue getReactionsInstance() {
        if (reactionsMetadataQueue == null) {
            reactionsMetadataQueue = new EventMetadataQueue();
        }
        return reactionsMetadataQueue;
    }

    public boolean add(EventMetadata eventMetadata) {
        return super.add((EventMetadataQueue) eventMetadata);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public EventMetadata poll() {
        return (EventMetadata) super.poll();
    }

    public void removeStaleDataChannelEvent(int i) {
        Iterator<E> it2 = iterator();
        while (it2.hasNext() && size() > i) {
            if (System.currentTimeMillis() - ((EventMetadata) it2.next()).getTimestamp() >= 1500) {
                it2.remove();
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public int size() {
        return super.size();
    }
}
