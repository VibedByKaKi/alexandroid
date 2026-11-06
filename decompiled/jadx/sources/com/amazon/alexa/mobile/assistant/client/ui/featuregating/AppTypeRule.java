package com.amazon.alexa.mobile.assistant.client.ui.featuregating;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/AppTypeRule;", "Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureRule;", "allowedAppTypes", "", "Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/AppType;", "<init>", "(Ljava/util/List;)V", "isEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "", "context", "Lcom/amazon/alexa/mobile/assistant/client/ui/featuregating/FeatureContext;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AppTypeRule implements FeatureRule {
    public static final int $stable = 8;

    @NotNull
    private final List<AppType> allowedAppTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public AppTypeRule(@NotNull List<? extends AppType> list) {
        list.getClass();
        this.allowedAppTypes = list;
    }

    @Override // com.amazon.alexa.mobile.assistant.client.ui.featuregating.FeatureRule
    @NotNull
    public StateFlow<Boolean> isEnabled(@NotNull FeatureContext context) {
        context.getClass();
        return StateFlowKt.MutableStateFlow(Boolean.valueOf(this.allowedAppTypes.contains(context.getAppType())));
    }
}
