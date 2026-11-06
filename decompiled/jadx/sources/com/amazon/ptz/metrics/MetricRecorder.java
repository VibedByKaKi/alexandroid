package com.amazon.ptz.metrics;

import com.amazon.ptz.physical.events.PhysicalPtzEvent;
import com.amazon.ptz.util.ZoomInput;
import com.amazon.ptzcontroller.lib.model.api.ptz.directive.CameraPtzInstance;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface MetricRecorder {
    void recordDigitalPanToBorder();

    void recordDigitalZoomRequest(ZoomInput zoomInput);

    void recordErrorResponse(PhysicalPtzEvent physicalPtzEvent);

    void recordPhysicalPtzRequest(CameraPtzInstance cameraPtzInstance);

    void recordPhysicalPtzRequestNotSupported(CameraPtzInstance cameraPtzInstance);

    void recordRtcDataChannelLatency(Long l);
}
