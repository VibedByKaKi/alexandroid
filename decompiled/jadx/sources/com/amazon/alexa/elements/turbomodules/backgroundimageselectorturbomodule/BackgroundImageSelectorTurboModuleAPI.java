package com.amazon.alexa.elements.turbomodules.backgroundimageselectorturbomodule;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface BackgroundImageSelectorTurboModuleAPI {
    void cancelUploads(Promise promise);

    void getAlbumId(Promise promise);

    void getMediaTypeAutoSave(String str, Promise promise);

    void getPhotosAutoSave(String str, Promise promise);

    void getSourceAutoSave(String str, Promise promise);

    void getUploaderStatus(Promise promise);

    void getVideosAutoSave(String str, Promise promise);

    void initiateSelection(String str, Promise promise);

    void isUploadInProgress(Promise promise);

    void removeBackgroundImage(ReadableMap readableMap, Promise promise);

    void selectBackgroundImage(ReadableMap readableMap, Promise promise);

    void setAutoSaveEnabled(boolean z, Promise promise);

    void setCellularDataEnabled(boolean z, Promise promise);

    void setMediaTypeAutoSave(String str, boolean z, Promise promise);

    void setPhotosAutoSave(String str, boolean z, Promise promise);

    void setPhotosCellularDataEnabled(boolean z, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void setSourceAutoSave(String str, boolean z, Promise promise);

    void setVideosAutoSave(String str, boolean z, Promise promise);

    void setVideosCellularDataEnabled(boolean z, Promise promise);

    void shouldRequestAutoRevokeDisable(Promise promise);
}
