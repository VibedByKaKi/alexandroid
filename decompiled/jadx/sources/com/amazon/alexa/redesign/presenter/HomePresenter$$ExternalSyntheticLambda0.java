package com.amazon.alexa.redesign.presenter;

import com.amazon.alexa.location.phase3.sensor.alexageofence.AlexaGeofenceDetector;
import com.amazon.alexa.location.phase3.sensor.motiondetection.MotionDetector;
import com.amazon.alexa.location.provider.interactor.event.LocalLocationEventInteractor;
import com.amazon.alexa.location.provider.interactor.event.LocationEventInteractor;
import com.amazon.alexa.location.provider.util.Metrics;
import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomePresenter$$ExternalSyntheticLambda0 implements Action {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HomePresenter$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                HomePresenter.onLogOut$lambda$0();
                break;
            case 1:
                AlexaGeofenceDetector.lambda$evaluateEvent$1();
                break;
            case 2:
                MotionDetector.lambda$estimateMotionEvent$1();
                break;
            case 3:
                LocalLocationEventInteractor.lambda$sendLocationToALPS$0();
                break;
            case 4:
                LocationEventInteractor.lambda$sendLocationToALPS$0();
                break;
            default:
                Metrics.recordSuccess(LocationEventInteractor.METRIC_LOCATION_REPORT_SUCCESS, true, LocationEventInteractor.SUB_COMPONENT_LOCATION_EVENT_INTERACTOR);
                break;
        }
    }
}
