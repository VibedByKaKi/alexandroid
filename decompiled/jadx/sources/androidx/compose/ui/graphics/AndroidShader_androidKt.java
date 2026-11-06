package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.Shader;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0010\u001a\u00060\u0001j\u0002`\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0015\u001a\u00060\u0001j\u0002`\u00032\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00060\u0001j\u0002`\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0016\u0010\u001f\u001a\u00020 2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001\u001a\u001e\u0010!\u001a\u00020\"2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010#\u001a\u00020 H\u0001\u001a0\u0010$\u001a\u0004\u0018\u00010%2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010#\u001a\u00020 H\u0001\u001a&\u0010'\u001a\u00020(2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0002\u001a3\u0010)\u001a\u00060\u0001j\u0002`\u00032\n\u0010*\u001a\u00060\u0001j\u0002`\u00032\n\u0010+\u001a\u00060\u0001j\u0002`\u00032\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0004\b.\u0010/*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u00060"}, d2 = {"Shader", "Landroid/graphics/Shader;", "ActualLinearGradientShader", "Landroidx/compose/ui/graphics/Shader;", "from", "Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_TO, "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualImageShader", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "ActualCompositeShader", "dst", "src", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "ActualCompositeShader-7EN7VTw", "(Landroid/graphics/Shader;Landroid/graphics/Shader;I)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,235:1\n65#2:236\n69#2:239\n65#2:242\n69#2:245\n65#2:248\n69#2:251\n65#2:254\n69#2:257\n60#3:237\n70#3:240\n60#3:243\n70#3:246\n60#3:249\n70#3:252\n60#3:255\n70#3:258\n22#4:238\n22#4:241\n22#4:244\n22#4:247\n22#4:250\n22#4:253\n22#4:256\n22#4:259\n71#5,5:260\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n41#1:236\n42#1:239\n43#1:242\n44#1:245\n61#1:248\n62#1:251\n78#1:254\n79#1:257\n41#1:237\n42#1:240\n43#1:243\n44#1:246\n61#1:249\n62#1:252\n78#1:255\n79#1:258\n41#1:238\n42#1:241\n43#1:244\n44#1:247\n61#1:250\n62#1:253\n78#1:256\n79#1:259\n137#1:260,5\n*E\n"})
/* loaded from: classes13.dex */
public final class AndroidShader_androidKt {
    @NotNull
    /* renamed from: ActualCompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m4542ActualCompositeShader7EN7VTw(@NotNull Shader shader, @NotNull Shader shader2, int i) {
        return new ComposeShader(shader, shader2, AndroidBlendMode_androidKt.m4492toAndroidBlendModes9anfk8(i));
    }

    @NotNull
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4543ActualImageShaderF49vj9s(@NotNull ImageBitmap imageBitmap, int i, int i2) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m4548toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m4548toAndroidTileMode0vamqd0(i2));
    }

    @NotNull
    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4544ActualLinearGradientShaderVjE6UOU(long j, long j2, @NotNull List<Color> list, @Nullable List<Float> list2, int i) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m4548toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4545ActualRadialGradientShader8uybcMk(long j, float f, @NotNull List<Color> list, @Nullable List<Float> list2, int i) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m4548toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4546ActualSweepGradientShader9KIMszo(long j, @NotNull List<Color> list, @Nullable List<Float> list2) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> list) {
        return 0;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> list, int i) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.m4698toArgb8_81llA(list.get(i2).m4654unboximpl());
        }
        return iArr;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> list2, int i) {
        if (i == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(list2);
        int i2 = 1;
        for (int i3 = 1; i3 < lastIndex; i3++) {
            long m4654unboximpl = list2.get(i3).m4654unboximpl();
            float floatValue = list != null ? list.get(i3).floatValue() : i3 / CollectionsKt.getLastIndex(list2);
            int i4 = i2 + 1;
            fArr[i2] = floatValue;
            if (Color.m4646getAlphaimpl(m4654unboximpl) == 0.0f) {
                i2 += 2;
                fArr[i4] = floatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(CollectionsKt.getLastIndex(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("colors and colorStops arguments must have equal length.");
        }
    }
}
