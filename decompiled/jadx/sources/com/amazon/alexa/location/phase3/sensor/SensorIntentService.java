package com.amazon.alexa.location.phase3.sensor;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.location.LocationService;
import com.amazon.alexa.location.phase3.LocationDataStore$$ExternalSyntheticLambda3;
import com.amazon.alexa.location.phase3.Phase3LocationService;
import com.amazon.alexa.location.utils.MobilyticsUtil;
import com.amazon.alexa.location.utils.NotificationUtil;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.voice.tta.typing.TypingPresenter$$ExternalSyntheticLambda5;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SensorIntentService extends IntentService {
    private static final int JOB_ID = 537202346;
    private LazyComponent<LocationService> locationService;
    private LazyComponent<Mobilytics> mobilytics;
    private static final String TAG = "SensorIntentService";
    public static final String COMOPONENT_NAME = MobilyticsUtil.getComponentName(TAG);

    public SensorIntentService() {
        super(TAG);
        ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
        this.locationService = componentRegistry.getLazy(LocationService.class);
        this.mobilytics = componentRegistry.getLazy(Mobilytics.class);
    }

    private static String getSimpleAction(Intent intent) {
        String action = intent.getAction();
        return action.substring(action.lastIndexOf(46) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleIntent$0(MobilyticsMetricsTimer mobilyticsMetricsTimer) throws Throwable {
        mobilyticsMetricsTimer.finishTimer();
        this.mobilytics.get().recordTimer(mobilyticsMetricsTimer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleIntent$1(String str) throws Throwable {
        Mobilytics mobilytics = this.mobilytics.get();
        String m = a$$ExternalSyntheticOutline0.m("intent_", str, MetricsConstants.SUCCESS_SUFFIX);
        String str2 = COMOPONENT_NAME;
        mobilytics.recordOccurrence(m, true, str2, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHandleIntent$2(String str, Throwable th) throws Throwable {
        Log.e(TAG, "onHandleIntent ", th);
        Mobilytics mobilytics = this.mobilytics.get();
        String m = a$$ExternalSyntheticOutline0.m("intent_", str, "_failure");
        String str2 = COMOPONENT_NAME;
        mobilytics.recordOccurrence(m, true, str2, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(JOB_ID, NotificationUtil.getNotificationForBackgroundTasks(this, "Sensors"));
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (!(this.locationService.get() instanceof Phase3LocationService)) {
            Mobilytics mobilytics = this.mobilytics.get();
            String str = COMOPONENT_NAME;
            mobilytics.recordOccurrence(MobilyticsUtil.MetricsID.PHASE3_SERVICE_NOT_AVAILABLE, true, str, str, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
            return;
        }
        Phase3LocationService phase3LocationService = (Phase3LocationService) this.locationService.get();
        String lowerCase = getSimpleAction(intent).toLowerCase(Locale.US);
        Mobilytics mobilytics2 = this.mobilytics.get();
        String m = a$$ExternalSyntheticOutline0.m("intent_", lowerCase, MetricsConstants.START_SUFFIX);
        String str2 = COMOPONENT_NAME;
        mobilytics2.recordOccurrence(m, true, str2, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        phase3LocationService.handleIntent(intent).doOnTerminate(new LocationDataStore$$ExternalSyntheticLambda3(this, this.mobilytics.get().createTimer(a$$ExternalSyntheticOutline0.m("intent_", lowerCase, "_handled_time"), str2, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID), 21)).subscribe(new LocationDataStore$$ExternalSyntheticLambda3(this, lowerCase, 22), new TypingPresenter$$ExternalSyntheticLambda5(this, lowerCase, 2));
    }
}
