package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/list/PendingCardReveal;", "", "attempt", "", "landingRootUri", "", "<init>", "(ILjava/lang/String;)V", "getAttempt", "()I", "getLandingRootUri", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PendingCardReveal {
    public static final int $stable = 0;
    private final int attempt;

    @Nullable
    private final String landingRootUri;

    public PendingCardReveal(int i, @Nullable String str) {
        this.attempt = i;
        this.landingRootUri = str;
    }

    public static /* synthetic */ PendingCardReveal copy$default(PendingCardReveal pendingCardReveal, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pendingCardReveal.attempt;
        }
        if ((i2 & 2) != 0) {
            str = pendingCardReveal.landingRootUri;
        }
        return pendingCardReveal.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAttempt() {
        return this.attempt;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLandingRootUri() {
        return this.landingRootUri;
    }

    @NotNull
    public final PendingCardReveal copy(int attempt, @Nullable String landingRootUri) {
        return new PendingCardReveal(attempt, landingRootUri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingCardReveal)) {
            return false;
        }
        PendingCardReveal pendingCardReveal = (PendingCardReveal) other;
        return this.attempt == pendingCardReveal.attempt && Intrinsics.areEqual(this.landingRootUri, pendingCardReveal.landingRootUri);
    }

    public final int getAttempt() {
        return this.attempt;
    }

    @Nullable
    public final String getLandingRootUri() {
        return this.landingRootUri;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.attempt) * 31;
        String str = this.landingRootUri;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m("PendingCardReveal(attempt=", this.attempt, ", landingRootUri=", this.landingRootUri, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
