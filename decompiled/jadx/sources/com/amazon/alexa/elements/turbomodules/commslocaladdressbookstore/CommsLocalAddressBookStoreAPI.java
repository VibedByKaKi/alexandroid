package com.amazon.alexa.elements.turbomodules.commslocaladdressbookstore;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsLocalAddressBookStoreAPI {
    void getAuthorizationStatus(Promise promise);

    void getContact(ReadableMap readableMap, Promise promise);

    void getContacts(Promise promise);

    void requestAddressBookPermissions(Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);
}
