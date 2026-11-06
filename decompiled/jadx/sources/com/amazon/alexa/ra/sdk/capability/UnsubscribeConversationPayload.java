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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/UnsubscribeConversationPayload;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class UnsubscribeConversationPayload implements JSONConvertible {
    public static final int $stable = 0;

    @SerializedName("conversationId")
    @NotNull
    private final String conversationId;

    public UnsubscribeConversationPayload(@NotNull String str) {
        str.getClass();
        this.conversationId = str;
    }

    public static /* synthetic */ UnsubscribeConversationPayload copy$default(UnsubscribeConversationPayload unsubscribeConversationPayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unsubscribeConversationPayload.conversationId;
        }
        return unsubscribeConversationPayload.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final UnsubscribeConversationPayload copy(@NotNull String conversationId) {
        conversationId.getClass();
        return new UnsubscribeConversationPayload(conversationId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnsubscribeConversationPayload) && Intrinsics.areEqual(this.conversationId, ((UnsubscribeConversationPayload) other).conversationId);
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    public int hashCode() {
        return this.conversationId.hashCode();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("UnsubscribeConversationPayload(conversationId=", this.conversationId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
