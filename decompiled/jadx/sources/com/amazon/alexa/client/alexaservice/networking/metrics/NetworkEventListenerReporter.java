package com.amazon.alexa.client.alexaservice.networking.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.api.AlexaMetricsType;
import com.amazon.alexa.client.alexaservice.base.system.EndpointAuthority;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.NetworkLatencyMetricEvent;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import dagger.Lazy;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class NetworkEventListenerReporter {
    private static final String EXECUTOR_NAME = "NetworkEventListenerReporter";
    private static final String TAG = "NetworkEventListenerReporter";
    private static final boolean isDebug = false;
    private final Lazy<EndpointAuthority> endpointAuthority;
    private final AlexaClientEventBus eventBus;
    private final ExecutorService executor;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum HttpRequestType {
        DOWNCHANNEL,
        EVENTS,
        CAPABILITIES,
        PING,
        OTHER
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PostMetricsAsyncRunnable implements Runnable {
        private final long end;
        private final Lazy<EndpointAuthority> endpointAuthority;
        private final AlexaClientEventBus eventBus;
        private final AlexaMetricsName metricsName;
        private final AlexaMetricsType metricsType;
        private final long start;
        private final HttpUrl url;

        public PostMetricsAsyncRunnable(AlexaClientEventBus alexaClientEventBus, AlexaMetricsName alexaMetricsName, HttpUrl httpUrl, Lazy<EndpointAuthority> lazy, long j, long j2, AlexaMetricsType alexaMetricsType) {
            this.eventBus = alexaClientEventBus;
            this.metricsName = alexaMetricsName;
            this.url = httpUrl;
            this.endpointAuthority = lazy;
            this.start = j;
            this.end = j2;
            this.metricsType = alexaMetricsType;
        }

        private HttpRequestType getRequestTypeFromUrl(HttpUrl httpUrl) {
            return httpUrl.encodedPath().equals(this.endpointAuthority.get().getDirectivesHttpUrl().encodedPath()) ? HttpRequestType.DOWNCHANNEL : httpUrl.encodedPath().equals(this.endpointAuthority.get().getCapabilitiesUrl().encodedPath()) ? HttpRequestType.CAPABILITIES : httpUrl.encodedPath().equals(this.endpointAuthority.get().getPingUrl().encodedPath()) ? HttpRequestType.PING : httpUrl.encodedPath().equals(this.endpointAuthority.get().getEventsHttpUrl().encodedPath()) ? HttpRequestType.EVENTS : HttpRequestType.OTHER;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.eventBus.post(NetworkLatencyMetricEvent.create(this.metricsName.getValue(), this.end - this.start, getRequestTypeFromUrl(this.url).name()));
        }
    }

    @Inject
    public NetworkEventListenerReporter(AlexaClientEventBus alexaClientEventBus, Lazy<EndpointAuthority> lazy) {
        this.eventBus = alexaClientEventBus;
        this.endpointAuthority = lazy;
        this.executor = ManagedExecutorFactory.newSingleThreadCachedThreadPool("NetworkEventListenerReporter", ManagedExecutorFactory.Group.BACKGROUND_TASK);
    }

    public void submitLatencyMetric(AlexaMetricsName alexaMetricsName, long j, long j2, HttpUrl httpUrl) {
        this.executor.submit(new PostMetricsAsyncRunnable(this.eventBus, alexaMetricsName, httpUrl, this.endpointAuthority, j, j2, AlexaMetricsType.TIMER));
    }

    @VisibleForTesting
    public NetworkEventListenerReporter(AlexaClientEventBus alexaClientEventBus, Lazy<EndpointAuthority> lazy, ExecutorService executorService) {
        this.eventBus = alexaClientEventBus;
        this.endpointAuthority = lazy;
        this.executor = executorService;
    }
}
