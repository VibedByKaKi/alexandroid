package com.amazon.alexa.assistant.ui.theme;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/assistant/ui/theme/ColorConfiguration;", "", AppStateModule.APP_STATE_BACKGROUND, "Lcom/amazon/alexa/assistant/ui/theme/ColorScheme;", "primaryTextColor", "secondaryTextColor", "conversationStarterBackground", "<init>", "(Lcom/amazon/alexa/assistant/ui/theme/ColorScheme;Lcom/amazon/alexa/assistant/ui/theme/ColorScheme;Lcom/amazon/alexa/assistant/ui/theme/ColorScheme;Lcom/amazon/alexa/assistant/ui/theme/ColorScheme;)V", "getBackground", "()Lcom/amazon/alexa/assistant/ui/theme/ColorScheme;", "getPrimaryTextColor", "getSecondaryTextColor", "getConversationStarterBackground$annotations", "()V", "getConversationStarterBackground", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ColorConfiguration {
    public static final int $stable = 0;

    @Nullable
    private final ColorScheme background;

    @Nullable
    private final ColorScheme conversationStarterBackground;

    @Nullable
    private final ColorScheme primaryTextColor;

    @Nullable
    private final ColorScheme secondaryTextColor;

    public /* synthetic */ ColorConfiguration(ColorScheme colorScheme, ColorScheme colorScheme2, ColorScheme colorScheme3, ColorScheme colorScheme4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : colorScheme, (i & 2) != 0 ? null : colorScheme2, (i & 4) != 0 ? null : colorScheme3, (i & 8) != 0 ? null : colorScheme4);
    }

    public static /* synthetic */ ColorConfiguration copy$default(ColorConfiguration colorConfiguration, ColorScheme colorScheme, ColorScheme colorScheme2, ColorScheme colorScheme3, ColorScheme colorScheme4, int i, Object obj) {
        if ((i & 1) != 0) {
            colorScheme = colorConfiguration.background;
        }
        if ((i & 2) != 0) {
            colorScheme2 = colorConfiguration.primaryTextColor;
        }
        if ((i & 4) != 0) {
            colorScheme3 = colorConfiguration.secondaryTextColor;
        }
        if ((i & 8) != 0) {
            colorScheme4 = colorConfiguration.conversationStarterBackground;
        }
        return colorConfiguration.copy(colorScheme, colorScheme2, colorScheme3, colorScheme4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ColorScheme getBackground() {
        return this.background;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ColorScheme getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ColorScheme getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ColorScheme getConversationStarterBackground() {
        return this.conversationStarterBackground;
    }

    @NotNull
    public final ColorConfiguration copy(@Nullable ColorScheme background, @Nullable ColorScheme primaryTextColor, @Nullable ColorScheme secondaryTextColor, @Nullable ColorScheme conversationStarterBackground) {
        return new ColorConfiguration(background, primaryTextColor, secondaryTextColor, conversationStarterBackground);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorConfiguration)) {
            return false;
        }
        ColorConfiguration colorConfiguration = (ColorConfiguration) other;
        return Intrinsics.areEqual(this.background, colorConfiguration.background) && Intrinsics.areEqual(this.primaryTextColor, colorConfiguration.primaryTextColor) && Intrinsics.areEqual(this.secondaryTextColor, colorConfiguration.secondaryTextColor) && Intrinsics.areEqual(this.conversationStarterBackground, colorConfiguration.conversationStarterBackground);
    }

    @Nullable
    public final ColorScheme getBackground() {
        return this.background;
    }

    @Nullable
    public final ColorScheme getConversationStarterBackground() {
        return this.conversationStarterBackground;
    }

    @Nullable
    public final ColorScheme getPrimaryTextColor() {
        return this.primaryTextColor;
    }

    @Nullable
    public final ColorScheme getSecondaryTextColor() {
        return this.secondaryTextColor;
    }

    public int hashCode() {
        ColorScheme colorScheme = this.background;
        int hashCode = (colorScheme == null ? 0 : colorScheme.hashCode()) * 31;
        ColorScheme colorScheme2 = this.primaryTextColor;
        int hashCode2 = (hashCode + (colorScheme2 == null ? 0 : colorScheme2.hashCode())) * 31;
        ColorScheme colorScheme3 = this.secondaryTextColor;
        int hashCode3 = (hashCode2 + (colorScheme3 == null ? 0 : colorScheme3.hashCode())) * 31;
        ColorScheme colorScheme4 = this.conversationStarterBackground;
        return hashCode3 + (colorScheme4 != null ? colorScheme4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ColorConfiguration(background=" + this.background + ", primaryTextColor=" + this.primaryTextColor + ", secondaryTextColor=" + this.secondaryTextColor + ", conversationStarterBackground=" + this.conversationStarterBackground + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Deprecated(message = "Conversation starter pills are a non-customizable Alexa-brand element; this value is ignored and will be removed in a future release.")
    public static /* synthetic */ void getConversationStarterBackground$annotations() {
    }

    public ColorConfiguration(@Nullable ColorScheme colorScheme, @Nullable ColorScheme colorScheme2, @Nullable ColorScheme colorScheme3, @Nullable ColorScheme colorScheme4) {
        this.background = colorScheme;
        this.primaryTextColor = colorScheme2;
        this.secondaryTextColor = colorScheme3;
        this.conversationStarterBackground = colorScheme4;
    }

    public ColorConfiguration() {
        this(null, null, null, null, 15, null);
    }
}
