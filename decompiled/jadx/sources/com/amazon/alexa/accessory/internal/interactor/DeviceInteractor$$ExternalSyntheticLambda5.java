package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.internal.interactor.DeviceAccountInteractor;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DeviceInteractor$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DeviceInteractor$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                DeviceInteractor.lambda$removeUnpairedDeviceGroups$8((DeviceGroup) obj);
                break;
            case 1:
                DeviceAccountInteractor.SessionListener.lambda$onAccessorySessionConnected$0((List) obj);
                break;
            case 2:
                DeviceAccountInteractor.SessionListener.lambda$onAccessorySessionConnected$1((Throwable) obj);
                break;
            case 3:
                Logger.d("DeviceInteractor bluetooth bond was removed but no device was removed from database", (Throwable) obj);
                break;
            case 4:
                Logger.e("RegistrationInteractor: On session connected listener registration caught exception", (Throwable) obj);
                break;
            case 5:
                Logger.e("CompanionDeviceInteractor: CRITICAL: failed to listen for removed devices");
                break;
            case 6:
                Logger.e("CompanionDeviceInteractor: Critical: Error in listenForNewCompanionDevices", (Throwable) obj);
                break;
            case 7:
                Logger.e("ConnectivityInteractor: CRITICAL: Error in querying user change");
                break;
            case 8:
                Logger.e("Failed to activate known accessories", (Throwable) obj);
                break;
            case 9:
                Logger.e("ConnectivityInteractor: failed to query expired standby accessories", (Throwable) obj);
                break;
            case 10:
                DeviceAccountInteractor.lambda$observeLogins$6((List) obj);
                break;
            case 11:
                DeviceAccountInteractor.lambda$observeLogins$7((Throwable) obj);
                break;
            case 12:
                Logger.e("An error occurred while persisting information for newly linked devices", (Throwable) obj);
                break;
            case 13:
                Logger.e("DeviceInteractor unable to remove unpaired devices from device supplier.", (Throwable) obj);
                break;
            case 14:
                Logger.e("Critical: RegistrationInteractor: Login observer onError", (Throwable) obj);
                break;
            case 15:
                Logger.d("RegistrationInteractor: Device groups observed");
                break;
            case 16:
                Logger.e("Critical: RegistrationInteractor: Observe devices caught exception:", (Throwable) obj);
                break;
            default:
                Logger.d("RegistrationInteractor: Login observed");
                break;
        }
    }
}
