package com.amazon.dee.app.services.icon;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsOperationalEvent;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import dagger.Lazy;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ \u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/dee/app/services/icon/IconMetrics;", "", "mobilyticsLazy", "Ldagger/Lazy;", "Lcom/amazon/alexa/mobilytics/Mobilytics;", "<init>", "(Ldagger/Lazy;)V", "recordCounter", "", "eventName", "", "subComponent", "recordError", "record", "operationalEventType", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class IconMetrics {

    @NotNull
    private static final String TAG = "IconMetrics";

    @NotNull
    private final Lazy<Mobilytics> mobilyticsLazy;

    @Inject
    public IconMetrics(@NotNull Lazy<Mobilytics> lazy) {
        lazy.getClass();
        this.mobilyticsLazy = lazy;
    }

    private final void record(String eventName, String operationalEventType, String subComponent) {
        String str;
        try {
            str = eventName;
        } catch (Exception e) {
            e = e;
            str = eventName;
        }
        try {
            MobilyticsOperationalEvent createOperationalEvent = this.mobilyticsLazy.get().createOperationalEvent(str, operationalEventType, AlexaMetricsConstants.MetricsComponents.DYNAMIC_APP_ICON, subComponent, "cbea4080-337a-4b7e-8e0b-ea16ec85c09a");
            createOperationalEvent.getClass();
            this.mobilyticsLazy.get().recordOperationalEvent(createOperationalEvent);
        } catch (Exception e2) {
            e = e2;
            Log.w(TAG, "Failed to record metric %s: %s", str, e.getMessage());
        }
    }

    public final void recordCounter(@NotNull String eventName, @NotNull String subComponent) {
        eventName.getClass();
        subComponent.getClass();
        record(eventName, "counter", subComponent);
    }

    public final void recordError(@NotNull String eventName, @NotNull String subComponent) {
        eventName.getClass();
        subComponent.getClass();
        record(eventName, "error", subComponent);
    }
}
