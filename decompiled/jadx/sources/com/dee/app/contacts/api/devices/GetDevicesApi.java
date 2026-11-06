package com.dee.app.contacts.api.devices;

import android.content.SharedPreferences;
import com.dee.app.contacts.api.AbstractContactApiAction;
import com.dee.app.contacts.common.constants.Constants;
import com.dee.app.contacts.common.network.gateway.DeviceServiceGateway;
import com.dee.app.contacts.common.utils.ContactsLogger;
import com.dee.app.contacts.common.utils.DeviceConverterUtils;
import com.dee.app.contacts.interfaces.models.apis.getdevices.GetDevicesRequest;
import com.dee.app.contacts.interfaces.models.apis.getdevices.GetDevicesResponse;
import com.dee.app.contacts.interfaces.models.data.device.Device;
import com.dee.app.contacts.interfaces.models.data.server.ServerDevice;
import com.dee.app.contacts.interfaces.models.data.server.ServerGetDevicesResponse;
import com.dee.app.sync.api.sync.CanSyncContactsApi$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import rx.Observable;
import rx.schedulers.Schedulers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetDevicesApi extends AbstractContactApiAction<GetDevicesRequest, GetDevicesResponse> {
    private static final ContactsLogger LOG = ContactsLogger.getLogger(Constants.LOG_TAG, GetDevicesApi.class);
    private final DeviceServiceGateway mDeviceServiceGateway;

    @Inject
    public GetDevicesApi(SharedPreferences sharedPreferences, DeviceServiceGateway deviceServiceGateway) {
        super(sharedPreferences);
        this.mDeviceServiceGateway = deviceServiceGateway;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ GetDevicesResponse lambda$handleGetDevicesAction$0(ServerGetDevicesResponse serverGetDevicesResponse) {
        ArrayList arrayList = new ArrayList();
        Iterator<ServerDevice> it2 = serverGetDevicesResponse.getDevices().iterator();
        while (it2.hasNext()) {
            Device convertServerDeviceToLocalDevice = DeviceConverterUtils.convertServerDeviceToLocalDevice(it2.next());
            if (convertServerDeviceToLocalDevice != null) {
                arrayList.add(convertServerDeviceToLocalDevice);
            }
        }
        return new GetDevicesResponse(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleGetDevicesAction$1(Throwable th) {
        LOG.e("Failed to get devices. ", th);
    }

    @Override // com.dee.app.contacts.api.AbstractContactApiAction
    public Observable<GetDevicesResponse> handleAction(GetDevicesRequest getDevicesRequest) {
        return handleGetDevicesAction(getDevicesRequest).subscribeOn(Schedulers.computation()).observeOn(Schedulers.computation());
    }

    public Observable<GetDevicesResponse> handleGetDevicesAction(GetDevicesRequest getDevicesRequest) {
        return this.mDeviceServiceGateway.getDevices(getDevicesRequest.getHomegroupId()).map(new CanSyncContactsApi$$ExternalSyntheticLambda0(5)).doOnError(new CanSyncContactsApi$$ExternalSyntheticLambda0(6));
    }
}
