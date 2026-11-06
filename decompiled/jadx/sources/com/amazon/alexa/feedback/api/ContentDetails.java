package com.amazon.alexa.feedback.api;

import androidx.annotation.Keep;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/feedback/api/ContentDetails;", "", "contentId", "", "contentType", "Lcom/amazon/alexa/feedback/api/ContentType;", Constants.SubmitFeedbackContentDetails.REQUEST_SLOT_ID, "(Ljava/lang/String;Lcom/amazon/alexa/feedback/api/ContentType;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "setContentId", "(Ljava/lang/String;)V", "getContentType", "()Lcom/amazon/alexa/feedback/api/ContentType;", "setContentType", "(Lcom/amazon/alexa/feedback/api/ContentType;)V", "getSlotId", "setSlotId", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContentDetails {

    @SerializedName("contentId")
    @NotNull
    private String contentId;

    @SerializedName("contentType")
    @NotNull
    private ContentType contentType;

    @SerializedName(Constants.SubmitFeedbackContentDetails.REQUEST_SLOT_ID)
    @NotNull
    private String slotId;

    public ContentDetails(@NotNull String str, @NotNull ContentType contentType, @NotNull String str2) {
        str.getClass();
        contentType.getClass();
        str2.getClass();
        this.contentId = str;
        this.contentType = contentType;
        this.slotId = str2;
    }

    public static /* synthetic */ ContentDetails copy$default(ContentDetails contentDetails, String str, ContentType contentType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentDetails.contentId;
        }
        if ((i & 2) != 0) {
            contentType = contentDetails.contentType;
        }
        if ((i & 4) != 0) {
            str2 = contentDetails.slotId;
        }
        return contentDetails.copy(str, contentType, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ContentType getContentType() {
        return this.contentType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSlotId() {
        return this.slotId;
    }

    @NotNull
    public final ContentDetails copy(@NotNull String contentId, @NotNull ContentType contentType, @NotNull String slotId) {
        contentId.getClass();
        contentType.getClass();
        slotId.getClass();
        return new ContentDetails(contentId, contentType, slotId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentDetails)) {
            return false;
        }
        ContentDetails contentDetails = (ContentDetails) other;
        return Intrinsics.areEqual(this.contentId, contentDetails.contentId) && this.contentType == contentDetails.contentType && Intrinsics.areEqual(this.slotId, contentDetails.slotId);
    }

    @NotNull
    public final String getContentId() {
        return this.contentId;
    }

    @NotNull
    public final ContentType getContentType() {
        return this.contentType;
    }

    @NotNull
    public final String getSlotId() {
        return this.slotId;
    }

    public int hashCode() {
        return this.slotId.hashCode() + ((this.contentType.hashCode() + (this.contentId.hashCode() * 31)) * 31);
    }

    public final void setContentId(@NotNull String str) {
        str.getClass();
        this.contentId = str;
    }

    public final void setContentType(@NotNull ContentType contentType) {
        contentType.getClass();
        this.contentType = contentType;
    }

    public final void setSlotId(@NotNull String str) {
        str.getClass();
        this.slotId = str;
    }

    @NotNull
    public String toString() {
        String str = this.contentId;
        ContentType contentType = this.contentType;
        String str2 = this.slotId;
        StringBuilder sb = new StringBuilder("ContentDetails(contentId=");
        sb.append(str);
        sb.append(", contentType=");
        sb.append(contentType);
        sb.append(", slotId=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
