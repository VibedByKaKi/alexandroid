package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordConfiguration;", "", "wakeWordSettingsControl", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordAction;", "sensitivityThreshold", "", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;F)V", "getWakeWordSettingsControl", "()Lkotlinx/coroutines/flow/StateFlow;", "getSensitivityThreshold", "()F", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WakeWordConfiguration {
    private final float sensitivityThreshold;

    @Nullable
    private final StateFlow<WakeWordAction> wakeWordSettingsControl;

    public /* synthetic */ WakeWordConfiguration(StateFlow stateFlow, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateFlow, (i & 2) != 0 ? 0.5f : f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WakeWordConfiguration copy$default(WakeWordConfiguration wakeWordConfiguration, StateFlow stateFlow, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            stateFlow = wakeWordConfiguration.wakeWordSettingsControl;
        }
        if ((i & 2) != 0) {
            f = wakeWordConfiguration.sensitivityThreshold;
        }
        return wakeWordConfiguration.copy(stateFlow, f);
    }

    @Nullable
    public final StateFlow<WakeWordAction> component1() {
        return this.wakeWordSettingsControl;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSensitivityThreshold() {
        return this.sensitivityThreshold;
    }

    @NotNull
    public final WakeWordConfiguration copy(@Nullable StateFlow<? extends WakeWordAction> wakeWordSettingsControl, float sensitivityThreshold) {
        return new WakeWordConfiguration(wakeWordSettingsControl, sensitivityThreshold);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WakeWordConfiguration)) {
            return false;
        }
        WakeWordConfiguration wakeWordConfiguration = (WakeWordConfiguration) other;
        return Intrinsics.areEqual(this.wakeWordSettingsControl, wakeWordConfiguration.wakeWordSettingsControl) && Float.compare(this.sensitivityThreshold, wakeWordConfiguration.sensitivityThreshold) == 0;
    }

    public final float getSensitivityThreshold() {
        return this.sensitivityThreshold;
    }

    @Nullable
    public final StateFlow<WakeWordAction> getWakeWordSettingsControl() {
        return this.wakeWordSettingsControl;
    }

    public int hashCode() {
        StateFlow<WakeWordAction> stateFlow = this.wakeWordSettingsControl;
        return Float.hashCode(this.sensitivityThreshold) + ((stateFlow == null ? 0 : stateFlow.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "WakeWordConfiguration(wakeWordSettingsControl=" + this.wakeWordSettingsControl + ", sensitivityThreshold=" + this.sensitivityThreshold + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WakeWordConfiguration(@Nullable StateFlow<? extends WakeWordAction> stateFlow, float f) {
        this.wakeWordSettingsControl = stateFlow;
        this.sensitivityThreshold = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WakeWordConfiguration() {
        this(null, 0.0f, 3, 0 == true ? 1 : 0);
    }
}
