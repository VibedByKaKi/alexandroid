package com.amazon.alexa.accessory.frames.ota;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.frames.personalization.PersonalizationHelper;
import com.amazon.alexa.accessory.frames.provider.AccessoryUtil;
import com.amazon.alexa.accessory.frames.routines.TapRoutinesAutoUpdateHelper;
import com.amazon.alexa.accessory.frames.routines.TapRoutinesManager;
import com.amazon.alexa.accessory.frames.wifiap.WifiApService;
import com.amazon.alexa.accessory.frames.wifiap.WifiApStateHandler;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.notificationpublisher.ConnectivityModule;
import com.amazon.alexa.accessory.protocol.Common;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class OTAHelper$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OTAHelper$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                OTAHelper.lambda$publishOobeOtaAvailableIfNeeded$8((Throwable) obj);
                break;
            case 1:
                OTAHelper.lambda$notifyTransferStateDone$31((Throwable) obj);
                break;
            case 2:
                OTAHelper.lambda$notifyAssetAvailableToDevice$10((Common.ErrorCode) obj);
                break;
            case 3:
                OTAHelper.lambda$notifyAssetAvailableToDevice$11((Throwable) obj);
                break;
            case 4:
                OTAHelper.lambda$cancelInProgressOTA$32((Common.ErrorCode) obj);
                break;
            case 5:
                OTAHelper.lambda$cancelInProgressOTA$33((Throwable) obj);
                break;
            case 6:
                OTAHelper.lambda$checkOTAUpdateAndNotifyAccessory$1((Throwable) obj);
                break;
            case 7:
                OTAHelper.lambda$notifyDeviceTransferError$24((Common.ErrorCode) obj);
                break;
            case 8:
                OTAHelper.lambda$notifyDeviceTransferError$25((Throwable) obj);
                break;
            case 9:
                PersonalizationHelper.lambda$sendProfileInfo$5((Throwable) obj);
                break;
            case 10:
                PersonalizationHelper.lambda$sendCustomerInfo$10((Common.ErrorCode) obj);
                break;
            case 11:
                PersonalizationHelper.lambda$sendCustomerInfo$11((Throwable) obj);
                break;
            case 12:
                AccessoryUtil.lambda$forwardATCommand$1((Throwable) obj);
                break;
            case 13:
                AccessoryUtil.lambda$forwardATCommand$3((Throwable) obj);
                break;
            case 14:
                TapRoutinesAutoUpdateHelper.lambda$updateBehaviorConfig$5((Throwable) obj);
                break;
            case 15:
                TapRoutinesAutoUpdateHelper.lambda$updateRoutineBehaviorConfiguration$1((Throwable) obj);
                break;
            case 16:
                TapRoutinesAutoUpdateHelper.lambda$updateRoutineBehaviorConfiguration$3((Throwable) obj);
                break;
            case 17:
                TapRoutinesManager.lambda$triggerTapRoutines$1((Throwable) obj);
                break;
            case 18:
                WifiApService.lambda$stopWifiAp$10(obj);
                break;
            case 19:
                WifiApStateHandler.lambda$handleConnect$8((Throwable) obj);
                break;
            case 20:
                WifiApStateHandler.lambda$handleStart$2((Throwable) obj);
                break;
            case 21:
                WifiApStateHandler.lambda$getStatus$14((Throwable) obj);
                break;
            case 22:
                WifiApStateHandler.lambda$handleStop$5((Throwable) obj);
                break;
            case 23:
                Logger.e("Failed to delete stale firmware download temp files", (Throwable) obj);
                break;
            case 24:
                ConnectivityModule.lambda$registerSuccessiveInputBehaviorConfigSetListener$18((Throwable) obj);
                break;
            case 25:
                ConnectivityModule.lambda$initActiveAccessories$0((List) obj);
                break;
            case 26:
                ConnectivityModule.lambda$initActiveAccessories$1((Throwable) obj);
                break;
            case 27:
                ConnectivityModule.lambda$clientConnectionObservable$19((Accessory) obj);
                break;
            case 28:
                ConnectivityModule.lambda$clientConnectionObservable$20((Throwable) obj);
                break;
            default:
                ConnectivityModule.lambda$clientConnectionObservable$21((Accessory) obj);
                break;
        }
    }
}
