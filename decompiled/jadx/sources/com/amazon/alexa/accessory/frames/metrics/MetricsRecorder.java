package com.amazon.alexa.accessory.frames.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.device.DeviceTypeInfoStore;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.notificationpublisher.exceptions.RxBlockingCallException;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import com.amazon.alexa.accessory.notificationpublisher.storage.AsyncLocalStorage;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.google.common.base.Strings;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import org.json.JSONException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MetricsRecorder {
    private static final String MAX_MILLIS_OF_THE_DAY_DAILY_HEART_BEAT = "maxMillisOfTheDayDailyHeartBeat";
    private static final String METRICS_STORAGE_TAG = "EchoFramesMetrics";
    private static final String TAG = "MetricsRecorder";
    private static MetricsRecorder recorder;
    private LazyComponent<Mobilytics> lazyMobilytics = ComponentRegistry.getInstance().getLazy(Mobilytics.class);
    private AsyncLocalStorage asyncLocalStorage = DependencyProvider.createAsyncLocalStorage(METRICS_STORAGE_TAG);

    public static synchronized MetricsRecorder getInstance() {
        MetricsRecorder metricsRecorder;
        synchronized (MetricsRecorder.class) {
            try {
                if (recorder == null) {
                    Log.d(TAG, "getInstance - Creating new instance");
                    recorder = new MetricsRecorder();
                }
                metricsRecorder = recorder;
            } catch (Throwable th) {
                throw th;
            }
        }
        return metricsRecorder;
    }

    private long getMaxMillisOfSameDay(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    private String getMobilyticsIdentifier(String str, String str2) {
        if (str2 != null) {
            return str2;
        }
        String upperCase = str.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "AJMM5LZMBFMM0":
            case "A3JKY41C0S05FZ":
            case "A3IYPH06PH1HRA":
            case "A2OUFCM11BT9RB":
                return "4c22bd9e-f936-44d2-95c3-249c93bd6042";
            case "A21YKVRGQV9TET":
                return "42534835-54fc-4240-8452-ba6c44493b3b";
            default:
                Log.d(TAG, "DeviceType not supported. Defaulting to Zephyr's identifier");
                return "4c22bd9e-f936-44d2-95c3-249c93bd6042";
        }
    }

    @VisibleForTesting
    public static void resetInstance() {
        recorder = new MetricsRecorder();
    }

    public void recordCounter(String str, String str2, String str3, double d, String str4) {
        Preconditions.notNull(str, "eventName");
        Preconditions.notNull(str2, "componentName");
        Preconditions.notNull(str2, "value");
        String deviceType = DeviceTypeInfoStore.getInstance().getDeviceType();
        Mobilytics mobilytics = this.lazyMobilytics.get();
        MobilyticsMetricsCounter createCounter = mobilytics.createCounter(!Strings.isNullOrEmpty(deviceType) ? a$$ExternalSyntheticOutline0.m$1(str, ":", deviceType) : str, str2, str3, getMobilyticsIdentifier(deviceType, str4));
        createCounter.incrementCounterByValue((long) d);
        mobilytics.recordCounter(createCounter);
        Log.i(TAG, String.format("Recorded accessory metric counter: %s, value: %f, subComponent: %s", a$$ExternalSyntheticOutline0.m$1(str, ":", deviceType), Double.valueOf(d), str3));
    }

    public void recordCounterWithOverrideIdentifier(String str, String str2) {
        recordCounter(str, MetricsConstants.COMPONENT_NAME, "default", 1.0d, str2);
    }

    public void recordDailyEvents(ArrayList<String> arrayList) {
        Log.d(TAG, "recordDailyEvents:");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object sync = this.asyncLocalStorage.getSync(MAX_MILLIS_OF_THE_DAY_DAILY_HEART_BEAT);
            if (sync == null || currentTimeMillis > ((Long) sync).longValue()) {
                this.asyncLocalStorage.putSync(MAX_MILLIS_OF_THE_DAY_DAILY_HEART_BEAT, Long.valueOf(getMaxMillisOfSameDay(currentTimeMillis)), null);
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    recordCounter(it2.next());
                }
            }
        } catch (RxBlockingCallException | JSONException e) {
            Log.e(TAG, " Exception : " + e.getMessage());
        }
    }

    public void recordDuration(String str, long j) {
        Mobilytics mobilytics = this.lazyMobilytics.get();
        String deviceType = DeviceTypeInfoStore.getInstance().getDeviceType();
        if (!Strings.isNullOrEmpty(deviceType)) {
            str = a$$ExternalSyntheticOutline0.m$1(str, ":", deviceType);
        }
        String str2 = str;
        recordTimer(mobilytics.createTimer(str2, MetricsConstants.COMPONENT_NAME, "default", j, false, getMobilyticsIdentifier(deviceType, null)));
        Log.i(TAG, "Recorded accessory metric duration: %s, durationMillis: %d", str2, Long.valueOf(j));
    }

    public void recordTapRoutinesMetrics(String str) {
        recordCounterWithOverrideIdentifier(str, "4c22bd9e-f936-44d2-95c3-249c93bd6042");
    }

    public void recordTimer(MobilyticsMetricsTimer mobilyticsMetricsTimer) {
        this.lazyMobilytics.get().recordTimer(mobilyticsMetricsTimer);
    }

    public MobilyticsMetricsTimer startTimer(String str, String str2) {
        Mobilytics mobilytics = this.lazyMobilytics.get();
        String deviceType = DeviceTypeInfoStore.getInstance().getDeviceType();
        if (!Strings.isNullOrEmpty(deviceType)) {
            str = a$$ExternalSyntheticOutline0.m$1(str, ":", deviceType);
        }
        return mobilytics.createTimer(str, MetricsConstants.COMPONENT_NAME, "default", getMobilyticsIdentifier(deviceType, str2));
    }

    public MobilyticsMetricsTimer startTimer(String str) {
        return startTimer(str, null);
    }

    @VisibleForTesting
    public void recordCounter(String str, String str2) {
        recordCounter(str, MetricsConstants.COMPONENT_NAME, str2, 1.0d, null);
    }

    public void recordCounter(String str) {
        recordCounter(str, MetricsConstants.COMPONENT_NAME, "default", 1.0d, null);
    }
}
