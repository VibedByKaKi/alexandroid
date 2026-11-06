package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.UiConversationEventExtras;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/InvokeOperationRequest;", "", "invocation", "Lcom/amazon/alexa/ra/core/data/model/InvokeData;", "text", "", "extras", "Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/InvokeData;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;)V", "getInvocation", "()Lcom/amazon/alexa/ra/core/data/model/InvokeData;", "getText", "()Ljava/lang/String;", "getExtras", "()Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InvokeOperationRequest {
    public static final int $stable = UiConversationEventExtras.$stable | com.amazon.alexa.ra.core.data.model.InvokeData.$stable;

    @NotNull
    private final UiConversationEventExtras extras;

    @NotNull
    private final com.amazon.alexa.ra.core.data.model.InvokeData invocation;

    @Nullable
    private final String text;

    public InvokeOperationRequest(@NotNull com.amazon.alexa.ra.core.data.model.InvokeData invokeData, @Nullable String str, @NotNull UiConversationEventExtras uiConversationEventExtras) {
        invokeData.getClass();
        uiConversationEventExtras.getClass();
        this.invocation = invokeData;
        this.text = str;
        this.extras = uiConversationEventExtras;
    }

    public static /* synthetic */ InvokeOperationRequest copy$default(InvokeOperationRequest invokeOperationRequest, com.amazon.alexa.ra.core.data.model.InvokeData invokeData, String str, UiConversationEventExtras uiConversationEventExtras, int i, Object obj) {
        if ((i & 1) != 0) {
            invokeData = invokeOperationRequest.invocation;
        }
        if ((i & 2) != 0) {
            str = invokeOperationRequest.text;
        }
        if ((i & 4) != 0) {
            uiConversationEventExtras = invokeOperationRequest.extras;
        }
        return invokeOperationRequest.copy(invokeData, str, uiConversationEventExtras);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final com.amazon.alexa.ra.core.data.model.InvokeData getInvocation() {
        return this.invocation;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final UiConversationEventExtras getExtras() {
        return this.extras;
    }

    @NotNull
    public final InvokeOperationRequest copy(@NotNull com.amazon.alexa.ra.core.data.model.InvokeData invocation, @Nullable String text, @NotNull UiConversationEventExtras extras) {
        invocation.getClass();
        extras.getClass();
        return new InvokeOperationRequest(invocation, text, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvokeOperationRequest)) {
            return false;
        }
        InvokeOperationRequest invokeOperationRequest = (InvokeOperationRequest) other;
        return Intrinsics.areEqual(this.invocation, invokeOperationRequest.invocation) && Intrinsics.areEqual(this.text, invokeOperationRequest.text) && Intrinsics.areEqual(this.extras, invokeOperationRequest.extras);
    }

    @NotNull
    public final UiConversationEventExtras getExtras() {
        return this.extras;
    }

    @NotNull
    public final com.amazon.alexa.ra.core.data.model.InvokeData getInvocation() {
        return this.invocation;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.invocation.hashCode() * 31;
        String str = this.text;
        return this.extras.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "InvokeOperationRequest(invocation=" + this.invocation + ", text=" + this.text + ", extras=" + this.extras + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
