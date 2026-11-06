package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.UiConversationEventExtras;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/UserEventRequest;", "", "type", "", "content", "Lkotlinx/serialization/json/JsonElement;", "extras", "Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;)V", "getType", "()Ljava/lang/String;", "getContent", "()Lkotlinx/serialization/json/JsonElement;", "getExtras", "()Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserEventRequest {
    public static final int $stable = 8;

    @NotNull
    private final JsonElement content;

    @NotNull
    private final UiConversationEventExtras extras;

    @NotNull
    private final String type;

    public UserEventRequest(@NotNull String str, @NotNull JsonElement jsonElement, @NotNull UiConversationEventExtras uiConversationEventExtras) {
        str.getClass();
        jsonElement.getClass();
        uiConversationEventExtras.getClass();
        this.type = str;
        this.content = jsonElement;
        this.extras = uiConversationEventExtras;
    }

    public static /* synthetic */ UserEventRequest copy$default(UserEventRequest userEventRequest, String str, JsonElement jsonElement, UiConversationEventExtras uiConversationEventExtras, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userEventRequest.type;
        }
        if ((i & 2) != 0) {
            jsonElement = userEventRequest.content;
        }
        if ((i & 4) != 0) {
            uiConversationEventExtras = userEventRequest.extras;
        }
        return userEventRequest.copy(str, jsonElement, uiConversationEventExtras);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final JsonElement getContent() {
        return this.content;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final UiConversationEventExtras getExtras() {
        return this.extras;
    }

    @NotNull
    public final UserEventRequest copy(@NotNull String type, @NotNull JsonElement content, @NotNull UiConversationEventExtras extras) {
        type.getClass();
        content.getClass();
        extras.getClass();
        return new UserEventRequest(type, content, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEventRequest)) {
            return false;
        }
        UserEventRequest userEventRequest = (UserEventRequest) other;
        return Intrinsics.areEqual(this.type, userEventRequest.type) && Intrinsics.areEqual(this.content, userEventRequest.content) && Intrinsics.areEqual(this.extras, userEventRequest.extras);
    }

    @NotNull
    public final JsonElement getContent() {
        return this.content;
    }

    @NotNull
    public final UiConversationEventExtras getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.extras.hashCode() + ((this.content.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "UserEventRequest(type=" + this.type + ", content=" + this.content + ", extras=" + this.extras + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
