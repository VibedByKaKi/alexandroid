package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/TileFooterTextItemModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "viewPosition", "", "onClickAction", "Lcom/amazon/alexa/redesign/actions/Action;", "titleBold", "", "title", "", "titleColor", "<init>", "(ILcom/amazon/alexa/redesign/actions/Action;ZLjava/lang/String;Ljava/lang/String;)V", "getViewPosition", "()I", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "getTitleBold", "()Z", "getTitle", "()Ljava/lang/String;", "getTitleColor", "modelType", "getModelType", "action", "getAction", "actionMetricsData", "", "", "getActionMetricsData", "()Ljava/util/Map;", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TileFooterTextItemModel extends ViewTypeModel {

    @NotNull
    public static final String TILE_FOOTER_TEXT_ITEM_TYPE = "TileFooterTextItemView";

    @NotNull
    private final Action action;

    @NotNull
    private final Map<String, Object> actionMetricsData;

    @NotNull
    private final String modelType;

    @NotNull
    private final Action onClickAction;

    @NotNull
    private final String title;
    private final boolean titleBold;

    @NotNull
    private final String titleColor;
    private final int viewPosition;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileFooterTextItemModel(int i, @NotNull Action action, boolean z, @NotNull String str, @NotNull String str2) {
        super(i);
        action.getClass();
        str.getClass();
        str2.getClass();
        this.viewPosition = i;
        this.onClickAction = action;
        this.titleBold = z;
        this.title = str;
        this.titleColor = str2;
        this.modelType = TILE_FOOTER_TEXT_ITEM_TYPE;
        this.action = action;
        this.actionMetricsData = action.getMetricData();
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    public Action getAction() {
        return this.action;
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    /* renamed from: getActionMetricsData */
    public Map<String, Object> mo19670getActionMetricsData() {
        return this.actionMetricsData;
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    public String getModelType() {
        return this.modelType;
    }

    @NotNull
    public final Action getOnClickAction() {
        return this.onClickAction;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getTitleBold() {
        return this.titleBold;
    }

    @NotNull
    public final String getTitleColor() {
        return this.titleColor;
    }

    public final int getViewPosition() {
        return this.viewPosition;
    }
}
