package com.amazon.alexa.api.compat.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lcom/amazon/alexa/api/compat/model/NaturalTurnControllerConfiguration;", "", "secondaryVadConfig", "Lcom/amazon/alexa/api/compat/model/SecondaryVadConfiguration;", "uiConfiguration", "Lcom/amazon/alexa/api/compat/model/UIConfiguration;", "bargeInBehavior", "Lcom/amazon/alexa/api/compat/model/BargeInBehavior;", "isExitIntentClassifierEnabled", "", "shouldEnforceTimeouts", "<init>", "(Lcom/amazon/alexa/api/compat/model/SecondaryVadConfiguration;Lcom/amazon/alexa/api/compat/model/UIConfiguration;Lcom/amazon/alexa/api/compat/model/BargeInBehavior;ZZ)V", "getSecondaryVadConfig", "()Lcom/amazon/alexa/api/compat/model/SecondaryVadConfiguration;", "getUiConfiguration", "()Lcom/amazon/alexa/api/compat/model/UIConfiguration;", "getBargeInBehavior", "()Lcom/amazon/alexa/api/compat/model/BargeInBehavior;", "()Z", "getShouldEnforceTimeouts", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class NaturalTurnControllerConfiguration {
    public static final int $stable = 0;

    @NotNull
    private final BargeInBehavior bargeInBehavior;
    private final boolean isExitIntentClassifierEnabled;

    @NotNull
    private final SecondaryVadConfiguration secondaryVadConfig;
    private final boolean shouldEnforceTimeouts;

    @NotNull
    private final UIConfiguration uiConfiguration;

    public /* synthetic */ NaturalTurnControllerConfiguration(SecondaryVadConfiguration secondaryVadConfiguration, UIConfiguration uIConfiguration, BargeInBehavior bargeInBehavior, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SecondaryVadConfiguration(0.0f, 0L, 3, null) : secondaryVadConfiguration, (i & 2) != 0 ? new UIConfiguration(false, 1, null) : uIConfiguration, (i & 4) != 0 ? BargeInBehavior.PAUSE_RESUME : bargeInBehavior, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }

    public static /* synthetic */ NaturalTurnControllerConfiguration copy$default(NaturalTurnControllerConfiguration naturalTurnControllerConfiguration, SecondaryVadConfiguration secondaryVadConfiguration, UIConfiguration uIConfiguration, BargeInBehavior bargeInBehavior, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            secondaryVadConfiguration = naturalTurnControllerConfiguration.secondaryVadConfig;
        }
        if ((i & 2) != 0) {
            uIConfiguration = naturalTurnControllerConfiguration.uiConfiguration;
        }
        if ((i & 4) != 0) {
            bargeInBehavior = naturalTurnControllerConfiguration.bargeInBehavior;
        }
        if ((i & 8) != 0) {
            z = naturalTurnControllerConfiguration.isExitIntentClassifierEnabled;
        }
        if ((i & 16) != 0) {
            z2 = naturalTurnControllerConfiguration.shouldEnforceTimeouts;
        }
        boolean z3 = z2;
        BargeInBehavior bargeInBehavior2 = bargeInBehavior;
        return naturalTurnControllerConfiguration.copy(secondaryVadConfiguration, uIConfiguration, bargeInBehavior2, z, z3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SecondaryVadConfiguration getSecondaryVadConfig() {
        return this.secondaryVadConfig;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final UIConfiguration getUiConfiguration() {
        return this.uiConfiguration;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BargeInBehavior getBargeInBehavior() {
        return this.bargeInBehavior;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExitIntentClassifierEnabled() {
        return this.isExitIntentClassifierEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldEnforceTimeouts() {
        return this.shouldEnforceTimeouts;
    }

    @NotNull
    public final NaturalTurnControllerConfiguration copy(@NotNull SecondaryVadConfiguration secondaryVadConfig, @NotNull UIConfiguration uiConfiguration, @NotNull BargeInBehavior bargeInBehavior, boolean isExitIntentClassifierEnabled, boolean shouldEnforceTimeouts) {
        secondaryVadConfig.getClass();
        uiConfiguration.getClass();
        bargeInBehavior.getClass();
        return new NaturalTurnControllerConfiguration(secondaryVadConfig, uiConfiguration, bargeInBehavior, isExitIntentClassifierEnabled, shouldEnforceTimeouts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaturalTurnControllerConfiguration)) {
            return false;
        }
        NaturalTurnControllerConfiguration naturalTurnControllerConfiguration = (NaturalTurnControllerConfiguration) other;
        return Intrinsics.areEqual(this.secondaryVadConfig, naturalTurnControllerConfiguration.secondaryVadConfig) && Intrinsics.areEqual(this.uiConfiguration, naturalTurnControllerConfiguration.uiConfiguration) && this.bargeInBehavior == naturalTurnControllerConfiguration.bargeInBehavior && this.isExitIntentClassifierEnabled == naturalTurnControllerConfiguration.isExitIntentClassifierEnabled && this.shouldEnforceTimeouts == naturalTurnControllerConfiguration.shouldEnforceTimeouts;
    }

    @NotNull
    public final BargeInBehavior getBargeInBehavior() {
        return this.bargeInBehavior;
    }

    @NotNull
    public final SecondaryVadConfiguration getSecondaryVadConfig() {
        return this.secondaryVadConfig;
    }

    public final boolean getShouldEnforceTimeouts() {
        return this.shouldEnforceTimeouts;
    }

    @NotNull
    public final UIConfiguration getUiConfiguration() {
        return this.uiConfiguration;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldEnforceTimeouts) + DoubleList$$ExternalSyntheticOutline0.m(this.isExitIntentClassifierEnabled, (this.bargeInBehavior.hashCode() + ((this.uiConfiguration.hashCode() + (this.secondaryVadConfig.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final boolean isExitIntentClassifierEnabled() {
        return this.isExitIntentClassifierEnabled;
    }

    @NotNull
    public String toString() {
        SecondaryVadConfiguration secondaryVadConfiguration = this.secondaryVadConfig;
        UIConfiguration uIConfiguration = this.uiConfiguration;
        BargeInBehavior bargeInBehavior = this.bargeInBehavior;
        boolean z = this.isExitIntentClassifierEnabled;
        boolean z2 = this.shouldEnforceTimeouts;
        StringBuilder sb = new StringBuilder("NaturalTurnControllerConfiguration(secondaryVadConfig=");
        sb.append(secondaryVadConfiguration);
        sb.append(", uiConfiguration=");
        sb.append(uIConfiguration);
        sb.append(", bargeInBehavior=");
        sb.append(bargeInBehavior);
        sb.append(", isExitIntentClassifierEnabled=");
        sb.append(z);
        sb.append(", shouldEnforceTimeouts=");
        return a$$ExternalSyntheticOutline0.m(sb, z2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public NaturalTurnControllerConfiguration(@NotNull SecondaryVadConfiguration secondaryVadConfiguration, @NotNull UIConfiguration uIConfiguration, @NotNull BargeInBehavior bargeInBehavior, boolean z, boolean z2) {
        secondaryVadConfiguration.getClass();
        uIConfiguration.getClass();
        bargeInBehavior.getClass();
        this.secondaryVadConfig = secondaryVadConfiguration;
        this.uiConfiguration = uIConfiguration;
        this.bargeInBehavior = bargeInBehavior;
        this.isExitIntentClassifierEnabled = z;
        this.shouldEnforceTimeouts = z2;
    }

    public NaturalTurnControllerConfiguration() {
        this(null, null, null, false, false, 31, null);
    }
}
