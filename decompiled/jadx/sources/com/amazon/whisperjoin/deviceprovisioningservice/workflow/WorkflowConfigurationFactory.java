package com.amazon.whisperjoin.deviceprovisioningservice.workflow;

import com.amazon.whisperjoin.common.sharedtypes.barcode.BarcodeDetails;
import com.amazon.whisperjoin.common.sharedtypes.devices.DeviceFilter;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.BarcodeFormatException;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.PublicKeyDecompressionException;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WorkflowConfigurationFactory {
    private static final String TAG = "WorkflowConfigurationFactory";

    public static WorkflowConfiguration createDefault() {
        try {
            return WorkflowConfiguration.builder().build();
        } catch (PublicKeyDecompressionException e) {
            WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
            return null;
        }
    }

    public static WorkflowConfiguration createWorkflowConfigurationForAllDevices(DeviceFilter.BeaconType beaconType, List<String> list) {
        try {
            return WorkflowConfiguration.builder().withBeaconType(beaconType).withProvisioningFlags(list).build();
        } catch (PublicKeyDecompressionException e) {
            WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
            return null;
        }
    }

    public static WorkflowConfiguration createWorkflowConfigurationForPinSetup(String str, DeviceFilter.BeaconType beaconType, List<String> list) throws BarcodeFormatException, PublicKeyDecompressionException {
        if (str != null) {
            BarcodeDetails createFromContent = BarcodeDetails.createFromContent(str);
            return WorkflowConfiguration.builder().withBeaconType(beaconType).withPublicKey(createFromContent.getPublicKey()).withPin(createFromContent.getPin()).withBarcodeString(str).withProvisioningFlags(list).build();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("barcode can not be null");
        return null;
    }

    public static WorkflowConfiguration createWorkflowConfigurationForTargetDevice(String str, DeviceFilter.BeaconType beaconType, List<String> list) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("deviceId can not be null");
            return null;
        }
        try {
            return WorkflowConfiguration.builder().withBeaconType(beaconType).withDeviceId(str).withProvisioningFlags(list).build();
        } catch (PublicKeyDecompressionException e) {
            WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
            return null;
        }
    }

    public static WorkflowConfiguration createWorkflowConfigurationForTargetDistressedDevice(String str, DeviceFilter.BeaconType beaconType) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("distressState can not be null");
            return null;
        }
        try {
            return WorkflowConfiguration.builder().withBeaconType(beaconType).withDistressState(str).build();
        } catch (PublicKeyDecompressionException e) {
            WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
            return null;
        }
    }

    public static WorkflowConfiguration createWorkflowConfigurationForTargetProduct(String str, DeviceFilter.BeaconType beaconType, List<String> list) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("productId can not be null");
            return null;
        }
        try {
            return WorkflowConfiguration.builder().withBeaconType(beaconType).withProductId(str).withProvisioningFlags(list).build();
        } catch (PublicKeyDecompressionException e) {
            WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
            return null;
        }
    }

    public static WorkflowConfiguration createWorkflowConfigurationForAllDevices(DeviceFilter.BeaconType beaconType) {
        try {
            return WorkflowConfiguration.builder().withBeaconType(beaconType).build();
        } catch (PublicKeyDecompressionException e) {
            WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
            return null;
        }
    }

    public static WorkflowConfiguration createWorkflowConfigurationForTargetDevice(String str, DeviceFilter.BeaconType beaconType) {
        if (str != null) {
            try {
                return WorkflowConfiguration.builder().withBeaconType(beaconType).withDeviceId(str).build();
            } catch (PublicKeyDecompressionException e) {
                WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
                return null;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("deviceId can not be null");
        return null;
    }

    public static WorkflowConfiguration createWorkflowConfigurationForTargetProduct(String str, DeviceFilter.BeaconType beaconType) {
        if (str != null) {
            try {
                return WorkflowConfiguration.builder().withBeaconType(beaconType).withProductId(str).build();
            } catch (PublicKeyDecompressionException e) {
                WJLog.e(TAG, "Barcode Public Key decompression error happened during non-barcode setup", e);
                return null;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("productId can not be null");
        return null;
    }

    public static WorkflowConfiguration createWorkflowConfigurationForTargetDevice(String str) {
        return createWorkflowConfigurationForTargetDevice(str, DeviceFilter.BeaconType.OOBE);
    }

    public static WorkflowConfiguration createWorkflowConfigurationForTargetProduct(String str) {
        return createWorkflowConfigurationForTargetProduct(str, DeviceFilter.BeaconType.OOBE);
    }

    public static WorkflowConfiguration createWorkflowConfigurationForPinSetup(String str, DeviceFilter.BeaconType beaconType) throws BarcodeFormatException, PublicKeyDecompressionException {
        if (str != null) {
            BarcodeDetails createFromContent = BarcodeDetails.createFromContent(str);
            return WorkflowConfiguration.builder().withBeaconType(beaconType).withPublicKey(createFromContent.getPublicKey()).withPin(createFromContent.getPin()).withBarcodeString(str).build();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("barcode can not be null");
        return null;
    }

    public static WorkflowConfiguration createWorkflowConfigurationForPinSetup(String str) throws BarcodeFormatException, PublicKeyDecompressionException {
        return createWorkflowConfigurationForPinSetup(str, DeviceFilter.BeaconType.OOBE);
    }
}
