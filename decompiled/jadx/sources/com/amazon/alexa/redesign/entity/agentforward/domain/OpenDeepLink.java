package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/OpenDeepLink;", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", PayloadUtils.PayloadKeys.DEEPLINK_URL, "", "fallback", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/DeepLinkFallback;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/domain/DeepLinkFallback;)V", "getDeepLinkUrl", "()Ljava/lang/String;", "setDeepLinkUrl", "(Ljava/lang/String;)V", "getFallback", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/DeepLinkFallback;", "setFallback", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/DeepLinkFallback;)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class OpenDeepLink implements ContentAction {
    public static final int $stable = 8;

    @Nullable
    private String deepLinkUrl;

    @Nullable
    private DeepLinkFallback fallback;

    public /* synthetic */ OpenDeepLink(String str, DeepLinkFallback deepLinkFallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : deepLinkFallback);
    }

    public static /* synthetic */ OpenDeepLink copy$default(OpenDeepLink openDeepLink, String str, DeepLinkFallback deepLinkFallback, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openDeepLink.deepLinkUrl;
        }
        if ((i & 2) != 0) {
            deepLinkFallback = openDeepLink.fallback;
        }
        return openDeepLink.copy(str, deepLinkFallback);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DeepLinkFallback getFallback() {
        return this.fallback;
    }

    @NotNull
    public final OpenDeepLink copy(@JsonProperty("deepLinkUrl") @Nullable String deepLinkUrl, @JsonProperty("fallback") @Nullable DeepLinkFallback fallback) {
        return new OpenDeepLink(deepLinkUrl, fallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenDeepLink)) {
            return false;
        }
        OpenDeepLink openDeepLink = (OpenDeepLink) other;
        return Intrinsics.areEqual(this.deepLinkUrl, openDeepLink.deepLinkUrl) && Intrinsics.areEqual(this.fallback, openDeepLink.fallback);
    }

    @Nullable
    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    @Nullable
    public final DeepLinkFallback getFallback() {
        return this.fallback;
    }

    public int hashCode() {
        String str = this.deepLinkUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLinkFallback deepLinkFallback = this.fallback;
        return hashCode + (deepLinkFallback != null ? deepLinkFallback.hashCode() : 0);
    }

    public final void setDeepLinkUrl(@Nullable String str) {
        this.deepLinkUrl = str;
    }

    public final void setFallback(@Nullable DeepLinkFallback deepLinkFallback) {
        this.fallback = deepLinkFallback;
    }

    @NotNull
    public String toString() {
        return "OpenDeepLink(deepLinkUrl=" + this.deepLinkUrl + ", fallback=" + this.fallback + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public OpenDeepLink(@JsonProperty("deepLinkUrl") @Nullable String str, @JsonProperty("fallback") @Nullable DeepLinkFallback deepLinkFallback) {
        this.deepLinkUrl = str;
        this.fallback = deepLinkFallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public OpenDeepLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
