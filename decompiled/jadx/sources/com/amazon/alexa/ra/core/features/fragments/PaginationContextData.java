package com.amazon.alexa.ra.core.features.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaFragmentsPaginationContextBundleKeys;
import com.amazon.alexa.ra.core.ui.enums.PaginationRetrievalMode;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/features/fragments/PaginationContextData;", "", "before", "", "after", AlexaFragmentsPaginationContextBundleKeys.RETRIEVAL_MODE, "Lcom/amazon/alexa/ra/core/ui/enums/PaginationRetrievalMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/ui/enums/PaginationRetrievalMode;)V", "getBefore", "()Ljava/lang/String;", "getAfter", "getRetrievalMode", "()Lcom/amazon/alexa/ra/core/ui/enums/PaginationRetrievalMode;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PaginationContextData {
    public static final int $stable = 0;

    @Nullable
    private final String after;

    @Nullable
    private final String before;

    @NotNull
    private final PaginationRetrievalMode retrievalMode;

    public /* synthetic */ PaginationContextData(String str, String str2, PaginationRetrievalMode paginationRetrievalMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? PaginationRetrievalMode.ANCHORED : paginationRetrievalMode);
    }

    public static /* synthetic */ PaginationContextData copy$default(PaginationContextData paginationContextData, String str, String str2, PaginationRetrievalMode paginationRetrievalMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paginationContextData.before;
        }
        if ((i & 2) != 0) {
            str2 = paginationContextData.after;
        }
        if ((i & 4) != 0) {
            paginationRetrievalMode = paginationContextData.retrievalMode;
        }
        return paginationContextData.copy(str, str2, paginationRetrievalMode);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBefore() {
        return this.before;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaginationRetrievalMode getRetrievalMode() {
        return this.retrievalMode;
    }

    @NotNull
    public final PaginationContextData copy(@Nullable String before, @Nullable String after, @NotNull PaginationRetrievalMode retrievalMode) {
        retrievalMode.getClass();
        return new PaginationContextData(before, after, retrievalMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginationContextData)) {
            return false;
        }
        PaginationContextData paginationContextData = (PaginationContextData) other;
        return Intrinsics.areEqual(this.before, paginationContextData.before) && Intrinsics.areEqual(this.after, paginationContextData.after) && this.retrievalMode == paginationContextData.retrievalMode;
    }

    @Nullable
    public final String getAfter() {
        return this.after;
    }

    @Nullable
    public final String getBefore() {
        return this.before;
    }

    @NotNull
    public final PaginationRetrievalMode getRetrievalMode() {
        return this.retrievalMode;
    }

    public int hashCode() {
        String str = this.before;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.after;
        return this.retrievalMode.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.before;
        String str2 = this.after;
        PaginationRetrievalMode paginationRetrievalMode = this.retrievalMode;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("PaginationContextData(before=", str, ", after=", str2, ", retrievalMode=");
        m.append(paginationRetrievalMode);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public PaginationContextData(@Nullable String str, @Nullable String str2, @NotNull PaginationRetrievalMode paginationRetrievalMode) {
        paginationRetrievalMode.getClass();
        this.before = str;
        this.after = str2;
        this.retrievalMode = paginationRetrievalMode;
    }

    public PaginationContextData() {
        this(null, null, null, 7, null);
    }
}
