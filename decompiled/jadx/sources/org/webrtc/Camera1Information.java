package org.webrtc;

import android.hardware.Camera;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Camera1Information implements CameraInformation {
    private boolean enable;
    private boolean enableGpuPath;
    private final Camera.Parameters parameters;
    private float strength;
    private float transitionTime;

    public Camera1Information(Camera.Parameters parameters) {
        this.parameters = parameters;
    }

    @Override // org.webrtc.CameraInformation
    public void disableVideoEffect() {
        this.enable = false;
        this.transitionTime = 0.0f;
        this.strength = 0.0f;
        this.enableGpuPath = true;
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
        this.enableGpuPath = true;
    }

    @Override // org.webrtc.CameraInformation
    public CameraAttributes getAttributes() {
        return new Camera1Attributes(this.parameters, this.enable, this.transitionTime, this.strength, this.enableGpuPath);
    }

    public Camera.Parameters getParameters() {
        return this.parameters;
    }
}
