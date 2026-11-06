package com.amazon.alexa.accessorykit;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class NativeContainerProvider implements ContainerProvider {
    @Override // com.amazon.alexa.accessorykit.ContainerProvider
    public WritableArray getArray() {
        return Arguments.createArray();
    }

    @Override // com.amazon.alexa.accessorykit.ContainerProvider
    public WritableMap getMap() {
        return Arguments.createMap();
    }
}
