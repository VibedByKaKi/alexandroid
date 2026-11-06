package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning;

import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.Action;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.operation.DeviceOperation;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.result.WJResult;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.Event;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceActionsExecutor implements ObservableTransformer<Action, WJResult> {
    private static final String TAG = "DeviceActionsExecutor";
    private final DeviceOperation<Action.BlessDiscoveredDevice> mBlessDiscoveredDeviceDeviceOperation;
    private final DeviceOperation<Action.ConnectToDevice> mConnectionToDeviceOperation;
    private final DeviceOperation<Action.DeviceNetworkDebugTunnel> mDeviceNetworkDebugTunnelOperation;
    private final DeviceOperation<Action.Disconnect> mDisconnectFromDeviceOperation;
    private final DeviceOperation<Action.GetProvisioningDetails> mGetAvailableNetworksOperation;
    private final DeviceOperation<Action.ProvisionDevice> mProvisionDeviceOperation;
    private final DeviceOperation<Action.SendCustomCommand> mSendCustomCommandOperation;
    private final DeviceOperation<Action.StartDiscovery> mStartDiscoveryOperation;
    private final DeviceOperation<Action.StopDiscovery> mStopDiscoveryOperation;
    private final DeviceOperation<Action.TerminateSetup> mTerminateSetupOperation;
    private final DeviceOperation<Action.VerifyProvisioning> mVerifyProvisioningOperation;

    public DeviceActionsExecutor(DeviceOperation<Action.StartDiscovery> deviceOperation, DeviceOperation<Action.StopDiscovery> deviceOperation2, DeviceOperation<Action.BlessDiscoveredDevice> deviceOperation3, DeviceOperation<Action.ConnectToDevice> deviceOperation4, DeviceOperation<Action.GetProvisioningDetails> deviceOperation5, DeviceOperation<Action.ProvisionDevice> deviceOperation6, DeviceOperation<Action.VerifyProvisioning> deviceOperation7, DeviceOperation<Action.TerminateSetup> deviceOperation8, DeviceOperation<Action.Disconnect> deviceOperation9, DeviceOperation<Action.DeviceNetworkDebugTunnel> deviceOperation10, DeviceOperation<Action.SendCustomCommand> deviceOperation11) {
        this.mStartDiscoveryOperation = deviceOperation;
        this.mStopDiscoveryOperation = deviceOperation2;
        this.mBlessDiscoveredDeviceDeviceOperation = deviceOperation3;
        this.mConnectionToDeviceOperation = deviceOperation4;
        this.mDisconnectFromDeviceOperation = deviceOperation9;
        this.mGetAvailableNetworksOperation = deviceOperation5;
        this.mProvisionDeviceOperation = deviceOperation6;
        this.mVerifyProvisioningOperation = deviceOperation7;
        this.mTerminateSetupOperation = deviceOperation8;
        this.mDeviceNetworkDebugTunnelOperation = deviceOperation10;
        this.mSendCustomCommandOperation = deviceOperation11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Observable<WJResult>> routeActionToExecutor(Observable<Action> observable) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(observable.ofType(Action.StartDiscovery.class).compose(this.mStartDiscoveryOperation));
        arrayList.add(observable.ofType(Action.StopDiscovery.class).compose(this.mStopDiscoveryOperation));
        arrayList.add(observable.ofType(Action.BlessDiscoveredDevice.class).compose(this.mBlessDiscoveredDeviceDeviceOperation));
        arrayList.add(observable.ofType(Action.ConnectToDevice.class).compose(this.mConnectionToDeviceOperation));
        arrayList.add(observable.ofType(Action.Disconnect.class).compose(this.mDisconnectFromDeviceOperation));
        arrayList.add(observable.ofType(Action.GetProvisioningDetails.class).compose(this.mGetAvailableNetworksOperation));
        arrayList.add(observable.ofType(Action.ProvisionDevice.class).compose(this.mProvisionDeviceOperation));
        arrayList.add(observable.ofType(Action.VerifyProvisioning.class).compose(this.mVerifyProvisioningOperation));
        arrayList.add(observable.ofType(Action.TerminateSetup.class).compose(this.mTerminateSetupOperation));
        arrayList.add(observable.ofType(Action.DeviceNetworkDebugTunnel.class).compose(this.mDeviceNetworkDebugTunnelOperation));
        arrayList.add(observable.ofType(Action.SendCustomCommand.class).compose(this.mSendCustomCommandOperation));
        return arrayList;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public ObservableSource<WJResult> apply(@NonNull Observable<Action> observable) {
        return observable.publish(new Function<Observable<Action>, ObservableSource<WJResult>>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.DeviceActionsExecutor.2
            @Override // io.reactivex.rxjava3.functions.Function
            public ObservableSource<WJResult> apply(Observable<Action> observable2) throws Exception {
                return Observable.merge(DeviceActionsExecutor.this.routeActionToExecutor(observable2));
            }
        }).doOnNext(new Consumer<WJResult>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.DeviceActionsExecutor.1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(@NonNull WJResult wJResult) throws Exception {
                if (wJResult.isState(Event.State.ERROR)) {
                    WJLog.e(DeviceActionsExecutor.TAG, "An Error Occurred: " + wJResult, wJResult.getError());
                }
            }
        }).observeOn(AndroidSchedulers.mainThread());
    }
}
