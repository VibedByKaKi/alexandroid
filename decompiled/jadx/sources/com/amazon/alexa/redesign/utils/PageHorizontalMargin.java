package com.amazon.alexa.redesign.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.cantilever.HelpViewController$$ExternalSyntheticLambda3;
import com.amazon.apl.android.Content$$ExternalSyntheticLambda0;
import com.swmansion.rnscreens.gamma.tabs.TabsHost$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/utils/PageHorizontalMargin;", "", "<init>", "()V", "calculate", "", "context", "Landroid/content/Context;", "screenWidthPx", "wrapWithResponsiveMargin", "Landroid/widget/FrameLayout;", "childView", "Landroid/view/View;", "isFullScreen", "", "updateChildMargin", "", "wrapper", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class PageHorizontalMargin {
    public static final int $stable = 0;

    @NotNull
    public static final PageHorizontalMargin INSTANCE = new PageHorizontalMargin();

    private PageHorizontalMargin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wrapWithResponsiveMargin$lambda$3$lambda$1(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        if (i9 == i7 - i5 || i9 <= 0 || !Intrinsics.areEqual(view.getTag(), Boolean.TRUE)) {
            return;
        }
        PageHorizontalMargin pageHorizontalMargin = INSTANCE;
        Context context = view.getContext();
        context.getClass();
        view.post(new HelpViewController$$ExternalSyntheticLambda3(view, pageHorizontalMargin.calculate(context, i9), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wrapWithResponsiveMargin$lambda$3$lambda$1$lambda$0(View view, int i) {
        view.getClass();
        View childAt = ((FrameLayout) view).getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2.leftMargin != i) {
            layoutParams2.leftMargin = i;
            layoutParams2.rightMargin = i;
            childAt.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wrapWithResponsiveMargin$lambda$3$lambda$2(FrameLayout frameLayout, Context context, View view) {
        int width = frameLayout.getWidth();
        if (width > 0) {
            int calculate = INSTANCE.calculate(context, width);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = calculate;
            layoutParams2.rightMargin = calculate;
            view.setLayoutParams(layoutParams2);
        }
    }

    public final int calculate(@NotNull Context context, int screenWidthPx) {
        context.getClass();
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = screenWidthPx / f;
        if (f2 < 600.0f) {
            return 0;
        }
        float f3 = 24.0f;
        if (f2 > 1008.0f) {
            f3 = f2 <= 1280.0f ? MathKt.roundToInt((((f2 - 1008.0f) / 272.0f) * 104.0f) + 24.0f) : f2 <= 1400.0f ? MathKt.roundToInt((((f2 - 1280.0f) / 120.0f) * 12.0f) + 128.0f) : MathKt.roundToInt(f2 * 0.1f);
        }
        return MathKt.roundToInt(f3 * f);
    }

    public final void updateChildMargin(@NotNull FrameLayout wrapper, boolean isFullScreen) {
        wrapper.getClass();
        wrapper.setTag(Boolean.valueOf(isFullScreen));
        View childAt = wrapper.getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (!isFullScreen) {
            if (layoutParams2.leftMargin != 0) {
                layoutParams2.leftMargin = 0;
                layoutParams2.rightMargin = 0;
                childAt.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        int width = wrapper.getWidth();
        if (width > 0) {
            Context context = wrapper.getContext();
            context.getClass();
            int calculate = calculate(context, width);
            if (layoutParams2.leftMargin != calculate) {
                layoutParams2.leftMargin = calculate;
                layoutParams2.rightMargin = calculate;
                childAt.setLayoutParams(layoutParams2);
            }
        }
    }

    @NotNull
    public final FrameLayout wrapWithResponsiveMargin(@NotNull Context context, @NotNull View childView, boolean isFullScreen) {
        context.getClass();
        childView.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(childView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setTag(Boolean.valueOf(isFullScreen));
        frameLayout.addOnLayoutChangeListener(new TabsHost$$ExternalSyntheticLambda0(1));
        if (isFullScreen) {
            frameLayout.post(new Content$$ExternalSyntheticLambda0(frameLayout, 21, context, childView));
        }
        return frameLayout;
    }
}
