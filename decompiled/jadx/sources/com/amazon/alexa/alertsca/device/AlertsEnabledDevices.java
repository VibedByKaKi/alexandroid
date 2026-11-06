package com.amazon.alexa.alertsca.device;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlertsEnabledDevices {
    private static final Set<Device> alertsEnabledDevices = new HashSet();

    public AlertsEnabledDevices() {
        Set<Device> set = alertsEnabledDevices;
        set.add(Device.create("motorola", "payton", "motorola", "moto x4", "payton"));
        set.add(Device.create("motorola", "payton", "motorola", "moto x4", "payton_playpl"));
        set.add(Device.create("motorola", "payton", "motorola", "moto x4", "payton_tmopl"));
        set.add(Device.create("motorola", "payton", "motorola", "moto x4", "payton_retru"));
        set.add(Device.create("motorola", "payton", "motorola", "moto x4", "payton_amz"));
        set.add(Device.create("motorola", "payton_sprout", "motorola", "moto x4", "payton_fi"));
        set.add(Device.create("motorola", "messi", "motorola", "moto z3", "messi"));
        set.add(Device.create("motorola", "messi", "motorola", "moto z3", "messi_verizon"));
        set.add(Device.create("motorola", "messi", "motorola", "moto z3", "messi_retcn"));
        set.add(Device.create("motorola", "messi", "motorola", "moto z3", "messi_cmcc"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_3uk"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_retru"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_amz"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_sprint"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_amxla"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_amx"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_dteu"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_ora"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_playpl"));
        set.add(Device.create("motorola", "beckham", "motorola", "moto z3 play", "beckham_vzw"));
        set.add(Device.create("motorola", "beckham", "motorola", "XT1929-10", "beckham_retcn"));
    }

    public boolean isAlertsEnabled(Device device) {
        return alertsEnabledDevices.contains(device);
    }
}
