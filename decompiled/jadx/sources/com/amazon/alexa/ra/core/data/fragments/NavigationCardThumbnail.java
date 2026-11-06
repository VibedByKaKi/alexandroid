package com.amazon.alexa.ra.core.data.fragments;

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
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/NavigationCardThumbnail;", "", "graphic", "Lcom/amazon/alexa/ra/core/data/fragments/HeroGraphic;", "text", "", "style", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/HeroGraphic;Ljava/lang/String;Ljava/lang/String;)V", "getGraphic", "()Lcom/amazon/alexa/ra/core/data/fragments/HeroGraphic;", "getText", "()Ljava/lang/String;", "getStyle", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class NavigationCardThumbnail {

    @NotNull
    public static final String GRAPHIC = "graphic";

    @NotNull
    public static final String STYLE = "style";

    @NotNull
    public static final String TEXT = "text";

    @Nullable
    private final HeroGraphic graphic;

    @Nullable
    private final String style;

    @Nullable
    private final String text;
    public static final int $stable = 8;

    public /* synthetic */ NavigationCardThumbnail(HeroGraphic heroGraphic, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : heroGraphic, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ NavigationCardThumbnail copy$default(NavigationCardThumbnail navigationCardThumbnail, HeroGraphic heroGraphic, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            heroGraphic = navigationCardThumbnail.graphic;
        }
        if ((i & 2) != 0) {
            str = navigationCardThumbnail.text;
        }
        if ((i & 4) != 0) {
            str2 = navigationCardThumbnail.style;
        }
        return navigationCardThumbnail.copy(heroGraphic, str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final HeroGraphic getGraphic() {
        return this.graphic;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final NavigationCardThumbnail copy(@Nullable HeroGraphic graphic, @Nullable String text, @Nullable String style) {
        return new NavigationCardThumbnail(graphic, text, style);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationCardThumbnail)) {
            return false;
        }
        NavigationCardThumbnail navigationCardThumbnail = (NavigationCardThumbnail) other;
        return Intrinsics.areEqual(this.graphic, navigationCardThumbnail.graphic) && Intrinsics.areEqual(this.text, navigationCardThumbnail.text) && Intrinsics.areEqual(this.style, navigationCardThumbnail.style);
    }

    @Nullable
    public final HeroGraphic getGraphic() {
        return this.graphic;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        HeroGraphic heroGraphic = this.graphic;
        int hashCode = (heroGraphic == null ? 0 : heroGraphic.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        HeroGraphic heroGraphic = this.graphic;
        String str = this.text;
        String str2 = this.style;
        StringBuilder sb = new StringBuilder("NavigationCardThumbnail(graphic=");
        sb.append(heroGraphic);
        sb.append(", text=");
        sb.append(str);
        sb.append(", style=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public NavigationCardThumbnail(@Nullable HeroGraphic heroGraphic, @Nullable String str, @Nullable String str2) {
        this.graphic = heroGraphic;
        this.text = str;
        this.style = str2;
    }

    public NavigationCardThumbnail() {
        this(null, null, null, 7, null);
    }
}
