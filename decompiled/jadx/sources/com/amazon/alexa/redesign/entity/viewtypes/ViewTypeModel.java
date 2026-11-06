package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "", "viewPosition", "", "<init>", "(I)V", "modelType", "", "getModelType", "()Ljava/lang/String;", "modelPosition", "getModelPosition", "()I", "action", "Lcom/amazon/alexa/redesign/actions/Action;", "getAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "actionMetricsData", "", "getActionMetricsData", "()Ljava/util/Map;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class ViewTypeModel {
    public static final int $stable = 0;
    private final int viewPosition;

    public ViewTypeModel(int i) {
        this.viewPosition = i;
    }

    @Nullable
    public abstract Action getAction();

    @Nullable
    /* renamed from: getActionMetricsData */
    public abstract Map<String, Object> mo19670getActionMetricsData();

    /* renamed from: getModelPosition, reason: from getter */
    public final int getViewPosition() {
        return this.viewPosition;
    }

    @NotNull
    public abstract String getModelType();
}
