package com.amazon.alexa.location;

import android.util.Log;
import com.amazon.alexa.location.phase3.Phase3LocationService;
import com.amazon.alexa.location.phase3.sensor.motiondetection.MotionDetector;
import com.amazon.alexa.location.provider.interactor.event.LocationEventInteractor;
import com.amazon.alexa.seamlessswitching.capability.bluetooth.DefaultIOComponentsBluetoothManager;
import com.amazon.alexa.voice.hva.DeepEngagementHighValueActionDetector;
import com.amazon.dee.app.elements.ElementsRoutingAdapter;
import com.amazon.deecomms.accessories.AccessoryUtilities;
import com.amazon.deecomms.accessories.CommsAccessorySessionListener;
import com.amazon.mobile.heremapsexplore.Constants.Constants;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultLocationService$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultLocationService$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Log.e(DefaultLocationService.TAG, "getLocationSettings() failed", (Throwable) obj);
                break;
            case 1:
                DefaultLocationService.lambda$onActivityResume$40((List) obj);
                break;
            case 2:
                Log.e(DefaultLocationService.TAG, "[ERROR] Fail to sync geofences onResume", (Throwable) obj);
                break;
            case 3:
                Objects.toString((Throwable) obj);
                break;
            case 4:
                Phase3LocationService.lambda$startPhase3$1((Throwable) obj);
                break;
            case 5:
                Log.e(MotionDetector.TAG, "Failed to store", (Throwable) obj);
                break;
            case 6:
                LocationEventInteractor.lambda$sendLocationToALPS$2((Throwable) obj);
                break;
            case 7:
                DefaultIOComponentsBluetoothManager.lambda$initialize$2((Throwable) obj);
                break;
            case 8:
                DefaultIOComponentsBluetoothManager.lambda$initialize$3((Throwable) obj);
                break;
            case 9:
                DefaultIOComponentsBluetoothManager.lambda$onSessionConnected$11((Throwable) obj);
                break;
            case 10:
                DefaultIOComponentsBluetoothManager.lambda$initialize$1((Throwable) obj);
                break;
            case 11:
                Log.e(DeepEngagementHighValueActionDetector.LOG_TAG, "Unable to observe Alexa processing state.", (Throwable) obj);
                break;
            case 12:
                ElementsRoutingAdapter.lambda$new$2((Throwable) obj);
                break;
            case 13:
                AccessoryUtilities.lambda$forwardAtCommands$3((Throwable) obj);
                break;
            case 14:
                AccessoryUtilities.lambda$forwardATCommand$1((Throwable) obj);
                break;
            case 15:
                CommsAccessorySessionListener.lambda$resetAccessoryConnectionInformation$9((Throwable) obj);
                break;
            case 16:
                CommsAccessorySessionListener.lambda$activate$1((Throwable) obj);
                break;
            case 17:
                CommsAccessorySessionListener.lambda$activate$3((Throwable) obj);
                break;
            case 18:
                CommsAccessorySessionListener.lambda$activate$5((Throwable) obj);
                break;
            case 19:
                CommsAccessorySessionListener.lambda$fetchAndStoreDeviceMasterId$17((Throwable) obj);
                break;
            case 20:
                Log.e(Constants.LOG_TAG, "Failed to set initial user location");
                break;
            case 21:
                Log.e(Constants.LOG_TAG, "Failed to get most recent user location");
                break;
            default:
                Log.e(Constants.LOG_TAG, "Failed to get most recent recent user location for update, using previous values instead");
                break;
        }
    }
}
