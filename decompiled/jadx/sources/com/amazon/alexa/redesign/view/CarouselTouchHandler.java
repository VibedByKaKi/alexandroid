package com.amazon.alexa.redesign.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/view/CarouselTouchHandler;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "touchSlop", "", "getTouchSlop$annotations", "()V", "getTouchSlop", "()I", "scrollStartY", "", "scrollEndY", "handleTouchEvent", "", "event", "Landroid/view/MotionEvent;", "viewParent", "Landroid/view/ViewParent;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CarouselTouchHandler {
    public static final int $stable = 8;
    private float scrollEndY;
    private float scrollStartY;
    private final int touchSlop;

    public CarouselTouchHandler(@NotNull Context context) {
        context.getClass();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final int getTouchSlop() {
        return this.touchSlop;
    }

    public final boolean handleTouchEvent(@NotNull MotionEvent event, @NotNull ViewParent viewParent) {
        event.getClass();
        viewParent.getClass();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.scrollStartY = event.getY();
        } else if (actionMasked == 2) {
            float y = event.getY();
            this.scrollEndY = y;
            if (Math.abs(y - this.scrollStartY) > this.touchSlop) {
                viewParent.requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        viewParent.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTouchSlop$annotations() {
    }
}
