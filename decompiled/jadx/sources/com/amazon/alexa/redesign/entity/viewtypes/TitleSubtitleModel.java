package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayConstants;
import com.amazon.alexa.redesign.actions.Action;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/TitleSubtitleModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ViewTypeModel;", "builder", "Lcom/amazon/alexa/redesign/entity/viewtypes/TitleSubtitleModel$Builder;", "<init>", "(Lcom/amazon/alexa/redesign/entity/viewtypes/TitleSubtitleModel$Builder;)V", "_title", "", "_subtitle", "_action", "Lcom/amazon/alexa/redesign/actions/Action;", "_titleColor", "_subtitleColor", "_subtitleBold", "", "title", "getTitle", "()Ljava/lang/String;", SmartPlayConstants.SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE, "getSubtitle", "titleColor", "getTitleColor", "subtitleColor", "getSubtitleColor", "subtitleBold", "getSubtitleBold", "()Z", "modelType", "getModelType", "action", "getAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "actionMetricsData", "", "", "getActionMetricsData", "()Ljava/util/Map;", "Companion", "Builder", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TitleSubtitleModel extends ViewTypeModel {

    @NotNull
    public static final String TITLE_SUBTITLE_TYPE = "TitleSubtitleView";

    @NotNull
    private final Action _action;

    @NotNull
    private final String _subtitle;
    private final boolean _subtitleBold;

    @NotNull
    private final String _subtitleColor;

    @NotNull
    private final String _title;

    @NotNull
    private final String _titleColor;
    public static final int $stable = 8;

    private TitleSubtitleModel(Builder builder) {
        super(builder.getViewPosition());
        this._title = builder.getTitle();
        this._subtitle = builder.getSubtitle();
        this._action = builder.getOnClickAction();
        this._titleColor = builder.getTitleColor();
        this._subtitleColor = builder.getSubtitleColor();
        this._subtitleBold = builder.getSubtitleBold();
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
        return TITLE_SUBTITLE_TYPE;
    }

    @NotNull
    /* renamed from: getSubtitle, reason: from getter */
    public final String get_subtitle() {
        return this._subtitle;
    }

    /* renamed from: getSubtitleBold, reason: from getter */
    public final boolean get_subtitleBold() {
        return this._subtitleBold;
    }

    @NotNull
    /* renamed from: getSubtitleColor, reason: from getter */
    public final String get_subtitleColor() {
        return this._subtitleColor;
    }

    @NotNull
    /* renamed from: getTitle, reason: from getter */
    public final String get_title() {
        return this._title;
    }

    @NotNull
    /* renamed from: getTitleColor, reason: from getter */
    public final String get_titleColor() {
        return this._titleColor;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/TitleSubtitleModel$Builder;", "", "title", "", SmartPlayConstants.SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE, "onClickAction", "Lcom/amazon/alexa/redesign/actions/Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/redesign/actions/Action;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "value", "titleColor", "getTitleColor", "subtitleColor", "getSubtitleColor", "", "subtitleBold", "getSubtitleBold", "()Z", "", "viewPosition", "getViewPosition", "()I", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/redesign/entity/viewtypes/TitleSubtitleModel;", "withViewPosition", "pos", "withTitleColor", "color", "withSubtitleColor", "withSubtitleBold", "bold", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private static final String DEFAULT_SUBTITLE_COLOR = "#666666";

        @NotNull
        private static final String DEFAULT_TITLE_COLOR = "#000000";

        @NotNull
        private final Action onClickAction;

        @NotNull
        private final String subtitle;
        private boolean subtitleBold;

        @NotNull
        private String subtitleColor;

        @NotNull
        private final String title;

        @NotNull
        private String titleColor;
        private int viewPosition;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        private Builder(String str, String str2, Action action) {
            this.title = str;
            this.subtitle = str2;
            this.onClickAction = action;
            this.titleColor = DEFAULT_TITLE_COLOR;
            this.subtitleColor = DEFAULT_SUBTITLE_COLOR;
        }

        @JvmStatic
        @NotNull
        public static final Builder create(@NotNull String str, @NotNull String str2, @NotNull Action action) {
            return INSTANCE.create(str, str2, action);
        }

        @NotNull
        public final TitleSubtitleModel build() {
            return new TitleSubtitleModel(this, null);
        }

        @NotNull
        public final Action getOnClickAction() {
            return this.onClickAction;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean getSubtitleBold() {
            return this.subtitleBold;
        }

        @NotNull
        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTitleColor() {
            return this.titleColor;
        }

        public final int getViewPosition() {
            return this.viewPosition;
        }

        @NotNull
        public final Builder withSubtitleBold(boolean bold) {
            this.subtitleBold = bold;
            return this;
        }

        @NotNull
        public final Builder withSubtitleColor(@NotNull String color) {
            color.getClass();
            this.subtitleColor = color;
            return this;
        }

        @NotNull
        public final Builder withTitleColor(@NotNull String color) {
            color.getClass();
            this.titleColor = color;
            return this;
        }

        @NotNull
        public final Builder withViewPosition(int pos) {
            this.viewPosition = pos;
            return this;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/TitleSubtitleModel$Builder$Companion;", "", "<init>", "()V", "DEFAULT_TITLE_COLOR", "", "DEFAULT_SUBTITLE_COLOR", "create", "Lcom/amazon/alexa/redesign/entity/viewtypes/TitleSubtitleModel$Builder;", "title", SmartPlayConstants.SMART_PLAY_MEDIA_JSON_FIELD_SUBTITLE, "action", "Lcom/amazon/alexa/redesign/actions/Action;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Builder create(@NotNull String title, @NotNull String subtitle, @NotNull Action action) {
                title.getClass();
                subtitle.getClass();
                action.getClass();
                return new Builder(title, subtitle, action, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(String str, String str2, Action action, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, action);
        }
    }

    public /* synthetic */ TitleSubtitleModel(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
