package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.ra.core.data.fragments.Reference;
import com.amazon.alexa.redesign.actions.Action;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\tR\u0016\u0010$\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(0'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/IconTitleSubtitleModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "builder", "Lcom/amazon/alexa/redesign/entity/viewtypes/IconTitleSubtitleModel$Builder;", "<init>", "(Lcom/amazon/alexa/redesign/entity/viewtypes/IconTitleSubtitleModel$Builder;)V", Reference.ICON_URL, "", "getIconUrl", "()Ljava/lang/String;", "title", "getTitle", SmartPlayConstants.SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE, "getSubtitle", "onClickAction", "Lcom/amazon/alexa/redesign/actions/Action;", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "imageType", "getImageType", "tint", "getTint", "imageTheme", "getImageTheme", "setImageTheme", "(Ljava/lang/String;)V", "bold", "", "getBold", "()Z", "setBold", "(Z)V", "italicized", "getItalicized", "modelType", "getModelType", "action", "getAction", "actionMetricsData", "", "", "getActionMetricsData", "()Ljava/util/Map;", "Companion", "Builder", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public class IconTitleSubtitleModel extends ViewTypeModel {

    @NotNull
    public static final String ICON_TITLE_SUBTITLE_TYPE = "IconTitleSubtitleView";

    @NotNull
    public static final String ICON_TITLE_TYPE = "IconTitleView";

    @Nullable
    private final Action action;

    @NotNull
    private final Map<String, Object> actionMetricsData;
    private boolean bold;

    @NotNull
    private final String iconUrl;

    @NotNull
    private String imageTheme;

    @NotNull
    private final String imageType;
    private final boolean italicized;

    @NotNull
    private final String modelType;

    @Nullable
    private final Action onClickAction;

    @Nullable
    private final String subtitle;

    @NotNull
    private final String tint;

    @NotNull
    private final String title;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\rJ\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010$\u001a\u00020%R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u001e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u001e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\b¨\u0006&"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/IconTitleSubtitleModel$Builder;", "", "<init>", "()V", "value", "", Reference.ICON_URL, "getIconUrl", "()Ljava/lang/String;", "title", "getTitle", SmartPlayConstants.SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE, "getSubtitle", "", "viewPosition", "getViewPosition", "()I", "Lcom/amazon/alexa/redesign/actions/Action;", "onClickAction", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "", "italicized", "getItalicized", "()Z", "bold", "getBold", "imageType", "getImageType", "tint", "getTint", "imageTheme", "getImageTheme", "action", "position", "url", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/redesign/entity/viewtypes/IconTitleSubtitleModel;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIconTitleSubtitleModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconTitleSubtitleModel.kt\ncom/amazon/alexa/redesign/entity/viewtypes/IconTitleSubtitleModel$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;
        private boolean bold;
        private boolean italicized;

        @Nullable
        private Action onClickAction;

        @Nullable
        private String subtitle;
        private int viewPosition;

        @NotNull
        private String iconUrl = "";

        @NotNull
        private String title = "";

        @NotNull
        private String imageType = "";

        @NotNull
        private String tint = "";

        @NotNull
        private String imageTheme = "";

        @NotNull
        public final Builder action(@Nullable Action action) {
            this.onClickAction = action;
            return this;
        }

        @NotNull
        public final Builder bold(boolean bold) {
            this.bold = bold;
            return this;
        }

        @NotNull
        public final IconTitleSubtitleModel build() {
            return new IconTitleSubtitleModel(this);
        }

        public final boolean getBold() {
            return this.bold;
        }

        @NotNull
        public final String getIconUrl() {
            return this.iconUrl;
        }

        @NotNull
        public final String getImageTheme() {
            return this.imageTheme;
        }

        @NotNull
        public final String getImageType() {
            return this.imageType;
        }

        public final boolean getItalicized() {
            return this.italicized;
        }

        @Nullable
        public final Action getOnClickAction() {
            return this.onClickAction;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTint() {
            return this.tint;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final int getViewPosition() {
            return this.viewPosition;
        }

        @NotNull
        public final Builder iconUrl(@NotNull String url) {
            url.getClass();
            this.iconUrl = url;
            return this;
        }

        @NotNull
        public final Builder imageTheme(@NotNull String imageTheme) {
            imageTheme.getClass();
            this.imageTheme = imageTheme;
            return this;
        }

        @NotNull
        public final Builder imageType(@NotNull String imageType) {
            imageType.getClass();
            this.imageType = imageType;
            return this;
        }

        @NotNull
        public final Builder italicized(boolean italicized) {
            this.italicized = italicized;
            return this;
        }

        @NotNull
        public final Builder subtitle(@Nullable String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        @NotNull
        public final Builder tint(@NotNull String tint) {
            tint.getClass();
            this.tint = tint;
            return this;
        }

        @NotNull
        public final Builder title(@NotNull String title) {
            title.getClass();
            this.title = title;
            return this;
        }

        @NotNull
        public final Builder viewPosition(int position) {
            this.viewPosition = position;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconTitleSubtitleModel(@NotNull Builder builder) {
        super(builder.getViewPosition());
        Map<String, Object> metricData;
        builder.getClass();
        this.iconUrl = builder.getIconUrl();
        this.title = builder.getTitle();
        this.subtitle = builder.getSubtitle();
        Action onClickAction = builder.getOnClickAction();
        this.onClickAction = onClickAction;
        this.imageType = builder.getImageType();
        this.tint = builder.getTint();
        this.imageTheme = builder.getImageTheme();
        this.bold = builder.getBold();
        this.italicized = builder.getItalicized();
        this.modelType = ICON_TITLE_SUBTITLE_TYPE;
        this.action = onClickAction;
        this.actionMetricsData = (onClickAction == null || (metricData = onClickAction.getMetricData()) == null) ? MapsKt.emptyMap() : metricData;
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

    public final boolean getBold() {
        return this.bold;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getImageTheme() {
        return this.imageTheme;
    }

    @NotNull
    public final String getImageType() {
        return this.imageType;
    }

    public final boolean getItalicized() {
        return this.italicized;
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTint() {
        return this.tint;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setBold(boolean z) {
        this.bold = z;
    }

    public final void setImageTheme(@NotNull String str) {
        str.getClass();
        this.imageTheme = str;
    }
}
