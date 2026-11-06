package com.amazon.alexa.biloba.metrics;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BilobaMetricsService {
    public static final String ALEXA_CARE_OWNER_IDENTIFIER = "df97e9db-d4b4-434a-a0c4-203211a5cec9";
    private static final String TAG = "BilobaMetricsService";
    private final Lazy<EnvironmentService> environmentService;
    private final Mobilytics mobilytics;
    private String roleSuffix;
    private String callerContext = "AlexaBiloba";

    @VisibleForTesting
    final Map<String, MobilyticsMetricsTimer> timersTTCF = new HashMap();

    public BilobaMetricsService(Mobilytics mobilytics, Lazy<EnvironmentService> lazy) {
        this.mobilytics = mobilytics;
        this.environmentService = lazy;
    }

    private void emitTTCFLogs(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        if (mobilyticsMetricsTimer != null) {
            String eventName = mobilyticsMetricsTimer.getEventName();
            String str = MetricsConstants.TTCFMetrics.INIT_SUFFIX;
            if (eventName.endsWith(MetricsConstants.TTCFMetrics.INIT_SUFFIX)) {
                str = "";
            }
            LogUtils.i(TAG, "TTCF did record biloba-init " + mobilyticsMetricsTimer.getEventName() + str + " " + mobilyticsMetricsTimer.getElapsedTime() + "ms");
        }
    }

    private void recordInteractionEvents(String str, String str2, String str3) {
        recordUserInteraction(BitVector$$ExternalSyntheticOutline0.m(str, str2), str3);
        if (TextUtils.isEmpty(this.roleSuffix)) {
            LogUtils.w(TAG, String.format("No user role for user interaction %1$s %2$s", str3, str));
            return;
        }
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, str2);
        m1m.append(this.roleSuffix);
        recordUserInteraction(m1m.toString(), str3);
    }

    private void recordUserInteraction(String str, String str2) {
        LogUtils.i(TAG, String.format("Recording user interaction %1$s %2$s", str2, str));
        this.mobilytics.recordUserInteractionEvent(this.mobilytics.createUserInteractionEvent(str, str2, "AlexaBiloba", this.callerContext, "df97e9db-d4b4-434a-a0c4-203211a5cec9"));
        recordCounter(str);
    }

    public void finishTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        if (mobilyticsMetricsTimer != null) {
            String str = TAG;
            LogUtils.i(str, String.format("Finish timer %1$s", mobilyticsMetricsTimer.getEventName()));
            mobilyticsMetricsTimer.finishTimer();
            if (this.environmentService.get().isDebugBuild()) {
                mobilyticsMetricsTimer.setEventName(mobilyticsMetricsTimer.getEventName() + ".Debug");
                LogUtils.d(str, String.format("Debug build, recording timer as %1$s", mobilyticsMetricsTimer.getEventName()));
            }
            LogUtils.i(str, String.format("Record timer %1$s", mobilyticsMetricsTimer.getEventName()));
            this.mobilytics.recordOperationalEvent(mobilyticsMetricsTimer);
        }
    }

    public void initializeMetricsContext(String str) {
        if (TextUtils.isEmpty(str)) {
            this.callerContext = "AlexaBiloba";
        } else {
            this.callerContext = str;
        }
    }

    public void recordCounter(String str) {
        LogUtils.i(TAG, "Recording Counter event " + str);
        this.mobilytics.recordCounter(this.mobilytics.createCounter(str, "AlexaBiloba", this.callerContext, "df97e9db-d4b4-434a-a0c4-203211a5cec9"));
        this.mobilytics.recordCounter(this.mobilytics.createCounter(str, a$$ExternalSyntheticOutline0.m("AlexaBiloba_", this.callerContext), this.callerContext, "df97e9db-d4b4-434a-a0c4-203211a5cec9"));
    }

    public void recordOccurrence(String str, boolean z) {
        LogUtils.i(TAG, String.format("Recording occurrence %1$s %2$b", str, Boolean.valueOf(z)));
        this.mobilytics.recordOccurrence(str, z, "AlexaBiloba", this.callerContext, "df97e9db-d4b4-434a-a0c4-203211a5cec9");
    }

    public void recordUserClick(String str, String str2) {
        recordInteractionEvents(str, str2, "click");
    }

    public void recordUserCommsCall(String str, String str2) {
        recordInteractionEvents(str, str2, InteractionType.COMMS_CALL);
    }

    public void recordUserCommsMessage(String str, String str2) {
        recordInteractionEvents(str, str2, InteractionType.COMMS_MESSAGE);
    }

    public void recordUserView(String str, String str2) {
        recordInteractionEvents(str, str2, "view");
    }

    public void resetTTCFTimers() {
        this.timersTTCF.clear();
    }

    public void startRecordingTTCF(long j) {
        this.timersTTCF.put(MetricsConstants.TTCFMetrics.BILOBA_DASHBOARD, startTimer(MetricsConstants.TTCFMetrics.BILOBA_DASHBOARD));
        this.timersTTCF.put(MetricsConstants.TTCFMetrics.BILOBA_GETTING_STARTED, startTimer(MetricsConstants.TTCFMetrics.BILOBA_GETTING_STARTED));
        this.timersTTCF.put(MetricsConstants.TTCFMetrics.TODAY_ACTIVITY_RENDER, startTimer(MetricsConstants.TTCFMetrics.TODAY_ACTIVITY_RENDER));
        this.timersTTCF.put(MetricsConstants.TTCFMetrics.DASHBOARD_CARDS_RENDER, startTimer(MetricsConstants.TTCFMetrics.DASHBOARD_CARDS_RENDER));
        this.timersTTCF.put(MetricsConstants.TTCFMetrics.BILOBA_LONE_CR, startTimer(MetricsConstants.TTCFMetrics.BILOBA_LONE_CR));
        Iterator<MobilyticsMetricsTimer> it2 = this.timersTTCF.values().iterator();
        while (it2.hasNext()) {
            it2.next().setEventTimestamp(j);
        }
    }

    public MobilyticsMetricsTimer startTimer(String str) {
        LogUtils.i(TAG, String.format("Start timer %1$s", str));
        return this.mobilytics.createTimer(str, "AlexaBiloba", this.callerContext, "df97e9db-d4b4-434a-a0c4-203211a5cec9");
    }

    public void stopRecordingTTCF(String str) {
        if (this.timersTTCF.containsKey(str)) {
            MobilyticsMetricsTimer mobilyticsMetricsTimer = this.timersTTCF.get(str);
            finishTimer(mobilyticsMetricsTimer);
            emitTTCFLogs(mobilyticsMetricsTimer);
            this.timersTTCF.remove(str);
            if (str.equals(MetricsConstants.TTCFMetrics.BILOBA_GETTING_STARTED) || str.equals(MetricsConstants.TTCFMetrics.BILOBA_LONE_CR)) {
                resetTTCFTimers();
            } else if (str.equals(MetricsConstants.TTCFMetrics.BILOBA_DASHBOARD)) {
                this.timersTTCF.remove(MetricsConstants.TTCFMetrics.BILOBA_GETTING_STARTED);
                this.timersTTCF.remove(MetricsConstants.TTCFMetrics.BILOBA_LONE_CR);
            }
        }
    }

    public void updateRoleSuffix(@MetricsConstants.UserRoleSuffix String str) {
        this.roleSuffix = str;
        LogUtils.d(TAG, "Updated roleSuffix to " + str);
    }
}
