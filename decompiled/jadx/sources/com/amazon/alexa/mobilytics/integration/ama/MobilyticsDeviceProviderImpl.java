package com.amazon.alexa.mobilytics.integration.ama;

import androidx.annotation.NonNull;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.mobilytics.identity.MobilyticsDevice;
import com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsDeviceProviderImpl implements MobilyticsDeviceProvider {
    private DeviceInformation deviceInformation;

    public MobilyticsDeviceProviderImpl() {
        this.deviceInformation = null;
        ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
        if (componentRegistry != null) {
            this.deviceInformation = (DeviceInformation) componentRegistry.get(DeviceInformation.class).get();
        }
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public MobilyticsDevice device() {
        return new MobilyticsDeviceImpl(this.deviceInformation);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public void addListener(@NonNull MobilyticsDeviceProvider.Listener listener) {
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDeviceProvider
    public void removeListener(@NonNull MobilyticsDeviceProvider.Listener listener) {
    }
}
