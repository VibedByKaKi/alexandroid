package com.amazon.alexa.featurefeedbackservice.configuration.configservice;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.configuration.PromptConfiguration;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.featurefeedbackservice.util.ValidationUtils;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureFeedbackConfiguration {
    private String feature;
    private PromptConfiguration promptConfiguration;

    public FeatureFeedbackConfiguration(@Nonnull String str, @NonNull PromptConfiguration promptConfiguration) {
        ValidationUtils.validateNonNullObject("featureName", str);
        ValidationUtils.validateNonNullObject(Constants.FeatureFeedbackConfigs.FEEDBACK_CONFIG_PROMPT_CONFIG, promptConfiguration);
        this.feature = str;
        this.promptConfiguration = promptConfiguration;
    }

    public String getFeatureName() {
        return this.feature;
    }

    public PromptConfiguration getPromptConfiguration() {
        return this.promptConfiguration;
    }

    public String toString() {
        return "{ featureName: " + this.feature + ", promptConfiguration: " + this.promptConfiguration + " }";
    }
}
