package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation;

import com.amazon.whisperjoin.deviceprovisioningservice.error.PresenterInitializationException;
import com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisionerClientData;
import org.apache.commons.lang.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PresenterValidator {
    public static void validatePreconditions(ProvisionerClientData provisionerClientData) {
        if (StringUtils.isEmpty(provisionerClientData.getClientAppName())) {
            throw new PresenterInitializationException("Client app name must be set");
        }
        if (StringUtils.isEmpty(provisionerClientData.getClientAppVersion())) {
            throw new PresenterInitializationException("Client app version must be set");
        }
        if (StringUtils.isEmpty(provisionerClientData.getDeviceModel())) {
            throw new PresenterInitializationException("Device model must be set");
        }
        if (StringUtils.isEmpty(provisionerClientData.getDeviceFirmwareVersion())) {
            throw new PresenterInitializationException("Device firmware version must be set");
        }
        if (StringUtils.isEmpty(provisionerClientData.getDeviceManufacturer())) {
            throw new PresenterInitializationException("Device manufacturer must be set");
        }
        if (StringUtils.isEmpty(provisionerClientData.getDeviceSerialNumber())) {
            throw new PresenterInitializationException("Provisioner DSN must be set");
        }
        if (StringUtils.isEmpty(provisionerClientData.getCustomerEcid())) {
            throw new PresenterInitializationException("Customer ecid must be set");
        }
        if (StringUtils.isEmpty(provisionerClientData.getMarketplace())) {
            throw new PresenterInitializationException("Marketplace must be set");
        }
    }
}
