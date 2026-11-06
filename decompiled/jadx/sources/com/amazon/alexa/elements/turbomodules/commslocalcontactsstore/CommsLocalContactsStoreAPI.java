package com.amazon.alexa.elements.turbomodules.commslocalcontactsstore;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CommsLocalContactsStoreAPI {
    void deleteContact(String str, Promise promise);

    void didHit40xServerError(String str, Promise promise);

    void getChildContacts(Promise promise);

    void getContactByCommsId(String str, Promise promise);

    void getContactById(String str, Promise promise);

    void getContactStatusByCommsId(String str, Promise promise);

    void getContactStatusById(String str, Promise promise);

    void getContactsByOwnerCommsIds(ReadableArray readableArray, Promise promise);

    void getContactsForIds(ReadableArray readableArray, Promise promise);

    void getContactsNamesByCommsId(ReadableArray readableArray, Promise promise);

    void getContactsWithBlockStatus(Promise promise);

    void getHomeGroupByCommsId(String str, Promise promise);

    void getHomeGroups(Promise promise);

    void getSimpleContacts(Promise promise);

    void saveContact(ReadableMap readableMap, Promise promise);

    void saveContacts(ReadableArray readableArray, ReadableArray readableArray2, Promise promise);

    void setDidHit40xServerError(String str, boolean z, Promise promise);

    void setHomeGroupCanBeDroppedInOn(String str, boolean z, Promise promise);

    void setHomeGroupCanDropIn(String str, boolean z, Promise promise);

    void setHomeGroupIdForMemberIds(String str, ReadableArray readableArray, Promise promise);

    void setReactContext(@Nullable ReactApplicationContext reactApplicationContext);

    void updateContact(ReadableMap readableMap, Promise promise);

    void updateContactsBlockStatus(ReadableArray readableArray, Promise promise);
}
