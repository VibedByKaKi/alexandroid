package com.amazon.alexa.elements.turbomodules.pmi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.NativePMISpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "PMI")
/* loaded from: classes17.dex */
public class PMIModule extends NativePMISpec {
    public static final String NAME = "PMI";
    private final PMIAPI pmiAPI;

    public PMIModule(ReactApplicationContext reactApplicationContext, PMIAPI pmiapi) {
        super(reactApplicationContext);
        this.pmiAPI = pmiapi;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePMISpec
    @ReactMethod
    public void endTimeline(double d, @Nullable String str) {
        this.pmiAPI.endTimeline(d, str);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePMISpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "PMI";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePMISpec
    @ReactMethod
    public void mark(double d, String str, @Nullable ReadableMap readableMap) {
        this.pmiAPI.mark(d, str, readableMap);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePMISpec
    @ReactMethod
    public double startRootTimeline(ReadableMap readableMap, double d) {
        String string = readableMap.hasKey("name") ? readableMap.getString("name") : null;
        String string2 = readableMap.hasKey("ownerIdentifier") ? readableMap.getString("ownerIdentifier") : null;
        if (string == null || string2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("PMI startRootTimeline: 'name' and 'ownerIdentifier' are required");
            return 0.0d;
        }
        return this.pmiAPI.startRootTimeline(string, readableMap.hasKey("registeredEvents") ? readableMap.getArray("registeredEvents") : null, string2, d);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativePMISpec
    @Nullable
    @ReactMethod
    public Double startTimeline(ReadableMap readableMap, @Nullable Double d) {
        String string = readableMap.hasKey("name") ? readableMap.getString("name") : null;
        String string2 = readableMap.hasKey("ownerIdentifier") ? readableMap.getString("ownerIdentifier") : null;
        if (string != null && string2 != null) {
            return this.pmiAPI.startTimeline(string, readableMap.hasKey("registeredEvents") ? readableMap.getArray("registeredEvents") : null, string2, d);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("PMI startTimeline: 'name' and 'ownerIdentifier' are required");
        return null;
    }
}
