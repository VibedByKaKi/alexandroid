package com.amazon.alexa.assistant.ui.conversation.feedback.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.feedback.client.FeedbackClientKt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/feedback/model/FeedbackInfo;", "", "fragmentId", "", "conversationId", "contentType", "feedbackText", FeedbackClientKt.EXTRA_INQUIRY_L1, "Lcom/amazon/alexa/assistant/ui/conversation/feedback/model/ExperienceFeedbackInquiry;", FeedbackClientKt.EXTRA_INQUIRY_L2, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/assistant/ui/conversation/feedback/model/ExperienceFeedbackInquiry;Lcom/amazon/alexa/assistant/ui/conversation/feedback/model/ExperienceFeedbackInquiry;)V", "getFragmentId", "()Ljava/lang/String;", "getConversationId", "getContentType", "getFeedbackText", "getInquiry1", "()Lcom/amazon/alexa/assistant/ui/conversation/feedback/model/ExperienceFeedbackInquiry;", "getInquiry2", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FeedbackInfo {
    public static final int $stable = 8;

    @NotNull
    private final String contentType;

    @NotNull
    private final String conversationId;

    @NotNull
    private final String feedbackText;

    @NotNull
    private final String fragmentId;

    @NotNull
    private final ExperienceFeedbackInquiry inquiry1;

    @Nullable
    private final ExperienceFeedbackInquiry inquiry2;

    public FeedbackInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ExperienceFeedbackInquiry experienceFeedbackInquiry, @Nullable ExperienceFeedbackInquiry experienceFeedbackInquiry2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        experienceFeedbackInquiry.getClass();
        this.fragmentId = str;
        this.conversationId = str2;
        this.contentType = str3;
        this.feedbackText = str4;
        this.inquiry1 = experienceFeedbackInquiry;
        this.inquiry2 = experienceFeedbackInquiry2;
    }

    public static /* synthetic */ FeedbackInfo copy$default(FeedbackInfo feedbackInfo, String str, String str2, String str3, String str4, ExperienceFeedbackInquiry experienceFeedbackInquiry, ExperienceFeedbackInquiry experienceFeedbackInquiry2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackInfo.fragmentId;
        }
        if ((i & 2) != 0) {
            str2 = feedbackInfo.conversationId;
        }
        if ((i & 4) != 0) {
            str3 = feedbackInfo.contentType;
        }
        if ((i & 8) != 0) {
            str4 = feedbackInfo.feedbackText;
        }
        if ((i & 16) != 0) {
            experienceFeedbackInquiry = feedbackInfo.inquiry1;
        }
        if ((i & 32) != 0) {
            experienceFeedbackInquiry2 = feedbackInfo.inquiry2;
        }
        ExperienceFeedbackInquiry experienceFeedbackInquiry3 = experienceFeedbackInquiry;
        ExperienceFeedbackInquiry experienceFeedbackInquiry4 = experienceFeedbackInquiry2;
        return feedbackInfo.copy(str, str2, str3, str4, experienceFeedbackInquiry3, experienceFeedbackInquiry4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFragmentId() {
        return this.fragmentId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getFeedbackText() {
        return this.feedbackText;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ExperienceFeedbackInquiry getInquiry1() {
        return this.inquiry1;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ExperienceFeedbackInquiry getInquiry2() {
        return this.inquiry2;
    }

    @NotNull
    public final FeedbackInfo copy(@NotNull String fragmentId, @NotNull String conversationId, @NotNull String contentType, @NotNull String feedbackText, @NotNull ExperienceFeedbackInquiry inquiry1, @Nullable ExperienceFeedbackInquiry inquiry2) {
        fragmentId.getClass();
        conversationId.getClass();
        contentType.getClass();
        feedbackText.getClass();
        inquiry1.getClass();
        return new FeedbackInfo(fragmentId, conversationId, contentType, feedbackText, inquiry1, inquiry2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackInfo)) {
            return false;
        }
        FeedbackInfo feedbackInfo = (FeedbackInfo) other;
        return Intrinsics.areEqual(this.fragmentId, feedbackInfo.fragmentId) && Intrinsics.areEqual(this.conversationId, feedbackInfo.conversationId) && Intrinsics.areEqual(this.contentType, feedbackInfo.contentType) && Intrinsics.areEqual(this.feedbackText, feedbackInfo.feedbackText) && Intrinsics.areEqual(this.inquiry1, feedbackInfo.inquiry1) && Intrinsics.areEqual(this.inquiry2, feedbackInfo.inquiry2);
    }

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final String getFeedbackText() {
        return this.feedbackText;
    }

    @NotNull
    public final String getFragmentId() {
        return this.fragmentId;
    }

    @NotNull
    public final ExperienceFeedbackInquiry getInquiry1() {
        return this.inquiry1;
    }

    @Nullable
    public final ExperienceFeedbackInquiry getInquiry2() {
        return this.inquiry2;
    }

    public int hashCode() {
        int hashCode = (this.inquiry1.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.fragmentId.hashCode() * 31, 31, this.conversationId), 31, this.contentType), 31, this.feedbackText)) * 31;
        ExperienceFeedbackInquiry experienceFeedbackInquiry = this.inquiry2;
        return hashCode + (experienceFeedbackInquiry == null ? 0 : experienceFeedbackInquiry.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.fragmentId;
        String str2 = this.conversationId;
        String str3 = this.contentType;
        String str4 = this.feedbackText;
        ExperienceFeedbackInquiry experienceFeedbackInquiry = this.inquiry1;
        ExperienceFeedbackInquiry experienceFeedbackInquiry2 = this.inquiry2;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("FeedbackInfo(fragmentId=", str, ", conversationId=", str2, ", contentType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", feedbackText=", str4, ", inquiry1=");
        m.append(experienceFeedbackInquiry);
        m.append(", inquiry2=");
        m.append(experienceFeedbackInquiry2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public /* synthetic */ FeedbackInfo(String str, String str2, String str3, String str4, ExperienceFeedbackInquiry experienceFeedbackInquiry, ExperienceFeedbackInquiry experienceFeedbackInquiry2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, experienceFeedbackInquiry, (i & 32) != 0 ? null : experienceFeedbackInquiry2);
    }
}
