package com.amazon.alexa.matter.eventbus.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum WiFiNetworkFrequencyBand {
    BAND_2_4__GHZ,
    BAND_3_655__GHZ,
    BAND_5__GHZ,
    BAND_60__GHZ,
    BAND_6__GHZ;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.matter.eventbus.schema.WiFiNetworkFrequencyBand$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkFrequencyBand;

        static {
            int[] iArr = new int[WiFiNetworkFrequencyBand.values().length];
            $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkFrequencyBand = iArr;
            try {
                iArr[WiFiNetworkFrequencyBand.BAND_2_4__GHZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkFrequencyBand[WiFiNetworkFrequencyBand.BAND_3_655__GHZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkFrequencyBand[WiFiNetworkFrequencyBand.BAND_5__GHZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkFrequencyBand[WiFiNetworkFrequencyBand.BAND_60__GHZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkFrequencyBand[WiFiNetworkFrequencyBand.BAND_6__GHZ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @JsonCreator
    public static WiFiNetworkFrequencyBand forValue(String str) throws IOException {
        if (str.equals("BAND_2_4_GHZ")) {
            return BAND_2_4__GHZ;
        }
        if (str.equals("BAND_3_655_GHZ")) {
            return BAND_3_655__GHZ;
        }
        if (str.equals("BAND_5_GHZ")) {
            return BAND_5__GHZ;
        }
        if (str.equals("BAND_60_GHZ")) {
            return BAND_60__GHZ;
        }
        if (str.equals("BAND_6_GHZ")) {
            return BAND_6__GHZ;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot deserialize WiFiNetworkFrequencyBand");
        return null;
    }

    @JsonValue
    public String toValue() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$matter$eventbus$schema$WiFiNetworkFrequencyBand[ordinal()];
        if (i == 1) {
            return "BAND_2_4_GHZ";
        }
        if (i == 2) {
            return "BAND_3_655_GHZ";
        }
        if (i == 3) {
            return "BAND_5_GHZ";
        }
        if (i == 4) {
            return "BAND_60_GHZ";
        }
        if (i != 5) {
            return null;
        }
        return "BAND_6_GHZ";
    }
}
