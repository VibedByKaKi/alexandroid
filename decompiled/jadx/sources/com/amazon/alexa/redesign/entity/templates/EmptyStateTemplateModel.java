package com.amazon.alexa.redesign.entity.templates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.entity.CardModel;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import com.amazon.alexa.redesign.view.templates.emptyStateTemplate.EmptyStateTemplateViewItem;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/redesign/entity/templates/EmptyStateTemplateModel;", "Lcom/amazon/alexa/redesign/entity/CardModel;", "<init>", "()V", "toViewItem", "Lcom/amazon/alexa/redesign/view/homeFeed/RecyclerViewItem;", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EmptyStateTemplateModel extends CardModel {
    public static final int $stable = 0;

    @NotNull
    private static final String EMPTY_STATE = "EmptyState";

    @NotNull
    private static final String EMPTY_STATE_ACTION = "EmptyStateAction";

    public EmptyStateTemplateModel() {
        setMetricsData(MapsKt.mutableMapOf(TuplesKt.to("actionType", EMPTY_STATE_ACTION), TuplesKt.to("contentType", EMPTY_STATE), TuplesKt.to("contentProvider", EMPTY_STATE)));
        setDismissible(false);
    }

    @Override // com.amazon.alexa.redesign.entity.CardModel
    @NotNull
    public RecyclerViewItem toViewItem() {
        return new EmptyStateTemplateViewItem(this);
    }
}
