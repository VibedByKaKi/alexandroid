package com.reactnativecommunity.cameraroll;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class NativeCameraRollPermissionModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCCameraRollPermission";

    public NativeCameraRollPermissionModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addListener(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void checkPermission(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }

    @DoNotStrip
    @ReactMethod
    public abstract void refreshPhotoSelection(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeListeners(double d);

    @DoNotStrip
    @ReactMethod
    public abstract void requestAddOnlyPermission(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void requestReadWritePermission(Promise promise);
}
