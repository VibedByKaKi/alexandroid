package com.dee.app.contacts.api;

import com.dee.app.contacts.api.devices.GetDevicesApi;
import com.dee.app.contacts.interfaces.models.apis.getdevices.GetDevicesRequest;
import com.dee.app.contacts.interfaces.models.apis.getdevices.GetDevicesResponse;
import javax.inject.Inject;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DevicesApiHandler {
    private final AbstractContactApiAction<GetDevicesRequest, GetDevicesResponse> mGetDevicesApi;

    @Inject
    public DevicesApiHandler(GetDevicesApi getDevicesApi) {
        this.mGetDevicesApi = getDevicesApi;
    }

    public Observable<GetDevicesResponse> getDevices(GetDevicesRequest getDevicesRequest) {
        return this.mGetDevicesApi.performAction(getDevicesRequest);
    }
}
