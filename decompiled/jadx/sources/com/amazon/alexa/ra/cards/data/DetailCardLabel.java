package com.amazon.alexa.ra.cards.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/DetailCardLabel;", "", "text", "", "graphic", "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "position", "Lcom/amazon/alexa/ra/cards/data/LabelPosition;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/cards/data/ItemGraphic;Lcom/amazon/alexa/ra/cards/data/LabelPosition;)V", "getText", "()Ljava/lang/String;", "getGraphic", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "getPosition", "()Lcom/amazon/alexa/ra/cards/data/LabelPosition;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class DetailCardLabel {
    public static final int $stable = 0;

    @Nullable
    private final ItemGraphic graphic;

    @NotNull
    private final LabelPosition position;

    @Nullable
    private final String text;

    public /* synthetic */ DetailCardLabel(String str, ItemGraphic itemGraphic, LabelPosition labelPosition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : itemGraphic, (i & 4) != 0 ? LabelPosition.START : labelPosition);
    }

    public static /* synthetic */ DetailCardLabel copy$default(DetailCardLabel detailCardLabel, String str, ItemGraphic itemGraphic, LabelPosition labelPosition, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailCardLabel.text;
        }
        if ((i & 2) != 0) {
            itemGraphic = detailCardLabel.graphic;
        }
        if ((i & 4) != 0) {
            labelPosition = detailCardLabel.position;
        }
        return detailCardLabel.copy(str, itemGraphic, labelPosition);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final LabelPosition getPosition() {
        return this.position;
    }

    @NotNull
    public final DetailCardLabel copy(@Nullable String text, @Nullable ItemGraphic graphic, @NotNull LabelPosition position) {
        position.getClass();
        return new DetailCardLabel(text, graphic, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailCardLabel)) {
            return false;
        }
        DetailCardLabel detailCardLabel = (DetailCardLabel) other;
        return Intrinsics.areEqual(this.text, detailCardLabel.text) && Intrinsics.areEqual(this.graphic, detailCardLabel.graphic) && this.position == detailCardLabel.position;
    }

    @Nullable
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @NotNull
    public final LabelPosition getPosition() {
        return this.position;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ItemGraphic itemGraphic = this.graphic;
        return this.position.hashCode() + ((hashCode + (itemGraphic != null ? itemGraphic.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "DetailCardLabel(text=" + this.text + ", graphic=" + this.graphic + ", position=" + this.position + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public DetailCardLabel(@Nullable String str, @Nullable ItemGraphic itemGraphic, @NotNull LabelPosition labelPosition) {
        labelPosition.getClass();
        this.text = str;
        this.graphic = itemGraphic;
        this.position = labelPosition;
    }

    public DetailCardLabel() {
        this(null, null, null, 7, null);
    }
}
