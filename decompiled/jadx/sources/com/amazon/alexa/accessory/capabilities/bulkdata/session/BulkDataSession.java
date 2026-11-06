package com.amazon.alexa.accessory.capabilities.bulkdata.session;

import com.amazon.alexa.accessory.capabilities.bulkdata.exceptions.BulkDataException;
import com.amazon.alexa.accessory.capabilities.bulkdata.identifiers.DataIdentifier;
import com.amazon.alexa.accessory.capabilities.bulkdata.identifiers.SessionIdentifier;
import com.amazon.alexa.accessory.io.Source;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface BulkDataSession {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface BlockReceivedCallback {
        void onBlockReceived(int i, int i2);

        void onBlockReceivedError(BulkDataException bulkDataException);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SessionAbortCallback {
        void onSessionAborted(BulkDataException bulkDataException);

        void onSessionAbortedError(BulkDataException bulkDataException);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SessionCompleteCallback {
        void onSessionComplete();

        void onSessionCompleteError(BulkDataException bulkDataException);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SessionStartCallback {
        void onSessionStart(BulkDataSession bulkDataSession, int i);

        void onSessionStartError(BulkDataException bulkDataException);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        CREATED,
        STARTED,
        COMPLETED,
        ABORTED
    }

    void abort();

    void complete();

    DataIdentifier getDataIdentifier();

    SessionIdentifier getSessionIdentifier();

    Source getSource();

    State getState();

    boolean isAborted();

    boolean isComplete();

    void start(SessionStartCallback sessionStartCallback, int i);
}
