package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum LiveViewFlexGridAlignmentPolicy {
    LEFT_HORIZONTAL("LEFT_HORIZONTAL"),
    CENTER_HORIZONTAL("CENTER_HORIZONTAL"),
    RIGHT_HORIZONTAL("RIGHT_HORIZONTAL"),
    CENTER_VERTICAL("CENTER_VERTICAL"),
    BOTTOM_VERTICAL("BOTTOM_VERTICAL");

    private final String value;

    LiveViewFlexGridAlignmentPolicy(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
