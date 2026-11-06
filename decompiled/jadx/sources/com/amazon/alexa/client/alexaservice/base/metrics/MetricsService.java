package com.amazon.alexa.client.alexaservice.base.metrics;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.device.PersistentStorage;
import com.amazon.alexa.client.core.marketplace.MarketplaceAuthority;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.client.metrics.core.AlexaMetricsEvent;
import com.amazon.alexa.client.metrics.core.DefaultAlexaMetricsEvent;
import com.amazon.alexa.client.metrics.core.DefaultMetricsCounter;
import com.amazon.alexa.client.metrics.core.DeviceInformation;
import com.amazon.alexa.client.metrics.core.MetricsConnector;
import com.amazon.alexa.client.metrics.core.MetricsCounter;
import com.amazon.alexa.client.metrics.core.MetricsTimer;
import com.amazon.alexa.client.metrics.core.PreloadAttributionProvider;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetricsService {
    private static final String SESSION_PAUSED = "SESSION_PAUSED";
    private static final String SUBCOMPONENT = "subComponent";
    private static final String TAG = "MetricsService";
    private final String androidId;
    private final DeviceInformation deviceInformation;
    private final MarketplaceAuthority marketplaceAuthority;
    private final MetricsConnector metricsConnector;
    private final Lazy<PersistentStorage> persistentStorage;
    private final PreloadAttributionProvider preloadAttributionProvider;
    private List<String> sessionEventsRecorded;
    private final MetricsSubComponentNameProvider subComponentNameProvider;
    private static final List<String> SINGLE_SESSION_EVENTS = Arrays.asList("APP_CRASH", "APP_CRASH_COUNT");
    private static final long SESSION_PAUSE_TIMEOUT = 5000;

    public MetricsService(DeviceInformation deviceInformation, Lazy<PersistentStorage> lazy, MetricsConnector metricsConnector, PreloadAttributionProvider preloadAttributionProvider, MarketplaceAuthority marketplaceAuthority, @Named("androidId") String str, MetricsSubComponentNameProvider metricsSubComponentNameProvider) {
        this.deviceInformation = deviceInformation;
        this.metricsConnector = metricsConnector;
        this.persistentStorage = lazy;
        this.preloadAttributionProvider = preloadAttributionProvider;
        this.marketplaceAuthority = marketplaceAuthority;
        this.androidId = str;
        this.subComponentNameProvider = metricsSubComponentNameProvider;
    }

    private void restartSession() {
        recordOccurrence("APP_CRASH", AlexaMetricsConstants.MetricsComponents.ALEXA_VOICE_SERVICE, false, null);
        endSession();
        beginSession();
    }

    public void beginSession() {
        this.sessionEventsRecorded = new ArrayList();
        boolean z = this.persistentStorage.get().getBoolean("FirstLaunch", true);
        String string = this.persistentStorage.get().getString("AppVersion", "2.0.0.0");
        if (z) {
            recordEvent(AlexaMetricsConstants.MetricEvents.SERVICE_INSTALL);
            this.persistentStorage.get().edit().set("FirstLaunch", false).set("AppVersion", "null").commitAsynchronously();
        } else if (!"null".equals(string)) {
            recordEvent(AlexaMetricsConstants.MetricEvents.SERVICE_UPDATE);
            this.persistentStorage.get().edit().set("AppVersion", "null").commitAsynchronously();
        }
        this.metricsConnector.beginSession();
    }

    public void endSession() {
        this.metricsConnector.endSession();
    }

    public void pauseSession() {
        this.metricsConnector.pauseSession();
        this.persistentStorage.get().edit().set(SESSION_PAUSED, SystemClock.elapsedRealtime()).commitAsynchronously();
    }

    public void recordCounter(MetricsCounter metricsCounter) {
        recordEvent(metricsCounter);
    }

    public void recordCustom(String str, String str2, String str3, @Nullable String str4, @Nullable Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("EventType", str);
        recordEvent(new DefaultAlexaMetricsEvent(str2, str3, str4, map));
    }

    public void recordError(String str, String str2, String str3, String str4, Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, Object> map2 = map;
        map2.put("EventValue", str2);
        recordCustom("Error", "Error." + str, str3, str4, map2);
    }

    public void recordEvent(AlexaMetricsEvent alexaMetricsEvent) {
        if (alexaMetricsEvent.isInvalidated()) {
            return;
        }
        Map<String, Object> customEntries = alexaMetricsEvent.getCustomEntries();
        if (customEntries != null) {
            Iterator<Map.Entry<String, Object>> it2 = customEntries.entrySet().iterator();
            while (it2.hasNext()) {
                Object value = it2.next().getValue();
                if (value == null || value.toString().isEmpty()) {
                    it2.remove();
                }
            }
            String attributionTag = this.preloadAttributionProvider.getAttributionTag();
            if (!TextUtils.isEmpty(attributionTag)) {
                customEntries.put("attributionTag", attributionTag);
            }
            customEntries.put("androidId", this.androidId);
            customEntries.putAll(this.deviceInformation.getStaticDeviceProfileData());
            customEntries.putAll(this.deviceInformation.getDynamicDeviceProfileData(true));
            if (!customEntries.containsKey("pfm")) {
                customEntries.put("pfm", this.marketplaceAuthority.getMarketplace().name());
            }
            if (!customEntries.containsKey("locale")) {
                customEntries.put("locale", Locale.getDefault().toLanguageTag());
            }
            String subComponentName = this.subComponentNameProvider.getSubComponentName();
            if (subComponentName != null) {
                customEntries.put("subComponent", subComponentName);
            }
        }
        this.metricsConnector.recordEvent(alexaMetricsEvent);
    }

    public void recordOccurrence(String str, String str2, @Nullable String str3, boolean z, @Nullable Map<String, Object> map) {
        DefaultMetricsCounter defaultMetricsCounter = new DefaultMetricsCounter(str, str2, map);
        if (z) {
            defaultMetricsCounter.incrementCounter();
        }
        recordEvent(defaultMetricsCounter);
    }

    public void recordTimer(MetricsTimer metricsTimer) {
        metricsTimer.finishTimer();
        String.format("%s took %.3f seconds", metricsTimer.getEventName(), Float.valueOf(metricsTimer.getElapsedTime() / 1000.0f));
        recordEvent(metricsTimer);
    }

    public void resumeSession() {
        long j = this.persistentStorage.get().getLong(SESSION_PAUSED, 0L);
        if (j == 0 || SystemClock.elapsedRealtime() - j <= SESSION_PAUSE_TIMEOUT) {
            this.metricsConnector.resumeSession();
        } else {
            restartSession();
            this.persistentStorage.get().edit().set(SESSION_PAUSED, 0L).commitAsynchronously();
        }
    }

    public MetricsCounter startCounter(String str, String str2, String str3, Map<String, Object> map) {
        return new DefaultMetricsCounter(str, str2, str3, map);
    }

    public void teardown() {
        this.metricsConnector.shutdown();
        this.subComponentNameProvider.teardown();
    }

    public MetricsCounter startCounter(String str, String str2, Map<String, Object> map) {
        return new DefaultMetricsCounter(str, str2, map);
    }

    public void recordOccurrence(String str, String str2, boolean z, @Nullable Map<String, Object> map) {
        recordOccurrence(str, str2, null, z, map);
    }

    public void recordEvent(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "_vox_speech_v2";
        }
        String str2 = str;
        if (SINGLE_SESSION_EVENTS.contains(str2)) {
            if (this.sessionEventsRecorded.contains(str2)) {
                return;
            } else {
                this.sessionEventsRecorded.add(str2);
            }
        }
        recordCustom("General", str2, AlexaMetricsConstants.MetricsComponents.ALEXA_VOICE_SERVICE, null, null);
    }
}
