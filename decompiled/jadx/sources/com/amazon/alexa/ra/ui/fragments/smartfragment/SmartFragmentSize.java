package com.amazon.alexa.ra.ui.fragments.smartfragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentSize;", "", "width", "Landroidx/compose/ui/unit/Dp;", "height", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWidth-D9Ej5fM", "()F", "F", "getHeight-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/amazon/alexa/ra/ui/fragments/smartfragment/SmartFragmentSize;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class SmartFragmentSize {
    public static final int $stable = 0;
    private final float height;
    private final float width;

    private SmartFragmentSize(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ SmartFragmentSize m19432copyYgX7TsA$default(SmartFragmentSize smartFragmentSize, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = smartFragmentSize.width;
        }
        if ((i & 2) != 0) {
            f2 = smartFragmentSize.height;
        }
        return smartFragmentSize.m19435copyYgX7TsA(f, f2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final SmartFragmentSize m19435copyYgX7TsA(float width, float height) {
        return new SmartFragmentSize(width, height, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartFragmentSize)) {
            return false;
        }
        SmartFragmentSize smartFragmentSize = (SmartFragmentSize) other;
        return Dp.m7373equalsimpl0(this.width, smartFragmentSize.width) && Dp.m7373equalsimpl0(this.height, smartFragmentSize.height);
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m19436getHeightD9Ej5fM() {
        return this.height;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m19437getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return Dp.m7374hashCodeimpl(this.height) + (Dp.m7374hashCodeimpl(this.width) * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("SmartFragmentSize(width=", Dp.m7379toStringimpl(this.width), ", height=", Dp.m7379toStringimpl(this.height), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ SmartFragmentSize(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
