package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/ButtonModel;", "builder", "Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;", "<init>", "(Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;)V", "_buttonText", "", "_buttonId", "buttonText", "getButtonText", "()Ljava/lang/String;", "buttonId", "getButtonId", "modelType", "getModelType", "Companion", "Builder", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public class TextButtonModel extends ButtonModel {
    public static final int $stable = 0;

    @NotNull
    public static final String TEXT_BUTTON_TYPE = "TextButtonView";

    @Nullable
    private final String _buttonId;

    @NotNull
    private final String _buttonText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextButtonModel(@NotNull Builder builder) {
        super(builder.getViewPosition(), builder.getOnClickAction());
        builder.getClass();
        this._buttonText = builder.getButtonText();
        this._buttonId = builder.getButtonId();
    }

    @Nullable
    /* renamed from: getButtonId, reason: from getter */
    public final String get_buttonId() {
        return this._buttonId;
    }

    @NotNull
    /* renamed from: getButtonText, reason: from getter */
    public final String get_buttonText() {
        return this._buttonText;
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.ButtonModel, com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    public String getModelType() {
        return TEXT_BUTTON_TYPE;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;", "", "buttonText", "", "onClickAction", "Lcom/amazon/alexa/redesign/actions/Action;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/actions/Action;)V", "getButtonText", "()Ljava/lang/String;", "getOnClickAction", "()Lcom/amazon/alexa/redesign/actions/Action;", "value", "buttonId", "getButtonId", "", "viewPosition", "getViewPosition", "()I", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel;", "withViewPosition", "pos", "withButtonId", "id", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String buttonId;

        @NotNull
        private final String buttonText;

        @NotNull
        private final Action onClickAction;
        private int viewPosition;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        private Builder(String str, Action action) {
            this.buttonText = str;
            this.onClickAction = action;
        }

        @JvmStatic
        @NotNull
        public static final Builder create(@NotNull String str, @NotNull Action action) {
            return INSTANCE.create(str, action);
        }

        @NotNull
        public final TextButtonModel build() {
            return new TextButtonModel(this);
        }

        @Nullable
        public final String getButtonId() {
            return this.buttonId;
        }

        @NotNull
        public final String getButtonText() {
            return this.buttonText;
        }

        @NotNull
        public final Action getOnClickAction() {
            return this.onClickAction;
        }

        public final int getViewPosition() {
            return this.viewPosition;
        }

        @NotNull
        public final Builder withButtonId(@NotNull String id) {
            id.getClass();
            this.buttonId = id;
            return this;
        }

        @NotNull
        public final Builder withViewPosition(int pos) {
            this.viewPosition = pos;
            return this;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder$Companion;", "", "<init>", "()V", "create", "Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;", "buttonText", "", "action", "Lcom/amazon/alexa/redesign/actions/Action;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Builder create(@NotNull String buttonText, @NotNull Action action) {
                buttonText.getClass();
                action.getClass();
                return new Builder(buttonText, action, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Builder(String str, Action action, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, action);
        }
    }
}
