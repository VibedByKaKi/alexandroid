package com.amazon.alexa.applink.sendtoapp.reportuserinteraction;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class ReportUserInteractionResults {
    public static ReportUserInteractionResults create(ReportUserInteractionResult reportUserInteractionResult, @Nullable ReportUserInteractionResult reportUserInteractionResult2) {
        return new AutoValue_ReportUserInteractionResults(reportUserInteractionResult, reportUserInteractionResult2);
    }

    @Nullable
    public abstract ReportUserInteractionResult fallback();

    public abstract ReportUserInteractionResult primary();
}
