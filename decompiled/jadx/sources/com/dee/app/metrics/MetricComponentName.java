package com.dee.app.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricComponentName {
    private String categoryId;
    private String method;
    private String routeName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String categoryId;
        private String method;
        private String routeName;

        public MetricComponentName build() {
            return new MetricComponentName(this.categoryId, this.method, this.routeName, 0);
        }

        public Builder withCategoryId(String str) {
            this.categoryId = str;
            return this;
        }

        public Builder withMethod(String str) {
            this.method = str;
            return this;
        }

        public Builder withRouteName(String str) {
            this.routeName = str;
            return this;
        }
    }

    public MetricComponentName(@NonNull MetricComponentName metricComponentName) {
        this.categoryId = metricComponentName.getCategoryId();
        this.method = metricComponentName.getMethod();
        this.routeName = metricComponentName.getRouteName();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MetricComponentName) {
            MetricComponentName metricComponentName = (MetricComponentName) obj;
            String str = this.categoryId;
            String str2 = metricComponentName.categoryId;
            boolean equals = str == null ? str2 == null : str.equals(str2);
            String str3 = this.method;
            String str4 = metricComponentName.method;
            boolean equals2 = str3 == null ? str4 == null : str3.equals(str4);
            String str5 = this.routeName;
            String str6 = metricComponentName.routeName;
            boolean equals3 = str5 == null ? str6 == null : str5.equals(str6);
            if (equals && equals2 && equals3) {
                return true;
            }
        }
        return false;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getMethod() {
        return this.method;
    }

    public String getRouteName() {
        return this.routeName;
    }

    public int hashCode() {
        String str = this.categoryId;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.method;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.routeName;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public void setCategoryId(@NonNull String str) {
        this.categoryId = str;
    }

    public void setMethod(@NonNull String str) {
        this.method = str;
    }

    public void setRouteName(@NonNull String str) {
        this.routeName = str;
    }

    public String toString() {
        String[] strArr = {this.categoryId, this.method, this.routeName};
        String str = "";
        String str2 = "";
        for (int i = 0; i < 3; i++) {
            String str3 = strArr[i];
            if (!TextUtils.isEmpty(str3)) {
                str = BitVector$$ExternalSyntheticOutline0.m(BitVector$$ExternalSyntheticOutline0.m(str, str2), str3);
                str2 = String.valueOf('.');
            }
        }
        return str;
    }

    private MetricComponentName(String str, String str2, String str3) {
        this.categoryId = str;
        this.method = str2;
        this.routeName = str3;
    }

    public /* synthetic */ MetricComponentName(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }
}
