package com.amazon.alexa.featurefeedbackservice.cache;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.configuration.FeatureFeedbackServiceConfiguration;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes17.dex */
public class ConfigCache {
    private volatile FeatureFeedbackServiceConfiguration configuration = new FeatureFeedbackServiceConfiguration();

    public long getLocalMinTimeBetweenPromptsMillis(@NonNull String str) {
        Utils.validateNonEmptyString("featureName", str);
        return this.configuration.getLocalGuardrailMinTimeBetweenPromptsMillis(str);
    }

    public boolean isEligible(@NonNull String str) {
        Utils.validateNonEmptyString("featureName", str);
        return this.configuration.isFeedbackPromptEligible(str);
    }

    public void override(FeatureFeedbackServiceConfiguration featureFeedbackServiceConfiguration) {
        this.configuration = featureFeedbackServiceConfiguration;
    }
}
