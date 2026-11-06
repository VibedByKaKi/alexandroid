package com.amazon.alexa.featurefeedbackservice.configuration;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PromptConfiguration {
    private long localMinTimeBetweenPromptsMillis;
    private boolean promptEligible;
    private long promptEligibleTimestamp;
    private List<String> promptEvents;

    public PromptConfiguration(boolean z, long j, List<String> list, long j2) {
        this.promptEligible = z;
        this.promptEligibleTimestamp = j;
        this.promptEvents = list == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
        this.localMinTimeBetweenPromptsMillis = j2;
    }

    public long getLocalMinTimeBetweenPromptsMillis() {
        return this.localMinTimeBetweenPromptsMillis;
    }

    public long getPromptEligibleTimestamp() {
        return this.promptEligibleTimestamp;
    }

    public List<String> getPromptEvents() {
        return ImmutableList.copyOf((Collection) this.promptEvents);
    }

    public boolean isPromptEligible() {
        return this.promptEligible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ promptEligible: ");
        sb.append(this.promptEligible);
        sb.append(", promptEligibleTimestamp: ");
        sb.append(this.promptEligibleTimestamp);
        sb.append(", localMinTimeBetweenPromptsMillis: ");
        sb.append(this.localMinTimeBetweenPromptsMillis);
        sb.append(", promptEvents: [ ");
        List<String> list = this.promptEvents;
        if (list != null) {
            boolean z = true;
            for (String str : list) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append(" ] }");
        return sb.toString();
    }
}
