package com.github.florent37.viewtooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.StringRes;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class ViewTooltip {
    private View rootView;
    private Runnable showRunnable;
    private String testId;
    private final TooltipView tooltipView;
    private final View view;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.github.florent37.viewtooltip.ViewTooltip$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$ALIGN;
        static final /* synthetic */ int[] $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$Position;

        static {
            int[] iArr = new int[ALIGN.values().length];
            $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$ALIGN = iArr;
            try {
                iArr[ALIGN.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$ALIGN[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$Position = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$Position[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$Position[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$Position[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ALIGN {
        START,
        CENTER,
        END
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ListenerDisplay {
        void onDisplay(View view);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ListenerHide {
        void onHide(View view);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Position {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TooltipAnimation {
        void animateEnter(View view, Animator.AnimatorListener animatorListener);

        void animateExit(View view, Animator.AnimatorListener animatorListener);
    }

    private ViewTooltip(MyContext myContext, View view, View view2) {
        this.testId = null;
        this.rootView = view;
        this.view = view2;
        this.tooltipView = new TooltipView(myContext.getContext());
        initializeAccessibilityDelegate();
        initializeOnScrollChangeListener();
    }

    private void cleanUpRunnable() {
        Runnable runnable;
        View view = this.view;
        if (view == null || (runnable = this.showRunnable) == null) {
            return;
        }
        view.removeCallbacks(runnable);
    }

    private NestedScrollView findScrollParent(View view) {
        if (view.getParent() == null || !(view.getParent() instanceof View)) {
            return null;
        }
        return view.getParent() instanceof NestedScrollView ? (NestedScrollView) view.getParent() : findScrollParent((View) view.getParent());
    }

    private static Activity getActivityContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private void initializeAccessibilityDelegate() {
        ViewCompat.setAccessibilityDelegate(this.tooltipView, new AccessibilityDelegateCompat() { // from class: com.github.florent37.viewtooltip.ViewTooltip.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (ViewTooltip.this.testId != null) {
                    accessibilityNodeInfoCompat.setViewIdResourceName(ViewTooltip.this.testId);
                }
            }
        });
    }

    private void initializeOnScrollChangeListener() {
        NestedScrollView findScrollParent = findScrollParent(this.view);
        if (findScrollParent != null) {
            findScrollParent.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.github.florent37.viewtooltip.ViewTooltip.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                    ViewTooltip.this.tooltipView.setTranslationY(ViewTooltip.this.tooltipView.getTranslationY() - (i2 - i4));
                }
            });
        }
    }

    public static ViewTooltip on(View view) {
        return new ViewTooltip(new MyContext(getActivityContext(view.getContext())), view);
    }

    public ViewTooltip align(ALIGN align) {
        this.tooltipView.setAlign(align);
        return this;
    }

    public ViewTooltip animation(TooltipAnimation tooltipAnimation) {
        this.tooltipView.setTooltipAnimation(tooltipAnimation);
        return this;
    }

    public ViewTooltip arrowHeight(int i) {
        this.tooltipView.setArrowHeight(i);
        return this;
    }

    public ViewTooltip arrowSourceMargin(int i) {
        this.tooltipView.setArrowSourceMargin(i);
        return this;
    }

    public ViewTooltip arrowTargetMargin(int i) {
        this.tooltipView.setArrowTargetMargin(i);
        return this;
    }

    public ViewTooltip arrowWidth(int i) {
        this.tooltipView.setArrowWidth(i);
        return this;
    }

    public ViewTooltip autoHide(boolean z, long j) {
        this.tooltipView.setAutoHide(z);
        this.tooltipView.setDuration(j);
        return this;
    }

    public ViewTooltip border(int i, float f) {
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        this.tooltipView.setBorderPaint(paint);
        return this;
    }

    public ViewTooltip clickToHide(boolean z) {
        this.tooltipView.setClickToHide(z);
        return this;
    }

    public void close() {
        cleanUpRunnable();
        this.tooltipView.close();
    }

    public void closeNow() {
        cleanUpRunnable();
        this.tooltipView.closeNow();
    }

    public ViewTooltip color(int i) {
        this.tooltipView.setColor(i);
        return this;
    }

    public ViewTooltip corner(int i) {
        this.tooltipView.setCorner(i);
        return this;
    }

    public ViewTooltip customView(int i) {
        this.tooltipView.setCustomView(((Activity) this.view.getContext()).findViewById(i));
        return this;
    }

    public ViewTooltip distanceWithArrow(int i) {
        this.tooltipView.setDistanceWithArrow(i);
        return this;
    }

    public ViewTooltip distanceWithView(int i) {
        this.tooltipView.setDistanceWithView(i);
        return this;
    }

    public ViewTooltip duration(long j) {
        this.tooltipView.setDuration(j);
        return this;
    }

    public ViewTooltip margin(int i, int i2, int i3, int i4) {
        this.tooltipView.setMargin(i, i2, i3, i4);
        return this;
    }

    public ViewTooltip onDisplay(ListenerDisplay listenerDisplay) {
        this.tooltipView.setListenerDisplay(listenerDisplay);
        return this;
    }

    public ViewTooltip onHide(ListenerHide listenerHide) {
        this.tooltipView.setListenerHide(listenerHide);
        return this;
    }

    public ViewTooltip padding(int i, int i2, int i3, int i4) {
        this.tooltipView.paddingTop = i2;
        this.tooltipView.paddingBottom = i4;
        this.tooltipView.paddingLeft = i;
        this.tooltipView.paddingRight = i3;
        return this;
    }

    public ViewTooltip position(Position position) {
        this.tooltipView.setPosition(position);
        return this;
    }

    public ViewTooltip setTextGravity(int i) {
        this.tooltipView.setTextGravity(i);
        return this;
    }

    public ViewTooltip shadowColor(@ColorInt int i) {
        this.tooltipView.setShadowColor(i);
        return this;
    }

    public TooltipView show() {
        Context context = this.tooltipView.getContext();
        if (context != null && (context instanceof Activity)) {
            View view = this.rootView;
            final ViewGroup viewGroup = view != null ? (ViewGroup) view : (ViewGroup) ((Activity) context).getWindow().getDecorView();
            Runnable runnable = new Runnable() { // from class: com.github.florent37.viewtooltip.ViewTooltip.3
                @Override // java.lang.Runnable
                public void run() {
                    final Rect rect = new Rect();
                    ViewTooltip.this.view.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    Point point = new Point();
                    viewGroup.getGlobalVisibleRect(rect2, point);
                    int[] iArr = new int[2];
                    ViewTooltip.this.view.getLocationOnScreen(iArr);
                    int i = iArr[0];
                    int i2 = rect.top;
                    int i3 = point.y;
                    rect.top = i2 - i3;
                    rect.bottom -= i3;
                    int i4 = point.x;
                    rect.left = i - i4;
                    rect.right -= i4;
                    viewGroup.addView(ViewTooltip.this.tooltipView, -2, -2);
                    ViewTooltip.this.tooltipView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.github.florent37.viewtooltip.ViewTooltip.3.1
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
                            ViewTooltip.this.tooltipView.setup(rect, viewGroup.getWidth());
                            ViewTooltip.this.tooltipView.getViewTreeObserver().removeOnPreDrawListener(this);
                            return false;
                        }
                    });
                }
            };
            this.showRunnable = runnable;
            this.view.postDelayed(runnable, 100L);
        }
        return this.tooltipView;
    }

    public ViewTooltip testId(String str) {
        this.testId = str;
        return this;
    }

    public ViewTooltip text(String str) {
        this.tooltipView.setText(str);
        return this;
    }

    public ViewTooltip textColor(int i) {
        this.tooltipView.setTextColor(i);
        return this;
    }

    public ViewTooltip textSize(int i, float f) {
        this.tooltipView.setTextSize(i, f);
        return this;
    }

    public ViewTooltip textTypeFace(Typeface typeface) {
        this.tooltipView.setTextTypeFace(typeface);
        return this;
    }

    public ViewTooltip withShadow(boolean z) {
        this.tooltipView.setWithShadow(z);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MyContext {
        private Activity activity;
        private Context context;
        private Fragment fragment;

        public MyContext(Activity activity) {
            this.activity = activity;
        }

        public Activity getActivity() {
            Activity activity = this.activity;
            return activity != null ? activity : this.fragment.getActivity();
        }

        public Context getContext() {
            Activity activity = this.activity;
            return activity != null ? activity : this.fragment.getActivity();
        }

        public Window getWindow() {
            Activity activity = this.activity;
            if (activity != null) {
                return activity.getWindow();
            }
            Fragment fragment = this.fragment;
            return fragment instanceof DialogFragment ? ((DialogFragment) fragment).getDialog().getWindow() : fragment.getActivity().getWindow();
        }

        public MyContext(Fragment fragment) {
            this.fragment = fragment;
        }

        public MyContext(Context context) {
            this.context = context;
        }
    }

    public ViewTooltip color(Paint paint) {
        this.tooltipView.setPaint(paint);
        return this;
    }

    public ViewTooltip text(@StringRes int i) {
        this.tooltipView.setText(i);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FadeTooltipAnimation implements TooltipAnimation {
        private long fadeDuration;

        public FadeTooltipAnimation() {
            this.fadeDuration = 400L;
        }

        @Override // com.github.florent37.viewtooltip.ViewTooltip.TooltipAnimation
        public void animateEnter(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.fadeDuration).setListener(animatorListener);
        }

        @Override // com.github.florent37.viewtooltip.ViewTooltip.TooltipAnimation
        public void animateExit(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(0.0f).setDuration(this.fadeDuration).setListener(animatorListener);
        }

        public FadeTooltipAnimation(long j) {
            this.fadeDuration = j;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TooltipView extends FrameLayout {
        private static final int MARGIN_SCREEN_BORDER_TOOLTIP = 30;
        private ALIGN align;
        private int arrowHeight;
        private int arrowSourceMargin;
        private int arrowTargetMargin;
        private int arrowWidth;
        private boolean autoHide;
        private Paint borderPaint;
        private Paint bubblePaint;
        private Path bubblePath;
        protected View childView;
        private boolean clickToHide;
        private int color;
        private int corner;
        private int distanceWithArrow;
        private int distanceWithView;
        private long duration;
        private ListenerDisplay listenerDisplay;
        private ListenerHide listenerHide;
        private int marginBottom;
        private int marginLeft;
        private int marginRight;
        private int marginTop;
        private int paddingBottom;
        private int paddingLeft;
        private int paddingRight;
        private int paddingTop;
        private Position position;
        private int shadowColor;
        final float shadowPadding;
        final float shadowWidth;
        final float shadowYShift;
        private TooltipAnimation tooltipAnimation;
        private Rect viewRect;

        public TooltipView(Context context) {
            super(context);
            this.arrowHeight = 15;
            this.arrowWidth = 15;
            this.arrowSourceMargin = 0;
            this.arrowTargetMargin = 0;
            this.color = Color.parseColor("#1F7C82");
            this.position = Position.BOTTOM;
            this.align = ALIGN.CENTER;
            this.autoHide = true;
            this.duration = 4000L;
            this.tooltipAnimation = new FadeTooltipAnimation();
            this.corner = 30;
            this.paddingTop = 20;
            this.paddingBottom = 30;
            this.paddingRight = 30;
            this.paddingLeft = 30;
            this.marginTop = 0;
            this.marginBottom = 0;
            this.marginRight = 0;
            this.marginLeft = 0;
            this.shadowWidth = 5.0f;
            this.shadowPadding = 5.0f;
            this.shadowYShift = 3.0f;
            this.distanceWithView = 0;
            this.distanceWithArrow = 0;
            this.shadowColor = Color.parseColor("#aaaaaa");
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.childView = textView;
            textView.setTextColor(-1);
            addView(this.childView, -2, -2);
            this.childView.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.bubblePaint = paint;
            paint.setColor(this.color);
            this.bubblePaint.setStyle(Paint.Style.FILL);
            this.borderPaint = null;
            setLayerType(1, this.bubblePaint);
            setWithShadow(true);
        }

        private void adjustAlignOffset(Rect rect, int i) {
            Position position = this.position;
            if (position == Position.LEFT || position == Position.RIGHT) {
                return;
            }
            ALIGN align = this.align;
            int i2 = 0;
            if (align == ALIGN.START) {
                i2 = Math.max(((getWidth() / 2) - this.distanceWithArrow) - this.marginLeft, 0);
            } else if (align == ALIGN.END) {
                i2 = -Math.max(((getWidth() / 2) - this.distanceWithArrow) - this.marginRight, 0);
            }
            rect.left += i2;
            rect.right += i2;
            setAlign(ALIGN.CENTER);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void adjustSizeOnChange(Rect rect, int i) {
            Position position = this.position;
            if (position == Position.TOP || position == Position.BOTTOM) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int width = getWidth();
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.childView.getWidth() + this.marginLeft + this.marginRight;
            Position position2 = this.position;
            if ((position2 != Position.RIGHT || rect.right + paddingRight > i) && (position2 != Position.LEFT || paddingRight > rect.left)) {
                return;
            }
            if (width > paddingRight) {
                width = paddingRight;
            }
            layoutParams.width = width;
            setLayoutParams(layoutParams);
        }

        private Path drawBubble(RectF rectF, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            Path path = new Path();
            if (this.viewRect == null) {
                return path;
            }
            float f7 = f < 0.0f ? 0.0f : f;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            float f9 = f4 < 0.0f ? 0.0f : f4;
            float f10 = f3 < 0.0f ? 0.0f : f3;
            Position position = this.position;
            Position position2 = Position.RIGHT;
            float f11 = position == position2 ? this.arrowHeight : this.marginLeft;
            Position position3 = Position.BOTTOM;
            float f12 = position == position3 ? this.arrowHeight : this.marginTop;
            Position position4 = Position.LEFT;
            float f13 = position == position4 ? this.arrowHeight : this.marginRight;
            Position position5 = Position.TOP;
            float f14 = position == position5 ? this.arrowHeight : this.marginBottom;
            float f15 = f11 + rectF.left;
            float f16 = f12 + rectF.top;
            float f17 = rectF.right - f13;
            float f18 = rectF.bottom - f14;
            float centerX = r3.centerX() - getX();
            float f19 = f7;
            float f20 = f8;
            float f21 = Arrays.asList(position5, position3).contains(this.position) ? this.arrowSourceMargin + centerX : centerX;
            if (Arrays.asList(position5, position3).contains(this.position)) {
                centerX += this.arrowTargetMargin;
            }
            if (Arrays.asList(position2, position4).contains(this.position)) {
                f5 = 2.0f;
                f6 = (f18 / 2.0f) - this.arrowSourceMargin;
            } else {
                f5 = 2.0f;
                f6 = f18 / 2.0f;
            }
            float f22 = f6;
            float f23 = Arrays.asList(position2, position4).contains(this.position) ? (f18 / f5) - this.arrowTargetMargin : f18 / f5;
            setPivotX(centerX);
            this.childView.setPivotX(centerX);
            int i = AnonymousClass4.$SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$Position[this.position.ordinal()];
            float f24 = f9;
            if (i == 1) {
                setPivotY(getMeasuredHeight());
                this.childView.setPivotY(getMeasuredHeight());
            } else if (i == 2) {
                setPivotY(0.0f);
                this.childView.setPivotY(0.0f);
            } else if (i == 3) {
                setPivotX(0.0f);
                this.childView.setPivotX(0.0f);
                setPivotY(getMeasuredHeight() / f5);
                this.childView.setPivotY(getMeasuredHeight() / f5);
            } else if (i == 4) {
                setPivotX(0.0f);
                this.childView.setPivotX(0.0f);
                setPivotY(getMeasuredHeight() / f5);
                this.childView.setPivotY(getMeasuredHeight() / f5);
            }
            float f25 = f19 / f5;
            float f26 = f15 + f25;
            path.moveTo(f26, f16);
            if (this.position == position3) {
                path.lineTo(f21 - this.arrowWidth, f16);
                path.lineTo(centerX, rectF.top);
                path.lineTo(f21 + this.arrowWidth, f16);
            }
            float f27 = f20 / f5;
            path.lineTo(f17 - f27, f16);
            path.quadTo(f17, f16, f17, f27 + f16);
            if (this.position == position4) {
                path.lineTo(f17, f22 - this.arrowWidth);
                path.lineTo(rectF.right, f23);
                path.lineTo(f17, f22 + this.arrowWidth);
            }
            float f28 = f10 / f5;
            path.lineTo(f17, f18 - f28);
            path.quadTo(f17, f18, f17 - f28, f18);
            if (this.position == position5) {
                path.lineTo(f21 + this.arrowWidth, f18);
                path.lineTo(centerX, rectF.bottom);
                path.lineTo(f21 - this.arrowWidth, f18);
            }
            float f29 = f24 / f5;
            path.lineTo(f15 + f29, f18);
            path.quadTo(f15, f18, f15, f18 - f29);
            if (this.position == position2) {
                path.lineTo(f15, f22 + this.arrowWidth);
                path.lineTo(rectF.left, f23);
                path.lineTo(f15, f22 - this.arrowWidth);
            }
            path.lineTo(f15, f16 + f25);
            path.quadTo(f15, f16, f26, f16);
            path.close();
            return path;
        }

        private int getAlignOffset(int i, int i2) {
            int i3 = AnonymousClass4.$SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$ALIGN[this.align.ordinal()];
            if (i3 == 1) {
                return i2 - i;
            }
            if (i3 != 2) {
                return 0;
            }
            return (i2 - i) / 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSetup(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(5.0f, 5.0f, getWidth() - 10.0f, getHeight() - 10.0f);
            int i = this.corner;
            this.bubblePath = drawBubble(rectF, i, i, i, i);
            startEnterAnimation();
            handleAutoRemove();
        }

        public boolean adjustSize(Rect rect, int i) {
            getGlobalVisibleRect(new Rect());
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            boolean z = true;
            if (this.position == Position.LEFT) {
                int width = getWidth();
                int i2 = rect.left;
                if (width > i2) {
                    layoutParams.width = (i2 - 30) - this.distanceWithView;
                    setLayoutParams(layoutParams);
                    postInvalidate();
                    return z;
                }
            }
            if (this.position == Position.RIGHT) {
                if (getWidth() + rect.right > i) {
                    layoutParams.width = ((i - rect.right) - 30) - this.distanceWithView;
                    setLayoutParams(layoutParams);
                    postInvalidate();
                    return z;
                }
            }
            Position position = this.position;
            if (position == Position.TOP || position == Position.BOTTOM) {
                adjustAlignOffset(rect, i);
                int i3 = rect.left;
                int i4 = rect.right;
                float f = i;
                if ((getWidth() / 2.0f) + rect.centerX() > f) {
                    float width2 = ((getWidth() / 2.0f) + rect.centerX()) - f;
                    i3 = (int) (i3 - width2);
                    i4 = (int) (i4 - width2);
                    setAlign(ALIGN.CENTER);
                } else if (rect.centerX() - (getWidth() / 2.0f) < 0.0f) {
                    float f2 = -(rect.centerX() - (getWidth() / 2.0f));
                    i3 = (int) (i3 + f2);
                    i4 = (int) (i4 + f2);
                    setAlign(ALIGN.CENTER);
                } else {
                    z = false;
                }
                rect.left = i3;
                rect.right = i4;
            } else {
                z = false;
            }
            setLayoutParams(layoutParams);
            postInvalidate();
            return z;
        }

        public void close() {
            remove();
        }

        public void closeNow() {
            removeNow();
        }

        public int getArrowHeight() {
            return this.arrowHeight;
        }

        public int getArrowSourceMargin() {
            return this.arrowSourceMargin;
        }

        public int getArrowTargetMargin() {
            return this.arrowTargetMargin;
        }

        public int getArrowWidth() {
            return this.arrowWidth;
        }

        public void handleAutoRemove() {
            if (this.clickToHide) {
                setOnClickListener(new View.OnClickListener() { // from class: com.github.florent37.viewtooltip.ViewTooltip.TooltipView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TooltipView.this.clickToHide) {
                            TooltipView.this.remove();
                        }
                    }
                });
            }
            if (this.autoHide) {
                postDelayed(new Runnable() { // from class: com.github.florent37.viewtooltip.ViewTooltip.TooltipView.4
                    @Override // java.lang.Runnable
                    public void run() {
                        TooltipView.this.remove();
                    }
                }, this.duration);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            createAccessibilityNodeInfo();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.bubblePath;
            if (path != null) {
                canvas.drawPath(path, this.bubblePaint);
                Paint paint = this.borderPaint;
                if (paint != null) {
                    canvas.drawPath(this.bubblePath, paint);
                }
            }
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            RectF rectF = new RectF(5.0f, 5.0f, i - 10.0f, i2 - 10.0f);
            int i5 = this.corner;
            this.bubblePath = drawBubble(rectF, i5, i5, i5, i5);
        }

        public void remove() {
            startExitAnimation(new AnimatorListenerAdapter() { // from class: com.github.florent37.viewtooltip.ViewTooltip.TooltipView.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    TooltipView.this.removeNow();
                }
            });
        }

        public void removeNow() {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
        }

        public void setAlign(ALIGN align) {
            this.align = align;
            postInvalidate();
        }

        public void setArrowHeight(int i) {
            this.arrowHeight = i;
            postInvalidate();
        }

        public void setArrowSourceMargin(int i) {
            this.arrowSourceMargin = i;
            postInvalidate();
        }

        public void setArrowTargetMargin(int i) {
            this.arrowTargetMargin = i;
            postInvalidate();
        }

        public void setArrowWidth(int i) {
            this.arrowWidth = i;
            postInvalidate();
        }

        public void setAutoHide(boolean z) {
            this.autoHide = z;
        }

        public void setBorderPaint(Paint paint) {
            this.borderPaint = paint;
            postInvalidate();
        }

        public void setClickToHide(boolean z) {
            this.clickToHide = z;
        }

        public void setColor(int i) {
            this.color = i;
            this.bubblePaint.setColor(i);
            postInvalidate();
        }

        public void setCorner(int i) {
            this.corner = i;
        }

        public void setCustomView(View view) {
            removeView(this.childView);
            this.childView = view;
            addView(view, -2, -2);
        }

        public void setDistanceWithArrow(int i) {
            this.distanceWithArrow = i;
            postInvalidate();
        }

        public void setDistanceWithView(int i) {
            this.distanceWithView = i;
        }

        public void setDuration(long j) {
            this.duration = j;
        }

        public void setListenerDisplay(ListenerDisplay listenerDisplay) {
            this.listenerDisplay = listenerDisplay;
        }

        public void setListenerHide(ListenerHide listenerHide) {
            this.listenerHide = listenerHide;
        }

        public void setMargin(int i, int i2, int i3, int i4) {
            this.marginLeft = i;
            this.marginTop = i2;
            this.marginRight = i3;
            this.marginBottom = i2;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(this.childView.getPaddingLeft() + i, this.childView.getPaddingTop() + i2, this.childView.getPaddingRight() + i3, this.childView.getPaddingBottom() + i4);
            this.childView.setLayoutParams(layoutParams);
            postInvalidate();
        }

        public void setPaint(Paint paint) {
            this.bubblePaint = paint;
            setLayerType(1, paint);
            postInvalidate();
        }

        public void setPosition(Position position) {
            this.position = position;
            int i = AnonymousClass4.$SwitchMap$com$github$florent37$viewtooltip$ViewTooltip$Position[position.ordinal()];
            if (i == 1) {
                setPadding(this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom + this.arrowHeight);
            } else if (i == 2) {
                setPadding(this.paddingLeft, this.paddingTop + this.arrowHeight, this.paddingRight, this.paddingBottom);
            } else if (i == 3) {
                setPadding(this.paddingLeft, this.paddingTop, this.paddingRight + this.arrowHeight, this.paddingBottom);
            } else if (i == 4) {
                setPadding(this.paddingLeft + this.arrowHeight, this.paddingTop, this.paddingRight, this.paddingBottom);
            }
            postInvalidate();
        }

        public void setShadowColor(int i) {
            this.shadowColor = i;
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.childView;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i) {
            View view = this.childView;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            }
            postInvalidate();
        }

        public void setTextGravity(int i) {
            View view = this.childView;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i);
            }
            postInvalidate();
        }

        public void setTextSize(int i, float f) {
            View view = this.childView;
            if (view instanceof TextView) {
                ((TextView) view).setTextSize(i, f);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.childView;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(TooltipAnimation tooltipAnimation) {
            this.tooltipAnimation = tooltipAnimation;
        }

        public void setWithShadow(boolean z) {
            Paint paint = this.bubblePaint;
            if (z) {
                paint.setShadowLayer(5.0f, 0.0f, 3.0f, this.shadowColor);
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }

        public void setup(Rect rect, final int i) {
            this.viewRect = new Rect(rect);
            final Rect rect2 = new Rect(rect);
            if (adjustSize(rect2, i)) {
                getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.github.florent37.viewtooltip.ViewTooltip.TooltipView.6
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        TooltipView.this.adjustSizeOnChange(rect2, i);
                        TooltipView.this.onSetup(rect2);
                        TooltipView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        return false;
                    }
                });
            } else {
                onSetup(rect2);
            }
        }

        public void setupPosition(Rect rect) {
            int width;
            int alignOffset;
            Position position = this.position;
            Position position2 = Position.LEFT;
            if (position == position2 || position == Position.RIGHT) {
                width = position == position2 ? (rect.left - getWidth()) - this.distanceWithView : rect.right + this.distanceWithView;
                alignOffset = rect.top + getAlignOffset(getHeight(), rect.height());
            } else {
                alignOffset = position == Position.BOTTOM ? rect.bottom + this.distanceWithView : (rect.top - getHeight()) - this.distanceWithView;
                width = rect.left + getAlignOffset(getWidth(), rect.width());
            }
            setX(width);
            setY(alignOffset);
        }

        public void startEnterAnimation() {
            this.tooltipAnimation.animateEnter(this, new AnimatorListenerAdapter() { // from class: com.github.florent37.viewtooltip.ViewTooltip.TooltipView.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (TooltipView.this.listenerDisplay != null) {
                        TooltipView.this.listenerDisplay.onDisplay(TooltipView.this);
                    }
                }
            });
        }

        public void startExitAnimation(final Animator.AnimatorListener animatorListener) {
            this.tooltipAnimation.animateExit(this, new AnimatorListenerAdapter() { // from class: com.github.florent37.viewtooltip.ViewTooltip.TooltipView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    animatorListener.onAnimationEnd(animator);
                    if (TooltipView.this.listenerHide != null) {
                        TooltipView.this.listenerHide.onHide(TooltipView.this);
                    }
                }
            });
        }

        public void setText(int i) {
            View view = this.childView;
            if (view instanceof TextView) {
                ((TextView) view).setText(i);
            }
            postInvalidate();
        }
    }

    public ViewTooltip customView(View view) {
        this.tooltipView.setCustomView(view);
        return this;
    }

    public static ViewTooltip on(Fragment fragment, View view) {
        return new ViewTooltip(new MyContext(fragment), view);
    }

    public static ViewTooltip on(Activity activity, View view) {
        return new ViewTooltip(new MyContext(getActivityContext(activity)), view);
    }

    public static ViewTooltip on(Activity activity, View view, View view2) {
        return new ViewTooltip(new MyContext(getActivityContext(activity)), view, view2);
    }

    private ViewTooltip(MyContext myContext, View view) {
        this.testId = null;
        this.view = view;
        this.tooltipView = new TooltipView(myContext.getContext());
        initializeAccessibilityDelegate();
        initializeOnScrollChangeListener();
    }

    private ViewTooltip(View view) {
        this(new MyContext(getActivityContext(view.getContext())), view);
    }
}
