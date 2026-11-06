package com.amazon.rtcsc.wrappers;

import com.amazon.alexa.smarthomecameras.constants.ErrorConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RTCSCErrorCode {
    public static final RTCSCErrorCode ALREADY_INITIALIZED;
    public static final RTCSCErrorCode CAMERA_NOT_AVAILABLE;
    public static final RTCSCErrorCode DIRECTIVE_PARSE_ERROR;
    public static final RTCSCErrorCode EMPTY_APP_IDENTIFIER;
    public static final RTCSCErrorCode INITIALIZE_FAILED;
    public static final RTCSCErrorCode INTERNAL_SESSION_ERROR;
    public static final RTCSCErrorCode INVALID_DEVICE_CONFIGURATION;
    public static final RTCSCErrorCode LISTENER_NOT_FOUND;
    public static final RTCSCErrorCode LISTENER_PREVIOUSLY_REGISTERED;
    public static final RTCSCErrorCode LISTENER_REGISTRATION_FAILED;
    public static final RTCSCErrorCode MEDIA_CONNECTION_FAILED;
    public static final RTCSCErrorCode MEDIA_CONNECTION_LOST;
    public static final RTCSCErrorCode METRICS_PUBLISHER_ADAPTER_PREVIOUSLY_REGISTERED;
    public static final RTCSCErrorCode NOT_INITIALIZED;
    public static final RTCSCErrorCode NULL_LISTENER;
    public static final RTCSCErrorCode NULL_METRICS_PUBLISHER_ADAPTER;
    public static final RTCSCErrorCode SESSION_ID_NOT_FOUND;
    public static final RTCSCErrorCode SESSION_TIMEOUT;
    public static final RTCSCErrorCode SUCCESS;
    public static final RTCSCErrorCode UNKNOWN_DIRECTIVE;
    public static final RTCSCErrorCode VIDEO_EFFECT_FAILED;
    private static int swigNext;
    private static RTCSCErrorCode[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        RTCSCErrorCode rTCSCErrorCode = new RTCSCErrorCode("SUCCESS");
        SUCCESS = rTCSCErrorCode;
        RTCSCErrorCode rTCSCErrorCode2 = new RTCSCErrorCode("NOT_INITIALIZED");
        NOT_INITIALIZED = rTCSCErrorCode2;
        RTCSCErrorCode rTCSCErrorCode3 = new RTCSCErrorCode("ALREADY_INITIALIZED");
        ALREADY_INITIALIZED = rTCSCErrorCode3;
        RTCSCErrorCode rTCSCErrorCode4 = new RTCSCErrorCode("NULL_LISTENER");
        NULL_LISTENER = rTCSCErrorCode4;
        RTCSCErrorCode rTCSCErrorCode5 = new RTCSCErrorCode(ErrorConstants.UNKNOWN_DIRECTIVE);
        UNKNOWN_DIRECTIVE = rTCSCErrorCode5;
        RTCSCErrorCode rTCSCErrorCode6 = new RTCSCErrorCode("DIRECTIVE_PARSE_ERROR");
        DIRECTIVE_PARSE_ERROR = rTCSCErrorCode6;
        RTCSCErrorCode rTCSCErrorCode7 = new RTCSCErrorCode("INITIALIZE_FAILED");
        INITIALIZE_FAILED = rTCSCErrorCode7;
        RTCSCErrorCode rTCSCErrorCode8 = new RTCSCErrorCode("LISTENER_REGISTRATION_FAILED");
        LISTENER_REGISTRATION_FAILED = rTCSCErrorCode8;
        RTCSCErrorCode rTCSCErrorCode9 = new RTCSCErrorCode("SESSION_ID_NOT_FOUND");
        SESSION_ID_NOT_FOUND = rTCSCErrorCode9;
        RTCSCErrorCode rTCSCErrorCode10 = new RTCSCErrorCode("LISTENER_PREVIOUSLY_REGISTERED");
        LISTENER_PREVIOUSLY_REGISTERED = rTCSCErrorCode10;
        RTCSCErrorCode rTCSCErrorCode11 = new RTCSCErrorCode("LISTENER_NOT_FOUND");
        LISTENER_NOT_FOUND = rTCSCErrorCode11;
        RTCSCErrorCode rTCSCErrorCode12 = new RTCSCErrorCode("NULL_METRICS_PUBLISHER_ADAPTER");
        NULL_METRICS_PUBLISHER_ADAPTER = rTCSCErrorCode12;
        RTCSCErrorCode rTCSCErrorCode13 = new RTCSCErrorCode("METRICS_PUBLISHER_ADAPTER_PREVIOUSLY_REGISTERED");
        METRICS_PUBLISHER_ADAPTER_PREVIOUSLY_REGISTERED = rTCSCErrorCode13;
        RTCSCErrorCode rTCSCErrorCode14 = new RTCSCErrorCode("EMPTY_APP_IDENTIFIER");
        EMPTY_APP_IDENTIFIER = rTCSCErrorCode14;
        RTCSCErrorCode rTCSCErrorCode15 = new RTCSCErrorCode("INVALID_DEVICE_CONFIGURATION");
        INVALID_DEVICE_CONFIGURATION = rTCSCErrorCode15;
        RTCSCErrorCode rTCSCErrorCode16 = new RTCSCErrorCode("INTERNAL_SESSION_ERROR");
        INTERNAL_SESSION_ERROR = rTCSCErrorCode16;
        RTCSCErrorCode rTCSCErrorCode17 = new RTCSCErrorCode("CAMERA_NOT_AVAILABLE");
        CAMERA_NOT_AVAILABLE = rTCSCErrorCode17;
        RTCSCErrorCode rTCSCErrorCode18 = new RTCSCErrorCode("MEDIA_CONNECTION_FAILED");
        MEDIA_CONNECTION_FAILED = rTCSCErrorCode18;
        RTCSCErrorCode rTCSCErrorCode19 = new RTCSCErrorCode("MEDIA_CONNECTION_LOST");
        MEDIA_CONNECTION_LOST = rTCSCErrorCode19;
        RTCSCErrorCode rTCSCErrorCode20 = new RTCSCErrorCode("SESSION_TIMEOUT");
        SESSION_TIMEOUT = rTCSCErrorCode20;
        RTCSCErrorCode rTCSCErrorCode21 = new RTCSCErrorCode("VIDEO_EFFECT_FAILED");
        VIDEO_EFFECT_FAILED = rTCSCErrorCode21;
        swigValues = new RTCSCErrorCode[]{rTCSCErrorCode, rTCSCErrorCode2, rTCSCErrorCode3, rTCSCErrorCode4, rTCSCErrorCode5, rTCSCErrorCode6, rTCSCErrorCode7, rTCSCErrorCode8, rTCSCErrorCode9, rTCSCErrorCode10, rTCSCErrorCode11, rTCSCErrorCode12, rTCSCErrorCode13, rTCSCErrorCode14, rTCSCErrorCode15, rTCSCErrorCode16, rTCSCErrorCode17, rTCSCErrorCode18, rTCSCErrorCode19, rTCSCErrorCode20, rTCSCErrorCode21};
        swigNext = 0;
    }

    private RTCSCErrorCode(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static RTCSCErrorCode swigToEnum(int i) {
        RTCSCErrorCode[] rTCSCErrorCodeArr = swigValues;
        if (i < rTCSCErrorCodeArr.length && i >= 0) {
            RTCSCErrorCode rTCSCErrorCode = rTCSCErrorCodeArr[i];
            if (rTCSCErrorCode.swigValue == i) {
                return rTCSCErrorCode;
            }
        }
        int i2 = 0;
        while (true) {
            RTCSCErrorCode[] rTCSCErrorCodeArr2 = swigValues;
            if (i2 >= rTCSCErrorCodeArr2.length) {
                Single$$ExternalSyntheticBUOutline0.m$3(RegionDefaults$$ExternalSyntheticOutline0.m(RTCSCErrorCode.class, "No enum ", " with value ", i));
                return null;
            }
            RTCSCErrorCode rTCSCErrorCode2 = rTCSCErrorCodeArr2[i2];
            if (rTCSCErrorCode2.swigValue == i) {
                return rTCSCErrorCode2;
            }
            i2++;
        }
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    private RTCSCErrorCode(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private RTCSCErrorCode(String str, RTCSCErrorCode rTCSCErrorCode) {
        this.swigName = str;
        int i = rTCSCErrorCode.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
