package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeCommsLocalKeyValueStoreSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CommsLocalKeyValueStoreModule";

    public NativeCommsLocalKeyValueStoreSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "CommsLocalKeyValueStoreModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getValue(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getValues(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setBooleanValue(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setStringValue(String str, String str2, Promise promise);
}
