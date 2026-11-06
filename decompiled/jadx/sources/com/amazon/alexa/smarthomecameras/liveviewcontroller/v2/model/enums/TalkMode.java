package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum TalkMode {
    NO_SUPPORT("NO_SUPPORT"),
    PRESS_AND_HOLD("PRESS_AND_HOLD"),
    PRESS("PRESS");

    private final String value;

    TalkMode(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
