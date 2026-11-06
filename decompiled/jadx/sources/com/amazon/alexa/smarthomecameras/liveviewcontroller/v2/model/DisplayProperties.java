package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.DisplayMode;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.OverlayPosition;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.OverlayType;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DisplayProperties implements Serializable {

    @NonNull
    @SerializedName("displayMode")
    private final DisplayMode displayMode;

    @SerializedName("overlayPosition")
    private final OverlayPosition overlayPosition;

    @SerializedName("overlayType")
    private final OverlayType overlayType;

    public DisplayProperties(DisplayMode displayMode, OverlayType overlayType, OverlayPosition overlayPosition) {
        this.displayMode = displayMode;
        this.overlayType = overlayType;
        this.overlayPosition = overlayPosition;
    }

    @NonNull
    public DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public OverlayPosition getOverlayPosition() {
        return this.overlayPosition;
    }

    public OverlayType getOverlayType() {
        return this.overlayType;
    }
}
