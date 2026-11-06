package com.amazon.alexa.accessory.speech;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.notificationpublisher.ConnectivityModule;
import com.amazon.alexa.accessory.notificationpublisher.artifactmanager.VipFilterArtifactManager;
import com.amazon.alexa.accessory.notificationpublisher.notificationlistener.StatusBarNotificationParser;
import com.amazon.alexa.accessory.notificationpublisher.reply.ReplyServiceHelper;
import com.amazon.alexa.accessory.persistence.FileBackedJsonRxMapStore;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.registration.DeviceRegistration;
import com.amazon.alexa.accessory.registration.FileSystemRegistrationSupplier;
import com.amazon.alexa.accessory.registration.deviceaccount.DeviceAccount;
import com.amazon.alexa.accessory.registration.deviceaccount.FileSystemDeviceAccountSupplier;
import com.amazon.alexa.accessory.repositories.display.MemoryDisplayContentRepository;
import com.amazon.alexa.accessory.speech.display.DisplayCaptionListener;
import com.amazon.alexa.accessory.speech.display.DisplayCardListener;
import com.amazon.alexa.accessory.speech.events.activitydetection.ActivityDetectionAccessoryManager;
import com.amazon.alexa.accessory.speech.events.statechange.StateChangeAccessoryManager;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryUserSpeechProvider$$ExternalSyntheticLambda5 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryUserSpeechProvider$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AccessoryUserSpeechProvider.lambda$checkDeviceFeaturesAndRegisterAudioPlaybackStatusListener$10((Throwable) obj);
                break;
            case 1:
                ConnectivityModule.lambda$clientConnectionObservable$22((Throwable) obj);
                break;
            case 2:
                ConnectivityModule.lambda$queryVipFilterConfig$7((Throwable) obj);
                break;
            case 3:
                ConnectivityModule.lambda$updateDeviceConnectivity$3((Throwable) obj);
                break;
            case 4:
                ConnectivityModule.lambda$getConnectedAccessoryInfo$11((Throwable) obj);
                break;
            case 5:
                VipFilterArtifactManager.lambda$checkForUpdatesForDownloadedAssets$8((Boolean) obj);
                break;
            case 6:
                VipFilterArtifactManager.lambda$checkForUpdatesForDownloadedAssets$9((Throwable) obj);
                break;
            case 7:
                VipFilterArtifactManager.lambda$checkIfTemplatesNeedDownload$11((Boolean) obj);
                break;
            case 8:
                VipFilterArtifactManager.lambda$checkIfTemplatesNeedDownload$12((Throwable) obj);
                break;
            case 9:
                StatusBarNotificationParser.lambda$new$2((Throwable) obj);
                break;
            case 10:
                ReplyServiceHelper.lambda$init$1((Set) obj);
                break;
            case 11:
                ReplyServiceHelper.lambda$init$2((Throwable) obj);
                break;
            case 12:
                FileBackedJsonRxMapStore.lambda$cleanCache$6((Throwable) obj);
                break;
            case 13:
                FileBackedJsonRxMapStore.lambda$cleanCache$8((Throwable) obj);
                break;
            case 14:
                FileSystemRegistrationSupplier.lambda$registerCloudAsync$21((DeviceRegistration) obj);
                break;
            case 15:
                Logger.e("Failed async registration", (Throwable) obj);
                break;
            case 16:
                FileSystemDeviceAccountSupplier.lambda$getDeviceAccountAndPersist$13((DeviceAccount) obj);
                break;
            case 17:
                FileSystemDeviceAccountSupplier.lambda$getDeviceAccountAndPersist$14((Throwable) obj);
                break;
            case 18:
                MemoryDisplayContentRepository.lambda$setDisplayContentByChunks$0((Common.ErrorCode) obj);
                break;
            case 19:
                AccessoryAudioPlaybackStatusListener.lambda$notifyAudioPlaybackStatus$3((Throwable) obj);
                break;
            case 20:
                LocalCommandCoordinationObserver.lambda$sendNotifyReserveResponseResult$8((Throwable) obj);
                break;
            case 21:
                LocalCommandCoordinationObserver.lambda$observeNotifyResponseStartStatus$6((Throwable) obj);
                break;
            case 22:
                LocalCommandCoordinationObserver.lambda$sendReserveResponse$2((String) obj);
                break;
            case 23:
                LocalCommandCoordinationObserver.lambda$sendReserveResponse$3((Throwable) obj);
                break;
            case 24:
                LocalCommandCoordinationObserver.lambda$observeNotifyReserveResponse$5((Throwable) obj);
                break;
            case 25:
                DisplayCaptionListener.lambda$onReceivedCaption$1((Throwable) obj);
                break;
            case 26:
                DisplayCardListener.lambda$onReceivedRenderCard$1((Throwable) obj);
                break;
            case 27:
                ActivityDetectionAccessoryManager.lambda$monitorForSession$5((Throwable) obj);
                break;
            case 28:
                ActivityDetectionAccessoryManager.lambda$subscribeAndObserve$11((Throwable) obj);
                break;
            default:
                StateChangeAccessoryManager.lambda$monitorEventsForSession$4((Throwable) obj);
                break;
        }
    }
}
