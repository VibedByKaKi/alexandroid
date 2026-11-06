package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.redesign.actions.Action;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/ExpandableSectionHeaderModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "viewPosition", "", "onClickAction", "Lcom/amazon/alexa/redesign/actions/Action;", "title", "", SmartPlayConstants.SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE, "titleBold", "", "subtitleBold", "secondaryText", "<init>", "(ILcom/amazon/alexa/redesign/actions/Action;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getViewPosition", "()I", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTitleBold", "()Z", "getSubtitleBold", "getSecondaryText", "modelType", "getModelType", "action", "getAction", "actionMetricsData", "", "", "getActionMetricsData", "()Ljava/util/Map;", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ExpandableSectionHeaderModel extends ViewTypeModel {

    @NotNull
    public static final String EXPANDABLE_SECTION_HEADER_TYPE = "ExpandableSectionHeader";

    @Nullable
    private final Action action;

    @NotNull
    private final Map<String, Object> actionMetricsData;

    @NotNull
    private final String modelType;

    @Nullable
    private final Action onClickAction;

    @Nullable
    private final String secondaryText;

    @Nullable
    private final String subtitle;
    private final boolean subtitleBold;

    @NotNull
    private final String title;
    private final boolean titleBold;
    private final int viewPosition;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableSectionHeaderModel(int i, @Nullable Action action, @NotNull String str, @Nullable String str2, boolean z, boolean z2, @Nullable String str3) {
        super(i);
        Map<String, Object> metricData;
        str.getClass();
        this.viewPosition = i;
        this.onClickAction = action;
        this.title = str;
        this.subtitle = str2;
        this.titleBold = z;
        this.subtitleBold = z2;
        this.secondaryText = str3;
        this.modelType = EXPANDABLE_SECTION_HEADER_TYPE;
        this.action = action;
        this.actionMetricsData = (action == null || (metricData = action.getMetricData()) == null) ? MapsKt.emptyMap() : metricData;
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @Nullable
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

    @Nullable
    public final Action getOnClickAction() {
        return this.onClickAction;
    }

    @Nullable
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getSubtitleBold() {
        return this.subtitleBold;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getTitleBold() {
        return this.titleBold;
    }

    public final int getViewPosition() {
        return this.viewPosition;
    }

    public /* synthetic */ ExpandableSectionHeaderModel(int i, Action action, String str, String str2, boolean z, boolean z2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, action, str, str2, z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : str3);
    }
}
