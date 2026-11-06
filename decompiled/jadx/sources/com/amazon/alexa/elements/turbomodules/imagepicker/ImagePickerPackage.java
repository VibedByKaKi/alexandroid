package com.amazon.alexa.elements.turbomodules.imagepicker;

import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.dialog.DialogPackage$$ExternalSyntheticLambda0;
import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ImagePickerPackage extends TurboReactPackage {
    private final ImagePickerAPI imagePickerAPI;

    public ImagePickerPackage(ImagePickerAPI imagePickerAPI) {
        this.imagePickerAPI = imagePickerAPI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("ImagePicker", new ReactModuleInfo("ImagePicker", "ImagePicker", false, false, false, false, true));
        hashMap.put("ElementsImagePicker", new ReactModuleInfo("ElementsImagePicker", "ElementsImagePicker", false, false, false, false, true));
        return hashMap;
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("ImagePicker")) {
            return new ImagePickerModule(reactApplicationContext, this.imagePickerAPI);
        }
        if (str.equals("ElementsImagePicker")) {
            return new ElementsImagePickerModule(reactApplicationContext, this.imagePickerAPI);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new DialogPackage$$ExternalSyntheticLambda0(12);
    }
}
