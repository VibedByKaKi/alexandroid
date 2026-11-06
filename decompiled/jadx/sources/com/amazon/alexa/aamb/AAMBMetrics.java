package com.amazon.alexa.aamb;

import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AAMBMetrics {
    private static final String COMPONENT_NAME = "AAMB";
    private static final String TAG = "AAMBMetrics";
    private final LazyComponent<Mobilytics> mMobilytics = ComponentRegistry.getInstance().getLazy(Mobilytics.class);
    private final Map<String, MobilyticsMetricsTimer> mTimerMap = new ConcurrentHashMap();
    private final Map<String, MobilyticsMetricsCounter> mCounterMap = new ConcurrentHashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Button {
        public static final String AGREE = "Agree";
        public static final String CANCEL = "Cancel";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Error {
        public static final String NONETWORK = "NoNetwork";
        public static final String TCPCONNECT = "TCPConnect";
        public static final String UDPCONNECT = "UDPConnect";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface HandshakeError {
        public static final String DISCONNECT = "Disconnect";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetricNames {
        public static final String AAMB_ERROR_ERROR = "AAMB_Error%s";
        public static final String AAMB_HANDSHAKECEPDETECTED = "AAMB_HandshakeCEPDetected";
        public static final String AAMB_HANDSHAKECONSENTREJECTED = "AAMB_HandshakeConsentRejected";
        public static final String AAMB_HANDSHAKEERROR_TRANSPORT_HANDSHAKEERROR = "AAMB_HandshakeError%s%s";
        public static final String AAMB_HANDSHAKESTARTED_TRANSPORT = "AAMB_HandshakeStarted%s";
        public static final String AAMB_PAGE_BUTTON_SELECTED = "AAMB_%s%sSelected";
        public static final String AAMB_PAGE_DISPLAYED = "AAMB_%sDisplayed";
        public static final String AAMB_SESSIONENDED = "AAMB_SessionEnded";
        public static final String AAMB_SESSIONENDED_TRANSPORT = "AAMB_SessionEnded%s";
        public static final String AAMB_SESSIONSTARTED = "AAMB_SessionStarted";
        public static final String AAMB_SESSIONSTARTED_TRANSPORT = "AAMB_SessionStarted%s";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Page {
        public static final String CBLCOMPLETE = "CBLComplete";
        public static final String CBLSTART = "CBLStart";
        public static final String CBLWEBVIEW = "CBLWebView";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SubComponentType {
        public static final String AAMB = "AAMB";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimerNames {
        public static final String SESSIONTIMER = "AAMB_SessionTimer";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transport {
        public static final String BT = "Bt";
        public static final String IAP = "IAP";
        public static final String WIFI = "Wifi";
    }

    private void createTimer(String str, String str2) {
        if (this.mMobilytics.get() == null) {
            return;
        }
        this.mTimerMap.put(str, this.mMobilytics.get().createTimer(str, "AAMB", str2, OwnerIdentifier.ALEXA_APP_AUTOMOTIVE_OTHER));
    }

    private void logMetric(String str, String str2) {
        MobilyticsMetricsCounter createCounter;
        if (this.mMobilytics.get() == null || (createCounter = this.mMobilytics.get().createCounter(str, "AAMB", str2, OwnerIdentifier.ALEXA_APP_AUTOMOTIVE_OTHER)) == null) {
            return;
        }
        createCounter.incrementCounter();
        this.mMobilytics.get().recordCounter(createCounter);
    }

    private void removeTimer(String str) {
        MobilyticsMetricsTimer remove;
        if (this.mMobilytics.get() == null || (remove = this.mTimerMap.remove(str)) == null) {
            return;
        }
        remove.finishTimer();
    }

    public MobilyticsMetricsCounter createCounter(String str, String str2) {
        if (this.mMobilytics.get() == null) {
            return null;
        }
        MobilyticsMetricsCounter createCounter = this.mMobilytics.get().createCounter(str, "AAMB", str2, OwnerIdentifier.ALEXA_APP_AUTOMOTIVE_OTHER);
        this.mCounterMap.put(str, createCounter);
        return createCounter;
    }

    public void logDisplayed(String str) {
        logMetric(a$$ExternalSyntheticOutline0.m("AAMB_", str, "Displayed"), "AAMB");
    }

    public void logError(String str) {
        logMetric(a$$ExternalSyntheticOutline0.m("AAMB_Error", str), "AAMB");
    }

    public void logHandshakeCEPDetected() {
        logMetric(MetricNames.AAMB_HANDSHAKECEPDETECTED, "AAMB");
    }

    public void logHandshakeConsentRejected() {
        logMetric(MetricNames.AAMB_HANDSHAKECONSENTREJECTED, "AAMB");
    }

    public void logHandshakeError(String str, String str2) {
        logMetric(a$$ExternalSyntheticOutline0.m("AAMB_HandshakeError", str, str2), "AAMB");
    }

    public void logHandshakeStarted(String str) {
        logMetric(a$$ExternalSyntheticOutline0.m("AAMB_HandshakeStarted", str), "AAMB");
    }

    public void logSelected(String str, String str2) {
        logMetric(a$$ExternalSyntheticOutline0.m("AAMB_", str, str2, AlexaMetricsConstants.DriveModeMetrics.NAVIGATE_TO_LINK_POSTFIX), "AAMB");
    }

    public void logSessionEnded(String str) {
        logMetric(a$$ExternalSyntheticOutline0.m(MetricNames.AAMB_SESSIONENDED, str), "AAMB");
    }

    public void logSessionEndedWithTimers() {
        logMetric(MetricNames.AAMB_SESSIONENDED, "AAMB");
        recordTimer(TimerNames.SESSIONTIMER);
    }

    public void logSessionStarted(String str) {
        logMetric(a$$ExternalSyntheticOutline0.m(MetricNames.AAMB_SESSIONSTARTED, str), "AAMB");
    }

    public void logSessionStartedWithTimers() {
        logMetric(MetricNames.AAMB_SESSIONSTARTED, "AAMB");
        createTimer(TimerNames.SESSIONTIMER, "AAMB");
    }

    public void recordCounter(String str) {
        MobilyticsMetricsCounter remove;
        if (this.mMobilytics.get() == null || (remove = this.mCounterMap.remove(str)) == null) {
            return;
        }
        this.mMobilytics.get().recordCounter(remove);
    }

    public void recordTimer(String str) {
        MobilyticsMetricsTimer remove;
        if (this.mMobilytics.get() == null || (remove = this.mTimerMap.remove(str)) == null) {
            return;
        }
        remove.finishTimer();
        this.mMobilytics.get().recordTimer(remove);
    }
}
