package com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaUserSpeechProviderScope;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.base.device.DeviceSerialNumber;
import com.amazon.alexa.client.alexaservice.base.device.DeviceType;
import com.amazon.alexa.client.alexaservice.base.device.FirmwareVersion;
import com.amazon.alexa.client.alexaservice.features.iocomponent.Connection;
import com.amazon.alexa.client.alexaservice.features.iocomponent.DeviceInfo;
import com.amazon.alexa.client.alexaservice.features.iocomponent.IOComponent;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DeviceIOComponentsStateProvider implements IOComponentsStateProvider {
    static final String DEFAULT_PACKAGE_NAME = "com.amazon.dee.app";
    private final DeviceType deviceType;
    private final DeviceSerialNumber dsn;
    private IOComponent ioComponent;
    private final String packageName;

    public DeviceIOComponentsStateProvider(String str, DeviceType deviceType, String str2) {
        this.dsn = DeviceSerialNumber.create(str);
        this.deviceType = deviceType;
        this.packageName = str2;
    }

    private IOComponent createIOComponentInternal() {
        if (this.ioComponent == null) {
            this.ioComponent = createIOComponent();
        }
        return this.ioComponent;
    }

    private boolean isCorrectInvocation(ExtendedClient extendedClient, @Nullable AlexaUserSpeechProviderScope alexaUserSpeechProviderScope) {
        return (!"com.amazon.dee.app".equals(this.packageName) && extendedClient.getPackageName().equals(this.packageName)) || AlexaUserSpeechProviderScope.SYSTEM.equals(alexaUserSpeechProviderScope);
    }

    @Override // com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.IOComponentsStateProvider
    public Set<IOComponent> createActiveIOComponents(@Nullable ExtendedClient extendedClient, @Nullable AlexaUserSpeechProviderScope alexaUserSpeechProviderScope) {
        return (extendedClient == null || !isCorrectInvocation(extendedClient, alexaUserSpeechProviderScope)) ? Collections.EMPTY_SET : Collections.singleton(createIOComponentInternal());
    }

    public IOComponent createIOComponent() {
        return IOComponent.create(IOComponent.Type.MICROPHONE, Connection.create(Connection.Type.MICROPHONE), DeviceInfo.create(this.deviceType, getDeviceSerialNumber(), getFirmwareVersion()));
    }

    @Override // com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.IOComponentsStateProvider
    public Set<IOComponent> createIOComponents() {
        return Collections.singleton(createIOComponentInternal());
    }

    public DeviceSerialNumber getDeviceSerialNumber() {
        return this.dsn;
    }

    public abstract FirmwareVersion getFirmwareVersion();
}
