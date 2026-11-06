package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0011\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0002J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR*\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "<init>", "()V", "internalTransformShader", "Landroidx/compose/ui/graphics/TransformShader;", "createdSize", "Landroidx/compose/ui/geometry/Size;", "J", "value", "Landroidx/compose/ui/graphics/Matrix;", ViewProps.TRANSFORM, "getTransform-3i98HWw", "()[F", "setTransform-Q8lPUPs", "([F)V", "[F", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "obtainTransformShader", "applyTo", "", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,742:1\n1#2:743\n*E\n"})
/* loaded from: classes13.dex */
public abstract class ShaderBrush extends Brush {
    private long createdSize;

    @Nullable
    private TransformShader internalTransformShader;

    @Nullable
    private float[] transform;

    public ShaderBrush() {
        super(null);
        this.createdSize = Size.INSTANCE.m4477getUnspecifiedNHjbRc();
    }

    private final TransformShader obtainTransformShader() {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            return transformShader;
        }
        TransformShader transformShader2 = new TransformShader();
        this.internalTransformShader = transformShader2;
        return transformShader2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public final void mo4590applyToPq9zytI(long size, @NotNull Paint p, float alpha) {
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader == null || !Size.m4465equalsimpl0(this.createdSize, size)) {
            if (Size.m4471isEmptyimpl(size)) {
                this.internalTransformShader = null;
                this.createdSize = Size.INSTANCE.m4477getUnspecifiedNHjbRc();
                transformShader = null;
            } else {
                transformShader = obtainTransformShader();
                float[] fArr = this.transform;
                if (fArr != null) {
                    transformShader.m5053transformQ8lPUPs(fArr);
                }
                transformShader.setShader(mo4613createShaderuvyYCjk(size));
                this.internalTransformShader = transformShader;
                this.createdSize = size;
            }
        }
        long mo4515getColor0d7_KjU = p.mo4515getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m4645equalsimpl0(mo4515getColor0d7_KjU, companion.m4670getBlack0d7_KjU())) {
            p.mo4521setColor8_81llA(companion.m4670getBlack0d7_KjU());
        }
        if (!Intrinsics.areEqual(p.getShader(), transformShader != null ? transformShader.getShader() : null)) {
            p.setShader(transformShader != null ? transformShader.getShader() : null);
        }
        if (p.getAlpha() == alpha) {
            return;
        }
        p.setAlpha(alpha);
    }

    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public abstract Shader mo4613createShaderuvyYCjk(long size);

    @Nullable
    /* renamed from: getTransform-3i98HWw, reason: not valid java name and from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* renamed from: setTransform-Q8lPUPs, reason: not valid java name */
    public final void m4970setTransformQ8lPUPs(@Nullable float[] fArr) {
        this.transform = fArr;
        TransformShader transformShader = this.internalTransformShader;
        if (transformShader != null) {
            transformShader.m5053transformQ8lPUPs(fArr);
        }
    }
}
