package com.amazon.clouddrive.android.core.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ClientMetric {

    @Nullable
    private String pageName;

    @Nullable
    private String status;

    @Nullable
    private String tagName;

    @NonNull
    private final Map<MetricName, Integer> counters = new LinkedHashMap();

    @NonNull
    private final Map<MetricName, Long> operationalLongCounters = new LinkedHashMap();

    @NonNull
    private final Map<MetricName, Double> timers = new LinkedHashMap();

    @NonNull
    private Map<String, String> metadata = new LinkedHashMap();

    @NonNull
    private final Map<MetricName, Exception> errors = new LinkedHashMap();

    public ClientMetric addCounter(@NonNull MetricName metricName, int i) {
        this.counters.put(metricName, Integer.valueOf(i));
        return this;
    }

    public ClientMetric addError(@NonNull MetricName metricName, @NonNull Exception exc) {
        this.errors.put(metricName, exc);
        return this;
    }

    public ClientMetric addMetadata(@NonNull String str, @Nullable String str2) {
        Map<String, String> map = this.metadata;
        if (str2 != null) {
            map.put(str, str2);
            return this;
        }
        map.remove(str);
        return this;
    }

    public ClientMetric addOperationalLongCounter(@NonNull MetricName metricName, long j) {
        this.operationalLongCounters.put(metricName, Long.valueOf(j));
        return this;
    }

    public ClientMetric addPivot(@NonNull MetricPivot metricPivot) {
        return addMetadata(metricPivot.getPivotKey(), metricPivot.getPivotValue());
    }

    public ClientMetric addTimer(@NonNull MetricName metricName, double d) {
        this.timers.put(metricName, Double.valueOf(d));
        return this;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientMetric)) {
            return false;
        }
        ClientMetric clientMetric = (ClientMetric) obj;
        Map<MetricName, Integer> counters = getCounters();
        Map<MetricName, Integer> counters2 = clientMetric.getCounters();
        if (counters != null ? !counters.equals(counters2) : counters2 != null) {
            return false;
        }
        Map<MetricName, Long> operationalLongCounters = getOperationalLongCounters();
        Map<MetricName, Long> operationalLongCounters2 = clientMetric.getOperationalLongCounters();
        if (operationalLongCounters != null ? !operationalLongCounters.equals(operationalLongCounters2) : operationalLongCounters2 != null) {
            return false;
        }
        Map<MetricName, Double> timers = getTimers();
        Map<MetricName, Double> timers2 = clientMetric.getTimers();
        if (timers != null ? !timers.equals(timers2) : timers2 != null) {
            return false;
        }
        Map<MetricName, Exception> errors = getErrors();
        Map<MetricName, Exception> errors2 = clientMetric.getErrors();
        if (errors != null ? !errors.equals(errors2) : errors2 != null) {
            return false;
        }
        Map<String, String> metadata = getMetadata();
        Map<String, String> metadata2 = clientMetric.getMetadata();
        if (metadata != null ? !metadata.equals(metadata2) : metadata2 != null) {
            return false;
        }
        String pageName = getPageName();
        String pageName2 = clientMetric.getPageName();
        if (pageName != null ? !pageName.equals(pageName2) : pageName2 != null) {
            return false;
        }
        String status = getStatus();
        String status2 = clientMetric.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String tagName = getTagName();
        String tagName2 = clientMetric.getTagName();
        return tagName != null ? tagName.equals(tagName2) : tagName2 == null;
    }

    @NonNull
    @Generated
    public Map<MetricName, Integer> getCounters() {
        return this.counters;
    }

    @NonNull
    @Generated
    public Map<MetricName, Exception> getErrors() {
        return this.errors;
    }

    @NonNull
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    @NonNull
    @Generated
    public Map<MetricName, Long> getOperationalLongCounters() {
        return this.operationalLongCounters;
    }

    @Nullable
    @Generated
    public String getPageName() {
        return this.pageName;
    }

    @Nullable
    @Generated
    public String getStatus() {
        return this.status;
    }

    @Nullable
    @Generated
    public String getTagName() {
        return this.tagName;
    }

    @NonNull
    @Generated
    public Map<MetricName, Double> getTimers() {
        return this.timers;
    }

    @Generated
    public int hashCode() {
        Map<MetricName, Integer> counters = getCounters();
        int hashCode = counters == null ? 43 : counters.hashCode();
        Map<MetricName, Long> operationalLongCounters = getOperationalLongCounters();
        int hashCode2 = ((hashCode + 59) * 59) + (operationalLongCounters == null ? 43 : operationalLongCounters.hashCode());
        Map<MetricName, Double> timers = getTimers();
        int hashCode3 = (hashCode2 * 59) + (timers == null ? 43 : timers.hashCode());
        Map<MetricName, Exception> errors = getErrors();
        int hashCode4 = (hashCode3 * 59) + (errors == null ? 43 : errors.hashCode());
        Map<String, String> metadata = getMetadata();
        int hashCode5 = (hashCode4 * 59) + (metadata == null ? 43 : metadata.hashCode());
        String pageName = getPageName();
        int hashCode6 = (hashCode5 * 59) + (pageName == null ? 43 : pageName.hashCode());
        String status = getStatus();
        int i = hashCode6 * 59;
        int hashCode7 = status == null ? 43 : status.hashCode();
        String tagName = getTagName();
        return ((i + hashCode7) * 59) + (tagName != null ? tagName.hashCode() : 43);
    }

    @Generated
    public String toString() {
        return "ClientMetric(counters=" + getCounters() + ", operationalLongCounters=" + getOperationalLongCounters() + ", timers=" + getTimers() + ", errors=" + getErrors() + ", metadata=" + getMetadata() + ", pageName=" + getPageName() + ", status=" + getStatus() + ", tagName=" + getTagName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ClientMetric withMetadata(@NonNull Map<String, String> map) {
        this.metadata = map;
        return this;
    }

    public ClientMetric withPageName(@NonNull String str) {
        this.pageName = str;
        return this;
    }

    public ClientMetric withStatus(@NonNull String str) {
        this.status = str;
        return this;
    }

    public ClientMetric withTagName(@NonNull String str) {
        this.tagName = str;
        return this;
    }
}
