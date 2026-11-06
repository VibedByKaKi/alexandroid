package com.amazon.alexa.elements.turbomodules.dialog;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeDialogSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "DialogModule")
/* loaded from: classes17.dex */
public class DialogModule extends NativeDialogSpec {
    public static final String NAME = "DialogModule";
    private final DialogAPI dialogAPI;

    public DialogModule(ReactApplicationContext reactApplicationContext, DialogAPI dialogAPI) {
        super(reactApplicationContext);
        this.dialogAPI = dialogAPI;
        dialogAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDialogSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "DialogModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeDialogSpec
    @ReactMethod
    public void showDialog(ReadableMap readableMap, Promise promise) {
        this.dialogAPI.showDialog(readableMap, promise);
    }
}
