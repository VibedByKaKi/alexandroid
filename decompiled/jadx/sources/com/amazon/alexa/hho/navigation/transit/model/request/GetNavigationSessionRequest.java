package com.amazon.alexa.hho.navigation.transit.model.request;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/request/GetNavigationSessionRequest;", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "contentFilter", "Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "segmentLimit", "", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;Ljava/lang/Integer;)V", "getSessionId", "()Ljava/lang/String;", "getContentFilter", "()Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "getSegmentLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;Ljava/lang/Integer;)Lcom/amazon/alexa/hho/navigation/transit/model/request/GetNavigationSessionRequest;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetNavigationSessionRequest {

    @Nullable
    private final ContentFilter contentFilter;

    @Nullable
    private final Integer segmentLimit;

    @NotNull
    private final String sessionId;

    public /* synthetic */ GetNavigationSessionRequest(String str, ContentFilter contentFilter, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : contentFilter, (i & 4) != 0 ? null : num);
    }

    public static /* synthetic */ GetNavigationSessionRequest copy$default(GetNavigationSessionRequest getNavigationSessionRequest, String str, ContentFilter contentFilter, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getNavigationSessionRequest.sessionId;
        }
        if ((i & 2) != 0) {
            contentFilter = getNavigationSessionRequest.contentFilter;
        }
        if ((i & 4) != 0) {
            num = getNavigationSessionRequest.segmentLimit;
        }
        return getNavigationSessionRequest.copy(str, contentFilter, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ContentFilter getContentFilter() {
        return this.contentFilter;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getSegmentLimit() {
        return this.segmentLimit;
    }

    @NotNull
    public final GetNavigationSessionRequest copy(@NotNull String sessionId, @Nullable ContentFilter contentFilter, @Nullable Integer segmentLimit) {
        sessionId.getClass();
        return new GetNavigationSessionRequest(sessionId, contentFilter, segmentLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetNavigationSessionRequest)) {
            return false;
        }
        GetNavigationSessionRequest getNavigationSessionRequest = (GetNavigationSessionRequest) other;
        return Intrinsics.areEqual(this.sessionId, getNavigationSessionRequest.sessionId) && Intrinsics.areEqual(this.contentFilter, getNavigationSessionRequest.contentFilter) && Intrinsics.areEqual(this.segmentLimit, getNavigationSessionRequest.segmentLimit);
    }

    @Nullable
    public final ContentFilter getContentFilter() {
        return this.contentFilter;
    }

    @Nullable
    public final Integer getSegmentLimit() {
        return this.segmentLimit;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int hashCode = this.sessionId.hashCode() * 31;
        ContentFilter contentFilter = this.contentFilter;
        int hashCode2 = (hashCode + (contentFilter == null ? 0 : contentFilter.hashCode())) * 31;
        Integer num = this.segmentLimit;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        ContentFilter contentFilter = this.contentFilter;
        Integer num = this.segmentLimit;
        StringBuilder sb = new StringBuilder("GetNavigationSessionRequest(sessionId=");
        sb.append(str);
        sb.append(", contentFilter=");
        sb.append(contentFilter);
        sb.append(", segmentLimit=");
        return Automotive$$ExternalSyntheticOutline0.m(sb, num, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public GetNavigationSessionRequest(@NotNull String str, @Nullable ContentFilter contentFilter, @Nullable Integer num) {
        str.getClass();
        this.sessionId = str;
        this.contentFilter = contentFilter;
        this.segmentLimit = num;
    }
}
