package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.utils.DropShadow;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface DrawingContent extends Content {
    void draw(Canvas canvas, Matrix matrix, int i, @Nullable DropShadow dropShadow);

    void getBounds(RectF rectF, Matrix matrix, boolean z);
}
