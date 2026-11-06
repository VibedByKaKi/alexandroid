package com.amazon.alexa.redesign.view.homeFeed;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.redesign.entity.CardModel;
import com.amazon.alexa.redesign.entity.templates.TemplateType;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010#R\u0014\u0010$\u001a\u00020\"X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u0006&"}, d2 = {"Lcom/amazon/alexa/redesign/view/homeFeed/RecyclerViewItem;", "", "<init>", "()V", "templateType", "Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "getTemplateType", "()Lcom/amazon/alexa/redesign/entity/templates/TemplateType;", "title", "", "getTitle", "()Ljava/lang/String;", "viewBackgroundColor", "", "getViewBackgroundColor", "()I", "cardId", "getCardId", "getItemId", "itemIndex", "getMetrics", "Lorg/json/JSONObject;", Content.CARD_TYPE, "getCardType", "getPublisher", "topLevelMetricsObject", "", "getTopLevelMetricsObject", "()Ljava/util/Map;", "model", "Lcom/amazon/alexa/redesign/entity/CardModel;", "getModel", "()Lcom/amazon/alexa/redesign/entity/CardModel;", "isDismissible", "", "()Z", "isSection", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class RecyclerViewItem {

    @NotNull
    protected static final String DEFAULT_BACKGROUND_COLOR = "#163954";

    @Nullable
    private final String cardId;

    @Nullable
    private final String cardType;
    private final boolean isDismissible;
    private final boolean isSection;

    @Nullable
    private final CardModel model;

    @Nullable
    private final String title;

    @Nullable
    private final Map<String, Object> topLevelMetricsObject;
    public static final int $stable = 8;

    @NotNull
    private final TemplateType templateType = TemplateType.UNKNOWN;
    private final int viewBackgroundColor = Color.parseColor(DEFAULT_BACKGROUND_COLOR);

    @Nullable
    public String getCardId() {
        return this.cardId;
    }

    @Nullable
    public String getCardType() {
        return this.cardType;
    }

    @Nullable
    public String getItemId(int itemIndex) {
        return null;
    }

    @Nullable
    public JSONObject getMetrics(int itemIndex) {
        return null;
    }

    @Nullable
    public CardModel getModel() {
        return this.model;
    }

    @Nullable
    public String getPublisher(int itemIndex) {
        return null;
    }

    @NotNull
    public TemplateType getTemplateType() {
        return this.templateType;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public Map<String, Object> getTopLevelMetricsObject() {
        return this.topLevelMetricsObject;
    }

    public int getViewBackgroundColor() {
        return this.viewBackgroundColor;
    }

    /* renamed from: isDismissible, reason: from getter */
    public boolean getIsDismissible() {
        return this.isDismissible;
    }

    /* renamed from: isSection, reason: from getter */
    public boolean getIsSection() {
        return this.isSection;
    }
}
