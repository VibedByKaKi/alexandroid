package com.amazon.alexa.growth.coachmark;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.widget.FrameLayout;
import com.amazon.alexa.growth.coachmark.TourCoachMark;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FullscreenTouchInterceptorView extends FrameLayout {
    private static final float CORNER_RADIUS = 20.0f;
    private static final float HIGHLIGHT_RADIUS = 32.0f;
    private final Path path;

    public FullscreenTouchInterceptorView(Context context) {
        super(context);
        this.path = new Path();
    }

    private void setRect(View view) {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        getLocationInWindow(new int[2]);
        rectF.set(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + iArr[1]);
        invalidate();
        float f = getResources().getDisplayMetrics().density * 20.0f;
        this.path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.path.close();
    }

    private void setRound(View view) {
        view.getLocationInWindow(new int[2]);
        this.path.addCircle((view.getWidth() / 2.0f) + r0[0], (view.getHeight() / 2.0f) + r0[1], getResources().getDisplayMetrics().density * 32.0f, Path.Direction.CW);
        this.path.close();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAlpha(50);
        canvas.drawPath(this.path, paint);
        canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        super.dispatchDraw(canvas);
    }

    public void setAnchorView(View view, TourCoachMark.ANCHORVIEWSHAPE anchorviewshape) {
        if (anchorviewshape == TourCoachMark.ANCHORVIEWSHAPE.RECT) {
            setRect(view);
        } else if (anchorviewshape == TourCoachMark.ANCHORVIEWSHAPE.ROUND) {
            setRound(view);
        }
    }
}
