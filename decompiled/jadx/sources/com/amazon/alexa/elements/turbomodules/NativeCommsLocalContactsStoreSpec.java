package com.amazon.alexa.elements.turbomodules;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class NativeCommsLocalContactsStoreSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "CommsLocalContactsStoreModule";

    public NativeCommsLocalContactsStoreSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void deleteContact(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void didHit40xServerError(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getChildContacts(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactByCommsId(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactById(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactStatusByCommsId(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactStatusById(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactsByOwnerCommsIds(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactsForIds(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactsNamesByCommsId(ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getContactsWithBlockStatus(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getHomeGroupByCommsId(String str, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getHomeGroups(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "CommsLocalContactsStoreModule";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getSimpleContacts(Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void saveContact(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void saveContacts(ReadableArray readableArray, ReadableArray readableArray2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setDidHit40xServerError(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setHomeGroupCanBeDroppedInOn(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setHomeGroupCanDropIn(String str, boolean z, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void setHomeGroupIdForMemberIds(String str, ReadableArray readableArray, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void updateContact(ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void updateContactsBlockStatus(ReadableArray readableArray, Promise promise);
}
