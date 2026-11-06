package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.Immutable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/CitationUiConfig;", "", "displayMode", "Lcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;)V", "getDisplayMode", "()Lcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class CitationUiConfig {
    public static final int $stable = 0;

    @NotNull
    private final CitationDisplayMode displayMode;

    public /* synthetic */ CitationUiConfig(CitationDisplayMode citationDisplayMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CitationDisplayMode.ALL : citationDisplayMode);
    }

    public static /* synthetic */ CitationUiConfig copy$default(CitationUiConfig citationUiConfig, CitationDisplayMode citationDisplayMode, int i, Object obj) {
        if ((i & 1) != 0) {
            citationDisplayMode = citationUiConfig.displayMode;
        }
        return citationUiConfig.copy(citationDisplayMode);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CitationDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    @NotNull
    public final CitationUiConfig copy(@NotNull CitationDisplayMode displayMode) {
        displayMode.getClass();
        return new CitationUiConfig(displayMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CitationUiConfig) && this.displayMode == ((CitationUiConfig) other).displayMode;
    }

    @NotNull
    public final CitationDisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public int hashCode() {
        return this.displayMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "CitationUiConfig(displayMode=" + this.displayMode + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public CitationUiConfig(@NotNull CitationDisplayMode citationDisplayMode) {
        citationDisplayMode.getClass();
        this.displayMode = citationDisplayMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CitationUiConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
