package com.amazon.alexa.assistant.capability.conversation.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.ConversationEventExtrasBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/amazon/alexa/assistant/capability/conversation/model/ConversationEventMetadata;", "", "dialogRequestId", "", "presentationUri", "upc", "interactionLabel", ConversationEventExtrasBundleKeys.START_TIMESTAMP_IN_MILLIS, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getDialogRequestId", "()Ljava/lang/String;", "getPresentationUri", "getUpc", "getInteractionLabel", "getStartTimestampInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/amazon/alexa/assistant/capability/conversation/model/ConversationEventMetadata;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConversationEventMetadata {

    @Nullable
    private final String dialogRequestId;

    @Nullable
    private final String interactionLabel;

    @Nullable
    private final String presentationUri;

    @Nullable
    private final Long startTimestampInMillis;

    @Nullable
    private final String upc;

    public /* synthetic */ ConversationEventMetadata(String str, String str2, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l);
    }

    public static /* synthetic */ ConversationEventMetadata copy$default(ConversationEventMetadata conversationEventMetadata, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationEventMetadata.dialogRequestId;
        }
        if ((i & 2) != 0) {
            str2 = conversationEventMetadata.presentationUri;
        }
        if ((i & 4) != 0) {
            str3 = conversationEventMetadata.upc;
        }
        if ((i & 8) != 0) {
            str4 = conversationEventMetadata.interactionLabel;
        }
        if ((i & 16) != 0) {
            l = conversationEventMetadata.startTimestampInMillis;
        }
        Long l2 = l;
        String str5 = str3;
        return conversationEventMetadata.copy(str, str2, str5, str4, l2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getStartTimestampInMillis() {
        return this.startTimestampInMillis;
    }

    @NotNull
    public final ConversationEventMetadata copy(@Nullable String dialogRequestId, @Nullable String presentationUri, @Nullable String upc, @Nullable String interactionLabel, @Nullable Long startTimestampInMillis) {
        return new ConversationEventMetadata(dialogRequestId, presentationUri, upc, interactionLabel, startTimestampInMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationEventMetadata)) {
            return false;
        }
        ConversationEventMetadata conversationEventMetadata = (ConversationEventMetadata) other;
        return Intrinsics.areEqual(this.dialogRequestId, conversationEventMetadata.dialogRequestId) && Intrinsics.areEqual(this.presentationUri, conversationEventMetadata.presentationUri) && Intrinsics.areEqual(this.upc, conversationEventMetadata.upc) && Intrinsics.areEqual(this.interactionLabel, conversationEventMetadata.interactionLabel) && Intrinsics.areEqual(this.startTimestampInMillis, conversationEventMetadata.startTimestampInMillis);
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final String getInteractionLabel() {
        return this.interactionLabel;
    }

    @Nullable
    public final String getPresentationUri() {
        return this.presentationUri;
    }

    @Nullable
    public final Long getStartTimestampInMillis() {
        return this.startTimestampInMillis;
    }

    @Nullable
    public final String getUpc() {
        return this.upc;
    }

    public int hashCode() {
        String str = this.dialogRequestId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.presentationUri;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.upc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.interactionLabel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.startTimestampInMillis;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.dialogRequestId;
        String str2 = this.presentationUri;
        String str3 = this.upc;
        String str4 = this.interactionLabel;
        Long l = this.startTimestampInMillis;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ConversationEventMetadata(dialogRequestId=", str, ", presentationUri=", str2, ", upc=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", interactionLabel=", str4, ", startTimestampInMillis=");
        m.append(l);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public ConversationEventMetadata(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l) {
        this.dialogRequestId = str;
        this.presentationUri = str2;
        this.upc = str3;
        this.interactionLabel = str4;
        this.startTimestampInMillis = l;
    }

    public ConversationEventMetadata() {
        this(null, null, null, null, null, 31, null);
    }
}
