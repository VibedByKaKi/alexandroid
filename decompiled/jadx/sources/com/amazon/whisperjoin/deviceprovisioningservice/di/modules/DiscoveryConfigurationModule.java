package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.bluetooth.le.ScanFilter;
import android.content.Context;
import com.amazon.whisperjoin.common.sharedtypes.configuration.OveractiveConfiguration;
import com.amazon.whisperjoin.common.sharedtypes.radios.ScanningMode;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.ble.ScanFilters;
import com.amazon.whisperjoin.deviceprovisioningservice.device.DiscoverySettings;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.WorkflowConfiguration;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.operation.WJDeviceSetupModeSupportedPredicate;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.ProvisioningMethod;
import dagger.Module;
import dagger.Provides;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class DiscoveryConfigurationModule {
    private static final int FFS_DISCOVERY_COUNT_LIMIT = 1;
    private static final String TAG = "DiscoveryConfigurationModule";
    private static final int UGS_DISCOVERY_COUNT_LIMIT = 30;
    private final boolean mEnablePhilips;
    private final OveractiveConfiguration mOveractiveConfiguration;
    private final ScanningMode mScanningMode;

    public DiscoveryConfigurationModule(ScanningMode scanningMode, boolean z, OveractiveConfiguration overactiveConfiguration) {
        this.mScanningMode = scanningMode;
        this.mEnablePhilips = z;
        this.mOveractiveConfiguration = overactiveConfiguration;
    }

    @Provides
    public DiscoverySettings providesDiscoverySettings(WorkflowConfiguration workflowConfiguration, ScanningMode scanningMode, ProvisioningMethod provisioningMethod) {
        return new DiscoverySettings(workflowConfiguration.createDeviceFilter(), scanningMode, provisioningMethod.equals(ProvisioningMethod.FFS) ? 1 : 30);
    }

    @Provides
    public OveractiveConfiguration providesOveractiveConfiguration() {
        return this.mOveractiveConfiguration;
    }

    @Provides
    public List<ScanFilter> providesScanFilter(Context context) {
        if (this.mEnablePhilips) {
            WJLog.d(TAG, "Vending WJ and Philips scan filters");
            return ScanFilters.getScanFiltersForWJandPhilips();
        }
        WJLog.d(TAG, "Vending WJ scan filter");
        return ScanFilters.getDefaultScanFilters();
    }

    @Provides
    public ScanningMode providesScanningMode() {
        return this.mScanningMode;
    }

    @Provides
    public WJDeviceSetupModeSupportedPredicate providesWJDeviceSetupModeSupportedPredicate(ProvisioningMethod provisioningMethod, WorkflowConfiguration workflowConfiguration) {
        return new WJDeviceSetupModeSupportedPredicate(provisioningMethod, workflowConfiguration.hasBarcodeData());
    }
}
