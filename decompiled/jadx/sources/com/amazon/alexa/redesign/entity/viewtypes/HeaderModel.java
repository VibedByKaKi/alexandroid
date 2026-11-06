package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/HeaderModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "builder", "Lcom/amazon/alexa/redesign/entity/viewtypes/HeaderModel$Builder;", "<init>", "(Lcom/amazon/alexa/redesign/entity/viewtypes/HeaderModel$Builder;)V", "_title", "", "_action", "Lcom/amazon/alexa/redesign/actions/Action;", "title", "getTitle", "()Ljava/lang/String;", "modelType", "getModelType", "action", "getAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "actionMetricsData", "", "", "getActionMetricsData", "()Ljava/util/Map;", "Companion", "Builder", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class HeaderModel extends ViewTypeModel {

    @NotNull
    public static final String HEADER_TYPE = "HeaderView";

    @NotNull
    private final Action _action;

    @NotNull
    private final String _title;
    public static final int $stable = 8;

    private HeaderModel(Builder builder) {
        super(builder.getViewPosition());
        this._title = builder.getTitle();
        this._action = builder.getOnClickAction();
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    /* renamed from: getAction, reason: from getter */
    public Action get_action() {
        return this._action;
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    /* renamed from: getActionMetricsData */
    public Map<String, Object> mo19670getActionMetricsData() {
        return this._action.getMetricData();
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    public String getModelType() {
        return HEADER_TYPE;
    }

    @NotNull
    /* renamed from: getTitle, reason: from getter */
    public final String get_title() {
        return this._title;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/HeaderModel$Builder;", "", "title", "", "onClickAction", "Lcom/amazon/alexa/redesign/actions/Action;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/actions/Action;)V", "getTitle", "()Ljava/lang/String;", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "value", "", "viewPosition", "getViewPosition", "()I", "withViewPosition", "pos", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/redesign/entity/viewtypes/HeaderModel;", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Action onClickAction;

        @NotNull
        private final String title;
        private int viewPosition;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        private Builder(String str, Action action) {
            this.title = str;
            this.onClickAction = action;
        }

        @JvmStatic
        @NotNull
        public static final Builder create(@NotNull String str, @NotNull Action action) {
            return INSTANCE.create(str, action);
        }

        @NotNull
        public final HeaderModel build() {
            return new HeaderModel(this, null);
        }

        @NotNull
        public final Action getOnClickAction() {
            return this.onClickAction;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final int getViewPosition() {
            return this.viewPosition;
        }

        @NotNull
        public final Builder withViewPosition(int pos) {
            this.viewPosition = pos;
            return this;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/HeaderModel$Builder$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/redesign/entity/viewtypes/HeaderModel$Builder;", "title", "", "action", "Lcom/amazon/alexa/redesign/actions/Action;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Builder create(@NotNull String title, @NotNull Action action) {
                title.getClass();
                action.getClass();
                return new Builder(title, action, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(String str, Action action, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, action);
        }
    }

    public /* synthetic */ HeaderModel(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
