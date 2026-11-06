package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum FabricType {
    OPERATING_SYSTEM;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.FabricType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FabricType;

        static {
            int[] iArr = new int[FabricType.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$FabricType = iArr;
            try {
                iArr[FabricType.OPERATING_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @JsonCreator
    public static FabricType forValue(String str) throws IOException {
        if (str.equals("OperatingSystem")) {
            return OPERATING_SYSTEM;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize FabricType");
        return null;
    }

    @JsonValue
    public String toValue() {
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$FabricType[ordinal()] != 1) {
            return null;
        }
        return "OperatingSystem";
    }
}
