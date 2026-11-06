package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/OpenDeepLinkDomain;", "Lcom/amazon/alexa/redesign/entity/agentforward/network/ContentActionDomain;", PayloadUtils.PayloadKeys.DEEPLINK_URL, "", "fallback", "Lcom/amazon/alexa/redesign/entity/agentforward/network/DeepLinkFallbackDomain;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/network/DeepLinkFallbackDomain;)V", "getDeepLinkUrl", "()Ljava/lang/String;", "getFallback", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/DeepLinkFallbackDomain;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class OpenDeepLinkDomain implements ContentActionDomain {
    public static final int $stable = 0;

    @Nullable
    private final String deepLinkUrl;

    @Nullable
    private final DeepLinkFallbackDomain fallback;

    public /* synthetic */ OpenDeepLinkDomain(String str, DeepLinkFallbackDomain deepLinkFallbackDomain, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : deepLinkFallbackDomain);
    }

    public static /* synthetic */ OpenDeepLinkDomain copy$default(OpenDeepLinkDomain openDeepLinkDomain, String str, DeepLinkFallbackDomain deepLinkFallbackDomain, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openDeepLinkDomain.deepLinkUrl;
        }
        if ((i & 2) != 0) {
            deepLinkFallbackDomain = openDeepLinkDomain.fallback;
        }
        return openDeepLinkDomain.copy(str, deepLinkFallbackDomain);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DeepLinkFallbackDomain getFallback() {
        return this.fallback;
    }

    @NotNull
    public final OpenDeepLinkDomain copy(@Nullable String deepLinkUrl, @Nullable DeepLinkFallbackDomain fallback) {
        return new OpenDeepLinkDomain(deepLinkUrl, fallback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenDeepLinkDomain)) {
            return false;
        }
        OpenDeepLinkDomain openDeepLinkDomain = (OpenDeepLinkDomain) other;
        return Intrinsics.areEqual(this.deepLinkUrl, openDeepLinkDomain.deepLinkUrl) && Intrinsics.areEqual(this.fallback, openDeepLinkDomain.fallback);
    }

    @Nullable
    public final String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    @Nullable
    public final DeepLinkFallbackDomain getFallback() {
        return this.fallback;
    }

    public int hashCode() {
        String str = this.deepLinkUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLinkFallbackDomain deepLinkFallbackDomain = this.fallback;
        return hashCode + (deepLinkFallbackDomain != null ? deepLinkFallbackDomain.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenDeepLinkDomain(deepLinkUrl=" + this.deepLinkUrl + ", fallback=" + this.fallback + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public OpenDeepLinkDomain(@Nullable String str, @Nullable DeepLinkFallbackDomain deepLinkFallbackDomain) {
        this.deepLinkUrl = str;
        this.fallback = deepLinkFallbackDomain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenDeepLinkDomain() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
