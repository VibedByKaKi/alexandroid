package com.amazon.alexa.elements.turbomodules.commslocalcontactsstore;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "CommsLocalContactsStoreModule")
/* loaded from: classes17.dex */
public class CommsLocalContactsStoreModule extends NativeCommsLocalContactsStoreSpec {
    public static final String NAME = "CommsLocalContactsStoreModule";
    private final CommsLocalContactsStoreAPI commsLocalContactsStoreAPI;

    public CommsLocalContactsStoreModule(ReactApplicationContext reactApplicationContext, CommsLocalContactsStoreAPI commsLocalContactsStoreAPI) {
        super(reactApplicationContext);
        this.commsLocalContactsStoreAPI = commsLocalContactsStoreAPI;
        commsLocalContactsStoreAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void deleteContact(String str, Promise promise) {
        this.commsLocalContactsStoreAPI.deleteContact(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void didHit40xServerError(String str, Promise promise) {
        this.commsLocalContactsStoreAPI.didHit40xServerError(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getChildContacts(Promise promise) {
        this.commsLocalContactsStoreAPI.getChildContacts(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactByCommsId(String str, Promise promise) {
        this.commsLocalContactsStoreAPI.getContactByCommsId(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactById(String str, Promise promise) {
        this.commsLocalContactsStoreAPI.getContactById(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactStatusByCommsId(String str, Promise promise) {
        this.commsLocalContactsStoreAPI.getContactStatusByCommsId(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactStatusById(String str, Promise promise) {
        this.commsLocalContactsStoreAPI.getContactStatusById(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactsByOwnerCommsIds(ReadableArray readableArray, Promise promise) {
        this.commsLocalContactsStoreAPI.getContactsByOwnerCommsIds(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactsForIds(ReadableArray readableArray, Promise promise) {
        this.commsLocalContactsStoreAPI.getContactsForIds(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactsNamesByCommsId(ReadableArray readableArray, Promise promise) {
        this.commsLocalContactsStoreAPI.getContactsNamesByCommsId(readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getContactsWithBlockStatus(Promise promise) {
        this.commsLocalContactsStoreAPI.getContactsWithBlockStatus(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getHomeGroupByCommsId(String str, Promise promise) {
        this.commsLocalContactsStoreAPI.getHomeGroupByCommsId(str, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getHomeGroups(Promise promise) {
        this.commsLocalContactsStoreAPI.getHomeGroups(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "CommsLocalContactsStoreModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void getSimpleContacts(Promise promise) {
        this.commsLocalContactsStoreAPI.getSimpleContacts(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void saveContact(ReadableMap readableMap, Promise promise) {
        this.commsLocalContactsStoreAPI.saveContact(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void saveContacts(ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        this.commsLocalContactsStoreAPI.saveContacts(readableArray, readableArray2, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void setDidHit40xServerError(String str, boolean z, Promise promise) {
        this.commsLocalContactsStoreAPI.setDidHit40xServerError(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void setHomeGroupCanBeDroppedInOn(String str, boolean z, Promise promise) {
        this.commsLocalContactsStoreAPI.setHomeGroupCanBeDroppedInOn(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void setHomeGroupCanDropIn(String str, boolean z, Promise promise) {
        this.commsLocalContactsStoreAPI.setHomeGroupCanDropIn(str, z, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void setHomeGroupIdForMemberIds(String str, ReadableArray readableArray, Promise promise) {
        this.commsLocalContactsStoreAPI.setHomeGroupIdForMemberIds(str, readableArray, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void updateContact(ReadableMap readableMap, Promise promise) {
        this.commsLocalContactsStoreAPI.updateContact(readableMap, promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeCommsLocalContactsStoreSpec
    @ReactMethod
    public void updateContactsBlockStatus(ReadableArray readableArray, Promise promise) {
        this.commsLocalContactsStoreAPI.updateContactsBlockStatus(readableArray, promise);
    }
}
