package com.amazon.alexa.redesign.actions;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.HomeContract;
import com.amazon.alexa.redesign.view.viewtypes.ViewType;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001dJ\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H&J\u001e\u0010%\u001a\u00020&2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dH&J6\u0010*\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00032\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/amazon/alexa/redesign/actions/Action;", "", "actionType", "", "metaActionType", ViewProps.ACCESSIBILITY_LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "getMetaActionType", "getAccessibilityLabel", "viewType", "Lcom/amazon/alexa/redesign/view/viewtypes/ViewType;", "getViewType", "()Lcom/amazon/alexa/redesign/view/viewtypes/ViewType;", "setViewType", "(Lcom/amazon/alexa/redesign/view/viewtypes/ViewType;)V", "presenter", "Lcom/amazon/alexa/redesign/HomeContract$Presenter;", "getPresenter", "()Lcom/amazon/alexa/redesign/HomeContract$Presenter;", "setPresenter", "(Lcom/amazon/alexa/redesign/HomeContract$Presenter;)V", "refreshUri", "getRefreshUri", "setRefreshUri", "(Ljava/lang/String;)V", "metricsData", "", "getMetricsData", "()Ljava/util/Map;", "setMetricsData", "(Ljava/util/Map;)V", "getOnClickUserLeavesHome", "", "getMetricData", "execute", "", "view", "Lcom/amazon/alexa/redesign/HomeContract$View;", "executionParams", "bind", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class Action {
    public static final int $stable = 8;

    @NotNull
    private final String accessibilityLabel;

    @NotNull
    private final String actionType;

    @NotNull
    private final String metaActionType;

    @Nullable
    private Map<String, ? extends Object> metricsData;

    @Nullable
    private HomeContract.Presenter presenter;

    @Nullable
    private String refreshUri;

    @Nullable
    private ViewType viewType;

    public Action(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.actionType = str;
        this.metaActionType = str2;
        this.accessibilityLabel = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(Action action, HomeContract.Presenter presenter, ViewType viewType, String str, Map map, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: bind");
            return;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        action.bind(presenter, viewType, str, map);
    }

    public final void bind(@NotNull HomeContract.Presenter presenter, @NotNull ViewType viewType, @NotNull String refreshUri, @Nullable Map<String, ? extends Object> metricsData) {
        presenter.getClass();
        viewType.getClass();
        refreshUri.getClass();
        this.presenter = presenter;
        this.viewType = viewType;
        this.refreshUri = refreshUri;
        this.metricsData = metricsData;
    }

    public abstract void execute(@NotNull HomeContract.Presenter presenter, @NotNull HomeContract.View view);

    public abstract void execute(@Nullable Map<String, ? extends Object> executionParams);

    @NotNull
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @NotNull
    public final String getActionType() {
        return this.actionType;
    }

    @NotNull
    public final String getMetaActionType() {
        return this.metaActionType;
    }

    @NotNull
    public final Map<String, Object> getMetricData() {
        return MapsKt.mapOf(TuplesKt.to("actionType", this.actionType), TuplesKt.to("metaActionType", this.metaActionType));
    }

    @Nullable
    public final Map<String, Object> getMetricsData() {
        return this.metricsData;
    }

    public boolean getOnClickUserLeavesHome() {
        return true;
    }

    @Nullable
    public final HomeContract.Presenter getPresenter() {
        return this.presenter;
    }

    @Nullable
    public final String getRefreshUri() {
        return this.refreshUri;
    }

    @Nullable
    public final ViewType getViewType() {
        return this.viewType;
    }

    public final void setMetricsData(@Nullable Map<String, ? extends Object> map) {
        this.metricsData = map;
    }

    public final void setPresenter(@Nullable HomeContract.Presenter presenter) {
        this.presenter = presenter;
    }

    public final void setRefreshUri(@Nullable String str) {
        this.refreshUri = str;
    }

    public final void setViewType(@Nullable ViewType viewType) {
        this.viewType = viewType;
    }
}
