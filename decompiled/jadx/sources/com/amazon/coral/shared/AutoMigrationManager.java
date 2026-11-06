package com.amazon.coral.shared;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AutoMigrationManager {
    private static final CoralInternalLogger LOG = CoralInternalLoggerFactory.getLogger((Class<?>) AutoMigrationManager.class);
    private final String allowMarker;
    private final String denyMarker;
    private final boolean enableInNonProduction;
    private final String featureName;
    private final String fullyQualifiedServiceName;
    private final boolean isProduction;
    private final double samplingRate;
    private volatile Boolean shouldUpgrade;
    private final String systemProperty;
    private final double upgradeThreshold;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String allowMarker;
        private String denyMarker;
        private boolean enableInNonProduction;
        private String featureName;
        private String fullyQualifiedServiceName;
        private boolean isProduction;
        private double samplingRate = 1.0d;
        private String systemProperty;
        private double upgradeThreshold;

        private static String getMarkerFilePath(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.replace(".", "/"));
            sb.append(".");
            return a$$ExternalSyntheticOutline0.m(sb, str2, str3);
        }

        public Builder allowMarker(String str) {
            this.allowMarker = str;
            return this;
        }

        public AutoMigrationManager buildWithDefaults() {
            validate();
            populateDefaults();
            return new AutoMigrationManager(this);
        }

        public Builder denyMarker(String str) {
            this.denyMarker = str;
            return this;
        }

        public Builder enableInNonProduction(boolean z) {
            this.enableInNonProduction = z;
            return this;
        }

        public Builder featureName(String str) {
            this.featureName = str;
            return this;
        }

        public Builder fullyQualifiedServiceName(String str) {
            this.fullyQualifiedServiceName = str;
            return this;
        }

        public void populateDefaults() {
            if (this.systemProperty == null) {
                this.systemProperty = "com.amazon.coral.automigration." + this.featureName;
            }
            if (this.denyMarker == null) {
                this.denyMarker = getMarkerFilePath(this.fullyQualifiedServiceName, this.featureName, "Deny");
            }
            if (this.allowMarker == null) {
                this.allowMarker = getMarkerFilePath(this.fullyQualifiedServiceName, this.featureName, "Allow");
            }
        }

        public Builder production(boolean z) {
            this.isProduction = z;
            return this;
        }

        public Builder samplingRate(double d) {
            this.samplingRate = d;
            return this;
        }

        public Builder systemProperty(String str) {
            this.systemProperty = str;
            return this;
        }

        public Builder upgradeThreshold(double d) {
            this.upgradeThreshold = d;
            return this;
        }

        public boolean validate() {
            double d = this.upgradeThreshold;
            if (d < 0.0d || d > 1.0d) {
                Single$$ExternalSyntheticBUOutline0.m$3("Upgrade threshold must be between [0.0, 1.0]");
                return false;
            }
            double d2 = this.samplingRate;
            if (d2 < 0.0d || d2 > 1.0d) {
                Single$$ExternalSyntheticBUOutline0.m$3("Sampling rate must be between [0.0, 1.0]");
                return false;
            }
            if (this.featureName == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Feature name must be set");
                return false;
            }
            if (this.fullyQualifiedServiceName != null) {
                return true;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Fully qualified service name must be set");
            return false;
        }
    }

    private AutoMigrationManager(Builder builder) {
        this.upgradeThreshold = builder.upgradeThreshold;
        this.samplingRate = builder.samplingRate;
        this.featureName = builder.featureName;
        this.systemProperty = builder.systemProperty;
        this.denyMarker = builder.denyMarker;
        this.allowMarker = builder.allowMarker;
        this.enableInNonProduction = builder.enableInNonProduction;
        this.fullyQualifiedServiceName = builder.fullyQualifiedServiceName;
        this.isProduction = builder.isProduction;
    }

    public static Builder builder() {
        return new Builder();
    }

    private static boolean markerFileExists(String str) {
        return AutoMigrationManager.class.getClassLoader().getResource(str) != null;
    }

    public boolean computeShouldUpgrade() {
        String property = System.getProperty(this.systemProperty);
        if ("false".equals(property)) {
            LOG.warn("Feature {} disabled by system property {}", this.featureName, this.systemProperty);
            return false;
        }
        if ("true".equalsIgnoreCase(property)) {
            LOG.warn("Feature {} enabled by system property {}", this.featureName, this.systemProperty);
            return true;
        }
        if (markerFileExists(this.denyMarker)) {
            LOG.warn("Feature {} disabled by marker file {}", this.featureName, this.denyMarker);
            return false;
        }
        if (markerFileExists(this.allowMarker)) {
            LOG.warn("Feature {} enabled by marker file {}", this.featureName, this.allowMarker);
            return true;
        }
        if (this.enableInNonProduction && !this.isProduction) {
            LOG.warn("Feature {} enabled by non-prod rollout", this.featureName);
            return true;
        }
        boolean currentServiceShouldUpgrade = CoralUpgradeManager.currentServiceShouldUpgrade(this.featureName, this.upgradeThreshold, this.fullyQualifiedServiceName);
        String str = this.featureName;
        if (currentServiceShouldUpgrade) {
            LOG.warn("Feature {} enabled by auto-upgrade at threshold {}", str, Double.valueOf(this.upgradeThreshold));
            return currentServiceShouldUpgrade;
        }
        LOG.warn("Feature {} not eligible for auto-upgrade at threshold {}", str, Double.valueOf(this.upgradeThreshold));
        return currentServiceShouldUpgrade;
    }

    public String getAllowMarker() {
        return this.allowMarker;
    }

    public String getDenyMarker() {
        return this.denyMarker;
    }

    public String getSystemProperty() {
        return this.systemProperty;
    }

    public Boolean shouldUpgrade() {
        if (this.shouldUpgrade == null) {
            this.shouldUpgrade = Boolean.valueOf(computeShouldUpgrade());
        }
        return this.shouldUpgrade;
    }
}
