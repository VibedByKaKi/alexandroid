package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ContentExperimental;", "", ContentExperimental.LAYOUT_VARIABLES, "Lcom/amazon/alexa/ra/core/data/fragments/ContentLayoutVariables;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/ContentLayoutVariables;)V", "getLayoutVariables", "()Lcom/amazon/alexa/ra/core/data/fragments/ContentLayoutVariables;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ContentExperimental {

    @NotNull
    public static final String LAYOUT_VARIABLES = "layoutVariables";

    @Nullable
    private final ContentLayoutVariables layoutVariables;
    public static final int $stable = 8;

    public /* synthetic */ ContentExperimental(ContentLayoutVariables contentLayoutVariables, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contentLayoutVariables);
    }

    public static /* synthetic */ ContentExperimental copy$default(ContentExperimental contentExperimental, ContentLayoutVariables contentLayoutVariables, int i, Object obj) {
        if ((i & 1) != 0) {
            contentLayoutVariables = contentExperimental.layoutVariables;
        }
        return contentExperimental.copy(contentLayoutVariables);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ContentLayoutVariables getLayoutVariables() {
        return this.layoutVariables;
    }

    @NotNull
    public final ContentExperimental copy(@Nullable ContentLayoutVariables layoutVariables) {
        return new ContentExperimental(layoutVariables);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentExperimental) && Intrinsics.areEqual(this.layoutVariables, ((ContentExperimental) other).layoutVariables);
    }

    @Nullable
    public final ContentLayoutVariables getLayoutVariables() {
        return this.layoutVariables;
    }

    public int hashCode() {
        ContentLayoutVariables contentLayoutVariables = this.layoutVariables;
        if (contentLayoutVariables == null) {
            return 0;
        }
        return contentLayoutVariables.hashCode();
    }

    @NotNull
    public String toString() {
        return "ContentExperimental(layoutVariables=" + this.layoutVariables + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ContentExperimental(@Nullable ContentLayoutVariables contentLayoutVariables) {
        this.layoutVariables = contentLayoutVariables;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentExperimental() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
