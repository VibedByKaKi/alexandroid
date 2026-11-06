package com.amazon.alexa.hho.navigation.transit.model.request;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.hho.navigation.transit.model.NavigationSessionStatus;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/request/UpdateNavigationSessionRequest;", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "status", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSessionStatus;", "contentFilter", "Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSessionStatus;Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;)V", "getSessionId", "()Ljava/lang/String;", "getStatus", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSessionStatus;", "getContentFilter", "()Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdateNavigationSessionRequest {

    @Nullable
    private final ContentFilter contentFilter;

    @NotNull
    private final String sessionId;

    @Nullable
    private final NavigationSessionStatus status;

    public /* synthetic */ UpdateNavigationSessionRequest(String str, NavigationSessionStatus navigationSessionStatus, ContentFilter contentFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : navigationSessionStatus, (i & 4) != 0 ? null : contentFilter);
    }

    public static /* synthetic */ UpdateNavigationSessionRequest copy$default(UpdateNavigationSessionRequest updateNavigationSessionRequest, String str, NavigationSessionStatus navigationSessionStatus, ContentFilter contentFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateNavigationSessionRequest.sessionId;
        }
        if ((i & 2) != 0) {
            navigationSessionStatus = updateNavigationSessionRequest.status;
        }
        if ((i & 4) != 0) {
            contentFilter = updateNavigationSessionRequest.contentFilter;
        }
        return updateNavigationSessionRequest.copy(str, navigationSessionStatus, contentFilter);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final NavigationSessionStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ContentFilter getContentFilter() {
        return this.contentFilter;
    }

    @NotNull
    public final UpdateNavigationSessionRequest copy(@NotNull String sessionId, @Nullable NavigationSessionStatus status, @Nullable ContentFilter contentFilter) {
        sessionId.getClass();
        return new UpdateNavigationSessionRequest(sessionId, status, contentFilter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateNavigationSessionRequest)) {
            return false;
        }
        UpdateNavigationSessionRequest updateNavigationSessionRequest = (UpdateNavigationSessionRequest) other;
        return Intrinsics.areEqual(this.sessionId, updateNavigationSessionRequest.sessionId) && this.status == updateNavigationSessionRequest.status && Intrinsics.areEqual(this.contentFilter, updateNavigationSessionRequest.contentFilter);
    }

    @Nullable
    public final ContentFilter getContentFilter() {
        return this.contentFilter;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final NavigationSessionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.sessionId.hashCode() * 31;
        NavigationSessionStatus navigationSessionStatus = this.status;
        int hashCode2 = (hashCode + (navigationSessionStatus == null ? 0 : navigationSessionStatus.hashCode())) * 31;
        ContentFilter contentFilter = this.contentFilter;
        return hashCode2 + (contentFilter != null ? contentFilter.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpdateNavigationSessionRequest(sessionId=" + this.sessionId + ", status=" + this.status + ", contentFilter=" + this.contentFilter + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public UpdateNavigationSessionRequest(@NotNull String str, @Nullable NavigationSessionStatus navigationSessionStatus, @Nullable ContentFilter contentFilter) {
        str.getClass();
        this.sessionId = str;
        this.status = navigationSessionStatus;
        this.contentFilter = contentFilter;
    }
}
