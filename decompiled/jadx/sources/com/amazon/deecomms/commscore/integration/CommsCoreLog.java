package com.amazon.deecomms.commscore.integration;

import com.amazon.alexa.enrollment.ui.terms.EnrollmentTermsViewFragment;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.identity.CommsCoreIdentity;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.commscore.api.metrics.CounterMetric;
import com.amazon.commscore.api.metrics.TimerMetric;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import com.amazon.deecomms.api.CommsDynamicFeature;
import com.amazon.deecomms.core.FeatureFlagManager;
import com.here.sdk.search.PlaceCategory;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsCoreLog {
    private static final String METRIC_PREFIX = "CommCoreLogTest";
    private static final String SUBCOMPONENT = "CommsCoreLog";
    private AlexaCommsCoreRemoteConfigurationService configurationService;
    private FeatureFlagManager featureFlagManager;
    private AlexaCommsCoreIdentityService identityService;
    private AlexaCommsCoreMetricsService metricsService;

    public CommsCoreLog(AlexaCommsCoreMetricsService alexaCommsCoreMetricsService, AlexaCommsCoreIdentityService alexaCommsCoreIdentityService, AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService, FeatureFlagManager featureFlagManager) {
        this.metricsService = alexaCommsCoreMetricsService;
        this.identityService = alexaCommsCoreIdentityService;
        this.configurationService = alexaCommsCoreRemoteConfigurationService;
        this.featureFlagManager = featureFlagManager;
    }

    private void buildLog(StringBuilder sb, String str, String str2) {
        sb.append(str + ":" + str2);
        sb.append("\n");
    }

    public void logAllData() {
        this.featureFlagManager.setFeature(CommsDynamicFeature.COMMS_CORE_METRICS_SERVICE, Boolean.FALSE);
        logMetrics();
        logIdentity();
        logRemoteConfig();
    }

    public void logIdentity() {
        StringBuilder sb = new StringBuilder();
        CommsCoreIdentity identity = this.identityService.getIdentity();
        buildLog(sb, "DirectedId", identity.getDirectedId());
        buildLog(sb, "CommsId", identity.getCommsId());
        buildLog(sb, "Cor", identity.getCountryOfResidence());
        buildLog(sb, "FirstName", identity.getName().getFirstName());
        buildLog(sb, "PCE ID", identity.getPceId());
        buildLog(sb, "PersonId V2", identity.getPersonIdV2());
        buildLog(sb, "MP Country Code", identity.getMarketplaceInfo().getMarketPlaceCountryCode());
        buildLog(sb, "PFM Code", identity.getMarketplaceInfo().getPfmCode());
    }

    public void logMetrics() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("statusCode", PlaceCategory.EAT_AND_DRINK);
        hashMap.put("messageType", "text");
        AlexaCommsCoreMetricsService alexaCommsCoreMetricsService = this.metricsService;
        String str = SUBCOMPONENT;
        TimerMetric createTimer = alexaCommsCoreMetricsService.createTimer("CommCoreLogTest:timer", str, hashMap);
        CounterMetric createCounter = this.metricsService.createCounter("CommCoreLogTest:counter", str, hashMap);
        createCounter.incrementCounter();
        this.metricsService.recordCounter(createCounter);
        this.metricsService.recordOccurrence("CommCoreLogTest:occurrence", str, true, hashMap);
        this.metricsService.recordWarningEvent("CommCoreLogTest:warning", "Test error: log test", str, new Exception("Test exception"));
        this.metricsService.recordTimer(createTimer);
    }

    public void logRemoteConfig() {
        this.configurationService.getRemoteConfiguration("ACMS.Endpoints.PFM.US", EnrollmentTermsViewFragment.DEFAULT_ENDPOINT).toString();
        this.configurationService.getRemoteConfiguration("Invalid.Key", "DefaultValue").toString();
    }
}
