package com.reactnativecommunity.cameraroll;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class NativeCameraRollModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCCameraRoll";

    public NativeCameraRollModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addListener(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void deletePhotos(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAlbums(ReadableMap readableMap, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNCCameraRoll";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getPhotoByInternalID(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getPhotoThumbnail(String str, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getPhotos(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeListeners(double d);

    @DoNotStrip
    @ReactMethod
    public abstract void saveToCameraRoll(String str, ReadableMap readableMap, Promise promise);
}
