package com.amazon.alexa.elements.turbomodules.cardstudio;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CardStudioService")
/* loaded from: classes17.dex */
public class CardStudioServiceModule extends NativeCardStudioServiceSpec {
    public static final String NAME = "CardStudioService";
    private CardStudioServiceAPI cardStudioServiceAPI;

    public CardStudioServiceModule(ReactApplicationContext reactApplicationContext, CardStudioServiceAPI cardStudioServiceAPI) {
        super(reactApplicationContext);
        this.cardStudioServiceAPI = cardStudioServiceAPI;
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec
    @ReactMethod
    public void cancelRequest(String str, Promise promise) {
        this.cardStudioServiceAPI.cancelRequest(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec
    @ReactMethod
    public void createItem(String str, String str2, @Nullable String str3, Promise promise) {
        this.cardStudioServiceAPI.createItem(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec
    @ReactMethod
    public void getItem(String str, Promise promise) {
        this.cardStudioServiceAPI.getItem(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CardStudioService";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec
    @ReactMethod
    public void getPrefetchedCards(Promise promise) {
        this.cardStudioServiceAPI.getPrefetchedCards(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec
    @ReactMethod
    public void invokeAction(String str, String str2, String str3, Promise promise) {
        this.cardStudioServiceAPI.invokeAction(str, str2, str3, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec
    @ReactMethod
    public void listItems(ReadableMap readableMap, Promise promise) {
        this.cardStudioServiceAPI.listItems(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCardStudioServiceSpec
    @ReactMethod
    public void reorder(String str, String str2, @Nullable String str3, @Nullable String str4, Promise promise) {
        this.cardStudioServiceAPI.reorder(str, str2, str3, str4, promise);
    }
}
