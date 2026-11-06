package com.amazon.alexa.accessory.internal;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class PeripheralDevices implements Iterable<PeripheralDevice> {
    private static final PeripheralDevices UNAVAILABLE = new PeripheralDevices(Collections.EMPTY_SET);
    private final Set<PeripheralDevice> devices;

    public PeripheralDevices(Set<PeripheralDevice> set) {
        Preconditions.notNull(set, "devices");
        this.devices = set;
    }

    public static PeripheralDevices unavailable() {
        return UNAVAILABLE;
    }

    public boolean areAvailable() {
        return this != UNAVAILABLE;
    }

    public boolean contains(PeripheralDevice peripheralDevice) {
        return this.devices.contains(peripheralDevice);
    }

    public Set<PeripheralDevice> getDevices() {
        return this.devices;
    }

    @Override // java.lang.Iterable
    public Iterator<PeripheralDevice> iterator() {
        return this.devices.iterator();
    }
}
