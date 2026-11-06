package com.imagepicker;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class NativeImagePickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ImagePicker";

    public NativeImagePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ImagePicker";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void launchCamera(ReadableMap readableMap, Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void launchImageLibrary(ReadableMap readableMap, Callback callback);
}
