package org.webrtc;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.core.processing.util.GLUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
class Camera2Attributes implements CameraAttributes {
    private static final int DEFAULT_RADIUS = 128;
    private static final String TAG = "Camera2Attributes";
    private HashMap<String, Map.Entry<CaptureRequest.Key<Object>, Object>> customCaptureRequestKeys;
    private boolean enable;
    private FollowMeCameraSessionFrameUpdater followMeCameraFrameUpdater;
    private Surface followMeSurface;
    private float strength;
    private float transitionTime;

    public Camera2Attributes(boolean z, float f, float f2, HashMap<String, Map.Entry<CaptureRequest.Key<Object>, Object>> hashMap, Surface surface, FollowMeCameraSessionFrameUpdater followMeCameraSessionFrameUpdater) {
        HashMap<String, Map.Entry<CaptureRequest.Key<Object>, Object>> hashMap2 = new HashMap<>();
        this.customCaptureRequestKeys = hashMap2;
        hashMap2.putAll(hashMap);
        this.enable = z;
        this.transitionTime = f;
        this.strength = f2;
        this.followMeSurface = surface;
        this.followMeCameraFrameUpdater = followMeCameraSessionFrameUpdater;
    }

    public String getCurrentVideoEffectStatus() {
        StringBuilder sb = new StringBuilder("[{Format:1.0}, {name:FROST, enable:");
        sb.append(this.enable);
        sb.append("}, {FROST: CURRENT:");
        return a$$ExternalSyntheticOutline0.m(sb, this.strength < 0.01f ? GLUtils.VERSION_UNKNOWN : "1.0", "}]");
    }

    public Map.Entry<CaptureRequest.Key<Object>, Object> getCustomCaptureRequestKey(String str) {
        return this.customCaptureRequestKeys.getOrDefault(str, null);
    }

    public HashMap<String, Map.Entry<CaptureRequest.Key<Object>, Object>> getCustomCaptureRequestKeys() {
        return this.customCaptureRequestKeys;
    }

    public boolean getEnableVideoEffect() {
        return this.enable;
    }

    public FollowMeCameraSessionFrameUpdater getFollowMeCameraSessionFrameUpdater() {
        return this.followMeCameraFrameUpdater;
    }

    public Surface getFollowMeSurface() {
        return this.followMeSurface;
    }

    public float getStrength() {
        return this.strength;
    }

    public float getTransitionTime() {
        return this.transitionTime;
    }

    public int getVideoEffectRadius(long j) {
        if (j <= 0 || Float.compare(this.transitionTime, 0.0f) <= 0) {
            this.strength = 1.0f;
        } else {
            float nanoTime = 1.0f - ((float) ((((System.nanoTime() - j) / 1000000) / 1000.0d) / this.transitionTime));
            this.strength = nanoTime;
            if (nanoTime < 0.01f) {
                this.strength = 0.0f;
                return 0;
            }
        }
        return (int) (this.strength * 128.0f);
    }

    public String toString() {
        return getCurrentVideoEffectStatus();
    }

    public Camera2Attributes() {
        this.customCaptureRequestKeys = new HashMap<>();
    }
}
