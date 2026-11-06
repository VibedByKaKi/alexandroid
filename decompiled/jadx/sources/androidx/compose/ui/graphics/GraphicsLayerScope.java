package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u0018\u0010\u0014\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0018\u0010 \u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u0018\u0010#\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020-X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u0018\u00100\u001a\u000201X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u000207X¦\u000e¢\u0006\u0012\u0012\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010@\u001a\u0004\u0018\u00010?2\b\u0010>\u001a\u0004\u0018\u00010?8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u00020E2\u0006\u0010>\u001a\u00020E8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010L\u001a\u0004\u0018\u00010K2\b\u0010>\u001a\u0004\u0018\u00010K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u00020R2\u0006\u0010Q\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010H\"\u0004\bT\u0010JR\u0014\u0010U\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006XÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "scaleX", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "alpha", "getAlpha", "setAlpha", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "cameraDistance", "getCameraDistance", "setCameraDistance", ViewProps.TRANSFORM_ORIGIN, "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "clip", "", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "_", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PlacementScopeMarker
/* loaded from: classes13.dex */
public interface GraphicsLayerScope extends Density {
    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4836getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    default int mo4837getBlendMode0nO6VwU() {
        return BlendMode.INSTANCE.m4585getSrcOver0nO6VwU();
    }

    float getCameraDistance();

    boolean getClip();

    @Nullable
    default ColorFilter getColorFilter() {
        return null;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo4838getCompositingStrategyNrFUSI() {
        return CompositingStrategy.INSTANCE.m4734getAutoNrFUSI();
    }

    @Nullable
    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    @NotNull
    Shape getShape();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo4839getSizeNHjbRc() {
        return Size.INSTANCE.m4477getUnspecifiedNHjbRc();
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4840getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo4841getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f);

    void setCameraDistance(float f);

    void setClip(boolean z);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    void setShape(@NotNull Shape shape);

    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo4846setTransformOrigin__ExYCQ(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4847getAmbientShadowColor0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4836getAmbientShadowColor0d7_KjU();
        }

        @Deprecated
        /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
        public static int m4848getBlendMode0nO6VwU(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4837getBlendMode0nO6VwU();
        }

        @Deprecated
        @Nullable
        public static ColorFilter getColorFilter(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getColorFilter();
        }

        @Deprecated
        /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m4849getCompositingStrategyNrFUSI(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4838getCompositingStrategyNrFUSI();
        }

        @Deprecated
        @Nullable
        public static RenderEffect getRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4850getSizeNHjbRc(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4839getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4851getSpotShadowColor0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4840getSpotShadowColor0d7_KjU();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4852roundToPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo550roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4853roundToPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo551roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m4854setAmbientShadowColor8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            GraphicsLayerScope.super.mo4842setAmbientShadowColor8_81llA(j);
        }

        @Deprecated
        /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
        public static void m4855setBlendModes9anfk8(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            GraphicsLayerScope.super.mo4843setBlendModes9anfk8(i);
        }

        @Deprecated
        public static void setColorFilter(@NotNull GraphicsLayerScope graphicsLayerScope, @Nullable ColorFilter colorFilter) {
            GraphicsLayerScope.super.setColorFilter(colorFilter);
        }

        @Deprecated
        /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m4856setCompositingStrategyaDBOjCE(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            GraphicsLayerScope.super.mo4844setCompositingStrategyaDBOjCE(i);
        }

        @Deprecated
        public static void setRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope, @Nullable RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m4857setSpotShadowColor8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            GraphicsLayerScope.super.mo4845setSpotShadowColor8_81llA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4858toDpGaN1DYA(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo552toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4859toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo553toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4861toDpSizekrfVVM(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo555toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4862toPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo556toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4863toPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo557toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull GraphicsLayerScope graphicsLayerScope, @NotNull DpRect dpRect) {
            return GraphicsLayerScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4864toSizeXkaWNTQ(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo558toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4865toSp0xMU5do(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo559toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4866toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo560toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4860toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo554toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4867toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo561toSpkPz2Gy4(i);
        }

        public static /* synthetic */ void getClip$annotations() {
        }
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo4842setAmbientShadowColor8_81llA(long j) {
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    default void mo4843setBlendModes9anfk8(int i) {
    }

    default void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo4844setCompositingStrategyaDBOjCE(int i) {
    }

    default void setRenderEffect(@Nullable RenderEffect renderEffect) {
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo4845setSpotShadowColor8_81llA(long j) {
    }
}
