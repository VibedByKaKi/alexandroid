package com.amazon.alexa.client.alexaservice.features.offlineprompts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface OfflinePromptsDetectionMetricsListener {
    void onOfflinePromptsDownloadFailure(long j, String str, String str2);

    void onOfflinePromptsDownloadInterrupted(long j);

    void onOfflinePromptsDownloadSuccess(long j, String str);
}
