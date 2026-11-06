package com.amazon.apl.android.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.amazon.apl.android.IAPLViewPresenter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes20.dex */
public class APLTextView extends View {
    private int mDrawLeft;
    private int mDrawTop;
    private Layout mLayout;
    private IAPLViewPresenter mPresenter;
    private int mVerticalGravity;

    public APLTextView(Context context, IAPLViewPresenter iAPLViewPresenter) {
        super(context);
        this.mDrawLeft = 0;
        this.mDrawTop = 0;
        this.mPresenter = iAPLViewPresenter;
    }

    @Override // android.view.View
    public void forceLayout() {
        IAPLViewPresenter iAPLViewPresenter = this.mPresenter;
        if (iAPLViewPresenter != null) {
            iAPLViewPresenter.requestLayoutFor(this);
        }
        super.forceLayout();
    }

    public Layout getLayout() {
        return this.mLayout;
    }

    public int getVerticalGravity() {
        return this.mVerticalGravity;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.mLayout == null) {
            return;
        }
        this.mDrawLeft = getPaddingLeft();
        int i = this.mVerticalGravity;
        if (i == 16) {
            this.mDrawTop = ((getPaddingTop() + (getMeasuredHeight() - getPaddingBottom())) - this.mLayout.getHeight()) / 2;
        } else if (i == 80) {
            this.mDrawTop = (getMeasuredHeight() - getPaddingBottom()) - this.mLayout.getHeight();
        } else {
            this.mDrawTop = getPaddingTop();
        }
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getScrollX() + this.mDrawLeft, getScrollY() + this.mDrawTop);
        this.mLayout.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IAPLViewPresenter iAPLViewPresenter = this.mPresenter;
        if (iAPLViewPresenter != null) {
            iAPLViewPresenter.clearLayoutRequestFor(this);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @UiThread
    public void setLayout(Layout layout) {
        this.mLayout = layout;
        invalidate();
    }

    public void setVerticalGravity(int i) {
        this.mVerticalGravity = i;
    }
}
