package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class NavigationRailFrameLayout extends FrameLayout {
    int paddingTop;
    boolean scrollingEnabled;

    public NavigationRailFrameLayout(@NonNull Context context) {
        super(context);
        this.paddingTop = 0;
        this.scrollingEnabled = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i5 = this.paddingTop;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int max = Math.max(i5, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), max, childAt.getRight(), childAt.getMeasuredHeight() + max);
            i5 = max + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i2);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i, i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            i3 = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i4 = (size - i3) - this.paddingTop;
            childAt = getChildAt(1);
            if (!this.scrollingEnabled) {
                i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.paddingTop + i3 + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i) {
        this.paddingTop = i;
    }

    public void setScrollingEnabled(boolean z) {
        this.scrollingEnabled = z;
    }
}
