package com.amazon.alexa.smarthomecameras.metrics;

import com.amazon.alexa.smarthomecameras.service.CamerasMobilyticsService;
import com.amazon.ptz.metrics.MetricRecorderImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PtzMetricsRecorder extends MetricRecorderImpl {
    final CamerasMobilyticsService metricsService;

    public PtzMetricsRecorder(CamerasMobilyticsService camerasMobilyticsService) {
        this.metricsService = camerasMobilyticsService;
    }
}
