package com.amazon.dee.app.elements.bridges;

import android.os.SystemClock;
import com.amazon.alexa.pmi.implementation.taplatency.HardwareTapStash;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = TapLatencyModule.MODULE_NAME)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/dee/app/elements/bridges/TapLatencyModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "millisSinceLastTapDown", "", "millisSince", "uptimeMs", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TapLatencyModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String MODULE_NAME = "TapLatency";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapLatencyModule(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final double millisSince(double uptimeMs) {
        if (uptimeMs <= 0.0d) {
            return -1.0d;
        }
        double uptimeMillis = SystemClock.uptimeMillis() - uptimeMs;
        if (uptimeMillis >= 0.0d) {
            return uptimeMillis;
        }
        return -1.0d;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final double millisSinceLastTapDown() {
        return HardwareTapStash.consumeAgeMs();
    }
}
