package com.amazon.alexa.ra.sdk.capability;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/ConversationMetaData;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "id", "", "assistantId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAssistantId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ConversationMetaData implements JSONConvertible {
    public static final int $stable = 0;

    @SerializedName("assistantId")
    @NotNull
    private final String assistantId;

    @SerializedName("id")
    @NotNull
    private final String id;

    public ConversationMetaData(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.assistantId = str2;
    }

    public static /* synthetic */ ConversationMetaData copy$default(ConversationMetaData conversationMetaData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationMetaData.id;
        }
        if ((i & 2) != 0) {
            str2 = conversationMetaData.assistantId;
        }
        return conversationMetaData.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAssistantId() {
        return this.assistantId;
    }

    @NotNull
    public final ConversationMetaData copy(@NotNull String id, @NotNull String assistantId) {
        id.getClass();
        assistantId.getClass();
        return new ConversationMetaData(id, assistantId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationMetaData)) {
            return false;
        }
        ConversationMetaData conversationMetaData = (ConversationMetaData) other;
        return Intrinsics.areEqual(this.id, conversationMetaData.id) && Intrinsics.areEqual(this.assistantId, conversationMetaData.assistantId);
    }

    @NotNull
    public final String getAssistantId() {
        return this.assistantId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.assistantId.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ConversationMetaData(id=", this.id, ", assistantId=", this.assistantId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
