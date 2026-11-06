package com.amazon.alexa.accessory.speech.events.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_AccessoryStateChangeEventPayload extends AccessoryStateChangeEventPayload {
    private final List<AccessoryInfo> accessories;
    private final String eventTimestamp;
    private final PersonInfo personInfo;

    @Nullable
    private final String token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AccessoryStateChangeEventPayload.Builder {
        private List<AccessoryInfo> accessories;
        private String eventTimestamp;
        private PersonInfo personInfo;
        private String token;

        @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload.Builder
        public AccessoryStateChangeEventPayload build() {
            List<AccessoryInfo> list;
            PersonInfo personInfo;
            String str = this.eventTimestamp;
            if (str != null && (list = this.accessories) != null && (personInfo = this.personInfo) != null) {
                return new AutoValue_AccessoryStateChangeEventPayload(str, list, personInfo, this.token, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.eventTimestamp == null) {
                sb.append(" eventTimestamp");
            }
            if (this.accessories == null) {
                sb.append(" accessories");
            }
            if (this.personInfo == null) {
                sb.append(" personInfo");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload.Builder
        public AccessoryStateChangeEventPayload.Builder setAccessories(List<AccessoryInfo> list) {
            if (list != null) {
                this.accessories = list;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null accessories");
            return null;
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload.Builder
        public AccessoryStateChangeEventPayload.Builder setEventTimestamp(String str) {
            if (str != null) {
                this.eventTimestamp = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventTimestamp");
            return null;
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload.Builder
        public AccessoryStateChangeEventPayload.Builder setPersonInfo(PersonInfo personInfo) {
            if (personInfo != null) {
                this.personInfo = personInfo;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null personInfo");
            return null;
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload.Builder
        public AccessoryStateChangeEventPayload.Builder setToken(String str) {
            this.token = str;
            return this;
        }
    }

    private AutoValue_AccessoryStateChangeEventPayload(String str, List<AccessoryInfo> list, PersonInfo personInfo, @Nullable String str2) {
        this.eventTimestamp = str;
        this.accessories = list;
        this.personInfo = personInfo;
        this.token = str2;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccessoryStateChangeEventPayload) {
            AccessoryStateChangeEventPayload accessoryStateChangeEventPayload = (AccessoryStateChangeEventPayload) obj;
            if (this.eventTimestamp.equals(accessoryStateChangeEventPayload.getEventTimestamp()) && this.accessories.equals(accessoryStateChangeEventPayload.getAccessories()) && this.personInfo.equals(accessoryStateChangeEventPayload.getPersonInfo()) && ((str = this.token) != null ? str.equals(accessoryStateChangeEventPayload.getToken()) : accessoryStateChangeEventPayload.getToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload
    public List<AccessoryInfo> getAccessories() {
        return this.accessories;
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload
    public String getEventTimestamp() {
        return this.eventTimestamp;
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload
    public PersonInfo getPersonInfo() {
        return this.personInfo;
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.AccessoryStateChangeEventPayload
    @Nullable
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = (((((this.eventTimestamp.hashCode() ^ 1000003) * 1000003) ^ this.accessories.hashCode()) * 1000003) ^ this.personInfo.hashCode()) * 1000003;
        String str = this.token;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccessoryStateChangeEventPayload{eventTimestamp=");
        sb.append(this.eventTimestamp);
        sb.append(", accessories=");
        sb.append(this.accessories);
        sb.append(", personInfo=");
        sb.append(this.personInfo);
        sb.append(", token=");
        return a$$ExternalSyntheticOutline0.m(sb, this.token, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_AccessoryStateChangeEventPayload(String str, List list, PersonInfo personInfo, String str2, int i) {
        this(str, list, personInfo, str2);
    }
}
