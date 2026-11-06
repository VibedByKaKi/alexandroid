package com.amazon.alexa.redesign.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/redesign/repository/CardStudioDecision;", "", "routeEnabled", "", "forceDeviceKind", "<init>", "(ZZ)V", "getRouteEnabled", "()Z", "getForceDeviceKind", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CardStudioDecision {
    public static final int $stable = 0;
    private final boolean forceDeviceKind;
    private final boolean routeEnabled;

    public CardStudioDecision(boolean z, boolean z2) {
        this.routeEnabled = z;
        this.forceDeviceKind = z2;
    }

    public static /* synthetic */ CardStudioDecision copy$default(CardStudioDecision cardStudioDecision, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cardStudioDecision.routeEnabled;
        }
        if ((i & 2) != 0) {
            z2 = cardStudioDecision.forceDeviceKind;
        }
        return cardStudioDecision.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRouteEnabled() {
        return this.routeEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceDeviceKind() {
        return this.forceDeviceKind;
    }

    @NotNull
    public final CardStudioDecision copy(boolean routeEnabled, boolean forceDeviceKind) {
        return new CardStudioDecision(routeEnabled, forceDeviceKind);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardStudioDecision)) {
            return false;
        }
        CardStudioDecision cardStudioDecision = (CardStudioDecision) other;
        return this.routeEnabled == cardStudioDecision.routeEnabled && this.forceDeviceKind == cardStudioDecision.forceDeviceKind;
    }

    public final boolean getForceDeviceKind() {
        return this.forceDeviceKind;
    }

    public final boolean getRouteEnabled() {
        return this.routeEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.forceDeviceKind) + (Boolean.hashCode(this.routeEnabled) * 31);
    }

    @NotNull
    public String toString() {
        return "CardStudioDecision(routeEnabled=" + this.routeEnabled + ", forceDeviceKind=" + this.forceDeviceKind + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
