package com.amazon.alexa.client.alexaservice.base.metrics.client;

import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientMetricData extends ClientMetricData {
    private final String apiCallId;
    private final String clientPackageName;
    private final String dialogTurnId;
    private final String eventId;
    private final String eventName;
    private final long eventTimestampMs;
    private final Integer eventValue;
    private final String invocationType;
    private final Long latencyMs;
    private final String softwareVersion;
    private final String sourcePackageName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ClientMetricData.Builder {
        private String apiCallId;
        private String clientPackageName;
        private String dialogTurnId;
        private String eventId;
        private String eventName;
        private Long eventTimestampMs;
        private Integer eventValue;
        private String invocationType;
        private Long latencyMs;
        private String softwareVersion;
        private String sourcePackageName;

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData autoBuild() {
            String str = this.eventName == null ? " eventName" : "";
            if (this.eventId == null) {
                str = str.concat(" eventId");
            }
            if (this.eventTimestampMs == null) {
                str = str.concat(" eventTimestampMs");
            }
            if (this.sourcePackageName == null) {
                str = str.concat(" sourcePackageName");
            }
            if (this.clientPackageName == null) {
                str = str.concat(" clientPackageName");
            }
            if (this.softwareVersion == null) {
                str = str.concat(" softwareVersion");
            }
            if (str.isEmpty()) {
                return new AutoValue_ClientMetricData(this.eventName, this.eventId, this.eventTimestampMs.longValue(), this.sourcePackageName, this.clientPackageName, this.softwareVersion, this.invocationType, this.dialogTurnId, this.latencyMs, this.apiCallId, this.eventValue, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        @Nullable
        public String getApiCallId() {
            return this.apiCallId;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        @Nullable
        public Integer getEventValue() {
            return this.eventValue;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        @Nullable
        public Long getLatencyMs() {
            return this.latencyMs;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setApiCallId(@Nullable String str) {
            this.apiCallId = str;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setClientPackageName(String str) {
            if (str != null) {
                this.clientPackageName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null clientPackageName");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setDialogTurnId(@Nullable String str) {
            this.dialogTurnId = str;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setEventId(String str) {
            if (str != null) {
                this.eventId = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventId");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setEventName(String str) {
            if (str != null) {
                this.eventName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventName");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setEventTimestampMs(long j) {
            this.eventTimestampMs = Long.valueOf(j);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setEventValue(@Nullable Integer num) {
            this.eventValue = num;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setInvocationType(@Nullable String str) {
            this.invocationType = str;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setLatencyMs(@Nullable Long l) {
            this.latencyMs = l;
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setSoftwareVersion(String str) {
            if (str != null) {
                this.softwareVersion = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null softwareVersion");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData.Builder
        public ClientMetricData.Builder setSourcePackageName(String str) {
            if (str != null) {
                this.sourcePackageName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null sourcePackageName");
            return null;
        }
    }

    private AutoValue_ClientMetricData(String str, String str2, long j, String str3, String str4, String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l, @Nullable String str8, @Nullable Integer num) {
        this.eventName = str;
        this.eventId = str2;
        this.eventTimestampMs = j;
        this.sourcePackageName = str3;
        this.clientPackageName = str4;
        this.softwareVersion = str5;
        this.invocationType = str6;
        this.dialogTurnId = str7;
        this.latencyMs = l;
        this.apiCallId = str8;
        this.eventValue = num;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Long l;
        String str3;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientMetricData) {
            ClientMetricData clientMetricData = (ClientMetricData) obj;
            if (this.eventName.equals(clientMetricData.getEventName()) && this.eventId.equals(clientMetricData.getEventId()) && this.eventTimestampMs == clientMetricData.getEventTimestampMs() && this.sourcePackageName.equals(clientMetricData.getSourcePackageName()) && this.clientPackageName.equals(clientMetricData.getClientPackageName()) && this.softwareVersion.equals(clientMetricData.getSoftwareVersion()) && ((str = this.invocationType) != null ? str.equals(clientMetricData.getInvocationType()) : clientMetricData.getInvocationType() == null) && ((str2 = this.dialogTurnId) != null ? str2.equals(clientMetricData.getDialogTurnId()) : clientMetricData.getDialogTurnId() == null) && ((l = this.latencyMs) != null ? l.equals(clientMetricData.getLatencyMs()) : clientMetricData.getLatencyMs() == null) && ((str3 = this.apiCallId) != null ? str3.equals(clientMetricData.getApiCallId()) : clientMetricData.getApiCallId() == null) && ((num = this.eventValue) != null ? num.equals(clientMetricData.getEventValue()) : clientMetricData.getEventValue() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    @Nullable
    public String getApiCallId() {
        return this.apiCallId;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    public String getClientPackageName() {
        return this.clientPackageName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    @Nullable
    public String getDialogTurnId() {
        return this.dialogTurnId;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    public String getEventId() {
        return this.eventId;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    public long getEventTimestampMs() {
        return this.eventTimestampMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    @Nullable
    public Integer getEventValue() {
        return this.eventValue;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    @Nullable
    public String getInvocationType() {
        return this.invocationType;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    @Nullable
    public Long getLatencyMs() {
        return this.latencyMs;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricData
    public String getSourcePackageName() {
        return this.sourcePackageName;
    }

    public int hashCode() {
        int hashCode = (((this.eventName.hashCode() ^ 1000003) * 1000003) ^ this.eventId.hashCode()) * 1000003;
        long j = this.eventTimestampMs;
        int hashCode2 = (((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.sourcePackageName.hashCode()) * 1000003) ^ this.clientPackageName.hashCode()) * 1000003) ^ this.softwareVersion.hashCode()) * 1000003;
        String str = this.invocationType;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.dialogTurnId;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.latencyMs;
        int hashCode5 = (hashCode4 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str3 = this.apiCallId;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Integer num = this.eventValue;
        return hashCode6 ^ (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientMetricData{eventName=");
        sb.append(this.eventName);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", eventTimestampMs=");
        sb.append(this.eventTimestampMs);
        sb.append(", sourcePackageName=");
        sb.append(this.sourcePackageName);
        sb.append(", clientPackageName=");
        sb.append(this.clientPackageName);
        sb.append(", softwareVersion=");
        sb.append(this.softwareVersion);
        sb.append(", invocationType=");
        sb.append(this.invocationType);
        sb.append(", dialogTurnId=");
        sb.append(this.dialogTurnId);
        sb.append(", latencyMs=");
        sb.append(this.latencyMs);
        sb.append(", apiCallId=");
        sb.append(this.apiCallId);
        sb.append(", eventValue=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, this.eventValue, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ClientMetricData(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, Long l, String str8, Integer num, int i) {
        this(str, str2, j, str3, str4, str5, str6, str7, l, str8, num);
    }
}
