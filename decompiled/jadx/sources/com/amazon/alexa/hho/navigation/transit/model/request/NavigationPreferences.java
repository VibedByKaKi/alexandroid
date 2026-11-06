package com.amazon.alexa.hho.navigation.transit.model.request;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.hho.navigation.transit.model.TransportMode;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/request/NavigationPreferences;", "", "transportMode", "Lcom/amazon/alexa/hho/navigation/transit/model/TransportMode;", "locale", "", "includeRouteOverviewVisual", "", "includeVoiceInstructions", "includeVisualInstructions", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/model/TransportMode;Ljava/lang/String;ZZZ)V", "getTransportMode", "()Lcom/amazon/alexa/hho/navigation/transit/model/TransportMode;", "getLocale", "()Ljava/lang/String;", "getIncludeRouteOverviewVisual", "()Z", "getIncludeVoiceInstructions", "getIncludeVisualInstructions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NavigationPreferences {
    private final boolean includeRouteOverviewVisual;
    private final boolean includeVisualInstructions;
    private final boolean includeVoiceInstructions;

    @NotNull
    private final String locale;

    @NotNull
    private final TransportMode transportMode;

    public /* synthetic */ NavigationPreferences(TransportMode transportMode, String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transportMode, (i & 2) != 0 ? "en_US" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3);
    }

    public static /* synthetic */ NavigationPreferences copy$default(NavigationPreferences navigationPreferences, TransportMode transportMode, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            transportMode = navigationPreferences.transportMode;
        }
        if ((i & 2) != 0) {
            str = navigationPreferences.locale;
        }
        if ((i & 4) != 0) {
            z = navigationPreferences.includeRouteOverviewVisual;
        }
        if ((i & 8) != 0) {
            z2 = navigationPreferences.includeVoiceInstructions;
        }
        if ((i & 16) != 0) {
            z3 = navigationPreferences.includeVisualInstructions;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return navigationPreferences.copy(transportMode, str, z5, z2, z4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TransportMode getTransportMode() {
        return this.transportMode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeRouteOverviewVisual() {
        return this.includeRouteOverviewVisual;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludeVoiceInstructions() {
        return this.includeVoiceInstructions;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIncludeVisualInstructions() {
        return this.includeVisualInstructions;
    }

    @NotNull
    public final NavigationPreferences copy(@NotNull TransportMode transportMode, @NotNull String locale, boolean includeRouteOverviewVisual, boolean includeVoiceInstructions, boolean includeVisualInstructions) {
        transportMode.getClass();
        locale.getClass();
        return new NavigationPreferences(transportMode, locale, includeRouteOverviewVisual, includeVoiceInstructions, includeVisualInstructions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationPreferences)) {
            return false;
        }
        NavigationPreferences navigationPreferences = (NavigationPreferences) other;
        return this.transportMode == navigationPreferences.transportMode && Intrinsics.areEqual(this.locale, navigationPreferences.locale) && this.includeRouteOverviewVisual == navigationPreferences.includeRouteOverviewVisual && this.includeVoiceInstructions == navigationPreferences.includeVoiceInstructions && this.includeVisualInstructions == navigationPreferences.includeVisualInstructions;
    }

    public final boolean getIncludeRouteOverviewVisual() {
        return this.includeRouteOverviewVisual;
    }

    public final boolean getIncludeVisualInstructions() {
        return this.includeVisualInstructions;
    }

    public final boolean getIncludeVoiceInstructions() {
        return this.includeVoiceInstructions;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final TransportMode getTransportMode() {
        return this.transportMode;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeVisualInstructions) + DoubleList$$ExternalSyntheticOutline0.m(this.includeVoiceInstructions, DoubleList$$ExternalSyntheticOutline0.m(this.includeRouteOverviewVisual, ArcMode$$ExternalSyntheticOutline0.m(this.transportMode.hashCode() * 31, 31, this.locale), 31), 31);
    }

    @NotNull
    public String toString() {
        TransportMode transportMode = this.transportMode;
        String str = this.locale;
        boolean z = this.includeRouteOverviewVisual;
        boolean z2 = this.includeVoiceInstructions;
        boolean z3 = this.includeVisualInstructions;
        StringBuilder sb = new StringBuilder("NavigationPreferences(transportMode=");
        sb.append(transportMode);
        sb.append(", locale=");
        sb.append(str);
        sb.append(", includeRouteOverviewVisual=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(sb, z, ", includeVoiceInstructions=", z2, ", includeVisualInstructions=");
        return a$$ExternalSyntheticOutline0.m(sb, z3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public NavigationPreferences(@NotNull TransportMode transportMode, @NotNull String str, boolean z, boolean z2, boolean z3) {
        transportMode.getClass();
        str.getClass();
        this.transportMode = transportMode;
        this.locale = str;
        this.includeRouteOverviewVisual = z;
        this.includeVoiceInstructions = z2;
        this.includeVisualInstructions = z3;
    }
}
