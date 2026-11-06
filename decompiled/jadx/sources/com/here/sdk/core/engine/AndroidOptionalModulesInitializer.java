package com.here.sdk.core.engine;

import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class AndroidOptionalModulesInitializer implements OptionalModulesInitializer {
    private static final String TAG = "AndroidOptionalModulesInitializer";

    private void tryInitModule(@NonNull SDKNativeEngine sDKNativeEngine, String str, String str2) throws Exception {
        try {
            Class.forName(str).getMethod("initialize", SDKNativeEngine.class).invoke(null, sDKNativeEngine);
        } catch (ClassNotFoundException unused) {
        }
    }

    private static void tryStartConsent(@NonNull SDKNativeEngine sDKNativeEngine) throws Exception {
        try {
            Class<?> cls = Class.forName("com.here.sdk.consent.ConsentInternal");
            cls.getMethod("start", null).invoke(cls.getMethod("fromSdkNativeEngine", SDKNativeEngine.class).invoke(null, sDKNativeEngine), null);
        } catch (ClassNotFoundException unused) {
        }
    }

    @Override // com.here.sdk.core.engine.OptionalModulesInitializer
    public boolean initOptionalModules(@NonNull SDKNativeEngine sDKNativeEngine) {
        try {
            tryInitModule(sDKNativeEngine, "com.here.sdk.consent.ConsentInitializer", "consent");
            tryInitModule(sDKNativeEngine, "com.here.sdk.location.LocationInitializer", "location");
            tryStartConsent(sDKNativeEngine);
            return true;
        } catch (Exception e) {
            Log.e(TAG, "SDK is failed due to initialisation issue with one of components, check in log for more information", e);
            return false;
        }
    }
}
