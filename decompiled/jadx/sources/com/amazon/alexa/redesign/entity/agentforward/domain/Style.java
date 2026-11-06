package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/Style;", "", "backgroundColorToken", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ColorToken;", "primaryTextColorToken", "secondaryTextColorToken", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/ColorToken;Lcom/amazon/alexa/redesign/entity/agentforward/domain/ColorToken;Lcom/amazon/alexa/redesign/entity/agentforward/domain/ColorToken;)V", "getBackgroundColorToken", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/ColorToken;", "setBackgroundColorToken", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/ColorToken;)V", "getPrimaryTextColorToken", "setPrimaryTextColorToken", "getSecondaryTextColorToken", "setSecondaryTextColorToken", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class Style {
    public static final int $stable = 8;

    @Nullable
    private ColorToken backgroundColorToken;

    @Nullable
    private ColorToken primaryTextColorToken;

    @Nullable
    private ColorToken secondaryTextColorToken;

    public /* synthetic */ Style(ColorToken colorToken, ColorToken colorToken2, ColorToken colorToken3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : colorToken, (i & 2) != 0 ? null : colorToken2, (i & 4) != 0 ? null : colorToken3);
    }

    public static /* synthetic */ Style copy$default(Style style, ColorToken colorToken, ColorToken colorToken2, ColorToken colorToken3, int i, Object obj) {
        if ((i & 1) != 0) {
            colorToken = style.backgroundColorToken;
        }
        if ((i & 2) != 0) {
            colorToken2 = style.primaryTextColorToken;
        }
        if ((i & 4) != 0) {
            colorToken3 = style.secondaryTextColorToken;
        }
        return style.copy(colorToken, colorToken2, colorToken3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ColorToken getBackgroundColorToken() {
        return this.backgroundColorToken;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ColorToken getPrimaryTextColorToken() {
        return this.primaryTextColorToken;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ColorToken getSecondaryTextColorToken() {
        return this.secondaryTextColorToken;
    }

    @NotNull
    public final Style copy(@JsonProperty("backgroundColorToken") @Nullable ColorToken backgroundColorToken, @JsonProperty("primaryTextColorToken") @Nullable ColorToken primaryTextColorToken, @JsonProperty("secondaryTextColorToken") @Nullable ColorToken secondaryTextColorToken) {
        return new Style(backgroundColorToken, primaryTextColorToken, secondaryTextColorToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Style)) {
            return false;
        }
        Style style = (Style) other;
        return this.backgroundColorToken == style.backgroundColorToken && this.primaryTextColorToken == style.primaryTextColorToken && this.secondaryTextColorToken == style.secondaryTextColorToken;
    }

    @Nullable
    public final ColorToken getBackgroundColorToken() {
        return this.backgroundColorToken;
    }

    @Nullable
    public final ColorToken getPrimaryTextColorToken() {
        return this.primaryTextColorToken;
    }

    @Nullable
    public final ColorToken getSecondaryTextColorToken() {
        return this.secondaryTextColorToken;
    }

    public int hashCode() {
        ColorToken colorToken = this.backgroundColorToken;
        int hashCode = (colorToken == null ? 0 : colorToken.hashCode()) * 31;
        ColorToken colorToken2 = this.primaryTextColorToken;
        int hashCode2 = (hashCode + (colorToken2 == null ? 0 : colorToken2.hashCode())) * 31;
        ColorToken colorToken3 = this.secondaryTextColorToken;
        return hashCode2 + (colorToken3 != null ? colorToken3.hashCode() : 0);
    }

    public final void setBackgroundColorToken(@Nullable ColorToken colorToken) {
        this.backgroundColorToken = colorToken;
    }

    public final void setPrimaryTextColorToken(@Nullable ColorToken colorToken) {
        this.primaryTextColorToken = colorToken;
    }

    public final void setSecondaryTextColorToken(@Nullable ColorToken colorToken) {
        this.secondaryTextColorToken = colorToken;
    }

    @NotNull
    public String toString() {
        return "Style(backgroundColorToken=" + this.backgroundColorToken + ", primaryTextColorToken=" + this.primaryTextColorToken + ", secondaryTextColorToken=" + this.secondaryTextColorToken + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public Style(@JsonProperty("backgroundColorToken") @Nullable ColorToken colorToken, @JsonProperty("primaryTextColorToken") @Nullable ColorToken colorToken2, @JsonProperty("secondaryTextColorToken") @Nullable ColorToken colorToken3) {
        this.backgroundColorToken = colorToken;
        this.primaryTextColorToken = colorToken2;
        this.secondaryTextColorToken = colorToken3;
    }

    @JsonCreator
    public Style() {
        this(null, null, null, 7, null);
    }
}
