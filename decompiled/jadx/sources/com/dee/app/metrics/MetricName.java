package com.dee.app.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricName {
    private String metricId;
    private String module;
    private String source;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String metricId;
        private String module;
        private String source;

        public Builder(@NonNull String str) {
            this.metricId = str;
        }

        public MetricName build() {
            return new MetricName(this.metricId, this.module, this.source, 0);
        }

        public Builder withMetricId(@NonNull String str) {
            this.metricId = str;
            return this;
        }

        public Builder withModule(String str) {
            this.module = str;
            return this;
        }

        public Builder withSource(String str) {
            this.source = str;
            return this;
        }
    }

    private MetricName(@NonNull String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Metric id cannot be blank.");
            throw null;
        }
        this.metricId = str;
        this.module = str2;
        this.source = str3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MetricName) {
            MetricName metricName = (MetricName) obj;
            String str = this.metricId;
            String str2 = metricName.metricId;
            boolean equals = str == null ? str2 == null : str.equals(str2);
            String str3 = this.module;
            String str4 = metricName.module;
            boolean equals2 = str3 == null ? str4 == null : str3.equals(str4);
            String str5 = this.source;
            String str6 = metricName.source;
            boolean equals3 = str5 == null ? str6 == null : str5.equals(str6);
            if (equals && equals2 && equals3) {
                return true;
            }
        }
        return false;
    }

    public String getMetricId() {
        return this.metricId;
    }

    public String getModule() {
        return this.module;
    }

    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.metricId;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.module;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.source;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public void setMetricId(@NonNull String str) {
        this.metricId = str;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.metricId);
        String[] strArr = {this.module, this.source};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                sb.insert(0, '.');
                sb.insert(0, str);
            }
        }
        return sb.toString();
    }

    public /* synthetic */ MetricName(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }

    public MetricName(@NonNull MetricName metricName) {
        this.metricId = metricName.getMetricId();
        this.module = metricName.getModule();
        this.source = metricName.getSource();
    }
}
