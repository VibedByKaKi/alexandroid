package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ReactionSummaries {
    private Map<String, String> errorMap;
    private Map<String, ReactionSummary> summaryMap;

    public boolean canEqual(Object obj) {
        return obj instanceof ReactionSummaries;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReactionSummaries)) {
            return false;
        }
        ReactionSummaries reactionSummaries = (ReactionSummaries) obj;
        if (!reactionSummaries.canEqual(this)) {
            return false;
        }
        Map<String, String> errorMap = getErrorMap();
        Map<String, String> errorMap2 = reactionSummaries.getErrorMap();
        if (errorMap != null ? !errorMap.equals(errorMap2) : errorMap2 != null) {
            return false;
        }
        Map<String, ReactionSummary> summaryMap = getSummaryMap();
        Map<String, ReactionSummary> summaryMap2 = reactionSummaries.getSummaryMap();
        return summaryMap != null ? summaryMap.equals(summaryMap2) : summaryMap2 == null;
    }

    public Map<String, String> getErrorMap() {
        return this.errorMap;
    }

    public Map<String, ReactionSummary> getSummaryMap() {
        return this.summaryMap;
    }

    public int hashCode() {
        Map<String, String> errorMap = getErrorMap();
        int hashCode = errorMap == null ? 43 : errorMap.hashCode();
        Map<String, ReactionSummary> summaryMap = getSummaryMap();
        return ((hashCode + 59) * 59) + (summaryMap != null ? summaryMap.hashCode() : 43);
    }

    public void setErrorMap(Map<String, String> map) {
        this.errorMap = map;
    }

    public void setSummaryMap(Map<String, ReactionSummary> map) {
        this.summaryMap = map;
    }

    public String toString() {
        return "ReactionSummaries(errorMap=" + getErrorMap() + ", summaryMap=" + getSummaryMap() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
