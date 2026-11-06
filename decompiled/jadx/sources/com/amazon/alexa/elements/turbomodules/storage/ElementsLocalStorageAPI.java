package com.amazon.alexa.elements.turbomodules.storage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ElementsLocalStorageAPI {
    void clear(@Nullable String str, Promise promise);

    void get(String str, ReadableMap readableMap, Promise promise);

    void put(String str, String str2, ReadableMap readableMap, Promise promise);

    void remove(String str, Promise promise);
}
