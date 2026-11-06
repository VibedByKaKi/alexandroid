package com.amazon.alexa.accessory.capabilities.bulkdata.session;

import com.amazon.alexa.accessory.capabilities.bulkdata.session.BulkDataSession;
import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BulkDataSessionMetadata {
    private final BulkDataSession.BlockReceivedCallback blockReceivedCallback;
    private final BulkDataSession.SessionAbortCallback sessionAbortCallback;
    private final BulkDataSession.SessionCompleteCallback sessionCompleteCallback;
    private final BulkDataSession.SessionStartCallback sessionStartCallback;

    public BulkDataSessionMetadata(BulkDataSession.BlockReceivedCallback blockReceivedCallback, BulkDataSession.SessionStartCallback sessionStartCallback, BulkDataSession.SessionCompleteCallback sessionCompleteCallback, BulkDataSession.SessionAbortCallback sessionAbortCallback) {
        Preconditions.notNull(blockReceivedCallback, "blockReceivedCallback");
        Preconditions.notNull(sessionStartCallback, "sessionStartCallback");
        Preconditions.notNull(sessionCompleteCallback, "sessionCompleteCallback");
        Preconditions.notNull(sessionAbortCallback, "sessionAbortCallback");
        this.blockReceivedCallback = blockReceivedCallback;
        this.sessionStartCallback = sessionStartCallback;
        this.sessionCompleteCallback = sessionCompleteCallback;
        this.sessionAbortCallback = sessionAbortCallback;
    }

    public BulkDataSession.BlockReceivedCallback getBlockReceivedCallback() {
        return this.blockReceivedCallback;
    }

    public BulkDataSession.SessionAbortCallback getSessionAbortCallback() {
        return this.sessionAbortCallback;
    }

    public BulkDataSession.SessionCompleteCallback getSessionCompleteCallback() {
        return this.sessionCompleteCallback;
    }

    public BulkDataSession.SessionStartCallback getSessionStartCallback() {
        return this.sessionStartCallback;
    }
}
