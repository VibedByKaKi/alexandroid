package com.amazon.alexa.seamlessswitching.capability.dependencies;

import com.amazon.alexa.seamlessswitching.capability.model.AccessoryBluetoothState;
import com.amazon.alexa.seamlessswitching.capability.model.AlexaDevice;
import com.amazon.alexa.seamlessswitching.capability.model.BluetoothState;
import com.amazon.alexa.seamlessswitching.capability.model.DeviceInfo;
import com.amazon.alexa.seamlessswitching.capability.model.PairedDevice;
import com.amazon.alexa.seamlessswitching.capability.model.directive.ConnectDeviceDirective;
import com.amazon.alexa.seamlessswitching.capability.model.directive.DisconnectDeviceDirective;
import com.amazon.alexa.seamlessswitching.capability.model.event.ConnectDeviceFailedEvent;
import com.amazon.alexa.seamlessswitching.capability.model.event.ConnectDeviceSucceededEvent;
import com.amazon.alexa.seamlessswitching.capability.model.event.DisconnectDeviceFailedEvent;
import com.amazon.alexa.seamlessswitching.capability.model.event.DisconnectDeviceSucceededEvent;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AutoValueGson_AutoValueAdapterFactory extends AutoValueAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (AccessoryBluetoothState.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AccessoryBluetoothState.typeAdapter(gson);
        }
        if (AlexaDevice.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) AlexaDevice.typeAdapter(gson);
        }
        if (BluetoothState.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BluetoothState.typeAdapter(gson);
        }
        if (ConnectDeviceDirective.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ConnectDeviceDirective.typeAdapter(gson);
        }
        if (ConnectDeviceFailedEvent.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ConnectDeviceFailedEvent.typeAdapter(gson);
        }
        if (ConnectDeviceSucceededEvent.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ConnectDeviceSucceededEvent.typeAdapter(gson);
        }
        if (DeviceInfo.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) DeviceInfo.typeAdapter(gson);
        }
        if (DisconnectDeviceDirective.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) DisconnectDeviceDirective.typeAdapter(gson);
        }
        if (DisconnectDeviceFailedEvent.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) DisconnectDeviceFailedEvent.typeAdapter(gson);
        }
        if (DisconnectDeviceSucceededEvent.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) DisconnectDeviceSucceededEvent.typeAdapter(gson);
        }
        if (PairedDevice.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PairedDevice.typeAdapter(gson);
        }
        return null;
    }
}
