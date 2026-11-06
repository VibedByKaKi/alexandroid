package com.amazon.alexa.location.phase3;

import com.amazon.alexa.accessory.avsclient.locale.UnmatchedLocaleNotifier;
import com.amazon.alexa.accessory.capabilities.vision.VisionCaptureCapability;
import com.amazon.alexa.accessory.frames.accessproof.AccessProofManager;
import com.amazon.alexa.accessory.frames.media.MediaImportResumer;
import com.amazon.alexa.accessory.frames.media.MediaImportService;
import com.amazon.alexa.accessory.frames.media.autoimport.BatteryMonitor;
import com.amazon.alexa.accessory.frames.media.autoimport.DeviceThermalProvider;
import com.amazon.alexa.accessory.frames.ota.OTAHelper;
import com.amazon.alexa.accessory.frames.personalization.PersonalizationHelper;
import com.amazon.alexa.accessory.frames.routines.TapRoutinesAutoUpdateHelper;
import com.amazon.alexa.accessory.frames.translation.TranslationManager;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.ConversationVoiceStreamControl;
import com.amazon.alexa.accessory.persistence.FileBackedJsonRxMapStore;
import com.amazon.alexa.accessory.speech.LocalCommandCoordinationObserver;
import com.amazon.alexa.accessory.speech.display.DisplayCaptionListener;
import com.amazon.alexa.accessory.speech.display.DisplayCardListener;
import com.amazon.alexa.dnssd.subscribers.StartDiscoverySubscriber;
import com.amazon.alexa.location.DefaultLocationService;
import com.amazon.alexa.location.GeofenceEventHandler;
import com.amazon.alexa.location.phase3.sensor.alexageofence.AlexaGeofenceDetector;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DwellTracker$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DwellTracker$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DwellTracker.lambda$updateDwellSession$0();
                break;
            case 1:
                Logger.d("Successfully uploaded accessory diagnostics");
                break;
            case 2:
                UnmatchedLocaleNotifier.lambda$onUserChanged$17();
                break;
            case 3:
                Logger.d("Near miss uploaded successfully!");
                break;
            case 4:
                VisionCaptureCapability.lambda$requestAndProvideVisionConfigurations$7();
                break;
            case 5:
                AccessProofManager.lambda$refreshRevocationsInBackground$13();
                break;
            case 6:
                Log.i(MediaImportResumer.TAG, "resumeAsync - resume pass complete");
                break;
            case 7:
                MediaImportService.lambda$subscribeNanTransferState$12();
                break;
            case 8:
                MediaImportService.lambda$observeTransferState$22();
                break;
            case 9:
                Log.w(BatteryMonitor.TAG, "Battery status subscription DISPOSED");
                break;
            case 10:
                Log.w(DeviceThermalProvider.TAG, "Device thermal state was empty; thermal constraint will fail open");
                break;
            case 11:
                OTAHelper.lambda$initiateFirmwareTransferForAnsel$21();
                break;
            case 12:
                OTAHelper.lambda$publishOobeOtaAvailableIfNeeded$7();
                break;
            case 13:
                PersonalizationHelper.lambda$sendProfileInfo$4();
                break;
            case 14:
                PersonalizationHelper.lambda$sendCustomerInfo$8();
                break;
            case 15:
                PersonalizationHelper.lambda$sendProfileInfo$2();
                break;
            case 16:
                TapRoutinesAutoUpdateHelper.lambda$updateBehaviorConfig$4();
                break;
            case 17:
                TranslationManager.adoptOrReleaseGrant$lambda$43();
                break;
            case 18:
                TranslationManager.releaseVoiceStreamLease$lambda$46();
                break;
            case 19:
                ConversationVoiceStreamControl.releaseQuietly$lambda$13();
                break;
            case 20:
                FileBackedJsonRxMapStore.lambda$cleanCache$5();
                break;
            case 21:
                LocalCommandCoordinationObserver.lambda$sendNotifyReserveResponseResult$7();
                break;
            case 22:
                DisplayCaptionListener.lambda$onReceivedCaption$0();
                break;
            case 23:
                DisplayCardListener.lambda$onReceivedRenderCard$0();
                break;
            case 24:
                StartDiscoverySubscriber.lambda$onMessageReceived$2();
                break;
            case 25:
                DefaultLocationService.lambda$observeFeatureAvailability$32();
                break;
            case 26:
                GeofenceEventHandler.lambda$reportGeoFenceStatusToALS$7();
                break;
            case 27:
                DwellTracker.lambda$updateDwellSession$2();
                break;
            case 28:
                DwellTracker.lambda$resetCurrentDwellSession$4();
                break;
            default:
                AlexaGeofenceDetector.lambda$updateStates$5();
                break;
        }
    }
}
