package com.amazon.alexa.applink.sendtoapp.reportuserinteraction;

import androidx.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_ReportUserInteractionResults extends ReportUserInteractionResults {
    private final ReportUserInteractionResult fallback;
    private final ReportUserInteractionResult primary;

    public AutoValue_ReportUserInteractionResults(ReportUserInteractionResult reportUserInteractionResult, @Nullable ReportUserInteractionResult reportUserInteractionResult2) {
        if (reportUserInteractionResult == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null primary");
            throw null;
        }
        this.primary = reportUserInteractionResult;
        this.fallback = reportUserInteractionResult2;
    }

    public boolean equals(Object obj) {
        ReportUserInteractionResult reportUserInteractionResult;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReportUserInteractionResults) {
            ReportUserInteractionResults reportUserInteractionResults = (ReportUserInteractionResults) obj;
            if (this.primary.equals(reportUserInteractionResults.primary()) && ((reportUserInteractionResult = this.fallback) != null ? reportUserInteractionResult.equals(reportUserInteractionResults.fallback()) : reportUserInteractionResults.fallback() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.applink.sendtoapp.reportuserinteraction.ReportUserInteractionResults
    @Nullable
    public ReportUserInteractionResult fallback() {
        return this.fallback;
    }

    public int hashCode() {
        int hashCode = (this.primary.hashCode() ^ 1000003) * 1000003;
        ReportUserInteractionResult reportUserInteractionResult = this.fallback;
        return (reportUserInteractionResult == null ? 0 : reportUserInteractionResult.hashCode()) ^ hashCode;
    }

    @Override // com.amazon.alexa.applink.sendtoapp.reportuserinteraction.ReportUserInteractionResults
    public ReportUserInteractionResult primary() {
        return this.primary;
    }

    public String toString() {
        return "ReportUserInteractionResults{primary=" + this.primary + ", fallback=" + this.fallback + StringSubstitutor.DEFAULT_VAR_END;
    }
}
