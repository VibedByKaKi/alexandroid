package com.amazon.alexa.accessory.repositories.device.v2;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.internal.util.DeviceDatabaseUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Device {
    private static final String COLOR_KEY = "color";
    private static final String DEVICE_ID_KEY = "deviceId";
    private static final String NAME_KEY = "name";
    private static final String SERIAL_NUMBER_KEY = "serialNumber";
    private static final String TYPE_KEY = "type";
    private final Integer color;
    private final Integer deviceId;
    private final String name;
    private final String serialNumber;
    private final String type;

    private Device(@NonNull Builder builder) {
        Preconditions.notNull(builder, "builder");
        Preconditions.notNull(builder.name, "name");
        Preconditions.notNull(builder.serialNumber, "serialNumber");
        Preconditions.notNull(builder.type, "type");
        Preconditions.notNull(builder.deviceId, "deviceId");
        Preconditions.notNull(builder.color, "color");
        this.name = DeviceDatabaseUtils.sanitize(builder.name);
        this.serialNumber = DeviceDatabaseUtils.sanitize(builder.serialNumber);
        this.type = DeviceDatabaseUtils.sanitize(builder.type);
        this.deviceId = builder.deviceId;
        this.color = builder.color;
    }

    public static Device fromBundle(Bundle bundle) {
        return newBuilder().name(bundle.getString("name")).serialNumber(bundle.getString("serialNumber")).type(bundle.getString("type")).deviceId(Integer.valueOf(bundle.getInt("deviceId"))).color(Integer.valueOf(bundle.getInt("color"))).build();
    }

    @NonNull
    public static Builder newBuilder(@NonNull Device device) {
        Preconditions.notNull(device, "device");
        return new Builder(device);
    }

    public static Bundle toBundle(Device device) {
        Bundle bundle = new Bundle();
        bundle.putString("name", device.name);
        bundle.putString("serialNumber", device.serialNumber);
        bundle.putString("type", device.type);
        bundle.putInt("deviceId", device.deviceId.intValue());
        bundle.putInt("color", device.color.intValue());
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Device.class == obj.getClass()) {
            Device device = (Device) obj;
            if (Objects.equals(this.name, device.name) && Objects.equals(this.serialNumber, device.serialNumber) && Objects.equals(this.type, device.type) && Objects.equals(this.deviceId, device.deviceId) && Objects.equals(this.color, device.color)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Integer getColor() {
        return this.color;
    }

    @NonNull
    public Integer getDeviceId() {
        return this.deviceId;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String getSerialNumber() {
        return this.serialNumber;
    }

    @NonNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.serialNumber, this.type, this.deviceId, this.color);
    }

    public String toString() {
        return "Device{name='" + this.name + "', serialNumber='" + this.serialNumber + "', type='" + this.type + "', deviceId=" + this.deviceId + ", color=" + this.color + AbstractJsonLexerKt.END_OBJ;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Integer color;
        private Integer deviceId;
        private String name;
        private String serialNumber;
        private String type;

        public Builder(@NonNull Device device) {
            Preconditions.notNull(device, "device");
            this.name = device.getName();
            this.serialNumber = device.getSerialNumber();
            this.type = device.getType();
            this.deviceId = device.getDeviceId();
            this.color = device.getColor();
        }

        @NonNull
        public Device build() {
            return new Device(this, 0);
        }

        public Builder color(Integer num) {
            this.color = num;
            return this;
        }

        public Builder deviceId(Integer num) {
            this.deviceId = num;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder serialNumber(String str) {
            this.serialNumber = str;
            return this;
        }

        public Builder type(String str) {
            this.type = str;
            return this;
        }

        public Builder() {
        }
    }

    public /* synthetic */ Device(Builder builder, int i) {
        this(builder);
    }
}
