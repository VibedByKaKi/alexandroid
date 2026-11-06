package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation;

import androidx.annotation.NonNull;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.DiscoveredDevicesViewModel;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.FailureViewModel;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.RecentlySetupDevicesViewModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface AutoDiscoveryPresenterContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Action extends BasePresenterAction<View> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // 
        void attachView(@NonNull View view);

        @Override // 
        void detachView();

        void getCustomerProvisioneesSetupStatus();

        void startDiscovery();

        void terminate();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void showDevicesForControlledSetup(DiscoveredDevicesViewModel discoveredDevicesViewModel);

        void showDevicesIneligibleForAutomatedSetup(DiscoveredDevicesViewModel discoveredDevicesViewModel);

        void showFailure(FailureViewModel failureViewModel);

        void showRecentlySetupDevices(RecentlySetupDevicesViewModel recentlySetupDevicesViewModel);
    }
}
