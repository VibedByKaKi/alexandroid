package com.amazon.whisperjoin.credentiallocker.metrics;

import android.util.Log;
import org.apache.commons.lang.StringUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TargetDevice {
    private static final String TAG = "com.amazon.whisperjoin.credentiallocker.metrics.TargetDevice";
    private String targetManufacturer;
    private String targetName;
    private String targetVersion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String targetManufacturer;
        private String targetName;
        private String targetVerison;

        public TargetDevice build() {
            String str;
            String str2;
            String str3 = this.targetName;
            if (str3 != null && (str = this.targetVerison) != null && (str2 = this.targetManufacturer) != null) {
                return new TargetDevice(str3, str, str2);
            }
            Log.e(TargetDevice.TAG, "Target name, version or manufacturer cannot be null");
            Single$$ExternalSyntheticBUOutline0.m$3("Target name, version or manufacturer cannot be null");
            return null;
        }

        public Builder withTargetManufacturer(String str) {
            if (StringUtils.isEmpty(str)) {
                Single$$ExternalSyntheticBUOutline0.m$3("Target Manufacturer cannot be null or empty");
                return null;
            }
            this.targetManufacturer = str;
            return this;
        }

        public Builder withTargetName(String str) {
            if (StringUtils.isEmpty(str)) {
                Single$$ExternalSyntheticBUOutline0.m$3("Target Name cannot be null or empty");
                return null;
            }
            this.targetName = str;
            return this;
        }

        public Builder withTargetVersion(String str) {
            if (StringUtils.isEmpty(str)) {
                Single$$ExternalSyntheticBUOutline0.m$3("Target Version cannot be null or empty");
                return null;
            }
            this.targetVerison = str;
            return this;
        }
    }

    private TargetDevice(String str, String str2, String str3) {
        this.targetName = str;
        this.targetVersion = str2;
        this.targetManufacturer = str3;
    }

    public String getTargetManufacturer() {
        return this.targetManufacturer;
    }

    public String getTargetName() {
        return this.targetName;
    }

    public String getTargetVersion() {
        return this.targetVersion;
    }
}
