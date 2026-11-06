package com.amazon.alexa.presence.service.guardrails;

import android.util.Log;
import com.amazon.alexa.presence.library.MetricsRecorder;
import com.amazon.alexa.presence.metrics.MetricsId;
import com.amazon.alexa.presence.metrics.MetricsMethod;
import com.amazon.alexa.presence.service.GuestConnectNotifInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class FeatureRefusalGuardrail implements PresenceFeatureGuardrailInterface {
    private static final String TAG = "com.amazon.alexa.presence.service.guardrails.FeatureRefusalGuardrail";
    private final GuestConnectNotifInfo guestConnectNotifInfo;
    private MetricsRecorder metrics;

    public FeatureRefusalGuardrail(GuestConnectNotifInfo guestConnectNotifInfo) {
        this.guestConnectNotifInfo = guestConnectNotifInfo;
        try {
            this.metrics = MetricsRecorder.getMetricsUtil();
        } catch (Throwable unused) {
            Log.w(TAG, "Unable to setup metrics service.");
        }
    }

    @Override // com.amazon.alexa.presence.service.guardrails.PresenceFeatureGuardrailInterface
    public boolean checkGuardrail() {
        boolean hasOpened = this.guestConnectNotifInfo.hasOpened();
        boolean z = !hasOpened;
        MetricsRecorder metricsRecorder = this.metrics;
        if (hasOpened) {
            metricsRecorder.recordCount(MetricsId.FAILED_GUARDRAIL, MetricsMethod.REFUSAL_GUARDRAIL);
            return z;
        }
        metricsRecorder.recordCount(MetricsId.PASSED_GUARDRAIL, MetricsMethod.REFUSAL_GUARDRAIL);
        return z;
    }
}
