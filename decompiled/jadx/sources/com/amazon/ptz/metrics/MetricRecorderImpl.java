package com.amazon.ptz.metrics;

import android.util.Log;
import com.amazon.ptz.physical.events.PhysicalPtzEvent;
import com.amazon.ptz.util.LogTag;
import com.amazon.ptz.util.ZoomInput;
import com.amazon.ptzcontroller.lib.model.api.ptz.directive.CameraPtzInstance;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MetricRecorderImpl implements MetricRecorder {
    private static final String TAG = LogTag.forClass(MetricRecorderImpl.class);
    private boolean doNotSpamLogsForZoom = false;
    private boolean doNotSpamLogsForPanToBorder = false;

    @Override // com.amazon.ptz.metrics.MetricRecorder
    public void recordDigitalPanToBorder() {
        if (this.doNotSpamLogsForPanToBorder) {
            return;
        }
        Log.w(TAG, "Client has not implemented digital pan to border metric logging. Ignoring metric for digital pan to border.");
        this.doNotSpamLogsForPanToBorder = true;
    }

    @Override // com.amazon.ptz.metrics.MetricRecorder
    public void recordDigitalZoomRequest(ZoomInput zoomInput) {
        if (this.doNotSpamLogsForZoom) {
            return;
        }
        Log.w(TAG, "Client has not implemented zoom request metric logging. Ignoring metric for zoom request.");
        this.doNotSpamLogsForZoom = true;
    }

    @Override // com.amazon.ptz.metrics.MetricRecorder
    public void recordErrorResponse(PhysicalPtzEvent physicalPtzEvent) {
        Log.w(TAG, "Client has not implemented PTZ error response metric logging. Ignoring metric PTZ error response: " + physicalPtzEvent.name());
    }

    @Override // com.amazon.ptz.metrics.MetricRecorder
    public void recordPhysicalPtzRequest(CameraPtzInstance cameraPtzInstance) {
        Log.w(TAG, "Client has not implemented physical PTZ request metric logging. Ignoring metric for physical PTZ request.");
    }

    @Override // com.amazon.ptz.metrics.MetricRecorder
    public void recordPhysicalPtzRequestNotSupported(CameraPtzInstance cameraPtzInstance) {
        Log.w(TAG, "Client has not implemented unsupported physical PTZ request metric logging. Ignoring metric for unsupported physical PTZ request.");
    }

    @Override // com.amazon.ptz.metrics.MetricRecorder
    public void recordRtcDataChannelLatency(Long l) {
        Log.w(TAG, "Client has not implemented RTC data channel latency metric logging. Ignoring metric for data channel latency: " + l);
    }
}
