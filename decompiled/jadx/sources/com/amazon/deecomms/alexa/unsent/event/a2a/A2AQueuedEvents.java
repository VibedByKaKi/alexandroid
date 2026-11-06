package com.amazon.deecomms.alexa.unsent.event.a2a;

import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.unsent.event.QueuedAlexaEvents;
import com.amazon.deecomms.calling.incallcommands.models.InCallCommandModel;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class A2AQueuedEvents implements QueuedAlexaEvents {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, A2AQueuedEvents.class);

    @Override // com.amazon.deecomms.alexa.unsent.event.QueuedAlexaEvents
    public synchronized void add(@NonNull InCallCommandModel inCallCommandModel) {
        LOG.i("Empty on purpose.");
    }

    @Override // com.amazon.deecomms.alexa.unsent.event.QueuedAlexaEvents
    public synchronized void clear() {
        LOG.i("Empty on purpose.");
    }

    @Override // com.amazon.deecomms.alexa.unsent.event.QueuedAlexaEvents
    public synchronized int getSize() {
        return 0;
    }

    @Override // com.amazon.deecomms.alexa.unsent.event.QueuedAlexaEvents
    public synchronized void send() {
        LOG.i("Empty on purpose.");
    }
}
