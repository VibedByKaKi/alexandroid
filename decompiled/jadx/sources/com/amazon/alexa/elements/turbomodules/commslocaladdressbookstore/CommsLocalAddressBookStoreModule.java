package com.amazon.alexa.elements.turbomodules.commslocaladdressbookstore;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsLocalAddressBookStoreSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsLocalAddressBookStoreModule")
/* loaded from: classes17.dex */
public class CommsLocalAddressBookStoreModule extends NativeCommsLocalAddressBookStoreSpec {
    public static final String NAME = "CommsLocalAddressBookStoreModule";
    private final CommsLocalAddressBookStoreAPI commsLocalAddressBookStoreAPI;

    public CommsLocalAddressBookStoreModule(ReactApplicationContext reactApplicationContext, CommsLocalAddressBookStoreAPI commsLocalAddressBookStoreAPI) {
        super(reactApplicationContext);
        this.commsLocalAddressBookStoreAPI = commsLocalAddressBookStoreAPI;
        commsLocalAddressBookStoreAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalAddressBookStoreSpec
    @ReactMethod
    public void getAuthorizationStatus(Promise promise) {
        this.commsLocalAddressBookStoreAPI.getAuthorizationStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalAddressBookStoreSpec
    @ReactMethod
    public void getContact(ReadableMap readableMap, Promise promise) {
        this.commsLocalAddressBookStoreAPI.getContact(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalAddressBookStoreSpec
    @ReactMethod
    public void getContacts(Promise promise) {
        this.commsLocalAddressBookStoreAPI.getContacts(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalAddressBookStoreSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsLocalAddressBookStoreModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalAddressBookStoreSpec
    @ReactMethod
    public void requestAddressBookPermissions(Promise promise) {
        this.commsLocalAddressBookStoreAPI.requestAddressBookPermissions(promise);
    }
}
