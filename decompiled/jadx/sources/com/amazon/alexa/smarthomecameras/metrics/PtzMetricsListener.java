package com.amazon.alexa.smarthomecameras.metrics;

import com.amazon.alexa.smarthomecameras.constants.MobilyticsConstants;
import com.amazon.alexa.smarthomecameras.ptz.PtzEventListener;
import com.amazon.alexa.smarthomecameras.service.CamerasMobilyticsService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PtzMetricsListener implements PtzEventListener {
    private static final String TAG = "PtzMetricsListener";
    final CamerasMobilyticsService metricsService;

    public PtzMetricsListener(CamerasMobilyticsService camerasMobilyticsService) {
        this.metricsService = camerasMobilyticsService;
    }

    @Override // com.amazon.alexa.smarthomecameras.ptz.PtzEventListener
    public void onDoubleTapZoom(String str) {
        this.metricsService.recordOperationalEvent(MobilyticsConstants.DPTZ_ZOOM_DOUBLE_TAP_COUNT_METRIC, str);
    }

    @Override // com.amazon.alexa.smarthomecameras.ptz.PtzEventListener
    public void onPan(String str) {
        this.metricsService.recordOperationalEvent(MobilyticsConstants.DPTZ_PAN_COUNT_METRIC, str);
    }

    @Override // com.amazon.alexa.smarthomecameras.ptz.PtzEventListener
    public void onPinchZoom(String str) {
        this.metricsService.recordOperationalEvent(MobilyticsConstants.DPTZ_ZOOM_PINCH_COUNT_METRIC, str);
    }
}
