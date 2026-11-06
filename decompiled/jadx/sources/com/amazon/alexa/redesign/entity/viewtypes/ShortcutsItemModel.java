package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0014\u0010\u0018\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/ShortcutsItemModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "builder", "Lcom/amazon/alexa/redesign/entity/viewtypes/ShortcutsItemModel$Builder;", "<init>", "(Lcom/amazon/alexa/redesign/entity/viewtypes/ShortcutsItemModel$Builder;)V", "title", "", "getTitle", "()Ljava/lang/String;", "imageUrl", "getImageUrl", "imageType", "getImageType", "onClickAction", "Lcom/amazon/alexa/redesign/actions/Action;", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "carouselItemId", "getCarouselItemId", "carouselItemType", "getCarouselItemType", "carouselItemProvider", "getCarouselItemProvider", "modelType", "getModelType", "action", "getAction", "actionMetricsData", "", "", "getActionMetricsData", "()Ljava/util/Map;", "Companion", "Builder", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ShortcutsItemModel extends ViewTypeModel {

    @NotNull
    public static final String SHORTCUTS_ITEM_TYPE = "ShortcutsItemView";

    @Nullable
    private final Action action;

    @NotNull
    private final Map<String, Object> actionMetricsData;

    @Nullable
    private final String carouselItemId;

    @Nullable
    private final String carouselItemProvider;

    @Nullable
    private final String carouselItemType;

    @Nullable
    private final String imageType;

    @Nullable
    private final String imageUrl;

    @NotNull
    private final String modelType;

    @Nullable
    private final Action onClickAction;

    @Nullable
    private final String title;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u001f\u001a\u00020 R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\"\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\"\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\"\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\f¨\u0006!"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/ShortcutsItemModel$Builder;", "", "<init>", "()V", "value", "", "viewPosition", "getViewPosition", "()I", "", "title", "getTitle", "()Ljava/lang/String;", "imageUrl", "getImageUrl", "imageType", "getImageType", "Lcom/amazon/alexa/redesign/actions/Action;", "action", "getAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "carouselItemId", "getCarouselItemId", "carouselItemType", "getCarouselItemType", "carouselItemProvider", "getCarouselItemProvider", "position", "id", "type", "provider", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/redesign/entity/viewtypes/ShortcutsItemModel;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nShortcutsItemModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutsItemModel.kt\ncom/amazon/alexa/redesign/entity/viewtypes/ShortcutsItemModel$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private Action action;

        @Nullable
        private String carouselItemId;

        @Nullable
        private String carouselItemProvider;

        @Nullable
        private String carouselItemType;

        @Nullable
        private String imageType;

        @Nullable
        private String imageUrl;

        @Nullable
        private String title;
        private int viewPosition;

        @NotNull
        public final Builder action(@Nullable Action action) {
            this.action = action;
            return this;
        }

        @NotNull
        public final ShortcutsItemModel build() {
            return new ShortcutsItemModel(this, null);
        }

        @NotNull
        public final Builder carouselItemId(@Nullable String id) {
            this.carouselItemId = id;
            return this;
        }

        @NotNull
        public final Builder carouselItemProvider(@Nullable String provider) {
            this.carouselItemProvider = provider;
            return this;
        }

        @NotNull
        public final Builder carouselItemType(@Nullable String type) {
            this.carouselItemType = type;
            return this;
        }

        @Nullable
        public final Action getAction() {
            return this.action;
        }

        @Nullable
        public final String getCarouselItemId() {
            return this.carouselItemId;
        }

        @Nullable
        public final String getCarouselItemProvider() {
            return this.carouselItemProvider;
        }

        @Nullable
        public final String getCarouselItemType() {
            return this.carouselItemType;
        }

        @Nullable
        public final String getImageType() {
            return this.imageType;
        }

        @Nullable
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final int getViewPosition() {
            return this.viewPosition;
        }

        @NotNull
        public final Builder imageType(@Nullable String imageType) {
            this.imageType = imageType;
            return this;
        }

        @NotNull
        public final Builder imageUrl(@Nullable String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        @NotNull
        public final Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }

        @NotNull
        public final Builder viewPosition(int position) {
            this.viewPosition = position;
            return this;
        }
    }

    private ShortcutsItemModel(Builder builder) {
        super(builder.getViewPosition());
        Map<String, Object> metricData;
        this.title = builder.getTitle();
        this.imageUrl = builder.getImageUrl();
        this.imageType = builder.getImageType();
        Action action = builder.getAction();
        this.onClickAction = action;
        this.carouselItemId = builder.getCarouselItemId();
        this.carouselItemType = builder.getCarouselItemType();
        this.carouselItemProvider = builder.getCarouselItemProvider();
        this.modelType = SHORTCUTS_ITEM_TYPE;
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

    @Nullable
    public final String getCarouselItemId() {
        return this.carouselItemId;
    }

    @Nullable
    public final String getCarouselItemProvider() {
        return this.carouselItemProvider;
    }

    @Nullable
    public final String getCarouselItemType() {
        return this.carouselItemType;
    }

    @Nullable
    public final String getImageType() {
        return this.imageType;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
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
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ ShortcutsItemModel(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
