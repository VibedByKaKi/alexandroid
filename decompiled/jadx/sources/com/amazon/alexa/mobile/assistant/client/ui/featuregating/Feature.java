package com.amazon.alexa.mobile.assistant.client.ui.featuregating;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/Feature;", "", "rule", "Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureRule;", "<init>", "(Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureRule;)V", "isEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "", "context", "Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureContext;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Feature {
    public static final int $stable = 8;

    @NotNull
    private final FeatureRule rule;

    public Feature(@NotNull FeatureRule featureRule) {
        featureRule.getClass();
        this.rule = featureRule;
    }

    @NotNull
    public final StateFlow<Boolean> isEnabled(@NotNull FeatureContext context) {
        context.getClass();
        return this.rule.isEnabled(context);
    }
}
