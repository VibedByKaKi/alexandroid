package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum Reason {
    ERROR,
    MANUAL,
    TIMEOUT;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.Reason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$Reason;

        static {
            int[] iArr = new int[Reason.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$Reason = iArr;
            try {
                iArr[Reason.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$Reason[Reason.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$Reason[Reason.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JsonCreator
    public static Reason forValue(String str) throws IOException {
        if (str.equals("Error")) {
            return ERROR;
        }
        if (str.equals("Manual")) {
            return MANUAL;
        }
        if (str.equals("Timeout")) {
            return TIMEOUT;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize Reason");
        return null;
    }

    @JsonValue
    public String toValue() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$Reason[ordinal()];
        if (i == 1) {
            return "Error";
        }
        if (i == 2) {
            return "Manual";
        }
        if (i != 3) {
            return null;
        }
        return "Timeout";
    }
}
