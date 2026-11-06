package com.amazon.alexa.applink.sendtoapp.reportuserinteraction;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class ReportUserInteractionResult {
    public static ReportUserInteractionResult create(@Nullable ReportUserInteractionOutcome reportUserInteractionOutcome, @Nullable ReportUserInteractionReason reportUserInteractionReason) {
        return new AutoValue_ReportUserInteractionResult(reportUserInteractionOutcome, reportUserInteractionReason);
    }

    @Nullable
    public abstract ReportUserInteractionOutcome outcome();

    @Nullable
    public abstract ReportUserInteractionReason reason();
}
