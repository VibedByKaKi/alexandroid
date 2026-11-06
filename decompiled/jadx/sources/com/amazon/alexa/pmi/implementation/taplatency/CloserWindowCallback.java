package com.amazon.alexa.pmi.implementation.taplatency;

import android.annotation.NonNull;
import android.os.SystemClock;
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
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J*\u0010\u001a\u001a\u00020\u00062\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000eH\u0016J\u001e\u0010$\u001a\u00020\u000e2\u000e\u0010%\u001a\n &*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\u00020\u000e2\u000e\u0010%\u001a\n &*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001¢\u0006\u0002\u0010)J\u001e\u0010*\u001a\u00020\u000e2\u000e\u0010%\u001a\n &*\u0004\u0018\u00010+0+H\u0096\u0001¢\u0006\u0002\u0010,J\u001e\u0010-\u001a\u00020\u000e2\u000e\u0010%\u001a\n &*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001¢\u0006\u0002\u0010'J\u001e\u0010.\u001a\u00020\u00062\u000e\u0010%\u001a\n &*\u0004\u0018\u00010/0/H\u0096\u0001¢\u0006\u0002\u00100J\u001e\u00101\u001a\u00020\u00062\u000e\u0010%\u001a\n &*\u0004\u0018\u00010/0/H\u0096\u0001¢\u0006\u0002\u00100J\t\u00102\u001a\u00020\u0006H\u0096\u0001J\t\u00103\u001a\u00020\u0006H\u0096\u0001J \u00104\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020!2\r\b\u0001\u00105\u001a\u00070\u001f¢\u0006\u0002\b6H\u0096\u0001J\u0018\u00107\u001a\t\u0018\u000108¢\u0006\u0002\b62\u0006\u0010%\u001a\u00020!H\u0097\u0001J\t\u00109\u001a\u00020\u0006H\u0096\u0001J \u0010:\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020!2\r\b\u0001\u00105\u001a\u00070;¢\u0006\u0002\b6H\u0096\u0001J \u0010<\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020!2\r\b\u0001\u00105\u001a\u00070\u001f¢\u0006\u0002\b6H\u0096\u0001J \u0010=\u001a\u00020\u00062\u0006\u0010%\u001a\u00020!2\r\b\u0001\u00105\u001a\u00070\u001f¢\u0006\u0002\b6H\u0096\u0001J1\u0010>\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020!2\u000f\b\u0001\u00105\u001a\t\u0018\u000108¢\u0006\u0002\b62\r\b\u0001\u0010?\u001a\u00070\u001f¢\u0006\u0002\b6H\u0096\u0001J\t\u0010@\u001a\u00020\u000eH\u0096\u0001J\u001e\u0010@\u001a\u00020\u000e2\u000e\u0010%\u001a\n &*\u0004\u0018\u00010A0AH\u0096\u0001¢\u0006\u0002\u0010BJ\u001e\u0010C\u001a\u00020\u00062\u000e\u0010%\u001a\n &*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0002\u0010EJ%\u0010F\u001a\t\u0018\u00010/¢\u0006\u0002\b62\u000e\u0010%\u001a\n &*\u0004\u0018\u00010G0GH\u0097\u0001¢\u0006\u0002\u0010HJ-\u0010F\u001a\t\u0018\u00010/¢\u0006\u0002\b62\u000e\u0010%\u001a\n &*\u0004\u0018\u00010G0G2\u0006\u00105\u001a\u00020!H\u0097\u0001¢\u0006\u0002\u0010IR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006J"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/CloserWindowCallback;", "Landroid/view/Window$Callback;", "delegate", "onTouchDown", "Lkotlin/Function1;", "", "", "onBackKey", "onFocusLost", "uptimeClock", "Lkotlin/Function0;", "<init>", "(Landroid/view/Window$Callback;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "Landroid/view/MotionEvent;", "onWindowFocusChanged", "hasFocus", "onProvideKeyboardShortcuts", "data", "", "Landroid/view/KeyboardShortcutGroup;", RouteName.MENU, "Landroid/view/Menu;", "deviceId", "", "onPointerCaptureChanged", "hasCapture", "dispatchGenericMotionEvent", "p0", "kotlin.jvm.PlatformType", "(Landroid/view/MotionEvent;)Z", "dispatchKeyShortcutEvent", "(Landroid/view/KeyEvent;)Z", "dispatchPopulateAccessibilityEvent", "Landroid/view/accessibility/AccessibilityEvent;", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "dispatchTrackballEvent", "onActionModeFinished", "Landroid/view/ActionMode;", "(Landroid/view/ActionMode;)V", "onActionModeStarted", "onAttachedToWindow", "onContentChanged", "onCreatePanelMenu", "p1", "Lkotlin/jvm/internal/EnhancedNullability;", "onCreatePanelView", "Landroid/view/View;", "onDetachedFromWindow", "onMenuItemSelected", "Landroid/view/MenuItem;", "onMenuOpened", "onPanelClosed", "onPreparePanel", "p2", "onSearchRequested", "Landroid/view/SearchEvent;", "(Landroid/view/SearchEvent;)Z", "onWindowAttributesChanged", "Landroid/view/WindowManager$LayoutParams;", "(Landroid/view/WindowManager$LayoutParams;)V", "onWindowStartingActionMode", "Landroid/view/ActionMode$Callback;", "(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;", "(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTapLatencyCloserHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapLatencyCloserHooks.kt\ncom/amazon/alexa/pmi/implementation/taplatency/CloserWindowCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
/* loaded from: classes18.dex */
public final class CloserWindowCallback implements Window.Callback {

    @NotNull
    private final Window.Callback delegate;
    private boolean enabled;

    @NotNull
    private final Function1<Long, Unit> onBackKey;

    @NotNull
    private final Function1<Long, Unit> onFocusLost;

    @Nullable
    private final Function1<Long, Unit> onTouchDown;

    @NotNull
    private final Function0<Long> uptimeClock;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.pmi.implementation.taplatency.CloserWindowCallback$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, SystemClock.class, "uptimeMillis", "uptimeMillis()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CloserWindowCallback(@NotNull Window.Callback callback, @Nullable Function1<? super Long, Unit> function1, @NotNull Function1<? super Long, Unit> function12, @NotNull Function1<? super Long, Unit> function13, @NotNull Function0<Long> function0) {
        callback.getClass();
        function12.getClass();
        function13.getClass();
        function0.getClass();
        this.delegate = callback;
        this.onTouchDown = function1;
        this.onBackKey = function12;
        this.onFocusLost = function13;
        this.uptimeClock = function0;
        this.enabled = true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent p0) {
        return this.delegate.dispatchGenericMotionEvent(p0);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        event.getClass();
        if (this.enabled && TapLatencyCloserHooksKt.isBackKeyDown(event)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.onBackKey.invoke(Long.valueOf(event.getEventTime()));
                Result.m25294constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
        }
        return this.delegate.dispatchKeyEvent(event);
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
        Function1<Long, Unit> function1 = this.onTouchDown;
        if (this.enabled && function1 != null && event.getActionMasked() == 0) {
            try {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(Long.valueOf(event.getEventTime()));
                Result.m25294constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
        }
        return this.delegate.dispatchTouchEvent(event);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent p0) {
        return this.delegate.dispatchTrackballEvent(p0);
    }

    public final boolean getEnabled() {
        return this.enabled;
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
    public void onWindowFocusChanged(boolean hasFocus) {
        if (this.enabled && !hasFocus) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.onFocusLost.invoke(this.uptimeClock.invoke());
                Result.m25294constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m25294constructorimpl(ResultKt.createFailure(th));
            }
        }
        this.delegate.onWindowFocusChanged(hasFocus);
    }

    @Override // android.view.Window.Callback
    @android.annotation.Nullable
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback p0) {
        return this.delegate.onWindowStartingActionMode(p0);
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
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

    public /* synthetic */ CloserWindowCallback(Window.Callback callback, Function1 function1, Function1 function12, Function1 function13, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(callback, function1, function12, function13, (i & 16) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
