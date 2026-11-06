package com.amazon.alexa.accessory.nearmiss;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MetaDataPayload implements JsonObjectSerializable {
    private final String appVersion;
    private final String deviceSerialNumber;
    private final String deviceType;
    private final String locale;
    private final String wwEndSeqnum;
    private final String wwStartSeqnum;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        public String appVersion;
        public String deviceSerialNumber;
        public String deviceType;
        public String locale;
        public String wwEndSeqnum;
        public String wwStartSeqnum;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public MetaDataPayload build() {
            Preconditions.notNull(this.appVersion, "appVersion");
            Preconditions.notNull(this.locale, "locale");
            Preconditions.notNull(this.wwStartSeqnum, "wwStartSeqnum");
            Preconditions.notNull(this.wwEndSeqnum, "wwEndSeqnum");
            Preconditions.notNull(this.deviceSerialNumber, "deviceSerialNumber");
            Preconditions.notNull(this.deviceType, "deviceType");
            return new MetaDataPayload(this);
        }

        public Builder deviceSerialNumber(String str) {
            this.deviceSerialNumber = str;
            return this;
        }

        public Builder deviceType(String str) {
            this.deviceType = str;
            return this;
        }

        public Builder locale(String str) {
            this.locale = str;
            return this;
        }

        public Builder wwEndSeqnum(int i) {
            this.wwEndSeqnum = String.valueOf(i);
            return this;
        }

        public Builder wwStartSeqnum(int i) {
            this.wwStartSeqnum = String.valueOf(i);
            return this;
        }
    }

    public MetaDataPayload(Builder builder) {
        Preconditions.notNull(builder, "builder");
        this.appVersion = builder.appVersion;
        this.locale = builder.locale;
        this.wwStartSeqnum = builder.wwStartSeqnum;
        this.wwEndSeqnum = builder.wwEndSeqnum;
        this.deviceType = builder.deviceType;
        this.deviceSerialNumber = builder.deviceSerialNumber;
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put("appVersion", this.appVersion).put("locale", this.locale).put("deviceType", this.deviceType).put("deviceSerialNumber", this.deviceSerialNumber).put("wwStartSeqnum", this.wwStartSeqnum).put("wwEndSeqnum", this.wwEndSeqnum);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetaDataPayload{appVersion='");
        sb.append(this.appVersion);
        sb.append("', locale='");
        sb.append(this.locale);
        sb.append("', wwStartSeqnum='");
        sb.append(this.wwStartSeqnum);
        sb.append("', wwEndSeqnum='");
        sb.append(this.wwEndSeqnum);
        sb.append("', deviceType='");
        sb.append(this.deviceType);
        sb.append("', deviceSerialNumber='");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceSerialNumber, "'}");
    }
}
