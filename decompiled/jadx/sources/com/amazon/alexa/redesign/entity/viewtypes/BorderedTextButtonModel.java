package com.amazon.alexa.redesign.entity.viewtypes;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.actions.Action;
import com.amazon.alexa.redesign.entity.viewtypes.TextButtonModel;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/BorderedTextButtonModel;", "Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel;", "builder", "Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;", "<init>", "(Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;)V", "modelType", "", "getModelType", "()Ljava/lang/String;", "Companion", "Builder", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class BorderedTextButtonModel extends TextButtonModel {
    public static final int $stable = 0;

    @NotNull
    public static final String BORDERED_TEXT_BUTTON_TYPE = "BorderedTextButtonView";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/BorderedTextButtonModel$Builder;", "", "textButtonBuilder", "Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;", "<init>", "(Lcom/amazon/alexa/redesign/entity/viewtypes/TextButtonModel$Builder;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/redesign/entity/viewtypes/BorderedTextButtonModel;", "withViewPosition", "pos", "", "withButtonId", "id", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private final TextButtonModel.Builder textButtonBuilder;

        public Builder(@NotNull TextButtonModel.Builder builder) {
            builder.getClass();
            this.textButtonBuilder = builder;
        }

        @NotNull
        public final BorderedTextButtonModel build() {
            return new BorderedTextButtonModel(this.textButtonBuilder, null);
        }

        @NotNull
        public final Builder withButtonId(@NotNull String id) {
            id.getClass();
            this.textButtonBuilder.withButtonId(id);
            return this;
        }

        @NotNull
        public final Builder withViewPosition(int pos) {
            this.textButtonBuilder.withViewPosition(pos);
            return this;
        }
    }

    public /* synthetic */ BorderedTextButtonModel(TextButtonModel.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @JvmStatic
    @NotNull
    public static final Builder create(@NotNull String str, @NotNull Action action) {
        return INSTANCE.create(str, action);
    }

    @Override // com.amazon.alexa.redesign.entity.viewtypes.TextButtonModel, com.amazon.alexa.redesign.entity.viewtypes.ButtonModel, com.amazon.alexa.redesign.entity.viewtypes.ViewTypeModel
    @NotNull
    public String getModelType() {
        return BORDERED_TEXT_BUTTON_TYPE;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/viewtypes/BorderedTextButtonModel$Companion;", "", "<init>", "()V", "BORDERED_TEXT_BUTTON_TYPE", "", "create", "Lcom/amazon/alexa/redesign/entity/viewtypes/BorderedTextButtonModel$Builder;", "buttonText", "action", "Lcom/amazon/alexa/redesign/actions/Action;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder create(@NotNull String buttonText, @NotNull Action action) {
            buttonText.getClass();
            action.getClass();
            return new Builder(TextButtonModel.Builder.INSTANCE.create(buttonText, action));
        }

        private Companion() {
        }
    }

    private BorderedTextButtonModel(TextButtonModel.Builder builder) {
        super(builder);
    }
}
