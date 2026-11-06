package com.amazon.comms.config.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SimJobScheduler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ForegroundPurpose {
        IncomingCallRing,
        OutgoingCallRing,
        ActiveCallAudio
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onForegroundState(ForegroundPurpose foregroundPurpose);
    }

    void finish();

    void registerListener(Listener listener);

    void scheduleCommunicationsJob(ForegroundPurpose foregroundPurpose);

    void scheduleExclusiveContentJob(ForegroundPurpose foregroundPurpose);

    void unregisterListener(Listener listener);
}
