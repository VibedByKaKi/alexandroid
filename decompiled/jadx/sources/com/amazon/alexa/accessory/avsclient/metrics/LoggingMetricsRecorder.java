package com.amazon.alexa.accessory.avsclient.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.metrics.AccessoryMetricsService;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class LoggingMetricsRecorder implements AccessoryMetricsService {
    private static final String TAG = "LoggingMetricsRecorder:";

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void createTimer(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, @NonNull String str5) {
        Preconditions.notNull(str, "metricIdentifier");
        Preconditions.notNull(str2, "timerName");
        Preconditions.notNull(str3, JsonFields.COMPONENT);
        Preconditions.notNull(str5, MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY);
        Logger.d("LoggingMetricsRecorder: createTimer. metricIdentifier=%s timerName=%s, component=%s, subComponent=%s, ownerId=%s", str, str2, str3, str4, str5);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCounter(String str, String str2, double d, Map<String, Object> map) {
        Logger.d("LoggingMetricsRecorder: recordCounter. name=%s, component=%s, value=%.1f, customAttributes=%s", str, str2, Double.valueOf(d), map);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCriticalEvent(String str, String str2, String str3, Throwable th) {
        Logger.e("LoggingMetricsRecorder: recordCriticalEvent: eventName=%s, component=%s, error=%s", str, str3, th);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordDem(String str, String str2, Map<String, String> map) {
        Logger.d("LoggingMetricsRecorder: eventName=%s, component=%s, recordDem: proto data=%s", str, str2, map.toString());
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordOccurrence(String str, String str2, boolean z, Map<String, Object> map) {
        Logger.d("LoggingMetricsRecorder: recordOccurence. name=%s, component=%s, value=%b, customAttributes=%s", str, str2, Boolean.valueOf(z), map);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordTime(String str, String str2, long j, Map<String, Object> map) {
        Logger.d("LoggingMetricsRecorder: recordTimer. name=%s, component=%s, value=%d, customAttributes=%s", str, str2, Long.valueOf(j), map);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordTimer(String str) {
        Preconditions.notNull(str, "metricIdentifier");
        Logger.d("LoggingMetricsRecorder: recordTimer. metricIdentifier=%s", str);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordUpl(String str, String str2, long j, Map<String, Object> map) {
        Logger.d("%s recordUpl. name=%s, component=%s, value=%d, customAttributes=" + map, TAG, str, str2, Long.valueOf(j));
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordWarningEvent(String str, String str2, String str3, Throwable th) {
        Logger.w("LoggingMetricsRecorder: recordWarningEvent: eventName=%s, component=%s, error=%s", str, str3, th);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCriticalEvent(String str, String str2, String str3, Throwable th, String str4) {
        Logger.e("LoggingMetricsRecorder: recordCriticalEvent: eventName=%s, component=%s, error=%s, ownerId=%s", str, str3, th, str4);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordWarningEvent(String str, String str2, String str3, Throwable th, String str4) {
        Logger.w("LoggingMetricsRecorder: recordWarningEvent: eventName=%s, component=%s, error=%s, ownerId=%s", str, str3, th, str4);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordCounter(String str, String str2, double d, Map<String, Object> map, String str3) {
        Logger.d("LoggingMetricsRecorder: recordCounter. name=%s, component=%s, value=%.1f, customAttributes=%s, ownerId=%s", str, str2, Double.valueOf(d), map, str3);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordOccurrence(String str, String str2, boolean z, Map<String, Object> map, String str3) {
        Logger.d("LoggingMetricsRecorder: recordOccurence. name=%s, component=%s, value=%b, customAttributes=%s, ownerId=%s", str, str2, Boolean.valueOf(z), map, str3);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void recordTime(String str, String str2, long j, Map<String, Object> map, String str3) {
        Logger.d("LoggingMetricsRecorder: recordTimer. name=%s, component=%s, value=%d, customAttributes=%s, ownerId=%s", str, str2, Long.valueOf(j), map, str3);
    }

    @Override // com.amazon.alexa.accessory.metrics.AccessoryMetricsService
    public void createTimer(String str, String str2, String str3, String str4) {
        Preconditions.notNull(str, "metricIdentifier");
        Preconditions.notNull(str2, "timerName");
        Preconditions.notNull(str3, JsonFields.COMPONENT);
        Logger.d("LoggingMetricsRecorder: createTimer. metricIdentifier=%s timerName=%s, component=%s, subComponent=%s", str, str2, str3, str4);
    }
}
