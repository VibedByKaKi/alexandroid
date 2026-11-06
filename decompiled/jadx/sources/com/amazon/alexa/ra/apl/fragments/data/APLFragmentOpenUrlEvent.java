package com.amazon.alexa.ra.apl.fragments.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mosaic.apl.interfaces.UrlEventCallback;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentOpenUrlEvent;", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentEvent;", "url", "", "openUrlCallbackResult", "Lcom/amazon/alexa/mosaic/apl/interfaces/UrlEventCallback;", "flags", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/mosaic/apl/interfaces/UrlEventCallback;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getOpenUrlCallbackResult", "()Lcom/amazon/alexa/mosaic/apl/interfaces/UrlEventCallback;", "getFlags", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class APLFragmentOpenUrlEvent implements APLFragmentEvent {
    public static final int $stable = 8;

    @Nullable
    private final String flags;

    @NotNull
    private final UrlEventCallback openUrlCallbackResult;

    @NotNull
    private final String url;

    public APLFragmentOpenUrlEvent(@NotNull String str, @NotNull UrlEventCallback urlEventCallback, @Nullable String str2) {
        str.getClass();
        urlEventCallback.getClass();
        this.url = str;
        this.openUrlCallbackResult = urlEventCallback;
        this.flags = str2;
    }

    public static /* synthetic */ APLFragmentOpenUrlEvent copy$default(APLFragmentOpenUrlEvent aPLFragmentOpenUrlEvent, String str, UrlEventCallback urlEventCallback, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPLFragmentOpenUrlEvent.url;
        }
        if ((i & 2) != 0) {
            urlEventCallback = aPLFragmentOpenUrlEvent.openUrlCallbackResult;
        }
        if ((i & 4) != 0) {
            str2 = aPLFragmentOpenUrlEvent.flags;
        }
        return aPLFragmentOpenUrlEvent.copy(str, urlEventCallback, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final UrlEventCallback getOpenUrlCallbackResult() {
        return this.openUrlCallbackResult;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFlags() {
        return this.flags;
    }

    @NotNull
    public final APLFragmentOpenUrlEvent copy(@NotNull String url, @NotNull UrlEventCallback openUrlCallbackResult, @Nullable String flags) {
        url.getClass();
        openUrlCallbackResult.getClass();
        return new APLFragmentOpenUrlEvent(url, openUrlCallbackResult, flags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APLFragmentOpenUrlEvent)) {
            return false;
        }
        APLFragmentOpenUrlEvent aPLFragmentOpenUrlEvent = (APLFragmentOpenUrlEvent) other;
        return Intrinsics.areEqual(this.url, aPLFragmentOpenUrlEvent.url) && Intrinsics.areEqual(this.openUrlCallbackResult, aPLFragmentOpenUrlEvent.openUrlCallbackResult) && Intrinsics.areEqual(this.flags, aPLFragmentOpenUrlEvent.flags);
    }

    @Nullable
    public final String getFlags() {
        return this.flags;
    }

    @NotNull
    public final UrlEventCallback getOpenUrlCallbackResult() {
        return this.openUrlCallbackResult;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.openUrlCallbackResult.hashCode() + (this.url.hashCode() * 31)) * 31;
        String str = this.flags;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.url;
        UrlEventCallback urlEventCallback = this.openUrlCallbackResult;
        String str2 = this.flags;
        StringBuilder sb = new StringBuilder("APLFragmentOpenUrlEvent(url=");
        sb.append(str);
        sb.append(", openUrlCallbackResult=");
        sb.append(urlEventCallback);
        sb.append(", flags=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ APLFragmentOpenUrlEvent(String str, UrlEventCallback urlEventCallback, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, urlEventCallback, (i & 4) != 0 ? null : str2);
    }
}
