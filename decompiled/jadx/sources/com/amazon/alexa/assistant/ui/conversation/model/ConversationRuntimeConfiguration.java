package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/ConversationRuntimeConfiguration;", "", "keyboardOnLaunch", "Lcom/amazon/alexa/assistant/ui/conversation/model/KeyboardOnLaunch;", "<init>", "(Lcom/amazon/alexa/assistant/ui/conversation/model/KeyboardOnLaunch;)V", "getKeyboardOnLaunch", "()Lcom/amazon/alexa/assistant/ui/conversation/model/KeyboardOnLaunch;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ConversationRuntimeConfiguration {
    public static final int $stable = 0;

    @Nullable
    private final KeyboardOnLaunch keyboardOnLaunch;

    public /* synthetic */ ConversationRuntimeConfiguration(KeyboardOnLaunch keyboardOnLaunch, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : keyboardOnLaunch);
    }

    public static /* synthetic */ ConversationRuntimeConfiguration copy$default(ConversationRuntimeConfiguration conversationRuntimeConfiguration, KeyboardOnLaunch keyboardOnLaunch, int i, Object obj) {
        if ((i & 1) != 0) {
            keyboardOnLaunch = conversationRuntimeConfiguration.keyboardOnLaunch;
        }
        return conversationRuntimeConfiguration.copy(keyboardOnLaunch);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final KeyboardOnLaunch getKeyboardOnLaunch() {
        return this.keyboardOnLaunch;
    }

    @NotNull
    public final ConversationRuntimeConfiguration copy(@Nullable KeyboardOnLaunch keyboardOnLaunch) {
        return new ConversationRuntimeConfiguration(keyboardOnLaunch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConversationRuntimeConfiguration) && this.keyboardOnLaunch == ((ConversationRuntimeConfiguration) other).keyboardOnLaunch;
    }

    @Nullable
    public final KeyboardOnLaunch getKeyboardOnLaunch() {
        return this.keyboardOnLaunch;
    }

    public int hashCode() {
        KeyboardOnLaunch keyboardOnLaunch = this.keyboardOnLaunch;
        if (keyboardOnLaunch == null) {
            return 0;
        }
        return keyboardOnLaunch.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConversationRuntimeConfiguration(keyboardOnLaunch=" + this.keyboardOnLaunch + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ConversationRuntimeConfiguration(@Nullable KeyboardOnLaunch keyboardOnLaunch) {
        this.keyboardOnLaunch = keyboardOnLaunch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationRuntimeConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
