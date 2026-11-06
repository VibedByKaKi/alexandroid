package com.amazon.alexa.applink.sendtoapp.reportuserinteraction;

import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class ReportUserInteractionPayload {
    public static ReportUserInteractionPayload create(ReportUserInteractionType reportUserInteractionType, ReportUserInteractionResults reportUserInteractionResults, String str) {
        return new AutoValue_ReportUserInteractionPayload(reportUserInteractionType, reportUserInteractionResults, str);
    }

    public abstract ReportUserInteractionResults result();

    public abstract String token();

    public abstract ReportUserInteractionType type();
}
