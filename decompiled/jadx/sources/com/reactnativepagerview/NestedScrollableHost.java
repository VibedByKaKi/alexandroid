package com.reactnativepagerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.Metadata;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(H\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/reactnativepagerview/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "initialIndex", "", "getInitialIndex", "()Ljava/lang/Integer;", "setInitialIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "didSetInitialIndex", "", "getDidSetInitialIndex", "()Z", "setDidSetInitialIndex", "(Z)V", "touchSlop", "initialX", "", "initialY", "nativeGestureStarted", "parentViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", MetricKeys.VALUE_IS_CHILD, "Landroid/view/View;", "getChild", "()Landroid/view/View;", "canChildScroll", ModelSourceWrapper.ORIENTATION, "delta", "onInterceptTouchEvent", "e", "Landroid/view/MotionEvent;", "handleInterceptTouchEvent", "", "onTouchEvent", "react-native-pager-view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NestedScrollableHost extends FrameLayout {
    private boolean didSetInitialIndex;

    @Nullable
    private Integer initialIndex;
    private float initialX;
    private float initialY;
    private boolean nativeGestureStarted;
    private int touchSlop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        context.getClass();
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final boolean canChildScroll(int orientation, float delta) {
        int i = -((int) Math.signum(delta));
        if (orientation == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i);
            }
            return false;
        }
        if (orientation != 1) {
            Path$$ExternalSyntheticBUOutline0.m();
            return false;
        }
        View child2 = getChild();
        if (child2 != null) {
            return child2.canScrollVertically(i);
        }
        return false;
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x000d, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.viewpager2.widget.ViewPager2 getParentViewPager() {
        /*
            r2 = this;
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r2 = (android.view.View) r2
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 == 0) goto L1e
            boolean r0 = r2 instanceof androidx.viewpager2.widget.ViewPager2
            if (r0 != 0) goto L1e
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto Lc
            android.view.View r2 = (android.view.View) r2
            goto Ld
        L1e:
            boolean r0 = r2 instanceof androidx.viewpager2.widget.ViewPager2
            if (r0 == 0) goto L25
            androidx.viewpager2.widget.ViewPager2 r2 = (androidx.viewpager2.widget.ViewPager2) r2
            return r2
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.NestedScrollableHost.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
    }

    private final void handleInterceptTouchEvent(MotionEvent e) {
        ViewPager2 parentViewPager = getParentViewPager();
        Integer valueOf = parentViewPager != null ? Integer.valueOf(parentViewPager.getOrientation()) : null;
        if (e.getAction() == 0) {
            this.initialX = e.getX();
            this.initialY = e.getY();
            if (valueOf != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        if (e.getAction() == 2) {
            float x = e.getX() - this.initialX;
            float y = e.getY() - this.initialY;
            boolean z = valueOf != null && valueOf.intValue() == 0;
            float abs = Math.abs(x) * (z ? 0.5f : 1.0f);
            float abs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
            int i = this.touchSlop;
            if (abs > i || abs2 > i) {
                NativeGestureUtil.notifyNativeGestureStarted(this, e);
                this.nativeGestureStarted = true;
                if (valueOf == null) {
                    return;
                }
                if (z == (abs2 > abs)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return;
                }
                int intValue = valueOf.intValue();
                if (!z) {
                    x = y;
                }
                if (canChildScroll(intValue, x)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    public final boolean getDidSetInitialIndex() {
        return this.didSetInitialIndex;
    }

    @Nullable
    public final Integer getInitialIndex() {
        return this.initialIndex;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e) {
        e.getClass();
        handleInterceptTouchEvent(e);
        return super.onInterceptTouchEvent(e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent e) {
        e.getClass();
        if (e.getActionMasked() == 1 && this.nativeGestureStarted) {
            NativeGestureUtil.notifyNativeGestureEnded(this, e);
            this.nativeGestureStarted = false;
        }
        return super.onTouchEvent(e);
    }

    public final void setDidSetInitialIndex(boolean z) {
        this.didSetInitialIndex = z;
    }

    public final void setInitialIndex(@Nullable Integer num) {
        this.initialIndex = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
