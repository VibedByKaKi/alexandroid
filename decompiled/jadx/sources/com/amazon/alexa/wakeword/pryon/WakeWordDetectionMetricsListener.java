package com.amazon.alexa.wakeword.pryon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface WakeWordDetectionMetricsListener {
    void onLocaleMismatch();

    void onPryonErrorEvent(int i);

    void onPryonInitializationFailure(int i, String str);

    void onPryonInitializationSuccess(long j, String str);

    void onPryonReset(long j);

    void onWakeWordModelDownloadFailure(long j, String str, String str2);

    void onWakeWordModelDownloadInterrupted(long j);

    void onWakeWordModelDownloadSuccess(long j, String str);
}
