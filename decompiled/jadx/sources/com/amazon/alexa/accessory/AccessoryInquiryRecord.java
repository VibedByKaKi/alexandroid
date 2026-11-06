package com.amazon.alexa.accessory;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Device;
import com.amazon.alexa.accessory.repositories.device.v2.Device;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AccessoryInquiryRecord {
    private final Set<Device> devices;

    public AccessoryInquiryRecord(List<Device> list) {
        Preconditions.notNull(list, "devices");
        this.devices = new HashSet(list);
    }

    private static Device extractDevice(Device.DeviceInformation deviceInformation) {
        return com.amazon.alexa.accessory.repositories.device.v2.Device.newBuilder().name(deviceInformation.getName()).serialNumber(deviceInformation.getSerialNumber()).deviceId(Integer.valueOf(deviceInformation.getDeviceId())).color(Integer.valueOf(deviceInformation.getProductColor())).type(deviceInformation.getDeviceType()).build();
    }

    private static Set<com.amazon.alexa.accessory.repositories.device.v2.Device> extractDevices(Set<Device.DeviceInformation> set) {
        HashSet hashSet = new HashSet(set.size());
        Iterator<Device.DeviceInformation> it2 = set.iterator();
        while (it2.hasNext()) {
            hashSet.add(extractDevice(it2.next()));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessoryInquiryRecord.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.devices, ((AccessoryInquiryRecord) obj).devices);
    }

    public Set<com.amazon.alexa.accessory.repositories.device.v2.Device> getDevices() {
        return Collections.unmodifiableSet(this.devices);
    }

    public int hashCode() {
        return Objects.hash(this.devices);
    }

    public String toString() {
        return "DefaultAccessoryInquiryRecord\n{\n\tdevices: " + Arrays.toString(this.devices.toArray()) + "\n}\n";
    }

    public AccessoryInquiryRecord(Set<Device.DeviceInformation> set) {
        Preconditions.notNull(set, "deviceInformationSet");
        this.devices = extractDevices(set);
    }

    public AccessoryInquiryRecord(DeviceGroup deviceGroup) {
        Preconditions.notNull(deviceGroup, "deviceGroup");
        this.devices = extractDevices(deviceGroup);
    }

    private static Set<com.amazon.alexa.accessory.repositories.device.v2.Device> extractDevices(DeviceGroup deviceGroup) {
        HashSet hashSet = new HashSet(deviceGroup.getDevices().size());
        hashSet.addAll(deviceGroup.getDevices());
        return hashSet;
    }
}
