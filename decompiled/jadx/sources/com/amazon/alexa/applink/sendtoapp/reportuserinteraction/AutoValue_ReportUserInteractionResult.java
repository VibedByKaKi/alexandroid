package com.amazon.alexa.applink.sendtoapp.reportuserinteraction;

import androidx.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_ReportUserInteractionResult extends ReportUserInteractionResult {
    private final ReportUserInteractionOutcome outcome;
    private final ReportUserInteractionReason reason;

    public AutoValue_ReportUserInteractionResult(@Nullable ReportUserInteractionOutcome reportUserInteractionOutcome, @Nullable ReportUserInteractionReason reportUserInteractionReason) {
        this.outcome = reportUserInteractionOutcome;
        this.reason = reportUserInteractionReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReportUserInteractionResult) {
            ReportUserInteractionResult reportUserInteractionResult = (ReportUserInteractionResult) obj;
            ReportUserInteractionOutcome reportUserInteractionOutcome = this.outcome;
            if (reportUserInteractionOutcome != null ? reportUserInteractionOutcome.equals(reportUserInteractionResult.outcome()) : reportUserInteractionResult.outcome() == null) {
                ReportUserInteractionReason reportUserInteractionReason = this.reason;
                if (reportUserInteractionReason != null ? reportUserInteractionReason.equals(reportUserInteractionResult.reason()) : reportUserInteractionResult.reason() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ReportUserInteractionOutcome reportUserInteractionOutcome = this.outcome;
        int hashCode = ((reportUserInteractionOutcome == null ? 0 : reportUserInteractionOutcome.hashCode()) ^ 1000003) * 1000003;
        ReportUserInteractionReason reportUserInteractionReason = this.reason;
        return hashCode ^ (reportUserInteractionReason != null ? reportUserInteractionReason.hashCode() : 0);
    }

    @Override // com.amazon.alexa.applink.sendtoapp.reportuserinteraction.ReportUserInteractionResult
    @Nullable
    public ReportUserInteractionOutcome outcome() {
        return this.outcome;
    }

    @Override // com.amazon.alexa.applink.sendtoapp.reportuserinteraction.ReportUserInteractionResult
    @Nullable
    public ReportUserInteractionReason reason() {
        return this.reason;
    }

    public String toString() {
        return "ReportUserInteractionResult{outcome=" + this.outcome + ", reason=" + this.reason + StringSubstitutor.DEFAULT_VAR_END;
    }
}
