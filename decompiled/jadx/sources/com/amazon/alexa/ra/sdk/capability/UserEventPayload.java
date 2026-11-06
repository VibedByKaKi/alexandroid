package com.amazon.alexa.ra.sdk.capability;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/UserEventPayload;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "type", "", "content", "Lcom/google/gson/JsonObject;", "<init>", "(Ljava/lang/String;Lcom/google/gson/JsonObject;)V", "getType", "()Ljava/lang/String;", "getContent", "()Lcom/google/gson/JsonObject;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class UserEventPayload implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName("content")
    @NotNull
    private final JsonObject content;

    @SerializedName("type")
    @NotNull
    private final String type;

    public UserEventPayload(@NotNull String str, @NotNull JsonObject jsonObject) {
        str.getClass();
        jsonObject.getClass();
        this.type = str;
        this.content = jsonObject;
    }

    public static /* synthetic */ UserEventPayload copy$default(UserEventPayload userEventPayload, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userEventPayload.type;
        }
        if ((i & 2) != 0) {
            jsonObject = userEventPayload.content;
        }
        return userEventPayload.copy(str, jsonObject);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final JsonObject getContent() {
        return this.content;
    }

    @NotNull
    public final UserEventPayload copy(@NotNull String type, @NotNull JsonObject content) {
        type.getClass();
        content.getClass();
        return new UserEventPayload(type, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEventPayload)) {
            return false;
        }
        UserEventPayload userEventPayload = (UserEventPayload) other;
        return Intrinsics.areEqual(this.type, userEventPayload.type) && Intrinsics.areEqual(this.content, userEventPayload.content);
    }

    @NotNull
    public final JsonObject getContent() {
        return this.content;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UserEventPayload(type=" + this.type + ", content=" + this.content + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
