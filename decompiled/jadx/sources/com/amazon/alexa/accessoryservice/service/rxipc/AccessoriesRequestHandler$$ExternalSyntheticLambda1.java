package com.amazon.alexa.accessoryservice.service.rxipc;

import com.amazon.alexa.accessoryclient.common.query.request.QuerySessionRequest;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoriesRequestHandler$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoriesRequestHandler f$0;
    public final /* synthetic */ QuerySessionRequest f$1;

    public /* synthetic */ AccessoriesRequestHandler$$ExternalSyntheticLambda1(AccessoriesRequestHandler accessoriesRequestHandler, QuerySessionRequest querySessionRequest, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoriesRequestHandler;
        this.f$1 = querySessionRequest;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource allCameraConfigurations$lambda$148;
        ObservableSource queryDeviceInformationSet$lambda$39;
        CompletableSource removeCompanionDevice$lambda$68;
        SingleSource savedWiFiNetworks$lambda$130;
        ObservableSource queryMediaControl$lambda$99;
        SingleSource issueRemoteReset$lambda$166;
        SingleSource queryConnectionStatus$lambda$3;
        SingleSource queryFirmwareInformationSet$lambda$42;
        ObservableSource queryCblLoginState$lambda$106;
        ObservableSource observeFirmwareZipFilePaths$lambda$46;
        ObservableSource queryResumeTranslation$lambda$140;
        ObservableSource queryMobileBridgeStatus$lambda$110;
        ObservableSource queryStopTranslation$lambda$137;
        CompletableSource releaseSession$lambda$5;
        ObservableSource queryUsers$lambda$69;
        ObservableSource queryPauseTranslation$lambda$139;
        SingleSource shouldUpgradeTransport$lambda$66;
        SingleSource queryDeviceFeatures$lambda$41;
        SingleSource requestStartSetup$lambda$40;
        ObservableSource queryFirmwareUpdateStatus$lambda$43;
        ObservableSource queryIsAwaitingDerivedKeys$lambda$80;
        ObservableSource observeDownloadProgress$lambda$45;
        SingleSource requestCblInformation$lambda$107;
        SingleSource allCameraSetting$lambda$150;
        SingleSource wiFiConfigApDetails$lambda$127;
        ObservableSource queryLocales$lambda$74;
        ObservableSource observeLiveFitnessDataNotifications$lambda$95;
        switch (this.$r8$classId) {
            case 0:
                allCameraConfigurations$lambda$148 = AccessoriesRequestHandler.getAllCameraConfigurations$lambda$148(this.f$0, this.f$1);
                return allCameraConfigurations$lambda$148;
            case 1:
                queryDeviceInformationSet$lambda$39 = AccessoriesRequestHandler.queryDeviceInformationSet$lambda$39(this.f$0, this.f$1);
                return queryDeviceInformationSet$lambda$39;
            case 2:
                removeCompanionDevice$lambda$68 = AccessoriesRequestHandler.removeCompanionDevice$lambda$68(this.f$0, this.f$1);
                return removeCompanionDevice$lambda$68;
            case 3:
                savedWiFiNetworks$lambda$130 = AccessoriesRequestHandler.getSavedWiFiNetworks$lambda$130(this.f$0, this.f$1);
                return savedWiFiNetworks$lambda$130;
            case 4:
                queryMediaControl$lambda$99 = AccessoriesRequestHandler.queryMediaControl$lambda$99(this.f$0, this.f$1);
                return queryMediaControl$lambda$99;
            case 5:
                issueRemoteReset$lambda$166 = AccessoriesRequestHandler.issueRemoteReset$lambda$166(this.f$0, this.f$1);
                return issueRemoteReset$lambda$166;
            case 6:
                queryConnectionStatus$lambda$3 = AccessoriesRequestHandler.queryConnectionStatus$lambda$3(this.f$0, this.f$1);
                return queryConnectionStatus$lambda$3;
            case 7:
                queryFirmwareInformationSet$lambda$42 = AccessoriesRequestHandler.queryFirmwareInformationSet$lambda$42(this.f$0, this.f$1);
                return queryFirmwareInformationSet$lambda$42;
            case 8:
                queryCblLoginState$lambda$106 = AccessoriesRequestHandler.queryCblLoginState$lambda$106(this.f$0, this.f$1);
                return queryCblLoginState$lambda$106;
            case 9:
                observeFirmwareZipFilePaths$lambda$46 = AccessoriesRequestHandler.observeFirmwareZipFilePaths$lambda$46(this.f$0, this.f$1);
                return observeFirmwareZipFilePaths$lambda$46;
            case 10:
                queryResumeTranslation$lambda$140 = AccessoriesRequestHandler.queryResumeTranslation$lambda$140(this.f$0, this.f$1);
                return queryResumeTranslation$lambda$140;
            case 11:
                queryMobileBridgeStatus$lambda$110 = AccessoriesRequestHandler.queryMobileBridgeStatus$lambda$110(this.f$0, this.f$1);
                return queryMobileBridgeStatus$lambda$110;
            case 12:
                queryStopTranslation$lambda$137 = AccessoriesRequestHandler.queryStopTranslation$lambda$137(this.f$0, this.f$1);
                return queryStopTranslation$lambda$137;
            case 13:
                releaseSession$lambda$5 = AccessoriesRequestHandler.releaseSession$lambda$5(this.f$0, this.f$1);
                return releaseSession$lambda$5;
            case 14:
                queryUsers$lambda$69 = AccessoriesRequestHandler.queryUsers$lambda$69(this.f$0, this.f$1);
                return queryUsers$lambda$69;
            case 15:
                queryPauseTranslation$lambda$139 = AccessoriesRequestHandler.queryPauseTranslation$lambda$139(this.f$0, this.f$1);
                return queryPauseTranslation$lambda$139;
            case 16:
                shouldUpgradeTransport$lambda$66 = AccessoriesRequestHandler.shouldUpgradeTransport$lambda$66(this.f$0, this.f$1);
                return shouldUpgradeTransport$lambda$66;
            case 17:
                queryDeviceFeatures$lambda$41 = AccessoriesRequestHandler.queryDeviceFeatures$lambda$41(this.f$0, this.f$1);
                return queryDeviceFeatures$lambda$41;
            case 18:
                requestStartSetup$lambda$40 = AccessoriesRequestHandler.requestStartSetup$lambda$40(this.f$0, this.f$1);
                return requestStartSetup$lambda$40;
            case 19:
                queryFirmwareUpdateStatus$lambda$43 = AccessoriesRequestHandler.queryFirmwareUpdateStatus$lambda$43(this.f$0, this.f$1);
                return queryFirmwareUpdateStatus$lambda$43;
            case 20:
                queryIsAwaitingDerivedKeys$lambda$80 = AccessoriesRequestHandler.queryIsAwaitingDerivedKeys$lambda$80(this.f$0, this.f$1);
                return queryIsAwaitingDerivedKeys$lambda$80;
            case 21:
                observeDownloadProgress$lambda$45 = AccessoriesRequestHandler.observeDownloadProgress$lambda$45(this.f$0, this.f$1);
                return observeDownloadProgress$lambda$45;
            case 22:
                requestCblInformation$lambda$107 = AccessoriesRequestHandler.requestCblInformation$lambda$107(this.f$0, this.f$1);
                return requestCblInformation$lambda$107;
            case 23:
                allCameraSetting$lambda$150 = AccessoriesRequestHandler.getAllCameraSetting$lambda$150(this.f$0, this.f$1);
                return allCameraSetting$lambda$150;
            case 24:
                wiFiConfigApDetails$lambda$127 = AccessoriesRequestHandler.getWiFiConfigApDetails$lambda$127(this.f$0, this.f$1);
                return wiFiConfigApDetails$lambda$127;
            case 25:
                queryLocales$lambda$74 = AccessoriesRequestHandler.queryLocales$lambda$74(this.f$0, this.f$1);
                return queryLocales$lambda$74;
            default:
                observeLiveFitnessDataNotifications$lambda$95 = AccessoriesRequestHandler.observeLiveFitnessDataNotifications$lambda$95(this.f$0, this.f$1);
                return observeLiveFitnessDataNotifications$lambda$95;
        }
    }
}
