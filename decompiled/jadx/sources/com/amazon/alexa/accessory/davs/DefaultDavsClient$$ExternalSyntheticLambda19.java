package com.amazon.alexa.accessory.davs;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.amazon.alexa.accessory.davs.i18n.I18nConfigSupplier;
import com.amazon.alexa.accessory.frames.media.MediaImportResumer;
import com.amazon.alexa.accessory.frames.translation.TranslationManager;
import com.amazon.alexa.accessory.frames.wifiap.WifiApService;
import com.amazon.alexa.accessory.internal.ActionQueue;
import com.amazon.alexa.accessory.kota.FileSystemFirmwareSupplier;
import com.amazon.alexa.accessory.notificationpublisher.conversation.audio.capturing.AccessoryVoiceStreamBinding;
import com.amazon.alexa.accessorykit.factoryreset.FactoryResetModule;
import com.amazon.alexa.audiopersonalization.api.CompletableDelegate;
import com.amazon.alexa.location.networking.gateway.AlexaLocationPlatformServiceNetworkGateway;
import com.amazon.alexa.location.phase3.LocationDataStore;
import com.amazon.alexa.location.phase3.sensor.alexageofence.AlexaGeofenceDetector;
import com.amazon.alexa.location.provider.interactor.event.LocalLocationEventInteractor;
import com.amazon.alexa.redesign.viewmodels.AgentForwardHomeViewModel;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultDavsClient$$ExternalSyntheticLambda19 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultDavsClient$$ExternalSyntheticLambda19(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((I18nConfigSupplier.StreamableI18nConfig) obj).cancel();
                break;
            case 1:
                MediaImportResumer.resumeAsync$lambda$0((Context) obj);
                break;
            case 2:
                ((MediaImportResumer) obj).finishResumePass();
                break;
            case 3:
                ((Runnable) obj).run();
                break;
            case 4:
                TranslationManager.stopVoiceStream$lambda$48((TranslationManager) obj);
                break;
            case 5:
                ((WifiApService) obj).lambda$startWifiApInternal$4();
                break;
            case 6:
                ((ActionQueue.Action.Callback) obj).onFinished();
                break;
            case 7:
                ((FileSystemFirmwareSupplier) obj).lambda$deleteStalePartFiles$1();
                break;
            case 8:
                ((AccessoryVoiceStreamBinding) obj).onSourceCompleted();
                break;
            case 9:
                ((BehaviorSubject) obj).onComplete();
                break;
            case 10:
                ((FactoryResetModule) obj).lambda$initiateFactoryResetAndCleanup$10();
                break;
            case 11:
                ((BroadcastReceiver.PendingResult) obj).finish();
                break;
            case 12:
                ((CompletableDelegate) obj).onComplete();
                break;
            case 13:
                ((AlexaLocationPlatformServiceNetworkGateway) obj).lambda$reportLocationRxSingle$2();
                break;
            case 14:
                ((LocationDataStore) obj).removeAll();
                break;
            case 15:
                ((AlexaGeofenceDetector) obj).saveStates();
                break;
            case 16:
                ((LocalLocationEventInteractor) obj).lambda$sendLocationToALPS$1();
                break;
            default:
                AgentForwardHomeViewModel.refreshData$lambda$1((Function0) obj);
                break;
        }
    }
}
