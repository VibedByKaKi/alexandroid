package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.os.Build;
import com.amazon.devicesetupservice.v1.ProvisionerInfo;
import com.amazon.whisperjoin.common.sharedtypes.cryptography.TrustProvider;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.di.scopes.ProvisionerServices;
import com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisionerClientData;
import com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisioningServiceConfiguration;
import com.amazon.whisperjoin.deviceprovisioningservice.util.DeviceSerialProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.WorkflowConfiguration;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.ProvisioningMethod;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.internal.retrofit.DSSServiceConfiguration;
import dagger.Module;
import dagger.Provides;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class ProvisioningConfigurationModule {
    private static final String TAG = "ProvisioningConfigurationModule";
    private final ProvisioningMethod mProvisioningMethod;
    private final ProvisioningServiceConfiguration mProvisioningServiceConfiguration;
    private final WorkflowConfiguration mWorkflowConfiguration;

    public ProvisioningConfigurationModule(ProvisioningServiceConfiguration provisioningServiceConfiguration, WorkflowConfiguration workflowConfiguration, ProvisioningMethod provisioningMethod) {
        if (provisioningServiceConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Provisioning service configuration cannot be null");
            throw null;
        }
        if (workflowConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("workflowConfiguration cannot be null");
            throw null;
        }
        if (provisioningMethod == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("provisioningMethod can not be null");
            throw null;
        }
        this.mProvisioningServiceConfiguration = provisioningServiceConfiguration;
        this.mWorkflowConfiguration = workflowConfiguration;
        this.mProvisioningMethod = provisioningMethod;
        WJLog.setDebug(provisioningServiceConfiguration.isDebugEnabled());
        String str = TAG;
        WJLog.i(str, "ProvisionerSDK Version: ");
        WJLog.d(str, "ProvisionerSDK Runtime Dependencies");
        WJLog.d(str, "");
    }

    @Provides
    @ProvisionerServices
    public DSSServiceConfiguration providesDSSServiceConfiguration() {
        return this.mProvisioningServiceConfiguration.getDSSServiceConfiguration();
    }

    @Provides
    @ProvisionerServices
    public Boolean providesIsDebugEnabled() {
        return Boolean.valueOf(this.mProvisioningServiceConfiguration.isDebugEnabled());
    }

    @Provides
    @ProvisionerServices
    public ProvisionerClientData providesProvisionerClientData(ProvisioningServiceConfiguration provisioningServiceConfiguration, MapAuthenticationProvider mapAuthenticationProvider) {
        ProvisionerClientData createProvisionerClientData = new ProvisionerClientData.Builder().setClientAppName(provisioningServiceConfiguration.getProvisionerApplicationName()).setClientAppVersion(provisioningServiceConfiguration.getProvisionerVersionNumber()).setDeviceManufacturer(Build.MANUFACTURER).setDeviceModel(Build.MODEL).setDeviceSerialNumber(DeviceSerialProvider.getDeviceSerial()).setDeviceFirmwareVersion(Build.VERSION.RELEASE).setMarketplace(provisioningServiceConfiguration.getLocaleConfiguration().getMarketplace()).setMetricsDeviceGroup(provisioningServiceConfiguration.getProvisionerDeviceGroup()).setCustomerEcid(mapAuthenticationProvider.getAccount()).createProvisionerClientData();
        String str = TAG;
        WJLog.d(str, "ProvisionerClientData");
        WJLog.d(str, createProvisionerClientData.toString());
        return createProvisionerClientData;
    }

    @Provides
    @ProvisionerServices
    public ProvisionerInfo providesProvisionerInfo(ProvisionerClientData provisionerClientData) {
        ProvisionerInfo provisionerInfo = new ProvisionerInfo();
        provisionerInfo.setDeviceModel(provisionerClientData.getDeviceModel());
        provisionerInfo.setManufacturer(provisionerClientData.getDeviceManufacturer());
        provisionerInfo.setFirmwareVersion(provisionerClientData.getDeviceFirmwareVersion());
        provisionerInfo.setApplication(provisionerClientData.getClientAppName());
        provisionerInfo.setApplicationVersion(provisionerClientData.getClientAppVersion());
        return provisionerInfo;
    }

    @Provides
    @ProvisionerServices
    public ProvisioningMethod providesProvisioningMethod() {
        return this.mProvisioningMethod;
    }

    @Provides
    @ProvisionerServices
    public ProvisioningServiceConfiguration providesProvisioningServiceConfiguration() {
        return this.mProvisioningServiceConfiguration;
    }

    @Provides
    @ProvisionerServices
    public TrustProvider.TrustState providesTrustState(WorkflowConfiguration workflowConfiguration, ProvisioningMethod provisioningMethod) {
        return provisioningMethod.equals(ProvisioningMethod.FFS) ? TrustProvider.TrustState.TRUSTED_ENCRYPTED : workflowConfiguration.hasBarcodeData() ? TrustProvider.TrustState.UNTRUSTED_PIN : TrustProvider.TrustState.UNTRUSTED_ENCRYPTED;
    }

    @Provides
    @ProvisionerServices
    public WorkflowConfiguration providesWorkflowConfiguration() {
        return this.mWorkflowConfiguration;
    }
}
