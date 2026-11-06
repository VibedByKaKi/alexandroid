package com.amazon.alexa.elements.turbomodules.cardstudio;

import com.amazon.alexa.elements.turbomodules.liveviewcontroller.LiveViewControllerAPI;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface CardStudioServiceAPI {
    void cancelRequest(String str, Promise promise);

    default void createItem(String str, String str2, @Nullable String str3, Promise promise) {
        promise.reject(LiveViewControllerAPI.E_NOT_IMPLEMENTED, "createItem is not implemented by this host app");
    }

    void getItem(String str, Promise promise);

    void getPrefetchedCards(Promise promise);

    void invokeAction(String str, String str2, String str3, Promise promise);

    void listItems(ReadableMap readableMap, Promise promise);

    void reorder(String str, String str2, @Nullable String str3, @Nullable String str4, Promise promise);
}
