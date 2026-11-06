package org.webrtc;

import android.hardware.Camera;
import androidx.camera.core.processing.util.GLUtils;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
class Camera1Attributes implements CameraAttributes {
    private static final int DEFAULT_RADIUS = 128;
    private boolean enable;
    private boolean enableGpuPath;
    private final String str;
    private float strength;
    private float transitionTime;

    public Camera1Attributes(Camera.Parameters parameters, boolean z, float f, float f2, boolean z2) {
        this.str = parameters.flatten();
        this.enable = z;
        this.transitionTime = f;
        this.strength = f2;
        this.enableGpuPath = z2;
    }

    public String getCameraParametersString() {
        return this.str;
    }

    public String getCurrentVideoEffectStatus() {
        StringBuilder sb = new StringBuilder("[{Format:1.0}, {name:FROST, enable:");
        sb.append(this.enable);
        sb.append("}, {FROST: CURRENT:");
        return a$$ExternalSyntheticOutline0.m(sb, this.strength < 0.01f ? GLUtils.VERSION_UNKNOWN : "1.0", "}]");
    }

    public boolean getEnableGpuPath() {
        return this.enableGpuPath;
    }

    public boolean getEnableVideoEffect() {
        return this.enable;
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
}
