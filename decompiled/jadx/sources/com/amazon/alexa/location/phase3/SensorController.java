package com.amazon.alexa.location.phase3;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.apl.AplInteractor$$ExternalSyntheticLambda0;
import com.amazon.alexa.crashreporting.api.CrashReporter;
import com.amazon.alexa.location.LocationManager$$ExternalSyntheticLambda1;
import com.amazon.alexa.location.models.ALSGeofence;
import com.amazon.alexa.location.phase3.SensorController;
import com.amazon.alexa.location.phase3.sensor.AbstractSensor;
import com.amazon.alexa.location.utils.ExceptionRecordUtil;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SensorController {

    @VisibleForTesting
    static final int HIGH_ACCURACY_EXPIRATION_TIMER = 300000;
    private static final String TAG = "SensorController";
    private Observable<Configuration> configurationObservable;
    private final LazyComponent<CrashReporter> crashReporter;
    private Observable<List<ALSGeofence>> geofencesObservable;

    @VisibleForTesting
    Observable<Boolean> needMoreDataObservable;
    private final List<AbstractSensor> sensors;
    private SensorState state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.location.phase3.SensorController$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$location$phase3$Configuration;

        static {
            int[] iArr = new int[Configuration.values().length];
            $SwitchMap$com$amazon$alexa$location$phase3$Configuration = iArr;
            try {
                iArr[Configuration.PHASE3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$location$phase3$Configuration[Configuration.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SensorState {
        OFF,
        DEFAULT,
        NORMAL,
        HIGH_ACCURACY
    }

    public SensorController(List<AbstractSensor> list, @NonNull LazyComponent<CrashReporter> lazyComponent) {
        this.sensors = list;
        this.crashReporter = lazyComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$setNeedMoreDataObservable$0(Boolean bool) throws Throwable {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SensorState lambda$start$1(List list, Configuration configuration, Boolean bool) throws Throwable {
        if (list.isEmpty()) {
            return SensorState.OFF;
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$location$phase3$Configuration[configuration.ordinal()];
        return i != 1 ? i != 2 ? SensorState.OFF : SensorState.DEFAULT : bool.booleanValue() ? SensorState.HIGH_ACCURACY : SensorState.NORMAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$2(Throwable th) throws Throwable {
        ExceptionRecordUtil.recordExceptions(TAG, "transitionState", th, this.crashReporter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transitionState(SensorState sensorState) {
        if (this.state != sensorState) {
            Iterator<AbstractSensor> it2 = this.sensors.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().toggleSensorState(sensorState);
                } catch (Exception e) {
                    Log.e(TAG, "transitionState", e);
                }
            }
            this.state = sensorState;
        }
    }

    public Map<String, AbstractSensor> buildIntentHandlerMap() {
        HashMap hashMap = new HashMap();
        for (AbstractSensor abstractSensor : this.sensors) {
            Iterator<String> it2 = abstractSensor.getCorrespondingIntentActions().iterator();
            while (it2.hasNext()) {
                hashMap.put(it2.next(), abstractSensor);
            }
        }
        return hashMap;
    }

    public void setConfigurationObservable(Observable<Configuration> observable) {
        this.configurationObservable = observable;
    }

    public void setGeofencesObservable(Observable<List<ALSGeofence>> observable) {
        this.geofencesObservable = observable;
    }

    public void setNeedMoreDataObservable(Subject<Boolean> subject) {
        this.needMoreDataObservable = Observable.merge(subject, subject.map(new LocationManager$$ExternalSyntheticLambda1(10)).throttleWithTimeout(300000L, TimeUnit.MILLISECONDS)).startWithItem(Boolean.FALSE);
    }

    public void start() {
        final int i = 0;
        final int i2 = 1;
        Observable.combineLatest(this.geofencesObservable, this.configurationObservable, this.needMoreDataObservable, new AplInteractor$$ExternalSyntheticLambda0(29)).distinctUntilChanged().subscribe(new Consumer(this) { // from class: com.amazon.alexa.location.phase3.SensorController$$ExternalSyntheticLambda1
            public final /* synthetic */ SensorController f$0;

            {
                this.f$0 = this;
            }

            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(Object obj) {
                int i3 = i;
                SensorController sensorController = this.f$0;
                switch (i3) {
                    case 0:
                        sensorController.transitionState((SensorController.SensorState) obj);
                        break;
                    default:
                        sensorController.lambda$start$2((Throwable) obj);
                        break;
                }
            }
        }, new Consumer(this) { // from class: com.amazon.alexa.location.phase3.SensorController$$ExternalSyntheticLambda1
            public final /* synthetic */ SensorController f$0;

            {
                this.f$0 = this;
            }

            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(Object obj) {
                int i3 = i2;
                SensorController sensorController = this.f$0;
                switch (i3) {
                    case 0:
                        sensorController.transitionState((SensorController.SensorState) obj);
                        break;
                    default:
                        sensorController.lambda$start$2((Throwable) obj);
                        break;
                }
            }
        });
    }
}
