package com.amazon.alexa.ra.core.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/UrlTapMetadata;", "", "presentationHint", "Lcom/amazon/alexa/ra/core/viewmodel/UrlPresentationHint;", "<init>", "(Lcom/amazon/alexa/ra/core/viewmodel/UrlPresentationHint;)V", "getPresentationHint", "()Lcom/amazon/alexa/ra/core/viewmodel/UrlPresentationHint;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class UrlTapMetadata {
    public static final int $stable = 0;

    @NotNull
    private final UrlPresentationHint presentationHint;

    public /* synthetic */ UrlTapMetadata(UrlPresentationHint urlPresentationHint, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UrlPresentationHint.IN_APP : urlPresentationHint);
    }

    public static /* synthetic */ UrlTapMetadata copy$default(UrlTapMetadata urlTapMetadata, UrlPresentationHint urlPresentationHint, int i, Object obj) {
        if ((i & 1) != 0) {
            urlPresentationHint = urlTapMetadata.presentationHint;
        }
        return urlTapMetadata.copy(urlPresentationHint);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UrlPresentationHint getPresentationHint() {
        return this.presentationHint;
    }

    @NotNull
    public final UrlTapMetadata copy(@NotNull UrlPresentationHint presentationHint) {
        presentationHint.getClass();
        return new UrlTapMetadata(presentationHint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UrlTapMetadata) && this.presentationHint == ((UrlTapMetadata) other).presentationHint;
    }

    @NotNull
    public final UrlPresentationHint getPresentationHint() {
        return this.presentationHint;
    }

    public int hashCode() {
        return this.presentationHint.hashCode();
    }

    @NotNull
    public String toString() {
        return "UrlTapMetadata(presentationHint=" + this.presentationHint + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public UrlTapMetadata(@NotNull UrlPresentationHint urlPresentationHint) {
        urlPresentationHint.getClass();
        this.presentationHint = urlPresentationHint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UrlTapMetadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
