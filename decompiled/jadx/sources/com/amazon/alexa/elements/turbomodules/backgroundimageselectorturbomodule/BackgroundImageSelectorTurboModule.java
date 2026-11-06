package com.amazon.alexa.elements.turbomodules.backgroundimageselectorturbomodule;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "BackgroundImageSelectorTurboModule")
/* loaded from: classes17.dex */
public class BackgroundImageSelectorTurboModule extends NativeBackgroundImageSelectorModuleSpec {
    public static final String NAME = "BackgroundImageSelectorTurboModule";
    private final BackgroundImageSelectorTurboModuleAPI backgroundImageSelectorTurboModuleAPI;

    public BackgroundImageSelectorTurboModule(ReactApplicationContext reactApplicationContext, BackgroundImageSelectorTurboModuleAPI backgroundImageSelectorTurboModuleAPI) {
        super(reactApplicationContext);
        this.backgroundImageSelectorTurboModuleAPI = backgroundImageSelectorTurboModuleAPI;
        backgroundImageSelectorTurboModuleAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void cancelUploads(Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.cancelUploads(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void getAlbumId(Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.getAlbumId(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void getMediaTypeAutoSave(String str, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.getMediaTypeAutoSave(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "BackgroundImageSelectorTurboModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void getPhotosAutoSave(String str, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.getPhotosAutoSave(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void getSourceAutoSave(String str, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.getSourceAutoSave(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void getUploaderStatus(Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.getUploaderStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void getVideosAutoSave(String str, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.getVideosAutoSave(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void initiateSelection(String str, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.initiateSelection(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void isUploadInProgress(Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.isUploadInProgress(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void removeBackgroundImage(ReadableMap readableMap, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.removeBackgroundImage(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void selectBackgroundImage(ReadableMap readableMap, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.selectBackgroundImage(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setAutoSaveEnabled(boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setAutoSaveEnabled(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setCellularDataEnabled(boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setCellularDataEnabled(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setMediaTypeAutoSave(String str, boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setMediaTypeAutoSave(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setPhotosAutoSave(String str, boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setPhotosAutoSave(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setPhotosCellularDataEnabled(boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setPhotosCellularDataEnabled(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setSourceAutoSave(String str, boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setSourceAutoSave(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setVideosAutoSave(String str, boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setVideosAutoSave(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void setVideosCellularDataEnabled(boolean z, Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.setVideosCellularDataEnabled(z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeBackgroundImageSelectorModuleSpec
    @ReactMethod
    public void shouldRequestAutoRevokeDisable(Promise promise) {
        this.backgroundImageSelectorTurboModuleAPI.shouldRequestAutoRevokeDisable(promise);
    }
}
