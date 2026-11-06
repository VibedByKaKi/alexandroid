package com.amazon.deecomms.api.metrics;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.util.DateUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class CommsMetric {
    private static final String METRIC_SOURCE = "ANDROID-NATIVE";
    private String mMetricName;
    private final String mServiceName;
    private final MetricType mType;
    private Map<String, Object> metaData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MetricType {
        Operational,
        ClickStream
    }

    public CommsMetric(MetricType metricType, String str, String str2) {
        HashMap hashMap = new HashMap();
        this.metaData = hashMap;
        this.mType = metricType;
        this.mServiceName = str;
        this.mMetricName = str2;
        hashMap.put("ownerIdentifier", "ec2b8c3f-5736-4878-bf6f-70ee753a92b2");
    }

    public String format(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(DateUtil.getUTCTime(new Date()));
        sb.append(",ANDROID-NATIVE,");
        sb.append(this.mMetricName);
        sb.append(",");
        sb.append(this.mType);
        sb.append(",");
        sb.append(str);
        sb.append(",");
        addAttributesForToString(sb);
        for (Map.Entry<String, Object> entry : this.metaData.entrySet()) {
            String key = entry.getKey();
            sb.append(key);
            sb.append('=');
            sb.append(!MetricKeys.META_HASHED_COMMS_ID.equals(key) ? entry.getValue() : "*****");
            sb.append(" ");
        }
        return sb.toString();
    }

    public String formatMetric() {
        return format("");
    }

    public Map<String, Object> getMetadata() {
        return this.metaData;
    }

    public String getMetricName() {
        return this.mMetricName;
    }

    public String getServiceName() {
        return this.mServiceName;
    }

    public MetricType getType() {
        return this.mType;
    }

    public void setMetadata(Map<String, Object> map) {
        this.metaData = map;
    }

    public void setMetricName(String str) {
        this.mMetricName = str;
    }

    public String toString() {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m("MetricType=");
        m.append(this.mType);
        m.append(", ServiceName=");
        m.append(this.mServiceName);
        m.append(", MetricName=");
        m.append(this.mMetricName);
        m.append(", ");
        addAttributesForToString(m);
        m.append(", ");
        m.append("Metadata={");
        for (Map.Entry<String, Object> entry : this.metaData.entrySet()) {
            m.append(entry.getKey());
            m.append('=');
            m.append(entry.getValue());
            m.append(", ");
        }
        m.append(StringSubstitutor.DEFAULT_VAR_END);
        return m.toString();
    }

    public void addAttributesForToString(StringBuilder sb) {
    }

    public CommsMetric(MetricType metricType, String str) {
        this(metricType, "Comms", str);
    }
}
