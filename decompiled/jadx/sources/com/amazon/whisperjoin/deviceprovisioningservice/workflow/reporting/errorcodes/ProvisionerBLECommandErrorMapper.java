package com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes;

import com.amazon.whisperbridge.constants.Command;
import com.amazon.whisperjoin.common.sharedtypes.error.WJError;
import com.amazon.whisperjoin.common.sharedtypes.error.WJErrorFactory;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.BLETransportOperationError;
import com.amazon.whisperjoin.common.sharedtypes.exceptions.UnsuccessfulProvisioningCommandError;
import com.amazon.whisperjoin.provisionerSDK.radios.error.ProvisionerCommandError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ProvisionerBLECommandErrorMapper implements WJErrorMapper<ProvisionerCommandError> {
    private final BLETransportOperationErrorDetailsProvider mBLETransportOperationErrorDetailsProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.ProvisionerBLECommandErrorMapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperbridge$constants$Command;

        static {
            int[] iArr = new int[Command.values().length];
            $SwitchMap$com$amazon$whisperbridge$constants$Command = iArr;
            try {
                iArr[Command.EXCHANGE_ECDHE_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.EXCHANGE_AUTHENTICATED_ECDHE_KEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.JPAKE_ROUND1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.JPAKE_ROUND2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.JPAKE_ROUND3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.JPAKE_CERT_VALIDATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.GET_VISIBLE_NETWORKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.GET_DEVICE_DETAILS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.SAVE_NETWORK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.GET_CONNECTION_STATUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.SET_CONFIGURATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.SET_REGISTRATION_CONFIGURATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.GET_REGISTRATION_INFORMATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.COMPLETE_PROVISIONING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$amazon$whisperbridge$constants$Command[Command.GET_SUPPORTED_NOTIFICATIONS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public ProvisionerBLECommandErrorMapper(BLETransportOperationErrorDetailsProvider bLETransportOperationErrorDetailsProvider) {
        this.mBLETransportOperationErrorDetailsProvider = bLETransportOperationErrorDetailsProvider;
    }

    private int getCommandErrorDetails(Throwable th) {
        return th instanceof BLETransportOperationError ? this.mBLETransportOperationErrorDetailsProvider.getDetails((BLETransportOperationError) th) : th instanceof UnsuccessfulProvisioningCommandError ? getProvisioningCommandErrorDetails((UnsuccessfulProvisioningCommandError) th) : CommonErrorDetailsProvider.getCommonErrorDetails(th);
    }

    private int getProvisioningCommandErrorDetails(UnsuccessfulProvisioningCommandError unsuccessfulProvisioningCommandError) {
        return unsuccessfulProvisioningCommandError.getStatusCode() + 300000;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.reporting.errorcodes.WJErrorMapper
    public WJError map(ProvisionerCommandError provisionerCommandError) {
        int commandErrorDetails = getCommandErrorDetails(provisionerCommandError.getFailureCause());
        switch (AnonymousClass1.$SwitchMap$com$amazon$whisperbridge$constants$Command[provisionerCommandError.getCommand().ordinal()]) {
            case 1:
                return WJErrorFactory.BLECommand.exchangeEcdheKey(commandErrorDetails);
            case 2:
                return WJErrorFactory.BLECommand.exchangeAuthEcdheKey(commandErrorDetails);
            case 3:
                return WJErrorFactory.BLECommand.jpakeRound1(commandErrorDetails);
            case 4:
                return WJErrorFactory.BLECommand.jpakeRound2(commandErrorDetails);
            case 5:
                return WJErrorFactory.BLECommand.jpakeRound3(commandErrorDetails);
            case 6:
                return WJErrorFactory.BLECommand.jpakeRoundCertValidation(commandErrorDetails);
            case 7:
                return WJErrorFactory.BLECommand.getVisibleNetworks(commandErrorDetails);
            case 8:
                return WJErrorFactory.BLECommand.getDeviceDetails(commandErrorDetails);
            case 9:
                return WJErrorFactory.BLECommand.saveNetwork(commandErrorDetails);
            case 10:
                return WJErrorFactory.BLECommand.getConnectionStatus(commandErrorDetails);
            case 11:
                return WJErrorFactory.BLECommand.setConfiguration(commandErrorDetails);
            case 12:
                return WJErrorFactory.BLECommand.setRegistrationToken(commandErrorDetails);
            case 13:
                return WJErrorFactory.BLECommand.getRegistrationStatus(commandErrorDetails);
            case 14:
                return WJErrorFactory.BLECommand.completeProvisioning(commandErrorDetails);
            case 15:
                return WJErrorFactory.BLECommand.getSupportedNotifications(commandErrorDetails);
            default:
                return WJErrorFactory.BLECommand.unknown(0);
        }
    }
}
