package org.webrtc;

import android.os.Handler;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CameraMetadataShim {
    private static final String TAG = "CameraMetadataShim";
    private WebRTCCameraMetadataObserver observer = null;
    private final int metric_frequency_in_ms = 2000;
    private final CameraMetadataObserver cameraMetadataObserver = new CameraMetadataObserver() { // from class: org.webrtc.CameraMetadataShim.1
        @Override // org.webrtc.CameraMetadataObserver
        public void onCameraQualityMetrics(String str) {
            if (CameraMetadataShim.this.observer != null) {
                CameraMetadataShim.this.observer.onCameraQualityMetrics(str);
            }
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WebRTCCameraMetadataObserver {
        void onCameraQualityMetrics(String str);
    }

    public synchronized void registerObserver(CameraVideoCapturer cameraVideoCapturer, Handler handler, WebRTCCameraMetadataObserver webRTCCameraMetadataObserver) {
        this.observer = webRTCCameraMetadataObserver;
        if (webRTCCameraMetadataObserver != null && cameraVideoCapturer != null && handler != null) {
            Log.i(TAG, "setting camera metadata observer");
            cameraVideoCapturer.setCameraMetadataObserver(this.cameraMetadataObserver, handler, 2000);
        }
    }
}
