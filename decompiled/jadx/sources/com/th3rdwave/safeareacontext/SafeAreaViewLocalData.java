package com.th3rdwave.safeareacontext;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewLocalData;", "", "insets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "mode", "Lcom/th3rdwave/safeareacontext/SafeAreaViewMode;", "edges", "Lcom/th3rdwave/safeareacontext/SafeAreaViewEdges;", "<init>", "(Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/SafeAreaViewMode;Lcom/th3rdwave/safeareacontext/SafeAreaViewEdges;)V", "getInsets", "()Lcom/th3rdwave/safeareacontext/EdgeInsets;", "getMode", "()Lcom/th3rdwave/safeareacontext/SafeAreaViewMode;", "getEdges", "()Lcom/th3rdwave/safeareacontext/SafeAreaViewEdges;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SafeAreaViewLocalData {

    @NotNull
    private final SafeAreaViewEdges edges;

    @NotNull
    private final EdgeInsets insets;

    @NotNull
    private final SafeAreaViewMode mode;

    public SafeAreaViewLocalData(@NotNull EdgeInsets edgeInsets, @NotNull SafeAreaViewMode safeAreaViewMode, @NotNull SafeAreaViewEdges safeAreaViewEdges) {
        edgeInsets.getClass();
        safeAreaViewMode.getClass();
        safeAreaViewEdges.getClass();
        this.insets = edgeInsets;
        this.mode = safeAreaViewMode;
        this.edges = safeAreaViewEdges;
    }

    public static /* synthetic */ SafeAreaViewLocalData copy$default(SafeAreaViewLocalData safeAreaViewLocalData, EdgeInsets edgeInsets, SafeAreaViewMode safeAreaViewMode, SafeAreaViewEdges safeAreaViewEdges, int i, Object obj) {
        if ((i & 1) != 0) {
            edgeInsets = safeAreaViewLocalData.insets;
        }
        if ((i & 2) != 0) {
            safeAreaViewMode = safeAreaViewLocalData.mode;
        }
        if ((i & 4) != 0) {
            safeAreaViewEdges = safeAreaViewLocalData.edges;
        }
        return safeAreaViewLocalData.copy(edgeInsets, safeAreaViewMode, safeAreaViewEdges);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EdgeInsets getInsets() {
        return this.insets;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SafeAreaViewMode getMode() {
        return this.mode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SafeAreaViewEdges getEdges() {
        return this.edges;
    }

    @NotNull
    public final SafeAreaViewLocalData copy(@NotNull EdgeInsets insets, @NotNull SafeAreaViewMode mode, @NotNull SafeAreaViewEdges edges) {
        insets.getClass();
        mode.getClass();
        edges.getClass();
        return new SafeAreaViewLocalData(insets, mode, edges);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeAreaViewLocalData)) {
            return false;
        }
        SafeAreaViewLocalData safeAreaViewLocalData = (SafeAreaViewLocalData) other;
        return Intrinsics.areEqual(this.insets, safeAreaViewLocalData.insets) && this.mode == safeAreaViewLocalData.mode && Intrinsics.areEqual(this.edges, safeAreaViewLocalData.edges);
    }

    @NotNull
    public final SafeAreaViewEdges getEdges() {
        return this.edges;
    }

    @NotNull
    public final EdgeInsets getInsets() {
        return this.insets;
    }

    @NotNull
    public final SafeAreaViewMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.edges.hashCode() + ((this.mode.hashCode() + (this.insets.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.insets + ", mode=" + this.mode + ", edges=" + this.edges + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
