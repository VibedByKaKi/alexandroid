package org.webrtc;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Camera2Information implements CameraInformation {
    private int captureHeight;
    private List<CaptureRequest.Key<?>> captureRequestKeys;
    private int captureWidth;
    private HashMap<String, Map.Entry<CaptureRequest.Key<Object>, Object>> customCaptureRequestKeys = new HashMap<>();
    private boolean enable;
    private FollowMeCameraSessionFrameUpdater followMeCameraFrameUpdater;
    private Surface followMeSurface;
    private float strength;
    private float transitionTime;

    public Camera2Information(List<CaptureRequest.Key<?>> list) {
        this.captureRequestKeys = new ArrayList();
        this.captureRequestKeys = list;
    }

    public void addCustomCaptureRequest(CaptureRequest.Key<Object> key, Object obj) {
        this.customCaptureRequestKeys.put(key.getName(), new AbstractMap.SimpleEntry(key, obj));
    }

    @Override // org.webrtc.CameraInformation
    public void disableVideoEffect() {
        this.enable = false;
        this.transitionTime = 0.0f;
        this.strength = 0.0f;
    }

    @Override // org.webrtc.CameraInformation
    public void enableVideoEffect(float f, float f2) {
        if (f < 0.0f) {
            Single$$ExternalSyntheticBUOutline0.m$3("TransitionTime can not be negative.");
            return;
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            Single$$ExternalSyntheticBUOutline0.m$3("Strength must be between 0.0 and 1.0 inclusive.");
            return;
        }
        this.enable = true;
        this.transitionTime = f;
        this.strength = f2;
    }

    @Override // org.webrtc.CameraInformation
    public Camera2Attributes getAttributes() {
        return new Camera2Attributes(this.enable, this.transitionTime, this.strength, this.customCaptureRequestKeys, this.followMeSurface, this.followMeCameraFrameUpdater);
    }

    public int getCaptureHeight() {
        return this.captureHeight;
    }

    public List<CaptureRequest.Key<?>> getCaptureRequestKeys() {
        return this.captureRequestKeys;
    }

    public int getCaptureWidth() {
        return this.captureWidth;
    }

    public void setCaptureHeight(int i) {
        this.captureHeight = i;
    }

    public void setCaptureWidth(int i) {
        this.captureWidth = i;
    }

    public void setFollowMeCameraSessionFrameUpdater(FollowMeCameraSessionFrameUpdater followMeCameraSessionFrameUpdater) {
        this.followMeCameraFrameUpdater = followMeCameraSessionFrameUpdater;
    }

    public void setFollowMeSurface(Surface surface) {
        this.followMeSurface = surface;
    }
}
