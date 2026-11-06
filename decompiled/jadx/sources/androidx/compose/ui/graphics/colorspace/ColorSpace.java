package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 82\u00020\u0001:\u00018B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0007H&J\u0012\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u0007H&J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010!\u001a\u00020\u001dH'J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0010¢\u0006\u0002\b'J%\u0010(\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0010¢\u0006\u0002\b)J7\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0000H\u0010¢\u0006\u0004\b1\u00102J \u00103\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0007J\u0012\u00103\u001a\u00020\u001d2\b\b\u0001\u0010!\u001a\u00020\u001dH'J\b\u00104\u001a\u00020\u0003H\u0016J\u0013\u00105\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00107\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u00069"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "model", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "id", "", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getModel-xdoWZVw", "()J", "J", "getId$ui_graphics_release", "()I", "componentCount", "getComponentCount", "isWideGamut", "", "()Z", "isSrgb", "getMinValue", "", JsonFields.COMPONENT, "getMaxValue", "toXyz", "", "r", "g", "b", "v", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "fromXyz", "toString", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "Companion", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,717:1\n53#2,3:718\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n246#1:718,3\n*E\n"})
/* loaded from: classes13.dex */
public abstract class ColorSpace {
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;

    @NotNull
    private final String name;

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            Single$$ExternalSyntheticBUOutline0.m$3("The id must be between -1 and 63");
            throw null;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) other;
        if (this.id == colorSpace.id && Intrinsics.areEqual(this.name, colorSpace.name)) {
            return ColorModel.m5069equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    @Size(min = 3)
    @NotNull
    public final float[] fromXyz(float x, float y, float z) {
        float[] fArr = new float[ColorModel.m5070getComponentCountimpl(this.model)];
        fArr[0] = x;
        fArr[1] = y;
        fArr[2] = z;
        return fromXyz(fArr);
    }

    @Size(min = 3)
    @NotNull
    public abstract float[] fromXyz(@Size(min = 3) @NotNull float[] v);

    @IntRange(from = 1, to = 4)
    public final int getComponentCount() {
        return ColorModel.m5070getComponentCountimpl(this.model);
    }

    /* renamed from: getId$ui_graphics_release, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public abstract float getMaxValue(@IntRange(from = 0, to = 3) int component);

    public abstract float getMinValue(@IntRange(from = 0, to = 3) int component);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name and from getter */
    public final long getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return ((ColorModel.m5071hashCodeimpl(this.model) + (this.name.hashCode() * 31)) * 31) + this.id;
    }

    /* renamed from: isSrgb */
    public boolean getIsSrgb() {
        return false;
    }

    /* renamed from: isWideGamut */
    public abstract boolean getIsWideGamut();

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m5072toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics_release(float v0, float v1, float v2) {
        float[] xyz = toXyz(v0, v1, v2);
        float f = xyz[0];
        float f2 = xyz[1];
        return (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
    }

    @Size(3)
    @NotNull
    public final float[] toXyz(float r, float g, float b) {
        return toXyz(new float[]{r, g, b});
    }

    @Size(min = 3)
    @NotNull
    public abstract float[] toXyz(@Size(min = 3) @NotNull float[] v);

    public float toZ$ui_graphics_release(float v0, float v1, float v2) {
        return toXyz(v0, v1, v2)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo5079xyzaToColorJlNiLsg$ui_graphics_release(float x, float y, float z, float a2, @NotNull ColorSpace colorSpace) {
        float[] fromXyz = fromXyz(x, y, z);
        return ColorKt.Color(fromXyz[0], fromXyz[1], fromXyz[2], a2, colorSpace);
    }

    public /* synthetic */ ColorSpace(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public /* synthetic */ ColorSpace(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    private ColorSpace(String str, long j) {
        this(str, j, -1, null);
    }
}
