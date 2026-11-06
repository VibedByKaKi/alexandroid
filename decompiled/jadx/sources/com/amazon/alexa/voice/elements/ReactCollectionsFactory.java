package com.amazon.alexa.voice.elements;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ReactCollectionsFactory implements CollectionsFactory {
    @Override // com.amazon.alexa.voice.elements.CollectionsFactory
    @NonNull
    public WritableArray createArray() {
        return Arguments.createArray();
    }

    @Override // com.amazon.alexa.voice.elements.CollectionsFactory
    @NonNull
    public WritableMap createMap() {
        return Arguments.createMap();
    }
}
