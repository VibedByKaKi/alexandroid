package com.amazon.alexa.redesign.view.templates.emptyStateTemplate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.entity.templates.EmptyStateTemplateModel;
import com.amazon.alexa.redesign.entity.templates.TemplateType;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/view/templates/emptyStateTemplate/EmptyStateTemplateViewItem;", "Lcom/amazon/alexa/redesign/view/homeFeed/RecyclerViewItem;", "emptyStateTemplateModel", "Lcom/amazon/alexa/redesign/entity/templates/EmptyStateTemplateModel;", "<init>", "(Lcom/amazon/alexa/redesign/entity/templates/EmptyStateTemplateModel;)V", "templateType", "Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "getTemplateType", "()Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EmptyStateTemplateViewItem extends RecyclerViewItem {
    public static final int $stable = 0;

    @NotNull
    private final EmptyStateTemplateModel emptyStateTemplateModel;

    @NotNull
    private final TemplateType templateType;

    public EmptyStateTemplateViewItem(@NotNull EmptyStateTemplateModel emptyStateTemplateModel) {
        emptyStateTemplateModel.getClass();
        this.emptyStateTemplateModel = emptyStateTemplateModel;
        this.templateType = TemplateType.EmptyState;
    }

    @Override // com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem
    @NotNull
    public TemplateType getTemplateType() {
        return this.templateType;
    }
}
