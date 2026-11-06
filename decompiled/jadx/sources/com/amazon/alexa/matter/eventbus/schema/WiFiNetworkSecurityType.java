package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum WiFiNetworkSecurityType {
    OPEN,
    WEP,
    WPA,
    WPA2,
    WPA2_WPA3_TRANSITIONAL,
    WPA3_ONLY;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.WiFiNetworkSecurityType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType;

        static {
            int[] iArr = new int[WiFiNetworkSecurityType.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType = iArr;
            try {
                iArr[WiFiNetworkSecurityType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType[WiFiNetworkSecurityType.WEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType[WiFiNetworkSecurityType.WPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType[WiFiNetworkSecurityType.WPA2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType[WiFiNetworkSecurityType.WPA2_WPA3_TRANSITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType[WiFiNetworkSecurityType.WPA3_ONLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @JsonCreator
    public static WiFiNetworkSecurityType forValue(String str) throws IOException {
        if (str.equals("OPEN")) {
            return OPEN;
        }
        if (str.equals("WEP")) {
            return WEP;
        }
        if (str.equals("WPA")) {
            return WPA;
        }
        if (str.equals("WPA2")) {
            return WPA2;
        }
        if (str.equals("WPA2_WPA3_TRANSITIONAL")) {
            return WPA2_WPA3_TRANSITIONAL;
        }
        if (str.equals("WPA3_ONLY")) {
            return WPA3_ONLY;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize WiFiNetworkSecurityType");
        return null;
    }

    @JsonValue
    public String toValue() {
        switch (AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkSecurityType[ordinal()]) {
            case 1:
                return "OPEN";
            case 2:
                return "WEP";
            case 3:
                return "WPA";
            case 4:
                return "WPA2";
            case 5:
                return "WPA2_WPA3_TRANSITIONAL";
            case 6:
                return "WPA3_ONLY";
            default:
                return null;
        }
    }
}
