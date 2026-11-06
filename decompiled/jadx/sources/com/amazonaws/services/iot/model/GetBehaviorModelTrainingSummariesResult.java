package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetBehaviorModelTrainingSummariesResult implements Serializable {
    private String nextToken;
    private List<BehaviorModelTrainingSummary> summaries;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetBehaviorModelTrainingSummariesResult)) {
            return false;
        }
        GetBehaviorModelTrainingSummariesResult getBehaviorModelTrainingSummariesResult = (GetBehaviorModelTrainingSummariesResult) obj;
        if ((getBehaviorModelTrainingSummariesResult.getSummaries() == null) ^ (getSummaries() == null)) {
            return false;
        }
        if (getBehaviorModelTrainingSummariesResult.getSummaries() != null && !getBehaviorModelTrainingSummariesResult.getSummaries().equals(getSummaries())) {
            return false;
        }
        if ((getBehaviorModelTrainingSummariesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return getBehaviorModelTrainingSummariesResult.getNextToken() == null || getBehaviorModelTrainingSummariesResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<BehaviorModelTrainingSummary> getSummaries() {
        return this.summaries;
    }

    public int hashCode() {
        return (((getSummaries() == null ? 0 : getSummaries().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSummaries(Collection<BehaviorModelTrainingSummary> collection) {
        if (collection == null) {
            this.summaries = null;
        } else {
            this.summaries = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSummaries() != null) {
            sb.append("summaries: " + getSummaries() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetBehaviorModelTrainingSummariesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public GetBehaviorModelTrainingSummariesResult withSummaries(BehaviorModelTrainingSummary... behaviorModelTrainingSummaryArr) {
        if (getSummaries() == null) {
            this.summaries = new ArrayList(behaviorModelTrainingSummaryArr.length);
        }
        for (BehaviorModelTrainingSummary behaviorModelTrainingSummary : behaviorModelTrainingSummaryArr) {
            this.summaries.add(behaviorModelTrainingSummary);
        }
        return this;
    }

    public GetBehaviorModelTrainingSummariesResult withSummaries(Collection<BehaviorModelTrainingSummary> collection) {
        setSummaries(collection);
        return this;
    }
}
