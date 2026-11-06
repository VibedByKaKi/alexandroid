package com.amazon.alexa.apl.payload;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/apl/payload/DirectiveToken;", "", "mPresentationToken", "", "mPresentationSession", "Lcom/amazon/alexa/apl/payload/PresentationSession;", "(Ljava/lang/String;Lcom/amazon/alexa/apl/payload/PresentationSession;)V", "getMPresentationSession", "()Lcom/amazon/alexa/apl/payload/PresentationSession;", "getMPresentationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DirectiveToken {

    @NotNull
    private final PresentationSession mPresentationSession;

    @NotNull
    private final String mPresentationToken;

    public DirectiveToken(@NotNull String str, @NotNull PresentationSession presentationSession) {
        str.getClass();
        presentationSession.getClass();
        this.mPresentationToken = str;
        this.mPresentationSession = presentationSession;
    }

    public static /* synthetic */ DirectiveToken copy$default(DirectiveToken directiveToken, String str, PresentationSession presentationSession, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directiveToken.mPresentationToken;
        }
        if ((i & 2) != 0) {
            presentationSession = directiveToken.mPresentationSession;
        }
        return directiveToken.copy(str, presentationSession);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMPresentationToken() {
        return this.mPresentationToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PresentationSession getMPresentationSession() {
        return this.mPresentationSession;
    }

    @NotNull
    public final DirectiveToken copy(@NotNull String mPresentationToken, @NotNull PresentationSession mPresentationSession) {
        mPresentationToken.getClass();
        mPresentationSession.getClass();
        return new DirectiveToken(mPresentationToken, mPresentationSession);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectiveToken)) {
            return false;
        }
        DirectiveToken directiveToken = (DirectiveToken) other;
        return Intrinsics.areEqual(this.mPresentationToken, directiveToken.mPresentationToken) && Intrinsics.areEqual(this.mPresentationSession, directiveToken.mPresentationSession);
    }

    @NotNull
    public final PresentationSession getMPresentationSession() {
        return this.mPresentationSession;
    }

    @NotNull
    public final String getMPresentationToken() {
        return this.mPresentationToken;
    }

    public int hashCode() {
        return this.mPresentationSession.hashCode() + (this.mPresentationToken.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DirectiveToken(mPresentationToken=" + this.mPresentationToken + ", mPresentationSession=" + this.mPresentationSession + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
