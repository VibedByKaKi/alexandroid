package com.amazon.alexa.featureservice.configuration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureServiceConfiguration {
    private boolean authenticated;
    private int batchUploadRate;
    private boolean crashMitigationEnabled;
    private boolean crashMitigationMonitorEnabled;
    private long featureRefreshTime;
    private boolean isBatchUploadRateConfigurable;
    private boolean isThrottleDeduplicateFGEnable;
    private boolean networkConnected;
    private long sessionUpdateThreshold;
    private boolean shouldLogExperimentTriggersUsingOkhttp;
    private boolean storeFeaturesInBatchEnabled;
    private boolean testingFeaturesEnabled;

    public int getBatchUploadRate() {
        return this.batchUploadRate;
    }

    public long getFeatureRefreshTime() {
        return this.featureRefreshTime;
    }

    public long getSessionUpdateThreshold() {
        return this.sessionUpdateThreshold;
    }

    public boolean isAuthenticated() {
        return this.authenticated;
    }

    public boolean isBatchUploadRateConfigurable() {
        return this.isBatchUploadRateConfigurable;
    }

    public boolean isCrashMitigationEnabled() {
        return this.crashMitigationEnabled;
    }

    public boolean isCrashMitigationMonitorEnabled() {
        return this.crashMitigationMonitorEnabled;
    }

    public boolean isNetworkConnected() {
        return this.networkConnected;
    }

    public boolean isShouldLogExperimentTriggersUsingOkhttp() {
        return this.shouldLogExperimentTriggersUsingOkhttp;
    }

    public boolean isStoreFeaturesInBatchEnabled() {
        return this.storeFeaturesInBatchEnabled;
    }

    public boolean isTestingFeaturesEnabled() {
        return this.testingFeaturesEnabled;
    }

    public boolean isThrottleDeduplicateFGEnable() {
        return this.isThrottleDeduplicateFGEnable;
    }

    public void setAuthenticated(boolean z) {
        this.authenticated = z;
    }

    public void setBatchUploadRate(int i) {
        this.batchUploadRate = i;
    }

    public void setBatchUploadRateConfigurable(boolean z) {
        this.isBatchUploadRateConfigurable = z;
    }

    public void setCrashMitigationEnabled(boolean z) {
        this.crashMitigationEnabled = z;
    }

    public void setCrashMitigationMonitorEnabled(boolean z) {
        this.crashMitigationMonitorEnabled = z;
    }

    public void setFeatureRefreshTime(long j) {
        this.featureRefreshTime = j;
    }

    public void setNetworkConnected(boolean z) {
        this.networkConnected = z;
    }

    public void setSessionUpdateThreshold(long j) {
        this.sessionUpdateThreshold = j;
    }

    public void setShouldLogExperimentTriggersUsingOkhttp(boolean z) {
        this.shouldLogExperimentTriggersUsingOkhttp = z;
    }

    public void setStoreFeaturesInBatchEnabled(boolean z) {
        this.storeFeaturesInBatchEnabled = z;
    }

    public void setTestingFeaturesEnabled(boolean z) {
        this.testingFeaturesEnabled = z;
    }

    public void setThrottleDeduplicateFGEnable(boolean z) {
        this.isThrottleDeduplicateFGEnable = z;
    }
}
