package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda14 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QuerySessionRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda14(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionRequest querySessionRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = querySessionRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        ObservableSource observeVoiceStreamingEvents$lambda$170;
        SingleSource fitnessData$lambda$84;
        ObservableSource queryStartAssetTransferSession$lambda$154;
        CompletableSource initiateFirmwareTransfer$lambda$44;
        ObservableSource queryAccessProof$lambda$159;
        SingleSource requestStopVoiceStream$lambda$169;
        ObservableSource queryRegisterForMediaEvents$lambda$101;
        ObservableSource queryPolicyConfigurationRequest$lambda$162;
        ObservableSource observeStopLiveFitnessDataNotifications$lambda$96;
        ObservableSource queryAssetAvailable$lambda$152;
        ObservableSource queryTransferState$lambda$153;
        ObservableSource queryStartTranslation$lambda$138;
        SingleSource timeSinceLastSpoken$lambda$124;
        ObservableSource queryDavsI18nConfig$lambda$115;
        ObservableSource queryDeviceConfiguration$lambda$37;
        SingleSource stopWiFiConfigAp$lambda$126;
        ObservableSource queryTranslationResult$lambda$141;
        ObservableSource queryWiFiNetworkConnectionChanges$lambda$132;
        ObservableSource queryNotifyAssetTransferSession$lambda$155;
        SingleSource queryFirmwareOtaGroupName$lambda$49;
        SingleSource orCreateDeviceRegistration$lambda$62;
        SingleSource requestStartVoiceStream$lambda$168;
        ObservableSource observeFitnessDataAvailableNotifications$lambda$97;
        ObservableSource queryWakewords$lambda$76;
        SingleSource queryConnectedAccessory$lambda$4;
        ObservableSource querySecurityMaterialRequest$lambda$163;
        ObservableSource observeFitnessSessionUpdates$lambda$86;
        CompletableSource requestTransportUpgrade$lambda$67;
        ObservableSource queryActionCommandsForOutgoingNotifications$lambda$114;
        SingleSource cloudPairingAttributes$lambda$117;
        switch (this.$r8$classId) {
            case 0:
                observeVoiceStreamingEvents$lambda$170 = AccessoriesRequestHandler.observeVoiceStreamingEvents$lambda$170(this.f$0, this.f$1);
                return observeVoiceStreamingEvents$lambda$170;
            case 1:
                fitnessData$lambda$84 = AccessoriesRequestHandler.getFitnessData$lambda$84(this.f$0, this.f$1);
                return fitnessData$lambda$84;
            case 2:
                queryStartAssetTransferSession$lambda$154 = AccessoriesRequestHandler.queryStartAssetTransferSession$lambda$154(this.f$0, this.f$1);
                return queryStartAssetTransferSession$lambda$154;
            case 3:
                initiateFirmwareTransfer$lambda$44 = AccessoriesRequestHandler.initiateFirmwareTransfer$lambda$44(this.f$0, this.f$1);
                return initiateFirmwareTransfer$lambda$44;
            case 4:
                queryAccessProof$lambda$159 = AccessoriesRequestHandler.queryAccessProof$lambda$159(this.f$0, this.f$1);
                return queryAccessProof$lambda$159;
            case 5:
                requestStopVoiceStream$lambda$169 = AccessoriesRequestHandler.requestStopVoiceStream$lambda$169(this.f$0, this.f$1);
                return requestStopVoiceStream$lambda$169;
            case 6:
                queryRegisterForMediaEvents$lambda$101 = AccessoriesRequestHandler.queryRegisterForMediaEvents$lambda$101(this.f$0, this.f$1);
                return queryRegisterForMediaEvents$lambda$101;
            case 7:
                queryPolicyConfigurationRequest$lambda$162 = AccessoriesRequestHandler.queryPolicyConfigurationRequest$lambda$162(this.f$0, this.f$1);
                return queryPolicyConfigurationRequest$lambda$162;
            case 8:
                observeStopLiveFitnessDataNotifications$lambda$96 = AccessoriesRequestHandler.observeStopLiveFitnessDataNotifications$lambda$96(this.f$0, this.f$1);
                return observeStopLiveFitnessDataNotifications$lambda$96;
            case 9:
                queryAssetAvailable$lambda$152 = AccessoriesRequestHandler.queryAssetAvailable$lambda$152(this.f$0, this.f$1);
                return queryAssetAvailable$lambda$152;
            case 10:
                queryTransferState$lambda$153 = AccessoriesRequestHandler.queryTransferState$lambda$153(this.f$0, this.f$1);
                return queryTransferState$lambda$153;
            case 11:
                queryStartTranslation$lambda$138 = AccessoriesRequestHandler.queryStartTranslation$lambda$138(this.f$0, this.f$1);
                return queryStartTranslation$lambda$138;
            case 12:
                timeSinceLastSpoken$lambda$124 = AccessoriesRequestHandler.getTimeSinceLastSpoken$lambda$124(this.f$0, this.f$1);
                return timeSinceLastSpoken$lambda$124;
            case 13:
                queryDavsI18nConfig$lambda$115 = AccessoriesRequestHandler.queryDavsI18nConfig$lambda$115(this.f$0, this.f$1);
                return queryDavsI18nConfig$lambda$115;
            case 14:
                queryDeviceConfiguration$lambda$37 = AccessoriesRequestHandler.queryDeviceConfiguration$lambda$37(this.f$0, this.f$1);
                return queryDeviceConfiguration$lambda$37;
            case 15:
                stopWiFiConfigAp$lambda$126 = AccessoriesRequestHandler.stopWiFiConfigAp$lambda$126(this.f$0, this.f$1);
                return stopWiFiConfigAp$lambda$126;
            case 16:
                queryTranslationResult$lambda$141 = AccessoriesRequestHandler.queryTranslationResult$lambda$141(this.f$0, this.f$1);
                return queryTranslationResult$lambda$141;
            case 17:
                queryWiFiNetworkConnectionChanges$lambda$132 = AccessoriesRequestHandler.queryWiFiNetworkConnectionChanges$lambda$132(this.f$0, this.f$1);
                return queryWiFiNetworkConnectionChanges$lambda$132;
            case 18:
                queryNotifyAssetTransferSession$lambda$155 = AccessoriesRequestHandler.queryNotifyAssetTransferSession$lambda$155(this.f$0, this.f$1);
                return queryNotifyAssetTransferSession$lambda$155;
            case 19:
                queryFirmwareOtaGroupName$lambda$49 = AccessoriesRequestHandler.queryFirmwareOtaGroupName$lambda$49(this.f$0, this.f$1);
                return queryFirmwareOtaGroupName$lambda$49;
            case 20:
                orCreateDeviceRegistration$lambda$62 = AccessoriesRequestHandler.getOrCreateDeviceRegistration$lambda$62(this.f$0, this.f$1);
                return orCreateDeviceRegistration$lambda$62;
            case 21:
                requestStartVoiceStream$lambda$168 = AccessoriesRequestHandler.requestStartVoiceStream$lambda$168(this.f$0, this.f$1);
                return requestStartVoiceStream$lambda$168;
            case 22:
                observeFitnessDataAvailableNotifications$lambda$97 = AccessoriesRequestHandler.observeFitnessDataAvailableNotifications$lambda$97(this.f$0, this.f$1);
                return observeFitnessDataAvailableNotifications$lambda$97;
            case 23:
                queryWakewords$lambda$76 = AccessoriesRequestHandler.queryWakewords$lambda$76(this.f$0, this.f$1);
                return queryWakewords$lambda$76;
            case 24:
                queryConnectedAccessory$lambda$4 = AccessoriesRequestHandler.queryConnectedAccessory$lambda$4(this.f$0, this.f$1);
                return queryConnectedAccessory$lambda$4;
            case 25:
                querySecurityMaterialRequest$lambda$163 = AccessoriesRequestHandler.querySecurityMaterialRequest$lambda$163(this.f$0, this.f$1);
                return querySecurityMaterialRequest$lambda$163;
            case 26:
                observeFitnessSessionUpdates$lambda$86 = AccessoriesRequestHandler.observeFitnessSessionUpdates$lambda$86(this.f$0, this.f$1);
                return observeFitnessSessionUpdates$lambda$86;
            case 27:
                requestTransportUpgrade$lambda$67 = AccessoriesRequestHandler.requestTransportUpgrade$lambda$67(this.f$0, this.f$1);
                return requestTransportUpgrade$lambda$67;
            case 28:
                queryActionCommandsForOutgoingNotifications$lambda$114 = AccessoriesRequestHandler.queryActionCommandsForOutgoingNotifications$lambda$114(this.f$0, this.f$1);
                return queryActionCommandsForOutgoingNotifications$lambda$114;
            default:
                cloudPairingAttributes$lambda$117 = AccessoriesRequestHandler.getCloudPairingAttributes$lambda$117(this.f$0, this.f$1);
                return cloudPairingAttributes$lambda$117;
        }
    }
}
