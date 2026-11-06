package com.amazon.alexa.elements.turbomodules.commsdiagnosticsmanager;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsDiagnosticsManagerSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsDiagnosticsManagerModule")
/* loaded from: classes17.dex */
public class CommsDiagnosticsManagerModule extends NativeCommsDiagnosticsManagerSpec {
    public static final String NAME = "CommsDiagnosticsManagerModule";
    private final CommsDiagnosticsManagerAPI commsDiagnosticsManagerAPI;

    public CommsDiagnosticsManagerModule(ReactApplicationContext reactApplicationContext, CommsDiagnosticsManagerAPI commsDiagnosticsManagerAPI) {
        super(reactApplicationContext);
        this.commsDiagnosticsManagerAPI = commsDiagnosticsManagerAPI;
        commsDiagnosticsManagerAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsDiagnosticsManagerSpec
    @ReactMethod
    public void getDiagnosticInformation(Promise promise) {
        this.commsDiagnosticsManagerAPI.getDiagnosticInformation(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsDiagnosticsManagerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsDiagnosticsManagerModule";
    }
}
