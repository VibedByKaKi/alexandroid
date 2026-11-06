package com.amazon.apl.android.utils;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TransformUtils {
    public static void applyChildTransformToParentCanvas(Matrix matrix, View view, Canvas canvas) {
        int top = view.getTop();
        int left = view.getLeft();
        matrix.preTranslate(-left, -top);
        matrix.postTranslate(left, top);
        canvas.concat(matrix);
    }
}
