package com.mapbox.maps.renderer;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.MapboxLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0011\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bB5\b\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0007R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/renderer/DisplayRefreshRateMonitor;", "", "context", "Landroid/content/Context;", "onRefreshRateChanged", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "displayId", "displayManager", "Landroid/hardware/display/DisplayManager;", "mainHandler", "Landroid/os/Handler;", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroid/hardware/display/DisplayManager;Landroid/os/Handler;)V", "Ljava/lang/Integer;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "com/mapbox/maps/renderer/DisplayRefreshRateMonitor$listener$1", "Lcom/mapbox/maps/renderer/DisplayRefreshRateMonitor$listener$1;", "started", "", "start", "stop", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DisplayRefreshRateMonitor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final String TAG = "Mbgl-DisplayRefreshRateMonitor";

    @Nullable
    private final Integer displayId;

    @NotNull
    private final DisplayManager displayManager;

    @NotNull
    private final DisplayRefreshRateMonitor$listener$1 listener;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final Function1<Integer, Unit> onRefreshRateChanged;
    private boolean started;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DisplayRefreshRateMonitor(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r5) {
        /*
            r3 = this;
            r4.getClass()
            r5.getClass()
            com.mapbox.maps.renderer.DisplayRefreshRateMonitor$Companion r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.Companion
            java.lang.Integer r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.Companion.access$currentDisplayId(r0, r4)
            java.lang.String r1 = "display"
            java.lang.Object r4 = r4.getSystemService(r1)
            r4.getClass()
            android.hardware.display.DisplayManager r4 = (android.hardware.display.DisplayManager) r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r3.<init>(r0, r5, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.renderer.DisplayRefreshRateMonitor.<init>(android.content.Context, kotlin.jvm.functions.Function1):void");
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        if (this.displayId == null) {
            return;
        }
        this.displayManager.registerDisplayListener(this.listener, this.mainHandler);
        MapboxLogger.logI(TAG, "Started listening for display " + this.displayId + " refresh rate changes");
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            if (this.displayId == null) {
                return;
            }
            this.displayManager.unregisterDisplayListener(this.listener);
            MapboxLogger.logI(TAG, "Stopped listening for display " + this.displayId + " refresh rate changes");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/renderer/DisplayRefreshRateMonitor$Companion;", "", "()V", Constants.LOG_TAG, "", "currentDisplayId", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Integer;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Integer currentDisplayId(Context context) {
            Display defaultDisplay;
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    defaultDisplay = context.getDisplay();
                } else {
                    Object systemService = context.getSystemService("window");
                    WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                    defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
                }
                if (defaultDisplay != null) {
                    return Integer.valueOf(defaultDisplay.getDisplayId());
                }
                return null;
            } catch (UnsupportedOperationException e) {
                MapboxLogger.logW(DisplayRefreshRateMonitor.TAG, "Could not resolve display from context: " + e.getMessage() + ". Refresh-rate updates disabled; pass a visual context (Activity / WindowContext / DisplayContext) to enable.");
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.mapbox.maps.renderer.DisplayRefreshRateMonitor$listener$1] */
    @VisibleForTesting(otherwise = 2)
    public DisplayRefreshRateMonitor(@Nullable Integer num, @NotNull Function1<? super Integer, Unit> function1, @NotNull DisplayManager displayManager, @NotNull Handler handler) {
        function1.getClass();
        displayManager.getClass();
        handler.getClass();
        this.displayId = num;
        this.onRefreshRateChanged = function1;
        this.displayManager = displayManager;
        this.mainHandler = handler;
        this.listener = new DisplayManager.DisplayListener() { // from class: com.mapbox.maps.renderer.DisplayRefreshRateMonitor$listener$1
            /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
            
                r0 = r2.this$0.displayId;
             */
            @Override // android.hardware.display.DisplayManager.DisplayListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onDisplayChanged(int r3) {
                /*
                    r2 = this;
                    com.mapbox.maps.renderer.DisplayRefreshRateMonitor r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.this
                    boolean r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.access$getStarted$p(r0)
                    if (r0 != 0) goto L9
                    goto L67
                L9:
                    com.mapbox.maps.renderer.DisplayRefreshRateMonitor r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.this
                    java.lang.Integer r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.access$getDisplayId$p(r0)
                    if (r0 != 0) goto L12
                    goto L67
                L12:
                    int r0 = r0.intValue()
                    if (r3 == r0) goto L19
                    goto L67
                L19:
                    com.mapbox.maps.renderer.DisplayRefreshRateMonitor r3 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.this
                    android.hardware.display.DisplayManager r3 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.access$getDisplayManager$p(r3)
                    com.mapbox.maps.renderer.DisplayRefreshRateMonitor r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.this
                    java.lang.Integer r0 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.access$getDisplayId$p(r0)
                    int r0 = r0.intValue()
                    android.view.Display r3 = r3.getDisplay(r0)
                    if (r3 == 0) goto L67
                    float r3 = r3.getRefreshRate()
                    int r3 = (int) r3
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Display "
                    r0.<init>(r1)
                    com.mapbox.maps.renderer.DisplayRefreshRateMonitor r1 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.this
                    java.lang.Integer r1 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.access$getDisplayId$p(r1)
                    r0.append(r1)
                    java.lang.String r1 = " changed; refresh rate now "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r1 = "Hz"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "Mbgl-DisplayRefreshRateMonitor"
                    com.mapbox.maps.MapboxLogger.logI(r1, r0)
                    com.mapbox.maps.renderer.DisplayRefreshRateMonitor r2 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.this
                    kotlin.jvm.functions.Function1 r2 = com.mapbox.maps.renderer.DisplayRefreshRateMonitor.access$getOnRefreshRateChanged$p(r2)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r2.invoke(r3)
                L67:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.renderer.DisplayRefreshRateMonitor$listener$1.onDisplayChanged(int):void");
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int displayId) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int displayId) {
            }
        };
    }
}
