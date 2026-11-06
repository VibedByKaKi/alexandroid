package com.amazon.rtvi.viogateway;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.rtvi.capture.metrics.MetricNames;
import com.amazon.rtvi.capture.metrics.MetricsCollector;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {Constants.LOG_TAG, "", "FRAME_DATA_PATH_SUFFIX", "recordToMetrics", "", "sample", "Lcom/amazon/rtvi/viogateway/UploadPhaseSample;", "RTVIAndroidAlexaAvsSdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVioGatewayCallMetricsListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VioGatewayCallMetricsListener.kt\ncom/amazon/rtvi/viogateway/VioGatewayCallMetricsListenerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
/* loaded from: classes14.dex */
public final class VioGatewayCallMetricsListenerKt {

    @NotNull
    private static final String FRAME_DATA_PATH_SUFFIX = "/events/frame-data";

    @NotNull
    private static final String TAG = "RTVICCS-GatewayPhase";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recordToMetrics(UploadPhaseSample uploadPhaseSample) {
        try {
            MetricsCollector metricsCollector = MetricsCollector.INSTANCE.get();
            metricsCollector.recordOccurrence(UploadPhaseMetrics.CONNECTION_REUSED, uploadPhaseSample.getConnectionReused(), MetricNames.SUBCOMPONENT_VIO_GATEWAY);
            Long dnsMs = uploadPhaseSample.getDnsMs();
            if (dnsMs != null) {
                metricsCollector.recordElapsedTimer(UploadPhaseMetrics.DNS_MS, MetricNames.SUBCOMPONENT_VIO_GATEWAY, dnsMs.longValue(), true);
            }
            Long connectMs = uploadPhaseSample.getConnectMs();
            if (connectMs != null) {
                metricsCollector.recordElapsedTimer(UploadPhaseMetrics.CONNECT_MS, MetricNames.SUBCOMPONENT_VIO_GATEWAY, connectMs.longValue(), true);
            }
            Long tlsMs = uploadPhaseSample.getTlsMs();
            if (tlsMs != null) {
                metricsCollector.recordElapsedTimer(UploadPhaseMetrics.TLS_MS, MetricNames.SUBCOMPONENT_VIO_GATEWAY, tlsMs.longValue(), true);
            }
            Long requestMs = uploadPhaseSample.getRequestMs();
            if (requestMs != null) {
                metricsCollector.recordElapsedTimer(UploadPhaseMetrics.REQUEST_MS, MetricNames.SUBCOMPONENT_VIO_GATEWAY, requestMs.longValue(), true);
            }
            Long ttfbMs = uploadPhaseSample.getTtfbMs();
            if (ttfbMs != null) {
                metricsCollector.recordElapsedTimer(UploadPhaseMetrics.TTFB_MS, MetricNames.SUBCOMPONENT_VIO_GATEWAY, ttfbMs.longValue(), true);
            }
            Long responseMs = uploadPhaseSample.getResponseMs();
            if (responseMs != null) {
                metricsCollector.recordElapsedTimer(UploadPhaseMetrics.RESPONSE_MS, MetricNames.SUBCOMPONENT_VIO_GATEWAY, responseMs.longValue(), true);
            }
        } catch (Exception e) {
            AppLaunchChecker$$ExternalSyntheticOutline0.m("Failed to record upload phase metrics: ", e.getMessage(), TAG);
        }
    }
}
