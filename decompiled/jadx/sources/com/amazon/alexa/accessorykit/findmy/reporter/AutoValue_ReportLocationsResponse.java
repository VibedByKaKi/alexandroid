package com.amazon.alexa.accessorykit.findmy.reporter;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_ReportLocationsResponse extends ReportLocationsResponse {

    @Nullable
    private final String message;

    @Nullable
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ReportLocationsResponse.Builder {
        private String message;
        private String type;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsResponse.Builder
        public ReportLocationsResponse build() {
            return new AutoValue_ReportLocationsResponse(this.type, this.message, 0);
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsResponse.Builder
        public ReportLocationsResponse.Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsResponse.Builder
        public ReportLocationsResponse.Builder setType(String str) {
            this.type = str;
            return this;
        }
    }

    private AutoValue_ReportLocationsResponse(@Nullable String str, @Nullable String str2) {
        this.type = str;
        this.message = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReportLocationsResponse) {
            ReportLocationsResponse reportLocationsResponse = (ReportLocationsResponse) obj;
            String str = this.type;
            if (str != null ? str.equals(reportLocationsResponse.getType()) : reportLocationsResponse.getType() == null) {
                String str2 = this.message;
                if (str2 != null ? str2.equals(reportLocationsResponse.getMessage()) : reportLocationsResponse.getMessage() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsResponse
    @Nullable
    @JsonProperty("message")
    public String getMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsResponse
    @Nullable
    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.message;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReportLocationsResponse{type=");
        sb.append(this.type);
        sb.append(", message=");
        return a$$ExternalSyntheticOutline0.m(sb, this.message, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ReportLocationsResponse(String str, String str2, int i) {
        this(str, str2);
    }
}
