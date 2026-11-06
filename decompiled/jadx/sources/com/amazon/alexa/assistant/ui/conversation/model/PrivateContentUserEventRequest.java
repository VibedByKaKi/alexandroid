package com.amazon.alexa.assistant.ui.conversation.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/model/PrivateContentUserEventRequest;", "", "type", "", "content", "Lkotlinx/serialization/json/JsonElement;", "presentationUri", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getContent", "()Lkotlinx/serialization/json/JsonElement;", "getPresentationUri", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PrivateContentUserEventRequest {
    public static final int $stable = 8;

    @NotNull
    private final JsonElement content;

    @NotNull
    private final String presentationUri;

    @NotNull
    private final String type;

    public PrivateContentUserEventRequest(@NotNull String str, @NotNull JsonElement jsonElement, @NotNull String str2) {
        str.getClass();
        jsonElement.getClass();
        str2.getClass();
        this.type = str;
        this.content = jsonElement;
        this.presentationUri = str2;
    }

    public static /* synthetic */ PrivateContentUserEventRequest copy$default(PrivateContentUserEventRequest privateContentUserEventRequest, String str, JsonElement jsonElement, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privateContentUserEventRequest.type;
        }
        if ((i & 2) != 0) {
            jsonElement = privateContentUserEventRequest.content;
        }
        if ((i & 4) != 0) {
            str2 = privateContentUserEventRequest.presentationUri;
        }
        return privateContentUserEventRequest.copy(str, jsonElement, str2);
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
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @NotNull
    public final PrivateContentUserEventRequest copy(@NotNull String type, @NotNull JsonElement content, @NotNull String presentationUri) {
        type.getClass();
        content.getClass();
        presentationUri.getClass();
        return new PrivateContentUserEventRequest(type, content, presentationUri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateContentUserEventRequest)) {
            return false;
        }
        PrivateContentUserEventRequest privateContentUserEventRequest = (PrivateContentUserEventRequest) other;
        return Intrinsics.areEqual(this.type, privateContentUserEventRequest.type) && Intrinsics.areEqual(this.content, privateContentUserEventRequest.content) && Intrinsics.areEqual(this.presentationUri, privateContentUserEventRequest.presentationUri);
    }

    @NotNull
    public final JsonElement getContent() {
        return this.content;
    }

    @NotNull
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.presentationUri.hashCode() + ((this.content.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        JsonElement jsonElement = this.content;
        String str2 = this.presentationUri;
        StringBuilder sb = new StringBuilder("PrivateContentUserEventRequest(type=");
        sb.append(str);
        sb.append(", content=");
        sb.append(jsonElement);
        sb.append(", presentationUri=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
