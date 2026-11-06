package com.amazon.ptzcontroller.lib.model.api.ptz.directive;

import com.amazon.alexa.smarthomecameras.ptz.directives.PhysicalPtzDirectiveConstants;
import edu.umd.cs.findbugs.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CameraPtzInstance {
    CAMERA_PAN(PhysicalPtzDirectiveConstants.CAMERA_PAN_INSTANCE_NAME),
    CAMERA_TILT(PhysicalPtzDirectiveConstants.CAMERA_TILT_INSTANCE_NAME),
    CAMERA_ZOOM("Camera.Zoom");

    private final String name;

    CameraPtzInstance(@NonNull String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
