package com.amazon.alexa.redesign.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.repository.FeatureRepositoryKt;
import com.amazon.alexa.redesign.utils.ReactAccessibilityActionIds;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.deecomms.common.metrics.MetricKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 72\u00020\u0001:\u00017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0012H&J\u0016\u0010'\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0014J\u0016\u0010+\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0014J\u0012\u0010,\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00100\u001a\u00020\u0012H\u0014J\b\u00101\u001a\u00020\u0012H\u0014J\"\u00102\u001a\u0004\u0018\u00010\u00192\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020$H\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010 \u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020$X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010/\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/amazon/alexa/redesign/view/ReactSurfaceContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "surfaceComponentName", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getSurfaceComponentName$AlexaMobileAndroidHomeChannel_release", "()Ljava/lang/String;", "passThroughTouches", "", "getPassThroughTouches", "()Z", "setPassThroughTouches", "(Z)V", "onDescendantAccessibilityFocused", "Lkotlin/Function0;", "", "getOnDescendantAccessibilityFocused", "()Lkotlin/jvm/functions/Function0;", "setOnDescendantAccessibilityFocused", "(Lkotlin/jvm/functions/Function0;)V", "onRequestSendAccessibilityEvent", MetricKeys.VALUE_IS_CHILD, "Landroid/view/View;", "event", "Landroid/view/accessibility/AccessibilityEvent;", "updateProps", "props", "Landroid/os/Bundle;", "stopSurface", "isSurfaceRunning", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "surfaceHostId", "", "getSurfaceHostId", "()I", "dispatchSaveInstanceState", "container", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchRestoreInstanceState", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "keyboardFocusEnabled", "onAttachedToWindow", "onDetachedFromWindow", "findInteractiveChild", RouteParameter.PARENT, "Landroid/view/ViewGroup;", "x", "y", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class ReactSurfaceContainer extends FrameLayout {

    @Nullable
    private final Boolean isSurfaceRunning;
    private boolean keyboardFocusEnabled;

    @Nullable
    private Function0<Unit> onDescendantAccessibilityFocused;
    private boolean passThroughTouches;

    @NotNull
    private final String surfaceComponentName;
    private final int surfaceHostId;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final KeyboardFocusRingController keyboardFocusController = new KeyboardFocusRingController();

    static {
        ReactAccessibilityActionIds.INSTANCE.register();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSurfaceContainer(@NotNull Context context, @NotNull String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.surfaceComponentName = str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NotNull SparseArray<Parcelable> container) {
        container.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(@NotNull SparseArray<Parcelable> container) {
        container.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (this.passThroughTouches && ev != null && ev.getAction() == 0 && findInteractiveChild(this, (int) ev.getX(), (int) ev.getY()) == null) {
            return false;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Nullable
    public final View findInteractiveChild(@NotNull ViewGroup parent, int x, int y) {
        View childAt;
        parent.getClass();
        Rect rect = new Rect();
        int childCount = parent.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            childAt = parent.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (x >= rect.left && x < rect.right && y >= rect.top && y < rect.bottom && (childAt.isClickable() || childAt.isFocusable() || ((childAt instanceof ViewGroup) && (childAt = findInteractiveChild((ViewGroup) childAt, x - rect.left, y - rect.top)) != null))) {
                    break;
                }
            }
        }
        return childAt;
    }

    @Nullable
    public final Function0<Unit> getOnDescendantAccessibilityFocused() {
        return this.onDescendantAccessibilityFocused;
    }

    public final boolean getPassThroughTouches() {
        return this.passThroughTouches;
    }

    @NotNull
    /* renamed from: getSurfaceComponentName$AlexaMobileAndroidHomeChannel_release, reason: from getter */
    public final String getSurfaceComponentName() {
        return this.surfaceComponentName;
    }

    public int getSurfaceHostId() {
        return this.surfaceHostId;
    }

    @Nullable
    /* renamed from: isSurfaceRunning, reason: from getter */
    public Boolean getIsSurfaceRunning() {
        return this.isSurfaceRunning;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean hasLso = FeatureRepositoryKt.getHasLso();
        this.keyboardFocusEnabled = hasLso;
        if (hasLso) {
            keyboardFocusController.onContainerAttached(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.keyboardFocusEnabled) {
            keyboardFocusController.onContainerDetached(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onRequestSendAccessibilityEvent(@NotNull View child, @NotNull AccessibilityEvent event) {
        Function0<Unit> function0;
        child.getClass();
        event.getClass();
        boolean onRequestSendAccessibilityEvent = super.onRequestSendAccessibilityEvent(child, event);
        if (onRequestSendAccessibilityEvent && event.getEventType() == 32768 && (function0 = this.onDescendantAccessibilityFocused) != null) {
            function0.invoke();
        }
        return onRequestSendAccessibilityEvent;
    }

    public final void setOnDescendantAccessibilityFocused(@Nullable Function0<Unit> function0) {
        this.onDescendantAccessibilityFocused = function0;
    }

    public final void setPassThroughTouches(boolean z) {
        this.passThroughTouches = z;
    }

    public abstract void stopSurface();

    public abstract void updateProps(@NotNull Bundle props);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/view/ReactSurfaceContainer$Companion;", "", "<init>", "()V", "keyboardFocusController", "Lcom/amazon/alexa/redesign/view/KeyboardFocusRingController;", "getKeyboardFocusController", "()Lcom/amazon/alexa/redesign/view/KeyboardFocusRingController;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KeyboardFocusRingController getKeyboardFocusController() {
            return ReactSurfaceContainer.keyboardFocusController;
        }

        private Companion() {
        }
    }
}
