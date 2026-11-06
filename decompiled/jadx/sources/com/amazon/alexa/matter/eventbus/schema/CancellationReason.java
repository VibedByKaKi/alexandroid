package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum CancellationReason {
    ERROR,
    TIMEOUT,
    USER_ACTION;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.CancellationReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CancellationReason;

        static {
            int[] iArr = new int[CancellationReason.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CancellationReason = iArr;
            try {
                iArr[CancellationReason.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CancellationReason[CancellationReason.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$CancellationReason[CancellationReason.USER_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JsonCreator
    public static CancellationReason forValue(String str) throws IOException {
        if (str.equals("ERROR")) {
            return ERROR;
        }
        if (str.equals("TIMEOUT")) {
            return TIMEOUT;
        }
        if (str.equals("USER_ACTION")) {
            return USER_ACTION;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize CancellationReason");
        return null;
    }

    @JsonValue
    public String toValue() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$CancellationReason[ordinal()];
        if (i == 1) {
            return "ERROR";
        }
        if (i == 2) {
            return "TIMEOUT";
        }
        if (i != 3) {
            return null;
        }
        return "USER_ACTION";
    }
}
