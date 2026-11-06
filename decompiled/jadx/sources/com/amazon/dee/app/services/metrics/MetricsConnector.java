package com.amazon.dee.app.services.metrics;

import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.event.userinteraction.MobilyticsUserInteractionEvent;
import com.dee.app.metrics.AlexaMetricsEvent;
import io.ktor.client.utils.CacheControl;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/MetricsConnector;", "", "shutdown", "", "beginSession", "pauseSession", "resumeSession", "endSession", "recordEvent", "event", "Lcom/dee/app/metrics/AlexaMetricsEvent;", "recordOperationalEvent", "operationalEvent", "Lcom/amazon/alexa/mobilytics/event/operational/MobilyticsOperationalEvent;", "recordUserInteractionEvent", "userInteractionEvent", "Lcom/amazon/alexa/mobilytics/event/userinteraction/MobilyticsUserInteractionEvent;", "userChanged", "userIdentity", "Lcom/amazon/alexa/identity/api/UserIdentity;", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MetricsConnector {
    void beginSession();

    void endSession();

    void pauseSession();

    @Deprecated(message = "Use recordOperationalEvent or recordUserInteractionEvent instead. See Mobilytics docs.")
    void recordEvent(@NotNull AlexaMetricsEvent event);

    void recordOperationalEvent(@NotNull MobilyticsOperationalEvent operationalEvent);

    void recordUserInteractionEvent(@NotNull MobilyticsUserInteractionEvent userInteractionEvent);

    void resumeSession();

    void shutdown();

    void userChanged(@NotNull UserIdentity userIdentity);
}
