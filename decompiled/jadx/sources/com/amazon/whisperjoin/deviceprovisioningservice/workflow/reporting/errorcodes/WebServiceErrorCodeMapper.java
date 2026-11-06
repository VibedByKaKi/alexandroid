package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.amazon.whisperjoin.common.sharedtypes.error.WJErrorFactory;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.DSSOperation;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.error.DSSClientError;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.error.DSSServiceError;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.error.GetAccessTokenError;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.error.NoCustomerAccountFoundError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WebServiceErrorCodeMapper implements WJErrorMapper<DSSClientError> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WebServiceErrorCodeMapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation;

        static {
            int[] iArr = new int[DSSOperation.values().length];
            $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation = iArr;
            try {
                iArr[DSSOperation.DISCOVERED_PROVISIONABLE_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.DISCOVERED_PROVISIONEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.START_ECDHE_AUTHENTICATION_SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.FINALIZE_ECDHE_AUTHENTICATION_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.COMPUTE_CONFIGURATION_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.REPORT_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.GET_FFS_ALLOWLIST_POLICY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.GET_DEVICE_REGISTRATION_STATUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.GET_CUSTOMER_PROVISIONEES_SETUP_STATUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[DSSOperation.VALIDATE_WIFI_SYNC_AUTH_TOKEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private int getErrorDetails(Throwable th) {
        int i;
        int errorCode;
        if (th instanceof DSSServiceError) {
            i = 100000;
            errorCode = ((DSSServiceError) th).getErrorCode();
        } else {
            if (!(th instanceof GetAccessTokenError)) {
                if (th instanceof NoCustomerAccountFoundError) {
                    return 300000;
                }
                return CommonErrorDetailsProvider.getCommonErrorDetails(th);
            }
            i = WebServiceErrorDetails.GET_ACCESS_TOKEN_ERROR_OFFSET;
            errorCode = ((GetAccessTokenError) th).getErrorCode();
        }
        return errorCode + i;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WJErrorMapper
    public WJError map(DSSClientError dSSClientError) {
        DSSOperation operation = dSSClientError.getOperation();
        int errorDetails = getErrorDetails(dSSClientError.getFailureCause());
        switch (AnonymousClass1.$SwitchMap$com$amazon$whisperjoin$devicesetupserviceandroidclient$DSSOperation[operation.ordinal()]) {
            case 1:
                return WJErrorFactory.WebService.discoveredProvisionableDevice(errorDetails);
            case 2:
                return WJErrorFactory.WebService.discoveredProvisioneeDevice(errorDetails);
            case 3:
                return WJErrorFactory.WebService.startEcdheAuthenticationSession(errorDetails);
            case 4:
                return WJErrorFactory.WebService.finalizeEcdheAuthenticationSession(errorDetails);
            case 5:
                return WJErrorFactory.WebService.computeConfigurationData(errorDetails);
            case 6:
                return WJErrorFactory.WebService.reportEvent(errorDetails);
            case 7:
                return WJErrorFactory.WebService.getAllowListPolicy(errorDetails);
            case 8:
                return WJErrorFactory.WebService.getDeviceRegistrationStatus(errorDetails);
            case 9:
                return WJErrorFactory.WebService.getCustomerProvisioneesSetupStatus(errorDetails);
            case 10:
                return WJErrorFactory.WebService.validateWifiSyncAuthToken(errorDetails);
            default:
                return WJErrorFactory.WebService.unknown(errorDetails);
        }
    }
}
