package com.amazon.alexa.elements.turbomodules.asseturl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.NativeMosaicAssetUrlSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "MosaicTurboModuleAssetUrl")
/* loaded from: classes17.dex */
public class MosaicAssetUrlModule extends NativeMosaicAssetUrlSpec {
    private MosaicAssetUrlAPI mosaicAssetUrlAPI;

    public MosaicAssetUrlModule(ReactApplicationContext reactApplicationContext, MosaicAssetUrlAPI mosaicAssetUrlAPI) {
        super(reactApplicationContext);
        this.mosaicAssetUrlAPI = mosaicAssetUrlAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeMosaicAssetUrlSpec
    @Nullable
    @ReactMethod
    public String getAssetUrl(String str, String str2) {
        return this.mosaicAssetUrlAPI.getAssetUrl(str, str2);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeMosaicAssetUrlSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "MosaicTurboModuleAssetUrl";
    }
}
