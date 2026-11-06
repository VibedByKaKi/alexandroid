package com.amazon.alexa.elements.turbomodules.commsmetricslogstorage;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsMetricsLogStorageSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsMetricsLogStorageModule")
/* loaded from: classes17.dex */
public class CommsMetricsLogStorageModule extends NativeCommsMetricsLogStorageSpec {
    public static final String NAME = "CommsMetricsLogStorageModule";
    private final CommsMetricsLogStorageAPI commsMetricsLogStorageAPI;

    public CommsMetricsLogStorageModule(ReactApplicationContext reactApplicationContext, CommsMetricsLogStorageAPI commsMetricsLogStorageAPI) {
        super(reactApplicationContext);
        this.commsMetricsLogStorageAPI = commsMetricsLogStorageAPI;
        commsMetricsLogStorageAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMetricsLogStorageSpec
    @ReactMethod
    public void deleteLogFile(String str, Promise promise) {
        this.commsMetricsLogStorageAPI.deleteLogFile(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMetricsLogStorageSpec
    @ReactMethod
    public void getLogFilenames(String str, Promise promise) {
        this.commsMetricsLogStorageAPI.getLogFilenames(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMetricsLogStorageSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsMetricsLogStorageModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsMetricsLogStorageSpec
    @ReactMethod
    public void writeEntry(String str, String str2, Promise promise) {
        this.commsMetricsLogStorageAPI.writeEntry(str, str2, promise);
    }
}
