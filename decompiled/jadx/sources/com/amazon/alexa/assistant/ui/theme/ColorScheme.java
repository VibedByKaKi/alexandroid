package com.amazon.alexa.assistant.ui.theme;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/ui/theme/ColorScheme;", "", "light", "", "dark", "<init>", "(JJ)V", "getLight", "()J", "getDark", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ColorScheme {
    public static final int $stable = 0;
    private final long dark;
    private final long light;

    public ColorScheme(long j, long j2) {
        this.light = j;
        this.dark = j2;
    }

    public static /* synthetic */ ColorScheme copy$default(ColorScheme colorScheme, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = colorScheme.light;
        }
        if ((i & 2) != 0) {
            j2 = colorScheme.dark;
        }
        return colorScheme.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDark() {
        return this.dark;
    }

    @NotNull
    public final ColorScheme copy(long light, long dark) {
        return new ColorScheme(light, dark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) other;
        return this.light == colorScheme.light && this.dark == colorScheme.dark;
    }

    public final long getDark() {
        return this.dark;
    }

    public final long getLight() {
        return this.light;
    }

    public int hashCode() {
        return Long.hashCode(this.dark) + (Long.hashCode(this.light) * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.dark, MarkdownConstants.RIGHT_PARENTHESIS, a$$ExternalSyntheticOutline0.m("ColorScheme(light=", this.light, ", dark="));
    }
}
