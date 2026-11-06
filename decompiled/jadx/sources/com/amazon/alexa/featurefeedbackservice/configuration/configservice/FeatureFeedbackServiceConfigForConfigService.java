package com.amazon.alexa.featurefeedbackservice.configuration.configservice;

import com.amazon.alexa.featurefeedbackservice.configuration.FeatureFeedbackServiceConfiguration;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureFeedbackServiceConfigForConfigService {
    private Integer configsRetrievalWaitTimeForFailure;
    private Integer configsRetrievalWaitTimeForSuccess;
    private List<FeatureFeedbackConfiguration> feedbackConfigurations;
    private boolean isEnabled;

    public FeatureFeedbackServiceConfigForConfigService(boolean z, int i, int i2, List<FeatureFeedbackConfiguration> list) {
        this.isEnabled = z;
        this.configsRetrievalWaitTimeForSuccess = Integer.valueOf(i);
        this.configsRetrievalWaitTimeForFailure = Integer.valueOf(i2);
        this.feedbackConfigurations = list;
    }

    public Integer getConfigsRetrievalWaitTimeForFailure() {
        return this.configsRetrievalWaitTimeForFailure;
    }

    public Integer getConfigsRetrievalWaitTimeForSuccess() {
        return this.configsRetrievalWaitTimeForSuccess;
    }

    public FeatureFeedbackServiceConfiguration toServiceConfiguration() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        List<FeatureFeedbackConfiguration> list = this.feedbackConfigurations;
        if (list != null) {
            for (FeatureFeedbackConfiguration featureFeedbackConfiguration : list) {
                builder.put(featureFeedbackConfiguration.getFeatureName(), featureFeedbackConfiguration.getPromptConfiguration());
            }
        }
        return new FeatureFeedbackServiceConfiguration(this.isEnabled, builder.build());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ isEnabled: ");
        sb.append(this.isEnabled);
        sb.append(", configsRetrievalWaitTimeForSuccess: ");
        sb.append(this.configsRetrievalWaitTimeForSuccess);
        sb.append(", configsRetrievalWaitTimeForFailure: ");
        sb.append(this.configsRetrievalWaitTimeForFailure);
        sb.append(", featureFeedbackConfigs: [ ");
        List<FeatureFeedbackConfiguration> list = this.feedbackConfigurations;
        if (list != null) {
            boolean z = true;
            for (FeatureFeedbackConfiguration featureFeedbackConfiguration : list) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(featureFeedbackConfiguration);
            }
        }
        sb.append(" ] }");
        return sb.toString();
    }

    public FeatureFeedbackServiceConfigForConfigService() {
    }
}
