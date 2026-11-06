package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffectVerificationHelper;", "", "<init>", "()V", "createBlurEffect", "Landroid/graphics/RenderEffect;", "inputRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "createBlurEffect-8A-3gB4", "(Landroidx/compose/ui/graphics/RenderEffect;FFI)Landroid/graphics/RenderEffect;", "createOffsetEffect", "offset", "Landroidx/compose/ui/geometry/Offset;", "createOffsetEffect-Uv8p0NA", "(Landroidx/compose/ui/graphics/RenderEffect;J)Landroid/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffectVerificationHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,168:1\n65#2:169\n69#2:172\n65#2:174\n69#2:177\n60#3:170\n70#3:173\n60#3:175\n70#3:178\n22#4:171\n22#4:176\n22#4:179\n*S KotlinDebug\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffectVerificationHelper\n*L\n159#1:169\n159#1:172\n162#1:174\n163#1:177\n159#1:170\n159#1:173\n162#1:175\n163#1:178\n159#1:171\n162#1:176\n163#1:179\n*E\n"})
/* loaded from: classes13.dex */
final class RenderEffectVerificationHelper {

    @NotNull
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @NotNull
    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m4966createBlurEffect8A3gB4(@Nullable RenderEffect inputRenderEffect, float radiusX, float radiusY, int edgeTreatment) {
        return (radiusX == 0.0f && radiusY == 0.0f) ? android.graphics.RenderEffect.createOffsetEffect(0.0f, 0.0f) : inputRenderEffect == null ? android.graphics.RenderEffect.createBlurEffect(radiusX, radiusY, AndroidTileMode_androidKt.m4548toAndroidTileMode0vamqd0(edgeTreatment)) : android.graphics.RenderEffect.createBlurEffect(radiusX, radiusY, inputRenderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m4548toAndroidTileMode0vamqd0(edgeTreatment));
    }

    @NotNull
    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m4967createOffsetEffectUv8p0NA(@Nullable RenderEffect inputRenderEffect, long offset) {
        return inputRenderEffect == null ? android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L))) : android.graphics.RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)), inputRenderEffect.asAndroidRenderEffect());
    }
}
