package expo.modules.font;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.view.ViewCompat;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lexpo/modules/font/RenderToImageOptions;", "Lexpo/modules/kotlin/records/Record;", "fontFamily", "", "size", "", "color", "", "<init>", "(Ljava/lang/String;FI)V", "getFontFamily$annotations", "()V", "getFontFamily", "()Ljava/lang/String;", "getSize$annotations", "getSize", "()F", "getColor$annotations", "getColor", "()I", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RenderToImageOptions implements Record {
    private final int color;

    @NotNull
    private final String fontFamily;
    private final float size;

    public /* synthetic */ RenderToImageOptions(String str, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 24.0f : f, (i2 & 4) != 0 ? ViewCompat.MEASURED_STATE_MASK : i);
    }

    public static /* synthetic */ RenderToImageOptions copy$default(RenderToImageOptions renderToImageOptions, String str, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = renderToImageOptions.fontFamily;
        }
        if ((i2 & 2) != 0) {
            f = renderToImageOptions.size;
        }
        if ((i2 & 4) != 0) {
            i = renderToImageOptions.color;
        }
        return renderToImageOptions.copy(str, f, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component2, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final RenderToImageOptions copy(@NotNull String fontFamily, float size, int color) {
        fontFamily.getClass();
        return new RenderToImageOptions(fontFamily, size, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderToImageOptions)) {
            return false;
        }
        RenderToImageOptions renderToImageOptions = (RenderToImageOptions) other;
        return Intrinsics.areEqual(this.fontFamily, renderToImageOptions.fontFamily) && Float.compare(this.size, renderToImageOptions.size) == 0 && this.color == renderToImageOptions.color;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final float getSize() {
        return this.size;
    }

    public int hashCode() {
        return Integer.hashCode(this.color) + DoubleList$$ExternalSyntheticOutline0.m(this.size, this.fontFamily.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.fontFamily;
        float f = this.size;
        int i = this.color;
        StringBuilder sb = new StringBuilder("RenderToImageOptions(fontFamily=");
        sb.append(str);
        sb.append(", size=");
        sb.append(f);
        sb.append(", color=");
        return a$$ExternalSyntheticOutline0.m(sb, i, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Field
    public static /* synthetic */ void getColor$annotations() {
    }

    @Field
    public static /* synthetic */ void getFontFamily$annotations() {
    }

    @Field
    public static /* synthetic */ void getSize$annotations() {
    }

    public RenderToImageOptions(@NotNull String str, float f, int i) {
        str.getClass();
        this.fontFamily = str;
        this.size = f;
        this.color = i;
    }

    public RenderToImageOptions() {
        this(null, 0.0f, 0, 7, null);
    }
}
