package com.amazon.alexa.location.phase3.sensor.alexageofence;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class AlexaGeofenceDetector$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaGeofenceDetector f$0;

    public /* synthetic */ AlexaGeofenceDetector$$ExternalSyntheticLambda3(AlexaGeofenceDetector alexaGeofenceDetector, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaGeofenceDetector;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AlexaGeofenceDetector alexaGeofenceDetector = this.f$0;
        switch (i) {
            case 0:
                alexaGeofenceDetector.lambda$updateStates$6((Throwable) obj);
                break;
            case 1:
                alexaGeofenceDetector.updateStates((List) obj);
                break;
            case 2:
                alexaGeofenceDetector.lambda$subscribeToActiveFences$0((Throwable) obj);
                break;
            default:
                alexaGeofenceDetector.lambda$evaluateEvent$2((Throwable) obj);
                break;
        }
    }
}
