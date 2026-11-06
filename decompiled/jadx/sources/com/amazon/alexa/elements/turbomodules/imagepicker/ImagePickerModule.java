package com.amazon.alexa.elements.turbomodules.imagepicker;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeImagePickerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ImagePicker")
/* loaded from: classes17.dex */
public class ImagePickerModule extends NativeImagePickerSpec {
    public static final String NAME = "ImagePicker";
    private ImagePickerAPI imagePickerAPI;

    public ImagePickerModule(ReactApplicationContext reactApplicationContext, ImagePickerAPI imagePickerAPI) {
        super(reactApplicationContext);
        this.imagePickerAPI = imagePickerAPI;
        imagePickerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeImagePickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ImagePicker";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeImagePickerSpec
    public void pick(ReadableMap readableMap, Promise promise) {
        this.imagePickerAPI.pick(readableMap, promise);
    }
}
