package com.amazon.alexa.ra.apl.deepbrowse.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/DeepBrowseNavigation;", "", "type", "Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationType;", "pageId", "", "<init>", "(Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationType;Ljava/lang/String;)V", "getType", "()Lcom/amazon/alexa/ra/apl/deepbrowse/viewmodels/NavigationType;", "getPageId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class DeepBrowseNavigation {
    public static final int $stable = 0;

    @Nullable
    private final String pageId;

    @NotNull
    private final NavigationType type;

    public DeepBrowseNavigation(@NotNull NavigationType navigationType, @Nullable String str) {
        navigationType.getClass();
        this.type = navigationType;
        this.pageId = str;
    }

    public static /* synthetic */ DeepBrowseNavigation copy$default(DeepBrowseNavigation deepBrowseNavigation, NavigationType navigationType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationType = deepBrowseNavigation.type;
        }
        if ((i & 2) != 0) {
            str = deepBrowseNavigation.pageId;
        }
        return deepBrowseNavigation.copy(navigationType, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavigationType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    public final DeepBrowseNavigation copy(@NotNull NavigationType type, @Nullable String pageId) {
        type.getClass();
        return new DeepBrowseNavigation(type, pageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepBrowseNavigation)) {
            return false;
        }
        DeepBrowseNavigation deepBrowseNavigation = (DeepBrowseNavigation) other;
        return this.type == deepBrowseNavigation.type && Intrinsics.areEqual(this.pageId, deepBrowseNavigation.pageId);
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    public final NavigationType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.pageId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeepBrowseNavigation(type=" + this.type + ", pageId=" + this.pageId + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
