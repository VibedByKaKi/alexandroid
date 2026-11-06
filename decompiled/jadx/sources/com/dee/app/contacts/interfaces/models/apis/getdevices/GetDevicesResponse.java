package com.dee.app.contacts.interfaces.models.apis.getdevices;

import com.dee.app.contacts.interfaces.models.data.device.Device;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetDevicesResponse {
    private List<Device> devices;

    public GetDevicesResponse(List<Device> list) {
        this.devices = list;
    }

    public List<Device> getDevices() {
        return this.devices;
    }

    public void setDevices(List<Device> list) {
        this.devices = list;
    }
}
