package com.amazon.alexa.elements.turbomodules.imagepicker;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsImagePickerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsImagePicker")
/* loaded from: classes17.dex */
public class ElementsImagePickerModule extends NativeElementsImagePickerSpec {
    public static final String NAME = "ElementsImagePicker";
    private ImagePickerAPI imagePickerAPI;

    public ElementsImagePickerModule(ReactApplicationContext reactApplicationContext, ImagePickerAPI imagePickerAPI) {
        super(reactApplicationContext);
        this.imagePickerAPI = imagePickerAPI;
        imagePickerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsImagePickerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsImagePicker";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsImagePickerSpec
    public void pick(ReadableMap readableMap, Promise promise) {
        this.imagePickerAPI.pick(readableMap, promise);
    }
}
