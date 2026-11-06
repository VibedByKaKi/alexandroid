package com.amazon.alexa.handsfree.voiceappreporter.services;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.metrics.dependencies.AlexaMobileMetricsComponent;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.CrashReportRecorder;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.protocols.voiceappreporter.VoiceAppEventReporterContract;
import com.amazon.alexa.handsfree.voiceappreporter.VoiceAppEvent;
import com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseHelper;
import com.amazon.alexa.handsfree.voiceappreporter.schedulers.VoiceAppEventReporterServiceScheduler;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceAppEventReporterService extends SafeDequeueJobIntentService {
    private static final int JOB_ID = 30009;
    private static final String TAG = "VoiceAppEventReporterService";

    @Inject
    AMPDInformationProvider mAMPDInformationProvider;

    @Inject
    CrashReportRecorder mCrashReportRecorder;

    @Inject
    Initializer mInitializer;

    @Inject
    MetricsBuilderProvider mMetricsBuilderProvider;

    @Inject
    VoiceAppEventReporterDatabaseHelper mVoiceAppEventReporterDatabaseHelper;

    @Inject
    VoiceAppEventReporterServiceScheduler mVoiceAppEventReporterServiceScheduler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum MetricType {
        VOICE_APP_EVENT("VoiceAppEvent"),
        CURSOR_ERROR("CursorError");

        private final String mValue;

        MetricType(@NonNull String str) {
            this.mValue = str;
        }

        @NonNull
        public String getValue() {
            return this.mValue;
        }
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) VoiceAppEventReporterService.class, JOB_ID, intent);
    }

    private void reportAppCrash() {
        this.mMetricsBuilderProvider.newBuilder().withPercentileMetricFailure(TAG, MetricType.VOICE_APP_EVENT.getValue()).emit(this);
    }

    private void reportAppStart() {
        this.mMetricsBuilderProvider.newBuilder().withPercentileMetricSuccess(TAG, MetricType.VOICE_APP_EVENT.getValue()).emit(this);
    }

    private void reportCursorError() {
        String str = TAG;
        Log.d(str, "There was an error accessing cursor. Adding cursor error");
        this.mMetricsBuilderProvider.newBuilder().withNonFatalErrorEventMetric(str, MetricType.CURSOR_ERROR.getValue()).emit(this);
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        ((AlexaMobileMetricsComponent) AhfComponentsProvider.getComponent(this, AlexaMobileMetricsComponent.class)).inject(this);
        this.mInitializer.initialize(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        while (true) {
            try {
                VoiceAppEvent popVoiceEvent = this.mVoiceAppEventReporterDatabaseHelper.popVoiceEvent();
                if (popVoiceEvent == null) {
                    break;
                }
                String eventType = popVoiceEvent.getEventType();
                int hashCode = eventType.hashCode();
                if (hashCode != -200567657) {
                    if (hashCode == -185731758 && eventType.equals(VoiceAppEventReporterContract.VoiceAppEventsTable.EVENT_TYPE_APP_START)) {
                        Log.d(TAG, "Reporting an app start event");
                        reportAppStart();
                    }
                } else if (eventType.equals(VoiceAppEventReporterContract.VoiceAppEventsTable.EVENT_TYPE_APP_CRASH)) {
                    Log.d(TAG, "Reporting a crash");
                    reportAppCrash();
                }
            } catch (Exception e) {
                Log.e(TAG, "Exception reporting the voice event: " + e);
                this.mCrashReportRecorder.reportNonFatalCrash(this, e.getStackTrace()[0].getMethodName(), e);
            }
        }
        if (this.mVoiceAppEventReporterDatabaseHelper.getHasCursorErrorOccurred()) {
            reportCursorError();
        }
        this.mVoiceAppEventReporterServiceScheduler.scheduleNextCheck();
    }
}
