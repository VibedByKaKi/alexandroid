package com.amazon.dee.app.services.toolbar;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/dee/app/services/toolbar/ToolbarVisibilityInfo;", "", "isVisible", "", "isFloating", "height", "", "<init>", "(ZZF)V", "()Z", "getHeight", "()F", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToolbarVisibilityInfo {
    private final float height;
    private final boolean isFloating;
    private final boolean isVisible;

    public ToolbarVisibilityInfo(boolean z, boolean z2, float f) {
        this.isVisible = z;
        this.isFloating = z2;
        this.height = f;
    }

    public static /* synthetic */ ToolbarVisibilityInfo copy$default(ToolbarVisibilityInfo toolbarVisibilityInfo, boolean z, boolean z2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = toolbarVisibilityInfo.isVisible;
        }
        if ((i & 2) != 0) {
            z2 = toolbarVisibilityInfo.isFloating;
        }
        if ((i & 4) != 0) {
            f = toolbarVisibilityInfo.height;
        }
        return toolbarVisibilityInfo.copy(z, z2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFloating() {
        return this.isFloating;
    }

    /* renamed from: component3, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    @NotNull
    public final ToolbarVisibilityInfo copy(boolean isVisible, boolean isFloating, float height) {
        return new ToolbarVisibilityInfo(isVisible, isFloating, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolbarVisibilityInfo)) {
            return false;
        }
        ToolbarVisibilityInfo toolbarVisibilityInfo = (ToolbarVisibilityInfo) other;
        return this.isVisible == toolbarVisibilityInfo.isVisible && this.isFloating == toolbarVisibilityInfo.isFloating && Float.compare(this.height, toolbarVisibilityInfo.height) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public int hashCode() {
        return Float.hashCode(this.height) + DoubleList$$ExternalSyntheticOutline0.m(this.isFloating, Boolean.hashCode(this.isVisible) * 31, 31);
    }

    public final boolean isFloating() {
        return this.isFloating;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        boolean z = this.isVisible;
        boolean z2 = this.isFloating;
        return ErrorUtils$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("ToolbarVisibilityInfo(isVisible=", z, ", isFloating=", z2, ", height="), MarkdownConstants.RIGHT_PARENTHESIS, this.height);
    }
}
