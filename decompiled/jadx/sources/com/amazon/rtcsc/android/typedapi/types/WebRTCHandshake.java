package com.amazon.rtcsc.android.typedapi.types;

import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WebRTCHandshake {

    @NonNull
    private String format;

    @NonNull
    private String value;

    public WebRTCHandshake(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("format is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("value is marked non-null but is null");
            throw null;
        }
        this.format = str;
        this.value = str2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WebRTCHandshake;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebRTCHandshake)) {
            return false;
        }
        WebRTCHandshake webRTCHandshake = (WebRTCHandshake) obj;
        if (!webRTCHandshake.canEqual(this)) {
            return false;
        }
        String format = getFormat();
        String format2 = webRTCHandshake.getFormat();
        if (format != null ? !format.equals(format2) : format2 != null) {
            return false;
        }
        String value = getValue();
        String value2 = webRTCHandshake.getValue();
        return value != null ? value.equals(value2) : value2 == null;
    }

    @NonNull
    public String getFormat() {
        return this.format;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String format = getFormat();
        int hashCode = format == null ? 43 : format.hashCode();
        String value = getValue();
        return ((hashCode + 59) * 59) + (value != null ? value.hashCode() : 43);
    }
}
