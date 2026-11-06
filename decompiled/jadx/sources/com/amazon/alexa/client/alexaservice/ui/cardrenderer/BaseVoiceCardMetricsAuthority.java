package com.amazon.alexa.client.alexaservice.ui.cardrenderer;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaMetadataBundleKey;
import com.amazon.alexa.client.alexaservice.base.metrics.MetricsService;
import com.amazon.alexa.client.metrics.core.DefaultMetricsTimer;
import com.amazon.alexa.client.metrics.core.MetricsCounter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class BaseVoiceCardMetricsAuthority {
    private static final String TAG = "BaseVoiceCardMetricsAuthority";
    private final MetricsService metricsService;

    public BaseVoiceCardMetricsAuthority(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    private void recordError(String str, String str2) {
        this.metricsService.recordError(str, str2, getAppComponentName(), null, null);
    }

    private void recordOccurrenceOfEvent(String str, @Nullable Map<String, Object> map) {
        MetricsCounter startCounter = this.metricsService.startCounter(str, getAppComponentName(), null, map);
        startCounter.incrementCounter();
        this.metricsService.recordCounter(startCounter);
    }

    public abstract String getAppComponentName();

    public void recordCardControllerCreationError(Bundle bundle) {
        recordError(TransitionalMetricNames.CARD_CREATE_CONTROLLER_FAILED, bundle.getString(AlexaMetadataBundleKey.CARD_NAME.name()));
    }

    public void recordCardCreationError(Bundle bundle) {
        recordOccurrenceOfEvent(TransitionalMetricNames.CARD_CREATION_ERROR);
    }

    public void recordCardCreationLatency(Bundle bundle) {
        long j = bundle.getLong(AlexaMetadataBundleKey.LATENCY_REALTIME_MS.name(), -1L);
        if (j >= 0) {
            recordTimerEvent(TransitionalMetricNames.CARD_CREATION_LATENCY, j);
        }
    }

    public void recordCardInteracted(Bundle bundle) {
        String m = a$$ExternalSyntheticOutline0.m("UserInteraction.", bundle.getString(AlexaMetadataBundleKey.CARD_NAME.name()));
        if (bundle.getBoolean(AlexaMetadataBundleKey.CARD_WAS_INTERACTED_WITH.name())) {
            recordOccurrenceOfEvent(m);
        } else {
            recordNoOccurrenceOfEvent(m);
        }
    }

    public void recordCardRenderLatency(Bundle bundle) {
        long j = bundle.getLong(AlexaMetadataBundleKey.LATENCY_REALTIME_MS.name(), -1L);
        if (j >= 0) {
            recordTimerEvent(TransitionalMetricNames.CARD_RENDER_LATENCY, j);
        }
    }

    public void recordCardRenderSuccess(Bundle bundle) {
        if (bundle.getBoolean(AlexaMetadataBundleKey.SUCCESS.name())) {
            recordOccurrenceOfEvent(TransitionalMetricNames.CARD_RENDER_SUCCESSFUL);
        } else {
            recordNoOccurrenceOfEvent(TransitionalMetricNames.CARD_RENDER_SUCCESSFUL);
        }
    }

    public void recordCardViewCreatedLatency(Bundle bundle) {
        long j = bundle.getLong(AlexaMetadataBundleKey.LATENCY_REALTIME_MS.name(), -1L);
        if (j >= 0) {
            recordTimerEvent(TransitionalMetricNames.CARD_VIEWS_CREATED_LATENCY, j);
        }
    }

    public void recordFoundCardFactory(Bundle bundle, boolean z) {
        if (z) {
            recordOccurrenceOfEvent(TransitionalMetricNames.FOUND_CARD_FACTORY);
        } else {
            recordNoOccurrenceOfEvent(TransitionalMetricNames.FOUND_CARD_FACTORY);
            recordError(TransitionalMetricNames.EVENT_CARD_NO_MATCH, bundle.getString(AlexaMetadataBundleKey.CARD_NAME.name()));
        }
    }

    public void recordJsonParsingError(Bundle bundle) {
        String string = bundle.getString(AlexaMetadataBundleKey.ERROR_TYPE.name());
        String string2 = bundle.getString(AlexaMetadataBundleKey.MESSAGE.name());
        if (string == null) {
            Log.w(TAG, "Unknown JSON Parsing error. Null error type");
        }
        switch (string) {
            case "INVALID_JSON":
                recordError(TransitionalMetricNames.JSON_PARSING_ERROR_INVALID, string2);
                break;
            case "MISSING_CARD_TYPE":
                recordError(TransitionalMetricNames.JSON_PARSING_ERROR_MISSING_CARD_TYPE, string2);
                break;
            case "CARD_DATA_NULL":
                recordError(TransitionalMetricNames.JSON_PARSING_ERROR_NULL, "Null card data");
                break;
            default:
                Log.w(TAG, "Unknown JSON Parsing error: ".concat(string));
                break;
        }
    }

    public void recordNoOccurrenceOfEvent(String str) {
        this.metricsService.recordCounter(this.metricsService.startCounter(str, getAppComponentName(), null, null));
    }

    public void recordTimerEvent(String str, String str2, long j, @Nullable Map<String, Object> map) {
        this.metricsService.recordTimer(new DefaultMetricsTimer(str, str2, null, map, j, false));
    }

    public void recordValidJson(Bundle bundle) {
        if (bundle.getBoolean(AlexaMetadataBundleKey.SUCCESS.name())) {
            recordOccurrenceOfEvent(TransitionalMetricNames.JSON_PARSING_VALID_JSON);
        } else {
            recordNoOccurrenceOfEvent(TransitionalMetricNames.JSON_PARSING_VALID_JSON);
        }
    }

    public void recordTimerEvent(String str, long j) {
        recordTimerEvent(str, j, null);
    }

    private void recordTimerEvent(String str, long j, @Nullable Map<String, Object> map) {
        recordTimerEvent(str, getAppComponentName(), j, map);
    }

    public void recordOccurrenceOfEvent(String str) {
        recordOccurrenceOfEvent(str, null);
    }
}
