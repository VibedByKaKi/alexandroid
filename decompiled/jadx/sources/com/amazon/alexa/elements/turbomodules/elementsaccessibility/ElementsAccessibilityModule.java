package com.amazon.alexa.elements.turbomodules.elementsaccessibility;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeElementsAccessibilitySpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "ElementsAccessibilityModule")
/* loaded from: classes17.dex */
public class ElementsAccessibilityModule extends NativeElementsAccessibilitySpec {
    public static final String NAME = "ElementsAccessibilityModule";
    private final ElementsAccessibilityAPI elementsAccessibilityAPI;

    public ElementsAccessibilityModule(ReactApplicationContext reactApplicationContext, ElementsAccessibilityAPI elementsAccessibilityAPI) {
        super(reactApplicationContext);
        this.elementsAccessibilityAPI = elementsAccessibilityAPI;
        elementsAccessibilityAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsAccessibilitySpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ElementsAccessibilityModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeElementsAccessibilitySpec
    @ReactMethod
    public void screenChanged() {
        this.elementsAccessibilityAPI.screenChanged();
    }
}
