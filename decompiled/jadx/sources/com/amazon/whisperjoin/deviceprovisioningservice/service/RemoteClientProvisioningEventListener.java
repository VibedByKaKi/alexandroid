package com.amazon.whisperjoin.deviceprovisioningservice.service;

import android.os.RemoteException;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.ProvisioningWorkflowEventCallback;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.ProvisioningEventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class RemoteClientProvisioningEventListener implements ProvisioningEventListener {
    private static final String TAG = "RemoteClientProvisioningEventListener";
    private final ProvisioningWorkflowEventCallback mClientListener;

    public RemoteClientProvisioningEventListener(ProvisioningWorkflowEventCallback provisioningWorkflowEventCallback) {
        this.mClientListener = provisioningWorkflowEventCallback;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.ProvisioningEventListener
    public void onComplete() {
        try {
            this.mClientListener.onComplete();
        } catch (RemoteException e) {
            WJLog.e(TAG, "RemoteException Occurred", e);
        }
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.ProvisioningEventListener
    public void onError(String str, String str2, String str3) {
        try {
            this.mClientListener.onError(str, str2, str3);
        } catch (RemoteException e) {
            WJLog.e(TAG, "RemoteException Occurred", e);
        }
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.ProvisioningEventListener
    public void onNext(String str, String str2) {
        try {
            this.mClientListener.onNext(str, str2);
        } catch (RemoteException e) {
            WJLog.e(TAG, "RemoteException Occurred", e);
        }
    }
}
