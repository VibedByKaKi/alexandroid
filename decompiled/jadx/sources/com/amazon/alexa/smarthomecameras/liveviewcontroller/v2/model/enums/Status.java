package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums;

import com.amazon.alexa.smarthomecameras.constants.ErrorConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum Status {
    STOP_LIVE_VIEW_REQUESTED("STOP_LIVE_VIEW_REQUESTED"),
    MEDIA_SOURCE_NOT_FOUND(ErrorConstants.MEDIA_SOURCE_NOT_FOUND),
    UNAUTHORIZED(ErrorConstants.UNAUTHORIZED),
    BATTERY_LEVEL_TOO_LOW("BATTERY_LEVEL_TOO_LOW"),
    MEDIA_SOURCE_ASLEEP("MEDIA_SOURCE_ASLEEP"),
    MEDIA_SOURCE_TURNED_OFF(ErrorConstants.MEDIA_SOURCE_TURNED_OFF),
    SESSION_TIMEOUT("SESSION_TIMEOUT"),
    CAMERAS_DISCONNECTED("CAMERAS_DISCONNECTED"),
    VIEWERS_DISCONNECTED("VIEWERS_DISCONNECTED");

    private final String value;

    Status(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
