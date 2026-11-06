package com.imagepicker;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class ImagePickerModule extends NativeImagePickerSpec {
    final ImagePickerModuleImpl imagePickerModuleImpl;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.imagePickerModuleImpl = new ImagePickerModuleImpl(reactApplicationContext);
    }

    @Override // com.imagepicker.NativeImagePickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ImagePicker";
    }

    @Override // com.imagepicker.NativeImagePickerSpec
    public void launchCamera(ReadableMap readableMap, Callback callback) {
        this.imagePickerModuleImpl.launchCamera(readableMap, callback);
    }

    @Override // com.imagepicker.NativeImagePickerSpec
    public void launchImageLibrary(ReadableMap readableMap, Callback callback) {
        this.imagePickerModuleImpl.launchImageLibrary(readableMap, callback);
    }
}
