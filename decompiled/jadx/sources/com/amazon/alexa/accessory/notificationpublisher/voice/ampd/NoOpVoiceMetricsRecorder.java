package com.amazon.alexa.accessory.notificationpublisher.voice.ampd;

import androidx.annotation.Nullable;
import com.amazon.alexa.externalnotifications.capability.ExternalNotificationsMetricsRecorder;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NoOpVoiceMetricsRecorder implements ExternalNotificationsMetricsRecorder {
    @Override // com.amazon.alexa.externalnotifications.capability.ExternalNotificationsMetricsRecorder
    public void recordCounter(String str, double d) {
    }

    @Override // com.amazon.alexa.externalnotifications.capability.ExternalNotificationsMetricsRecorder
    public void recordCounter(String str, @Nullable Map<String, Object> map) {
    }

    @Override // com.amazon.alexa.externalnotifications.capability.ExternalNotificationsMetricsRecorder
    public void recordCounter(String str) {
    }
}
