package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum EventType {
    MATTER_V1_CLIENT,
    MATTER_V1_SERVER;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.EventType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$EventType;

        static {
            int[] iArr = new int[EventType.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$EventType = iArr;
            try {
                iArr[EventType.MATTER_V1_CLIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$EventType[EventType.MATTER_V1_SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @JsonCreator
    public static EventType forValue(String str) throws IOException {
        if (str.equals("Matter:V1:Client")) {
            return MATTER_V1_CLIENT;
        }
        if (str.equals("Matter:V1:Server")) {
            return MATTER_V1_SERVER;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize EventType");
        return null;
    }

    @JsonValue
    public String toValue() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$EventType[ordinal()];
        if (i == 1) {
            return "Matter:V1:Client";
        }
        if (i != 2) {
            return null;
        }
        return "Matter:V1:Server";
    }
}
