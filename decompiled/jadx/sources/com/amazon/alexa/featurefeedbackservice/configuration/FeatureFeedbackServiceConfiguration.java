package com.amazon.alexa.featurefeedbackservice.configuration;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.util.ValidationUtils;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureFeedbackServiceConfiguration {
    private volatile Map<String, PromptConfiguration> featurePromptConfigs;
    private boolean isEnabled;

    public FeatureFeedbackServiceConfiguration(boolean z, @NonNull Map<String, PromptConfiguration> map) {
        ValidationUtils.validateNonNullObject("featurePromptConfigs", map);
        this.isEnabled = z;
        this.featurePromptConfigs = ImmutableMap.copyOf((Map) map);
    }

    public long getLocalGuardrailMinTimeBetweenPromptsMillis(@NonNull String str) {
        Utils.validateNonEmptyString("featureName", str);
        PromptConfiguration promptConfiguration = this.featurePromptConfigs.get(str);
        if (promptConfiguration == null || !promptConfiguration.isPromptEligible()) {
            return 0L;
        }
        return promptConfiguration.getLocalMinTimeBetweenPromptsMillis();
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean isFeedbackPromptEligible(@NonNull String str) {
        PromptConfiguration promptConfiguration;
        Utils.validateNonEmptyString("featureName", str);
        return this.isEnabled && (promptConfiguration = this.featurePromptConfigs.get(str)) != null && promptConfiguration.isPromptEligible() && promptConfiguration.getPromptEligibleTimestamp() <= System.currentTimeMillis();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ isEnabled: ");
        sb.append(this.isEnabled);
        sb.append(", featureFeedbackConfigs: [ ");
        boolean z = true;
        for (Map.Entry<String, PromptConfiguration> entry : this.featurePromptConfigs.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("{ featureName: ");
            sb.append(entry.getKey());
            sb.append(", promptConfig: ");
            sb.append(entry.getValue());
            sb.append(" }");
        }
        sb.append(" ] }");
        return sb.toString();
    }

    public FeatureFeedbackServiceConfiguration() {
        this(false, ImmutableMap.of());
    }
}
