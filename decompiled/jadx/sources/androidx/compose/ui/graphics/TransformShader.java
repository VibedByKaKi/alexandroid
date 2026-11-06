package androidx.compose.ui.graphics;

import android.graphics.Shader;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u000e\u0010\r\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/TransformShader;", "", "<init>", "()V", "aMatrix", "Landroid/graphics/Matrix;", "obtainMatrix", ViewProps.TRANSFORM, "", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-Q8lPUPs", "([F)V", "value", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shader", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/TransformShader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1#2:236\n*E\n"})
/* loaded from: classes13.dex */
public final class TransformShader {

    @Nullable
    private android.graphics.Matrix aMatrix;

    @Nullable
    private Shader shader;

    private final android.graphics.Matrix obtainMatrix() {
        android.graphics.Matrix matrix = this.aMatrix;
        if (matrix != null) {
            return matrix;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        this.aMatrix = matrix2;
        return matrix2;
    }

    @Nullable
    public final Shader getShader() {
        return this.shader;
    }

    public final void setShader(@Nullable Shader shader) {
        android.graphics.Matrix matrix = this.aMatrix;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.shader = shader;
    }

    /* renamed from: transform-Q8lPUPs, reason: not valid java name */
    public final void m5053transformQ8lPUPs(@Nullable float[] matrix) {
        android.graphics.Matrix matrix2;
        if (matrix == null) {
            matrix2 = null;
            this.aMatrix = null;
        } else {
            android.graphics.Matrix obtainMatrix = obtainMatrix();
            AndroidMatrixConversions_androidKt.m4512setFromEL8BTi8(obtainMatrix, matrix);
            matrix2 = obtainMatrix;
        }
        Shader shader = this.shader;
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }
}
