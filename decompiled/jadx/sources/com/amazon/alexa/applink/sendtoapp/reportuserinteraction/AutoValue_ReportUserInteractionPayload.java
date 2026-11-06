package com.amazon.alexa.applink.sendtoapp.reportuserinteraction;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_ReportUserInteractionPayload extends ReportUserInteractionPayload {
    private final ReportUserInteractionResults result;
    private final String token;
    private final ReportUserInteractionType type;

    public AutoValue_ReportUserInteractionPayload(ReportUserInteractionType reportUserInteractionType, ReportUserInteractionResults reportUserInteractionResults, String str) {
        if (reportUserInteractionType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            throw null;
        }
        this.type = reportUserInteractionType;
        if (reportUserInteractionResults == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null result");
            throw null;
        }
        this.result = reportUserInteractionResults;
        if (str != null) {
            this.token = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null token");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReportUserInteractionPayload) {
            ReportUserInteractionPayload reportUserInteractionPayload = (ReportUserInteractionPayload) obj;
            if (this.type.equals(reportUserInteractionPayload.type()) && this.result.equals(reportUserInteractionPayload.result()) && this.token.equals(reportUserInteractionPayload.token())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.token.hashCode() ^ ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.result.hashCode()) * 1000003);
    }

    @Override // com.amazon.alexa.applink.sendtoapp.reportuserinteraction.ReportUserInteractionPayload
    public ReportUserInteractionResults result() {
        return this.result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReportUserInteractionPayload{type=");
        sb.append(this.type);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", token=");
        return a$$ExternalSyntheticOutline0.m(sb, this.token, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.alexa.applink.sendtoapp.reportuserinteraction.ReportUserInteractionPayload
    public String token() {
        return this.token;
    }

    @Override // com.amazon.alexa.applink.sendtoapp.reportuserinteraction.ReportUserInteractionPayload
    public ReportUserInteractionType type() {
        return this.type;
    }
}
