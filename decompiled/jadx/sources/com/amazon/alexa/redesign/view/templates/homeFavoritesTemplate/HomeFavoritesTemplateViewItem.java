package com.amazon.alexa.redesign.view.templates.homeFavoritesTemplate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.entity.templates.HomeFavoritesTemplateModel;
import com.amazon.alexa.redesign.entity.templates.TemplateType;
import com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/view/templates/homeFavoritesTemplate/HomeFavoritesTemplateViewItem;", "Lcom/amazon/alexa/redesign/view/homeFeed/RecyclerViewItem;", "favModel", "Lcom/amazon/alexa/redesign/entity/templates/HomeFavoritesTemplateModel;", "<init>", "(Lcom/amazon/alexa/redesign/entity/templates/HomeFavoritesTemplateModel;)V", "getFavModel", "()Lcom/amazon/alexa/redesign/entity/templates/HomeFavoritesTemplateModel;", "isSection", "", "()Z", "model", "getModel", "templateType", "Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "getTemplateType", "()Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "topLevelMetricsObject", "", "", "", "getTopLevelMetricsObject", "()Ljava/util/Map;", "isDismissible", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class HomeFavoritesTemplateViewItem extends RecyclerViewItem {
    public static final int $stable = 8;

    @NotNull
    private final HomeFavoritesTemplateModel favModel;
    private final boolean isDismissible;
    private final boolean isSection;

    @NotNull
    private final HomeFavoritesTemplateModel model;

    @NotNull
    private final TemplateType templateType;

    @NotNull
    private final Map<String, Object> topLevelMetricsObject;

    public HomeFavoritesTemplateViewItem(@NotNull HomeFavoritesTemplateModel homeFavoritesTemplateModel) {
        homeFavoritesTemplateModel.getClass();
        this.favModel = homeFavoritesTemplateModel;
        this.isSection = true;
        this.model = homeFavoritesTemplateModel;
        this.templateType = TemplateType.HomeFavoritesTemplate;
        this.topLevelMetricsObject = homeFavoritesTemplateModel.getMetricsData();
        this.isDismissible = homeFavoritesTemplateModel.getIsDismissible();
    }

    @NotNull
    public final HomeFavoritesTemplateModel getFavModel() {
        return this.favModel;
    }

    @Override // com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem
    @NotNull
    public TemplateType getTemplateType() {
        return this.templateType;
    }

    @Override // com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem
    @NotNull
    public Map<String, Object> getTopLevelMetricsObject() {
        return this.topLevelMetricsObject;
    }

    @Override // com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem
    /* renamed from: isDismissible, reason: from getter */
    public boolean getIsDismissible() {
        return this.isDismissible;
    }

    @Override // com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem
    /* renamed from: isSection, reason: from getter */
    public boolean getIsSection() {
        return this.isSection;
    }

    @Override // com.amazon.alexa.redesign.view.homeFeed.RecyclerViewItem
    @NotNull
    public HomeFavoritesTemplateModel getModel() {
        return this.model;
    }
}
