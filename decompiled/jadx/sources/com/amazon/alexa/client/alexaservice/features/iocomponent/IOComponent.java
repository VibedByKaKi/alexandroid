package com.amazon.alexa.client.alexaservice.features.iocomponent;

import com.amazon.alexa.client.alexaservice.features.iocomponent.AutoValue_IOComponent;
import com.amazon.alexa.client.annotations.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class IOComponent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Type {
        MICROPHONE,
        AUDIO_OUTPUT,
        SCREEN,
        CAMERA
    }

    public static IOComponent create(Type type, Connection connection, DeviceInfo deviceInfo, @Nullable ClusterDevice clusterDevice, @Nullable List<IOComponentContext> list) {
        return new AutoValue_IOComponent(type, connection, deviceInfo, clusterDevice, list);
    }

    public static TypeAdapter<IOComponent> typeAdapter(Gson gson) {
        return new AutoValue_IOComponent.GsonTypeAdapter(gson);
    }

    @Nullable
    public abstract ClusterDevice getClusterDevice();

    public abstract Connection getConnection();

    @Nullable
    public abstract List<IOComponentContext> getContext();

    public abstract DeviceInfo getDeviceInfo();

    public abstract Type getType();

    public static IOComponent create(Type type, Connection connection, DeviceInfo deviceInfo) {
        return create(type, connection, deviceInfo, null, null);
    }
}
