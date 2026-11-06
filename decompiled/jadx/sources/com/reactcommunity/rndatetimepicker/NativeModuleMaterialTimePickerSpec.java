package com.reactcommunity.rndatetimepicker;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class NativeModuleMaterialTimePickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCMaterialTimePicker";

    public NativeModuleMaterialTimePickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void dismiss(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNCMaterialTimePicker";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void open(ReadableMap readableMap, Promise promise);
}
