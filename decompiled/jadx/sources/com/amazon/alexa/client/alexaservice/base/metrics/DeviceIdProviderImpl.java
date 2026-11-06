package com.amazon.alexa.client.alexaservice.base.metrics;

import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.alexa.client.metrics.core.DeviceIdProvider;
import dagger.Lazy;
import java.util.UUID;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeviceIdProviderImpl implements DeviceIdProvider {
    private static final String DEVICE_ID_KEY = "id";
    private final Lazy<PersistentStorage> storage;

    @Inject
    public DeviceIdProviderImpl(Lazy<PersistentStorage> lazy) {
        this.storage = lazy;
    }

    @Override // com.amazon.alexa.client.metrics.core.DeviceIdProvider
    public String getDeviceId() {
        PersistentStorage persistentStorage = this.storage.get();
        if (persistentStorage.contains("id")) {
            return persistentStorage.getString("id");
        }
        String uuid = UUID.randomUUID().toString();
        persistentStorage.edit().set("id", uuid).commitSynchronously();
        return uuid;
    }
}
