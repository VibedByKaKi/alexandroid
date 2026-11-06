package com.amazon.alexa.sharing.api;

import android.content.Intent;
import com.amazon.alexa.sharing.api.exceptions.AlexaSharingException;
import com.amazon.alexa.sharing.api.models.Payload;
import com.amazon.alexa.sharing.repo.models.acms.ACMSMessage;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface SharingClient {
    Intent handleShareIntent(Intent intent);

    void initialize();

    void openCamera(ReactApplicationContext reactApplicationContext, ReadableMap readableMap, Promise promise);

    void openPicker(ReactApplicationContext reactApplicationContext, ReadableMap readableMap, Promise promise);

    ACMSMessage sendNewMessage(List<String> list, Payload payload) throws AlexaSharingException;

    void startListening();
}
