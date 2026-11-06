package com.amazon.alexa.accessorykit.findmy;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_FindMyAccessoryInformation extends FindMyAccessoryInformation {
    private final String deviceSerialNumber;
    private final String deviceType;
    private final FindMyAccessoryInformation.EventCause eventCause;
    private final String identifier;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends FindMyAccessoryInformation.Builder {
        private String deviceSerialNumber;
        private String deviceType;
        private FindMyAccessoryInformation.EventCause eventCause;
        private String identifier;

        @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation.Builder
        public FindMyAccessoryInformation build() {
            String str;
            FindMyAccessoryInformation.EventCause eventCause;
            String str2;
            String str3 = this.deviceSerialNumber;
            if (str3 != null && (str = this.deviceType) != null && (eventCause = this.eventCause) != null && (str2 = this.identifier) != null) {
                return new AutoValue_FindMyAccessoryInformation(str3, str, eventCause, str2, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.deviceSerialNumber == null) {
                sb.append(" deviceSerialNumber");
            }
            if (this.deviceType == null) {
                sb.append(" deviceType");
            }
            if (this.eventCause == null) {
                sb.append(" eventCause");
            }
            if (this.identifier == null) {
                sb.append(" identifier");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation.Builder
        public FindMyAccessoryInformation.Builder setDeviceSerialNumber(String str) {
            if (str != null) {
                this.deviceSerialNumber = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceSerialNumber");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation.Builder
        public FindMyAccessoryInformation.Builder setDeviceType(String str) {
            if (str != null) {
                this.deviceType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceType");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation.Builder
        public FindMyAccessoryInformation.Builder setEventCause(FindMyAccessoryInformation.EventCause eventCause) {
            if (eventCause != null) {
                this.eventCause = eventCause;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventCause");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation.Builder
        public FindMyAccessoryInformation.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null identifier");
            return null;
        }
    }

    private AutoValue_FindMyAccessoryInformation(String str, String str2, FindMyAccessoryInformation.EventCause eventCause, String str3) {
        this.deviceSerialNumber = str;
        this.deviceType = str2;
        this.eventCause = eventCause;
        this.identifier = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindMyAccessoryInformation) {
            FindMyAccessoryInformation findMyAccessoryInformation = (FindMyAccessoryInformation) obj;
            if (this.deviceSerialNumber.equals(findMyAccessoryInformation.getDeviceSerialNumber()) && this.deviceType.equals(findMyAccessoryInformation.getDeviceType()) && this.eventCause.equals(findMyAccessoryInformation.getEventCause()) && this.identifier.equals(findMyAccessoryInformation.getIdentifier())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation
    @JsonProperty("deviceSerialNumber")
    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation
    @JsonProperty("deviceType")
    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation
    @JsonProperty("eventCause")
    public FindMyAccessoryInformation.EventCause getEventCause() {
        return this.eventCause;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.FindMyAccessoryInformation
    @JsonProperty("identifier")
    public String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode() ^ ((((((this.deviceSerialNumber.hashCode() ^ 1000003) * 1000003) ^ this.deviceType.hashCode()) * 1000003) ^ this.eventCause.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FindMyAccessoryInformation{deviceSerialNumber=");
        sb.append(this.deviceSerialNumber);
        sb.append(", deviceType=");
        sb.append(this.deviceType);
        sb.append(", eventCause=");
        sb.append(this.eventCause);
        sb.append(", identifier=");
        return a$$ExternalSyntheticOutline0.m(sb, this.identifier, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_FindMyAccessoryInformation(String str, String str2, FindMyAccessoryInformation.EventCause eventCause, String str3, int i) {
        this(str, str2, eventCause, str3);
    }
}
