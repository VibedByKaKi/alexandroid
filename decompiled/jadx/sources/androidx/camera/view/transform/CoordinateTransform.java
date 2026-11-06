package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.TransformExperimental;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TransformExperimental
/* loaded from: classes.dex */
public final class CoordinateTransform {
    private static final String MISMATCH_MSG = "The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport.";
    private static final String TAG = "CoordinateTransform";
    private final Matrix mMatrix;

    public CoordinateTransform(@NonNull OutputTransform outputTransform, @NonNull OutputTransform outputTransform2) {
        if (!TransformUtils.isAspectRatioMatchingWithRoundingError(outputTransform.getViewPortSize(), outputTransform2.getViewPortSize())) {
            Logger.w(TAG, "The source viewport (" + outputTransform.getViewPortSize() + ") does not match the target viewport (" + outputTransform2.getViewPortSize() + "). Please make sure they are associated with the same Viewport.");
        }
        Matrix matrix = new Matrix();
        this.mMatrix = matrix;
        Preconditions.checkState(outputTransform.getMatrix().invert(matrix), "The source transform cannot be inverted");
        matrix.postConcat(outputTransform2.getMatrix());
    }

    public void mapPoint(@NonNull PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        this.mMatrix.mapPoints(fArr);
        pointF.x = fArr[0];
        pointF.y = fArr[1];
    }

    public void mapPoints(@NonNull float[] fArr) {
        this.mMatrix.mapPoints(fArr);
    }

    public void mapRect(@NonNull RectF rectF) {
        this.mMatrix.mapRect(rectF);
    }

    public void transform(@NonNull Matrix matrix) {
        matrix.set(this.mMatrix);
    }
}
