package com.bugsnag.android;

import android.content.ComponentCallbacks2;
import com.amazon.alexa.accessorykit.ModelTransformer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012:\u0010\u0004\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016RB\u0010\u0004\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/ClientComponentCallbacks;", "Landroid/content/ComponentCallbacks2;", "deviceDataCollector", "Lcom/bugsnag/android/DeviceDataCollector;", "cb", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "oldOrientation", "newOrientation", "", "memoryCallback", "", "", "(Lcom/bugsnag/android/DeviceDataCollector;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getMemoryCallback", "()Lkotlin/jvm/functions/Function2;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", ModelTransformer.KEY_BATTERY_LEVEL, "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ClientComponentCallbacks implements ComponentCallbacks2 {
    private final Function2<String, String, Unit> cb;
    private final DeviceDataCollector deviceDataCollector;

    @NotNull
    private final Function2<Boolean, Integer, Unit> memoryCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientComponentCallbacks(@NotNull DeviceDataCollector deviceDataCollector, @NotNull Function2<? super String, ? super String, Unit> function2, @NotNull Function2<? super Boolean, ? super Integer, Unit> function22) {
        deviceDataCollector.getClass();
        function2.getClass();
        function22.getClass();
        this.deviceDataCollector = deviceDataCollector;
        this.cb = function2;
        this.memoryCallback = function22;
    }

    @NotNull
    public final Function2<Boolean, Integer, Unit> getMemoryCallback() {
        return this.memoryCallback;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration newConfig) {
        newConfig.getClass();
        String orientationAsString$bugsnag_android_core_release = this.deviceDataCollector.getOrientationAsString$bugsnag_android_core_release();
        if (this.deviceDataCollector.updateOrientation$bugsnag_android_core_release(newConfig.orientation)) {
            this.cb.invoke(orientationAsString$bugsnag_android_core_release, this.deviceDataCollector.getOrientationAsString$bugsnag_android_core_release());
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.memoryCallback.invoke(Boolean.TRUE, null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        this.memoryCallback.invoke(Boolean.valueOf(level >= 80), Integer.valueOf(level));
    }
}
