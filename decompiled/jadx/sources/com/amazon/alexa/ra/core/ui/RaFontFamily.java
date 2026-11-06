package com.amazon.alexa.ra.core.ui;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/RaFontFamily;", "", "default", "Landroidx/compose/ui/text/font/FontFamily;", "display", "bold", "typeface", "Landroid/graphics/Typeface;", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontFamily;Landroid/graphics/Typeface;)V", "getDefault", "()Landroidx/compose/ui/text/font/FontFamily;", "getDisplay", "getBold", "getTypeface", "()Landroid/graphics/Typeface;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RaFontFamily {
    public static final int $stable = 8;

    @NotNull
    private final FontFamily bold;

    @NotNull
    private final FontFamily default;

    @NotNull
    private final FontFamily display;

    @Nullable
    private final Typeface typeface;

    public RaFontFamily(@NotNull FontFamily fontFamily, @NotNull FontFamily fontFamily2, @NotNull FontFamily fontFamily3, @Nullable Typeface typeface) {
        fontFamily.getClass();
        fontFamily2.getClass();
        fontFamily3.getClass();
        this.default = fontFamily;
        this.display = fontFamily2;
        this.bold = fontFamily3;
        this.typeface = typeface;
    }

    public static /* synthetic */ RaFontFamily copy$default(RaFontFamily raFontFamily, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, Typeface typeface, int i, Object obj) {
        if ((i & 1) != 0) {
            fontFamily = raFontFamily.default;
        }
        if ((i & 2) != 0) {
            fontFamily2 = raFontFamily.display;
        }
        if ((i & 4) != 0) {
            fontFamily3 = raFontFamily.bold;
        }
        if ((i & 8) != 0) {
            typeface = raFontFamily.typeface;
        }
        return raFontFamily.copy(fontFamily, fontFamily2, fontFamily3, typeface);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FontFamily getDefault() {
        return this.default;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FontFamily getDisplay() {
        return this.display;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FontFamily getBold() {
        return this.bold;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @NotNull
    public final RaFontFamily copy(@NotNull FontFamily r1, @NotNull FontFamily display, @NotNull FontFamily bold, @Nullable Typeface typeface) {
        r1.getClass();
        display.getClass();
        bold.getClass();
        return new RaFontFamily(r1, display, bold, typeface);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RaFontFamily)) {
            return false;
        }
        RaFontFamily raFontFamily = (RaFontFamily) other;
        return Intrinsics.areEqual(this.default, raFontFamily.default) && Intrinsics.areEqual(this.display, raFontFamily.display) && Intrinsics.areEqual(this.bold, raFontFamily.bold) && Intrinsics.areEqual(this.typeface, raFontFamily.typeface);
    }

    @NotNull
    public final FontFamily getBold() {
        return this.bold;
    }

    @NotNull
    public final FontFamily getDefault() {
        return this.default;
    }

    @NotNull
    public final FontFamily getDisplay() {
        return this.display;
    }

    @Nullable
    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        int hashCode = (this.bold.hashCode() + ((this.display.hashCode() + (this.default.hashCode() * 31)) * 31)) * 31;
        Typeface typeface = this.typeface;
        return hashCode + (typeface == null ? 0 : typeface.hashCode());
    }

    @NotNull
    public String toString() {
        return "RaFontFamily(default=" + this.default + ", display=" + this.display + ", bold=" + this.bold + ", typeface=" + this.typeface + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
