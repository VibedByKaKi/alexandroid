package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/ToolbarVisibility;", "", "showNewChat", "", "showOverflow", "<init>", "(ZZ)V", "getShowNewChat", "()Z", "getShowOverflow", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ToolbarVisibility {
    public static final int $stable = 0;
    private final boolean showNewChat;
    private final boolean showOverflow;

    public ToolbarVisibility(boolean z, boolean z2) {
        this.showNewChat = z;
        this.showOverflow = z2;
    }

    public static /* synthetic */ ToolbarVisibility copy$default(ToolbarVisibility toolbarVisibility, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = toolbarVisibility.showNewChat;
        }
        if ((i & 2) != 0) {
            z2 = toolbarVisibility.showOverflow;
        }
        return toolbarVisibility.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowNewChat() {
        return this.showNewChat;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowOverflow() {
        return this.showOverflow;
    }

    @NotNull
    public final ToolbarVisibility copy(boolean showNewChat, boolean showOverflow) {
        return new ToolbarVisibility(showNewChat, showOverflow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarVisibility)) {
            return false;
        }
        ToolbarVisibility toolbarVisibility = (ToolbarVisibility) other;
        return this.showNewChat == toolbarVisibility.showNewChat && this.showOverflow == toolbarVisibility.showOverflow;
    }

    public final boolean getShowNewChat() {
        return this.showNewChat;
    }

    public final boolean getShowOverflow() {
        return this.showOverflow;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showOverflow) + (Boolean.hashCode(this.showNewChat) * 31);
    }

    @NotNull
    public String toString() {
        return "ToolbarVisibility(showNewChat=" + this.showNewChat + ", showOverflow=" + this.showOverflow + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
