package com.amazon.alexa.accessory.kota;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class CompanionDeviceId implements JsonObjectSerializable {
    private final String deviceSerialNumber;
    private final String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        String deviceSerialNumber;
        String deviceType;

        public CompanionDeviceId build() {
            Preconditions.notNull(this.deviceSerialNumber, "deviceSerialNumber");
            Preconditions.notNull(this.deviceType, "deviceType");
            return new CompanionDeviceId(this);
        }

        public Builder deviceSerialNumber(String str) {
            this.deviceSerialNumber = str;
            return this;
        }

        public Builder deviceType(String str) {
            this.deviceType = str;
            return this;
        }
    }

    public CompanionDeviceId(Builder builder) {
        this.deviceSerialNumber = builder.deviceSerialNumber;
        this.deviceType = builder.deviceType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CompanionDeviceId.class != obj.getClass()) {
            return false;
        }
        CompanionDeviceId companionDeviceId = (CompanionDeviceId) obj;
        if (this.deviceSerialNumber.equals(companionDeviceId.deviceSerialNumber)) {
            return this.deviceType.equals(companionDeviceId.deviceType);
        }
        return false;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return this.deviceType.hashCode() + (this.deviceSerialNumber.hashCode() * 31);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("deviceSerialNumber", this.deviceSerialNumber).put("deviceType", this.deviceType);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CompanionDeviceId{deviceSerialNumber='");
        sb.append(this.deviceSerialNumber);
        sb.append("', deviceType='");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceType, "'}");
    }
}
