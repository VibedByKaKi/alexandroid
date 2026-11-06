package com.amazon.alexa.pmi.implementation.taplatency;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"isBackKeyDown", "", "event", "Landroid/view/KeyEvent;", "registerSystemBackObserver", "Lkotlin/Function0;", "", "window", "Landroid/view/Window;", "callback", "Landroid/window/OnBackInvokedCallback;", "isImeVisible", "decor", "Landroid/view/View;", "TTLR_FOCUS_LOSS_DELAY_MS", "", "API_SYSTEM_BACK_OBSERVER", "", "PRIORITY_SYSTEM_NAVIGATION_OBSERVER", "TTLR_BACK_KEY_MATCH_MS", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TapLatencyCloserHooksKt {
    private static final int API_SYSTEM_BACK_OBSERVER = 36;
    private static final int PRIORITY_SYSTEM_NAVIGATION_OBSERVER = -2;
    public static final long TTLR_BACK_KEY_MATCH_MS = 1000;
    public static final long TTLR_FOCUS_LOSS_DELAY_MS = 100;

    public static final boolean isBackKeyDown(@NotNull KeyEvent keyEvent) {
        keyEvent.getClass();
        return keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0;
    }

    public static final boolean isImeVisible(@NotNull View view) {
        WindowInsets rootWindowInsets;
        view.getClass();
        return Build.VERSION.SDK_INT >= 30 && (rootWindowInsets = view.getRootWindowInsets()) != null && rootWindowInsets.isVisible(WindowInsets.Type.ime());
    }

    @NotNull
    public static final Function0<Unit> registerSystemBackObserver(@NotNull Window window, @NotNull OnBackInvokedCallback onBackInvokedCallback) {
        window.getClass();
        onBackInvokedCallback.getClass();
        OnBackInvokedDispatcher onBackInvokedDispatcher = window.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.getClass();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(-2, onBackInvokedCallback);
        return new TapLatencyCloserHooks$$ExternalSyntheticLambda0(onBackInvokedDispatcher, onBackInvokedCallback, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerSystemBackObserver$lambda$0(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        return Unit.INSTANCE;
    }
}
