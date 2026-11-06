package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/EmptyModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "viewPosition", "", "<init>", "(I)V", "modelType", "", "getModelType", "()Ljava/lang/String;", "action", "Lcom/amazon/alexa/redesign/actions/Action;", "getAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "actionMetricsData", "", "", "getActionMetricsData", "()Ljava/util/Map;", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EmptyModel extends ViewTypeModel {

    @NotNull
    public static final String EMPTY_MODEL = "EmptyView";

    @Nullable
    private final Action action;

    @NotNull
    private final Map<String, Object> actionMetricsData;

    @NotNull
    private final String modelType;
    public static final int $stable = 8;

    public EmptyModel(int i) {
        super(i);
        this.modelType = EMPTY_MODEL;
        this.actionMetricsData = MapsKt.emptyMap();
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
}
