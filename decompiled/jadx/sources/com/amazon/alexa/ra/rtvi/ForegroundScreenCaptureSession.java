package com.amazon.alexa.ra.rtvi;

import android.content.Context;
import android.util.Log;
import com.amazon.alexa.ra.rtvi.ScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/rtvi/ForegroundScreenCaptureSession;", "Lcom/amazon/alexa/ra/rtvi/ScreenCaptureSession;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "appContext", "startAndGetModule", "", "onReady", "Lkotlin/Function1;", "Lcom/amazon/alexa/ra/rtvi/ScreenCaptureModule;", "stop", "Companion", "ui-rtvi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ForegroundScreenCaptureSession implements ScreenCaptureSession {

    @NotNull
    private static final String TAG = "ForegroundScreenSession";

    @NotNull
    private final Context appContext;

    public ForegroundScreenCaptureSession(@NotNull Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
    }

    @Override // com.amazon.alexa.ra.rtvi.ScreenCaptureSession
    public void startAndGetModule(@NotNull Function1<? super ScreenCaptureModule, Unit> onReady) {
        onReady.getClass();
        Log.i(TAG, "Awaiting screen capture module from service");
        ScreenCaptureService.INSTANCE.awaitModule(onReady);
    }

    @Override // com.amazon.alexa.ra.rtvi.ScreenCaptureSession
    public void stop() {
        ScreenCaptureService.Companion companion = ScreenCaptureService.INSTANCE;
        companion.cancelAwait();
        companion.stop(this.appContext);
    }
}
