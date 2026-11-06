package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/StyleDomain;", "", "backgroundColorToken", "Lcom/amazon/alexa/redesign/entity/agentforward/network/ColorTokenDomain;", "primaryTextColorToken", "secondaryTextColorToken", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/ColorTokenDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/ColorTokenDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/ColorTokenDomain;)V", "getBackgroundColorToken", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/ColorTokenDomain;", "getPrimaryTextColorToken", "getSecondaryTextColorToken", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class StyleDomain {
    public static final int $stable = 0;

    @Nullable
    private final ColorTokenDomain backgroundColorToken;

    @Nullable
    private final ColorTokenDomain primaryTextColorToken;

    @Nullable
    private final ColorTokenDomain secondaryTextColorToken;

    public /* synthetic */ StyleDomain(ColorTokenDomain colorTokenDomain, ColorTokenDomain colorTokenDomain2, ColorTokenDomain colorTokenDomain3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : colorTokenDomain, (i & 2) != 0 ? null : colorTokenDomain2, (i & 4) != 0 ? null : colorTokenDomain3);
    }

    public static /* synthetic */ StyleDomain copy$default(StyleDomain styleDomain, ColorTokenDomain colorTokenDomain, ColorTokenDomain colorTokenDomain2, ColorTokenDomain colorTokenDomain3, int i, Object obj) {
        if ((i & 1) != 0) {
            colorTokenDomain = styleDomain.backgroundColorToken;
        }
        if ((i & 2) != 0) {
            colorTokenDomain2 = styleDomain.primaryTextColorToken;
        }
        if ((i & 4) != 0) {
            colorTokenDomain3 = styleDomain.secondaryTextColorToken;
        }
        return styleDomain.copy(colorTokenDomain, colorTokenDomain2, colorTokenDomain3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ColorTokenDomain getBackgroundColorToken() {
        return this.backgroundColorToken;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ColorTokenDomain getPrimaryTextColorToken() {
        return this.primaryTextColorToken;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ColorTokenDomain getSecondaryTextColorToken() {
        return this.secondaryTextColorToken;
    }

    @NotNull
    public final StyleDomain copy(@Nullable ColorTokenDomain backgroundColorToken, @Nullable ColorTokenDomain primaryTextColorToken, @Nullable ColorTokenDomain secondaryTextColorToken) {
        return new StyleDomain(backgroundColorToken, primaryTextColorToken, secondaryTextColorToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleDomain)) {
            return false;
        }
        StyleDomain styleDomain = (StyleDomain) other;
        return this.backgroundColorToken == styleDomain.backgroundColorToken && this.primaryTextColorToken == styleDomain.primaryTextColorToken && this.secondaryTextColorToken == styleDomain.secondaryTextColorToken;
    }

    @Nullable
    public final ColorTokenDomain getBackgroundColorToken() {
        return this.backgroundColorToken;
    }

    @Nullable
    public final ColorTokenDomain getPrimaryTextColorToken() {
        return this.primaryTextColorToken;
    }

    @Nullable
    public final ColorTokenDomain getSecondaryTextColorToken() {
        return this.secondaryTextColorToken;
    }

    public int hashCode() {
        ColorTokenDomain colorTokenDomain = this.backgroundColorToken;
        int hashCode = (colorTokenDomain == null ? 0 : colorTokenDomain.hashCode()) * 31;
        ColorTokenDomain colorTokenDomain2 = this.primaryTextColorToken;
        int hashCode2 = (hashCode + (colorTokenDomain2 == null ? 0 : colorTokenDomain2.hashCode())) * 31;
        ColorTokenDomain colorTokenDomain3 = this.secondaryTextColorToken;
        return hashCode2 + (colorTokenDomain3 != null ? colorTokenDomain3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StyleDomain(backgroundColorToken=" + this.backgroundColorToken + ", primaryTextColorToken=" + this.primaryTextColorToken + ", secondaryTextColorToken=" + this.secondaryTextColorToken + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public StyleDomain(@Nullable ColorTokenDomain colorTokenDomain, @Nullable ColorTokenDomain colorTokenDomain2, @Nullable ColorTokenDomain colorTokenDomain3) {
        this.backgroundColorToken = colorTokenDomain;
        this.primaryTextColorToken = colorTokenDomain2;
        this.secondaryTextColorToken = colorTokenDomain3;
    }

    public StyleDomain() {
        this(null, null, null, 7, null);
    }
}
