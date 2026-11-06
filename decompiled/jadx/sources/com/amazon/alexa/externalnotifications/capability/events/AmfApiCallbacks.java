package com.amazon.alexa.externalnotifications.capability.events;

import androidx.annotation.VisibleForTesting;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaApiCallbacks;
import com.amazon.alexa.api.ApiCallFailure;
import com.amazon.alexa.externalnotifications.capability.ExternalNotificationsMetricsRecorder;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AmfApiCallbacks extends AlexaApiCallbacks {

    @VisibleForTesting
    protected static final String ATTEMPT_SUFFIX = ".event.attempt";

    @VisibleForTesting
    protected static final String FAILURE_SUFFIX = ".event.failure";

    @VisibleForTesting
    protected static final String FAILURE_TYPE_CUSTOM_ENTRY_KEY = "failureType";

    @VisibleForTesting
    protected static final String SUCCESS_SUFFIX = ".event.success";
    private static final String TAG = "AmfApiCallbacks";
    private final String eventName;
    private final ExternalNotificationsMetricsRecorder metricsRecorder;

    public AmfApiCallbacks(String str, ExternalNotificationsMetricsRecorder externalNotificationsMetricsRecorder) {
        this.eventName = str;
        this.metricsRecorder = externalNotificationsMetricsRecorder;
        externalNotificationsMetricsRecorder.recordCounter(str + ATTEMPT_SUFFIX);
    }

    @Override // com.amazon.alexa.api.AlexaApiCallbacks
    public void onFailure(ApiCallFailure apiCallFailure) {
        ParcelCompat$$ExternalSyntheticOutline0.m(this.eventName, TAG, new StringBuilder("Send event failed for: "));
        this.metricsRecorder.recordCounter(a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.eventName, FAILURE_SUFFIX), new HashMap<String, Object>(apiCallFailure) { // from class: com.amazon.alexa.externalnotifications.capability.events.AmfApiCallbacks.1
            final /* synthetic */ ApiCallFailure val$apiCallFailure;

            {
                this.val$apiCallFailure = apiCallFailure;
                put("failureType", apiCallFailure.getFailureType());
            }
        });
    }

    @Override // com.amazon.alexa.api.AlexaApiCallbacks
    public void onSuccess() {
        ParcelCompat$$ExternalSyntheticOutline0.m(this.eventName, TAG, new StringBuilder("Send event succeeded for: "));
        this.metricsRecorder.recordCounter(this.eventName + SUCCESS_SUFFIX);
    }
}
