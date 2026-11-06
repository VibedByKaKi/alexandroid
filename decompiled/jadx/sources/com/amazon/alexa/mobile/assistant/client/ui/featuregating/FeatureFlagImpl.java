package com.amazon.alexa.mobile.assistant.client.ui.featuregating;

import com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureFlagImpl;", "Lcom/amazon/alexa/assistant/foundation/featuregating/FeatureFlag;", "feature", "Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/Feature;", "featureContext", "Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureContext;", "override", "", "<init>", "(Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/Feature;Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureContext;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "enabled", "getEnabled", "()Z", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
final class FeatureFlagImpl implements FeatureFlag {

    @NotNull
    private final Feature feature;

    @NotNull
    private final FeatureContext featureContext;

    @Nullable
    private final Boolean override;

    public FeatureFlagImpl(@NotNull Feature feature, @NotNull FeatureContext featureContext, @Nullable Boolean bool) {
        feature.getClass();
        featureContext.getClass();
        this.feature = feature;
        this.featureContext = featureContext;
        this.override = bool;
    }

    @Override // com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag
    public boolean getEnabled() {
        return isEnabled().getValue().booleanValue();
    }

    @Override // com.amazon.alexa.assistant.foundation.featuregating.FeatureFlag
    @NotNull
    public StateFlow<Boolean> isEnabled() {
        Boolean bool = this.override;
        return bool != null ? StateFlowKt.MutableStateFlow(bool) : this.feature.isEnabled(this.featureContext);
    }

    public /* synthetic */ FeatureFlagImpl(Feature feature, FeatureContext featureContext, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(feature, featureContext, (i & 4) != 0 ? null : bool);
    }
}
