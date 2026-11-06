package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.view.TransformExperimental;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TransformExperimental
/* loaded from: classes.dex */
public final class OutputTransform {

    @NonNull
    final Matrix mMatrix;

    @NonNull
    final Size mViewPortSize;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OutputTransform(@NonNull Matrix matrix, @NonNull Size size) {
        this.mMatrix = matrix;
        this.mViewPortSize = size;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Matrix getMatrix() {
        return this.mMatrix;
    }

    @NonNull
    public Size getViewPortSize() {
        return this.mViewPortSize;
    }
}
