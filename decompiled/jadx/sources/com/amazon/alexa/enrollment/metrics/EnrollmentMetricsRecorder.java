package com.amazon.alexa.enrollment.metrics;

import android.text.TextUtils;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentMetricsRecorder {
    private String callerContext = "VoiceEnrollment";
    private String channelName = MetricsConstants.CHANNEL_NAME;
    private final Lazy<Mobilytics> mobilytics;

    public EnrollmentMetricsRecorder(Lazy<Mobilytics> lazy) {
        this.mobilytics = lazy;
    }

    private void recordUserInteraction(String str, String str2) {
        MobilyticsUserInteractionEvent createUserInteractionEvent = this.mobilytics.get().createUserInteractionEvent(str, str2, "VoiceEnrollment", this.callerContext, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");
        createUserInteractionEvent.setChannelName(MetricsConstants.CHANNEL_NAME);
        this.mobilytics.get().recordUserInteractionEvent(createUserInteractionEvent);
        recordCounter(str);
    }

    public void finishTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        mobilyticsMetricsTimer.finishTimer();
        this.mobilytics.get().recordOperationalEvent(mobilyticsMetricsTimer);
    }

    public void initializeMetricsContext(String str) {
        if (TextUtils.isEmpty(str)) {
            this.callerContext = "VoiceEnrollment";
        } else {
            this.callerContext = str;
        }
    }

    public void recordCounter(String str) {
        this.mobilytics.get().recordCounter(this.mobilytics.get().createCounter(str, "VoiceEnrollment", this.callerContext, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9"));
        this.mobilytics.get().recordCounter(this.mobilytics.get().createCounter(str, a$$ExternalSyntheticOutline0.m("VoiceEnrollment_", this.callerContext), this.callerContext, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9"));
    }

    public void recordUserClickInteraction(String str) {
        recordUserInteraction(str, "click");
    }

    public void recordUserUtterenceInteraction(String str) {
        recordUserInteraction(str, InteractionType.UTTERANCE);
    }

    public void recordUserViewInteraction(String str) {
        recordUserInteraction(str, InteractionType.PAGE_VIEW);
    }

    public MobilyticsMetricsTimer startTimer(String str) {
        return this.mobilytics.get().createTimer(str, "VoiceEnrollment", this.callerContext, "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");
    }
}
