package com.amazon.alexa.pmi.implementation.taplatency;

import android.annotation.NonNull;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.amazon.alexa.routing.data.RouteName;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J*\u0010\u0011\u001a\u00020\f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u001e\u0010\u001b\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0002\u0010!J\u001e\u0010\"\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010 0 H\u0096\u0001¢\u0006\u0002\u0010!J\u001e\u0010#\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010$0$H\u0096\u0001¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010\u000b0\u000bH\u0096\u0001¢\u0006\u0002\u0010\u001eJ\u001e\u0010'\u001a\u00020\f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010(0(H\u0096\u0001¢\u0006\u0002\u0010)J\u001e\u0010*\u001a\u00020\f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010(0(H\u0096\u0001¢\u0006\u0002\u0010)J\t\u0010+\u001a\u00020\fH\u0096\u0001J\t\u0010,\u001a\u00020\fH\u0096\u0001J \u0010-\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00182\r\b\u0001\u0010.\u001a\u00070\u0016¢\u0006\u0002\b/H\u0096\u0001J\u0018\u00100\u001a\t\u0018\u00010\u0006¢\u0006\u0002\b/2\u0006\u0010\u001c\u001a\u00020\u0018H\u0097\u0001J\t\u00101\u001a\u00020\fH\u0096\u0001J \u00102\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00182\r\b\u0001\u0010.\u001a\u000703¢\u0006\u0002\b/H\u0096\u0001J \u00104\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00182\r\b\u0001\u0010.\u001a\u00070\u0016¢\u0006\u0002\b/H\u0096\u0001J \u00105\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00182\r\b\u0001\u0010.\u001a\u00070\u0016¢\u0006\u0002\b/H\u0096\u0001J1\u00106\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00182\u000f\b\u0001\u0010.\u001a\t\u0018\u00010\u0006¢\u0006\u0002\b/2\r\b\u0001\u00107\u001a\u00070\u0016¢\u0006\u0002\b/H\u0096\u0001J\t\u00108\u001a\u00020\u000fH\u0096\u0001J\u001e\u00108\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010909H\u0096\u0001¢\u0006\u0002\u0010:J\u001e\u0010;\u001a\u00020\f2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010<0<H\u0096\u0001¢\u0006\u0002\u0010=J\u0011\u0010>\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0096\u0001J%\u0010?\u001a\t\u0018\u00010(¢\u0006\u0002\b/2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010@0@H\u0097\u0001¢\u0006\u0002\u0010AJ-\u0010?\u001a\t\u0018\u00010(¢\u0006\u0002\b/2\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010@0@2\u0006\u0010.\u001a\u00020\u0018H\u0097\u0001¢\u0006\u0002\u0010BR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/TouchForwardingCallback;", "Landroid/view/Window$Callback;", "delegate", "armer", "Lcom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmer;", "decor", "Landroid/view/View;", "<init>", "(Landroid/view/Window$Callback;Lcom/amazon/alexa/pmi/implementation/taplatency/TapGestureArmer;Landroid/view/View;)V", "feed", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "disable", "dispatchTouchEvent", "", "event", "onProvideKeyboardShortcuts", "data", "", "Landroid/view/KeyboardShortcutGroup;", RouteName.MENU, "Landroid/view/Menu;", "deviceId", "", "onPointerCaptureChanged", "hasCapture", "dispatchGenericMotionEvent", "p0", "kotlin.jvm.PlatformType", "(Landroid/view/MotionEvent;)Z", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchPopulateAccessibilityEvent", "Landroid/view/accessibility/AccessibilityEvent;", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "dispatchTrackballEvent", "onActionModeFinished", "Landroid/view/ActionMode;", "(Landroid/view/ActionMode;)V", "onActionModeStarted", "onAttachedToWindow", "onContentChanged", "onCreatePanelMenu", "p1", "Lkotlin/jvm/internal/EnhancedNullability;", "onCreatePanelView", "onDetachedFromWindow", "onMenuItemSelected", "Landroid/view/MenuItem;", "onMenuOpened", "onPanelClosed", "onPreparePanel", "p2", "onSearchRequested", "Landroid/view/SearchEvent;", "(Landroid/view/SearchEvent;)Z", "onWindowAttributesChanged", "Landroid/view/WindowManager$LayoutParams;", "(Landroid/view/WindowManager$LayoutParams;)V", "onWindowFocusChanged", "onWindowStartingActionMode", "Landroid/view/ActionMode$Callback;", "(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;", "(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TouchForwardingCallback implements Window.Callback {

    @NotNull
    private final Window.Callback delegate;

    @Nullable
    private Function1<? super MotionEvent, Unit> feed;

    public TouchForwardingCallback(@NotNull Window.Callback callback, @NotNull TapGestureArmer tapGestureArmer, @NotNull View view) {
        callback.getClass();
        tapGestureArmer.getClass();
        view.getClass();
        this.delegate = callback;
        this.feed = new PixelCopyChangeDetector$$ExternalSyntheticLambda0(tapGestureArmer, view, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit feed$lambda$0(TapGestureArmer tapGestureArmer, View view, MotionEvent motionEvent) {
        motionEvent.getClass();
        tapGestureArmer.onTouchEvent(motionEvent, view);
        return Unit.INSTANCE;
    }

    public final void disable() {
        this.feed = null;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent p0) {
        return this.delegate.dispatchGenericMotionEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent p0) {
        return this.delegate.dispatchKeyEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent p0) {
        return this.delegate.dispatchKeyShortcutEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0) {
        return this.delegate.dispatchPopulateAccessibilityEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        try {
            Function1<? super MotionEvent, Unit> function1 = this.feed;
            if (function1 != null) {
                function1.invoke(event);
            }
        } catch (Throwable th) {
            Log.e(GlobalTapLatencyMonitorKt.TAP_LATENCY_TAG, "secondary-window touch feed threw; skipped", th);
        }
        return this.delegate.dispatchTouchEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent p0) {
        return this.delegate.dispatchTrackballEvent(p0);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode p0) {
        this.delegate.onActionModeFinished(p0);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode p0) {
        this.delegate.onActionModeStarted(p0);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.delegate.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.delegate.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int p0, @NonNull @NotNull Menu p1) {
        p1.getClass();
        return this.delegate.onCreatePanelMenu(p0, p1);
    }

    @Override // android.view.Window.Callback
    @android.annotation.Nullable
    @Nullable
    public View onCreatePanelView(int p0) {
        return this.delegate.onCreatePanelView(p0);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.delegate.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int p0, @NonNull @NotNull MenuItem p1) {
        p1.getClass();
        return this.delegate.onMenuItemSelected(p0, p1);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int p0, @NonNull @NotNull Menu p1) {
        p1.getClass();
        return this.delegate.onMenuOpened(p0, p1);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int p0, @NonNull @NotNull Menu p1) {
        p1.getClass();
        this.delegate.onPanelClosed(p0, p1);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean hasCapture) {
        this.delegate.onPointerCaptureChanged(hasCapture);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int p0, @android.annotation.Nullable @Nullable View p1, @NonNull @NotNull Menu p2) {
        p2.getClass();
        return this.delegate.onPreparePanel(p0, p1, p2);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(@Nullable List<KeyboardShortcutGroup> data, @Nullable Menu menu, int deviceId) {
        this.delegate.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.delegate.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams p0) {
        this.delegate.onWindowAttributesChanged(p0);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean p0) {
        this.delegate.onWindowFocusChanged(p0);
    }

    @Override // android.view.Window.Callback
    @android.annotation.Nullable
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback p0) {
        return this.delegate.onWindowStartingActionMode(p0);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent p0) {
        return this.delegate.onSearchRequested(p0);
    }

    @Override // android.view.Window.Callback
    @android.annotation.Nullable
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback p0, int p1) {
        return this.delegate.onWindowStartingActionMode(p0, p1);
    }
}
