package com.amazon.alexa.accessory.repositories.device.v2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import com.amazon.alexa.accessory.AccessoryTransport;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class DeviceGroup implements Iterable<Device> {
    private static final String DEVICES_KEY = "devices";
    private static final String IDENTIFIER_KEY = "identifier";
    private static final String ID_KEY = "id";
    private static final String LIST_KEY = "list";
    private static final String STANDBY_REASON_ORDINAL_KEY = "standbyReasonOrdinal";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String TRANSPORT_TYPE_ORDINAL_KEY = "transport";
    private final List<Device> devices;
    private final long id;
    private final String identifier;
    private final long standbyExpirationTimestamp;
    private final StandbyReason standbyReason;
    private final AccessoryTransport.Type transport;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StandbyReason {
        UNKNOWN,
        AAP_CONNECTION_REFUSAL
    }

    private DeviceGroup(@NonNull Builder builder) {
        this.id = builder.id;
        this.identifier = builder.identifier;
        this.transport = builder.transport;
        this.standbyExpirationTimestamp = builder.standbyExpirationTimestamp;
        this.standbyReason = builder.standbyReason;
        this.devices = Collections.unmodifiableList(builder.devices);
    }

    public static DeviceGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList;
        Bundle bundle2 = bundle.getBundle("devices");
        ArrayList arrayList = new ArrayList();
        if (bundle2 != null && (parcelableArrayList = bundle2.getParcelableArrayList(LIST_KEY)) != null) {
            Iterator it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                arrayList.add(Device.fromBundle((Bundle) ((Parcelable) it2.next())));
            }
        }
        return newBuilder().devices(arrayList).identifier(bundle.getString("identifier")).setConditionStandbyTimeout(bundle.getLong("timestamp"), StandbyReason.values()[bundle.getInt(STANDBY_REASON_ORDINAL_KEY)]).transport(AccessoryTransport.Type.values()[bundle.getInt("transport")]).id(bundle.getLong("id")).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDeviceWithHighestDeviceId$0(Device device, Device device2) {
        return device.getDeviceId().intValue() - device2.getDeviceId().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDeviceWithHighestId$1(Device device, Device device2) {
        return device.getDeviceId().intValue() - device2.getDeviceId().intValue();
    }

    @NonNull
    public static Builder newBuilder(@NonNull DeviceGroup deviceGroup) {
        Preconditions.notNull(deviceGroup, "deviceGroup");
        return new Builder(deviceGroup);
    }

    public static Bundle toBundle(DeviceGroup deviceGroup) {
        List<Device> devices = deviceGroup.getDevices();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(devices.size());
        Iterator<Device> it2 = devices.iterator();
        while (it2.hasNext()) {
            arrayList.add(Device.toBundle(it2.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(LIST_KEY, arrayList);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("devices", bundle);
        bundle2.putString("identifier", deviceGroup.identifier);
        bundle2.putInt("transport", deviceGroup.transport.ordinal());
        bundle2.putLong("timestamp", deviceGroup.standbyExpirationTimestamp);
        bundle2.putInt(STANDBY_REASON_ORDINAL_KEY, deviceGroup.standbyReason.ordinal());
        bundle2.putLong("id", deviceGroup.id);
        return bundle2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DeviceGroup.class == obj.getClass()) {
            DeviceGroup deviceGroup = (DeviceGroup) obj;
            if (this.id == deviceGroup.id && new HashSet(this.devices).equals(new HashSet(deviceGroup.devices)) && Objects.equals(this.identifier, deviceGroup.identifier) && this.transport == deviceGroup.transport) {
                return true;
            }
        }
        return false;
    }

    public Condition getCondition(long j) {
        long j2 = this.standbyExpirationTimestamp;
        Condition condition = Condition.STANDBY_INDEFINITE;
        return j2 == condition.getSpecialTimestamp() ? condition : this.standbyExpirationTimestamp > j ? Condition.STANDBY_TIMEOUT : Condition.ACTIVE;
    }

    @Nullable
    public Device getDevice(long j) {
        Iterator<Device> it2 = iterator();
        while (it2.hasNext()) {
            Device next = it2.next();
            if (next.getDeviceId().intValue() == j) {
                return next;
            }
        }
        return null;
    }

    @Nullable
    public Device getDeviceWithHighestDeviceId() {
        if (this.devices.isEmpty()) {
            return null;
        }
        return (Device) Collections.max(this.devices, new LayoutNode$$ExternalSyntheticLambda1(18));
    }

    @Nullable
    public Device getDeviceWithHighestId() {
        if (this.devices.isEmpty()) {
            return null;
        }
        return (Device) Collections.max(this.devices, new LayoutNode$$ExternalSyntheticLambda1(17));
    }

    @NonNull
    public List<Device> getDevices() {
        return this.devices;
    }

    public long getId() {
        return this.id;
    }

    @NonNull
    public String getIdentifier() {
        return this.identifier;
    }

    public long getStandbyExpirationTimestamp() {
        return this.standbyExpirationTimestamp;
    }

    public StandbyReason getStandbyReason() {
        return this.standbyReason;
    }

    @NonNull
    public AccessoryTransport.Type getTransportType() {
        return this.transport;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), this.devices, this.identifier, this.transport);
    }

    @Override // java.lang.Iterable
    public Iterator<Device> iterator() {
        return this.devices.iterator();
    }

    public String toString() {
        return "DeviceGroup{id=" + this.id + ", devices=" + this.devices + ", identifier='" + this.identifier + "', transport=" + this.transport + ", standbyExpirationTimestamp=" + this.standbyExpirationTimestamp + ", standbyReason=" + this.standbyReason + ", computedCondition=" + getCondition(System.currentTimeMillis()) + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Condition {
        private final long specialTimestamp;
        public static final Condition ACTIVE = new Condition("ACTIVE", 0, 1);
        public static final Condition STANDBY_TIMEOUT = new AnonymousClass1();
        public static final Condition STANDBY_INDEFINITE = new Condition("STANDBY_INDEFINITE", 2, 0);
        private static final /* synthetic */ Condition[] $VALUES = $values();

        private static /* synthetic */ Condition[] $values() {
            return new Condition[]{ACTIVE, STANDBY_TIMEOUT, STANDBY_INDEFINITE};
        }

        private Condition(String str, int i, long j) {
            this.specialTimestamp = j;
        }

        public static Condition valueOf(String str) {
            return (Condition) Enum.valueOf(Condition.class, str);
        }

        public static Condition[] values() {
            return (Condition[]) $VALUES.clone();
        }

        public long getSpecialTimestamp() {
            return this.specialTimestamp;
        }

        public /* synthetic */ Condition(String str, int i, long j, int i2) {
            this(str, i, j);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        /* renamed from: com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup$Condition$1, reason: invalid class name */
        public enum AnonymousClass1 extends Condition {
            public /* synthetic */ AnonymousClass1() {
                this("STANDBY_TIMEOUT", 1, Long.MIN_VALUE);
            }

            @Override // com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup.Condition
            public long getSpecialTimestamp() {
                throw new UnsupportedOperationException("STANDBY_TIMEOUT does not have special timestamp value");
            }

            private AnonymousClass1(String str, int i, long j) {
                super(str, i, j, 0);
            }
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @Nullable
    public Device getDevice() {
        if (this.devices.isEmpty()) {
            return null;
        }
        return this.devices.get(0);
    }

    public /* synthetic */ DeviceGroup(Builder builder, int i) {
        this(builder);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private final ArrayList<Device> devices;
        private long id;
        private String identifier;
        private long standbyExpirationTimestamp;
        private StandbyReason standbyReason;
        private AccessoryTransport.Type transport;

        public Builder(@NonNull DeviceGroup deviceGroup) {
            this.id = -1L;
            Preconditions.notNull(deviceGroup, "deviceGroup");
            this.id = deviceGroup.id;
            this.identifier = deviceGroup.identifier;
            this.transport = deviceGroup.transport;
            ArrayList<Device> arrayList = new ArrayList<>(deviceGroup.devices.size());
            this.devices = arrayList;
            arrayList.addAll(deviceGroup.devices);
            this.standbyExpirationTimestamp = deviceGroup.standbyExpirationTimestamp;
            this.standbyReason = deviceGroup.standbyReason;
        }

        @NonNull
        public DeviceGroup build() {
            Preconditions.notNull(this.identifier, "identifier");
            Preconditions.notNull(this.transport, "transport");
            Preconditions.notNull(this.devices, "devices");
            int i = 0;
            Preconditions.precondition(this.standbyExpirationTimestamp >= 0, "standbyExpirationTimestamp >= 0");
            Preconditions.notNull(this.standbyReason, "standbyReason");
            return new DeviceGroup(this, i);
        }

        @Deprecated
        public Builder condition(Condition condition) {
            Preconditions.precondition(condition != Condition.STANDBY_TIMEOUT, "STANDBY_TIMEOUT condition must be set with setConditionStandbyTimeout()");
            this.standbyExpirationTimestamp = condition.getSpecialTimestamp();
            return this;
        }

        public Builder devices(List<Device> list) {
            this.devices.clear();
            this.devices.addAll(list);
            return this;
        }

        public Builder id(long j) {
            this.id = j;
            return this;
        }

        public Builder identifier(String str) {
            this.identifier = str;
            return this;
        }

        public Builder setConditionActive() {
            this.standbyExpirationTimestamp = Condition.ACTIVE.getSpecialTimestamp();
            return this;
        }

        public Builder setConditionStandbyIndefinite(StandbyReason standbyReason) {
            this.standbyExpirationTimestamp = Condition.STANDBY_INDEFINITE.getSpecialTimestamp();
            this.standbyReason = standbyReason;
            return this;
        }

        public Builder setConditionStandbyTimeout(long j, StandbyReason standbyReason) {
            this.standbyExpirationTimestamp = j;
            this.standbyReason = standbyReason;
            return this;
        }

        public Builder transport(AccessoryTransport.Type type) {
            this.transport = type;
            return this;
        }

        public Builder() {
            this.id = -1L;
            this.devices = new ArrayList<>();
            this.standbyExpirationTimestamp = Condition.ACTIVE.getSpecialTimestamp();
            this.standbyReason = StandbyReason.UNKNOWN;
        }
    }
}
