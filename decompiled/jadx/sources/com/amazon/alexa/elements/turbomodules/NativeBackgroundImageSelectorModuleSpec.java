package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeBackgroundImageSelectorModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BackgroundImageSelectorTurboModule";

    public NativeBackgroundImageSelectorModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void cancelUploads(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getAlbumId(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getMediaTypeAutoSave(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "BackgroundImageSelectorTurboModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getPhotosAutoSave(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getSourceAutoSave(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getUploaderStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getVideosAutoSave(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void initiateSelection(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void isUploadInProgress(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void removeBackgroundImage(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void selectBackgroundImage(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setAutoSaveEnabled(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setCellularDataEnabled(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setMediaTypeAutoSave(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setPhotosAutoSave(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setPhotosCellularDataEnabled(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setSourceAutoSave(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setVideosAutoSave(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setVideosCellularDataEnabled(boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void shouldRequestAutoRevokeDisable(Promise promise);
}
