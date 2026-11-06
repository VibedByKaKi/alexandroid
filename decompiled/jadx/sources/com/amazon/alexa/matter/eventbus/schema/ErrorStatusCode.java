package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum ErrorStatusCode {
    BAD_REQUEST,
    ILLEGAL_STATE,
    MATTER_ERROR,
    NOT_IMPLEMENTED,
    OS_ERROR,
    PERMISSION_DENIED,
    SERVICE_ERROR,
    TRANSPORT_ERROR,
    UNKNOWN;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.ErrorStatusCode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode;

        static {
            int[] iArr = new int[ErrorStatusCode.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode = iArr;
            try {
                iArr[ErrorStatusCode.BAD_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.ILLEGAL_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.MATTER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.NOT_IMPLEMENTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.OS_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.PERMISSION_DENIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.SERVICE_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.TRANSPORT_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ErrorStatusCode.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @JsonCreator
    public static ErrorStatusCode forValue(String str) throws IOException {
        if (str.equals("BAD_REQUEST")) {
            return BAD_REQUEST;
        }
        if (str.equals("ILLEGAL_STATE")) {
            return ILLEGAL_STATE;
        }
        if (str.equals("MATTER_ERROR")) {
            return MATTER_ERROR;
        }
        if (str.equals("NOT_IMPLEMENTED")) {
            return NOT_IMPLEMENTED;
        }
        if (str.equals("OS_ERROR")) {
            return OS_ERROR;
        }
        if (str.equals("PERMISSION_DENIED")) {
            return PERMISSION_DENIED;
        }
        if (str.equals("SERVICE_ERROR")) {
            return SERVICE_ERROR;
        }
        if (str.equals("TRANSPORT_ERROR")) {
            return TRANSPORT_ERROR;
        }
        if (str.equals("UNKNOWN")) {
            return UNKNOWN;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize ErrorStatusCode");
        return null;
    }

    @JsonValue
    public String toValue() {
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$ErrorStatusCode[ordinal()]) {
            case 1:
                return "BAD_REQUEST";
            case 2:
                return "ILLEGAL_STATE";
            case 3:
                return "MATTER_ERROR";
            case 4:
                return "NOT_IMPLEMENTED";
            case 5:
                return "OS_ERROR";
            case 6:
                return "PERMISSION_DENIED";
            case 7:
                return "SERVICE_ERROR";
            case 8:
                return "TRANSPORT_ERROR";
            case 9:
                return "UNKNOWN";
            default:
                return null;
        }
    }
}
