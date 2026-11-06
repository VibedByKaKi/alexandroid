package com.amazon.dee.app.elements.bridges;

import android.annotation.SuppressLint;
import android.os.Trace;
import com.amazon.dee.app.services.logging.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = TraceModule.MODULE_NAME)
/* loaded from: classes3.dex */
public class TraceModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "Trace";
    private static final String SET_APP_TRACING_METHOD_NAME = "setAppTracingAllowed";
    private static final String TAG = "TraceModule";

    public TraceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    public static boolean enableApplicationTracing(boolean z, boolean z2) {
        if (!z2) {
            Log.w(TAG, "Application tracing isn't supported on release signed builds.");
            return true;
        }
        try {
            Trace.class.getDeclaredMethod(SET_APP_TRACING_METHOD_NAME, Boolean.TYPE).invoke(null, Boolean.valueOf(z));
            return true;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e(TAG, e, "Can't %s application tracing.", z ? "enable" : "disable");
            return false;
        }
    }

    @ReactMethod
    public void beginSection(String str) {
        Trace.beginSection(str);
    }

    @ReactMethod
    public void endSection() {
        Trace.endSection();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }
}
