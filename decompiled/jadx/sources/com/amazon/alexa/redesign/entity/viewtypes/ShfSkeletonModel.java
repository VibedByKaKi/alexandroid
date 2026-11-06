package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/ShfSkeletonModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "viewPosition", "", "<init>", "(I)V", "modelType", "", "getModelType", "()Ljava/lang/String;", "action", "", "getAction", "()Ljava/lang/Void;", "actionMetricsData", "getActionMetricsData", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ShfSkeletonModel extends ViewTypeModel {

    @NotNull
    public static final String SHF_SKELETON_TYPE = "SHFSkeletonView";

    @Nullable
    private final Void action;

    @Nullable
    private final Void actionMetricsData;

    @NotNull
    private final String modelType;
    public static final int $stable = 8;

    public ShfSkeletonModel(int i) {
        super(i);
        this.modelType = SHF_SKELETON_TYPE;
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    /* renamed from: getAction */
    public /* bridge */ /* synthetic */ Action get_action() {
        return (Action) getAction();
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    /* renamed from: getActionMetricsData, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Map mo19670getActionMetricsData() {
        return (Map) getActionMetricsData();
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    public String getModelType() {
        return this.modelType;
    }

    @Nullable
    public Void getAction() {
        return this.action;
    }

    @Nullable
    public Void getActionMetricsData() {
        return this.actionMetricsData;
    }
}
