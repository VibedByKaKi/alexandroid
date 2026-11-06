package com.amazon.dee.app.services.metrics.kinesis.client;

import com.amazon.dee.app.services.metrics.kinesis.event.KinesisEvent;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0002\u0010\u0010J'\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/client/KinesisEventClient;", "Lcom/amazon/dee/app/services/metrics/kinesis/client/KinesisEventRecorder;", "recordEvent", "", "event", "Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisEvent;", "createEvent", "eventType", "", "addGlobalAttribute", "attributeName", "attributeValue", "addGlobalMetric", ShortcutConstants.METRIC_NAME_KEY, "metricValue", "", "(Ljava/lang/String;Ljava/lang/Double;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "removeGlobalAttribute", "removeGlobalMetric", "updateAppBackgroundStatus", "status", "", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface KinesisEventClient extends KinesisEventRecorder {
    void addGlobalAttribute(@NotNull String attributeName, @NotNull String attributeValue);

    void addGlobalAttribute(@NotNull String eventType, @NotNull String attributeName, @NotNull String attributeValue);

    void addGlobalMetric(@NotNull String metricName, @Nullable Double metricValue);

    void addGlobalMetric(@NotNull String eventType, @NotNull String metricName, @Nullable Double metricValue);

    @NotNull
    KinesisEvent createEvent(@NotNull String eventType);

    void recordEvent(@NotNull KinesisEvent event);

    void removeGlobalAttribute(@NotNull String attributeName);

    void removeGlobalAttribute(@NotNull String eventType, @NotNull String attributeName);

    void removeGlobalMetric(@NotNull String metricName);

    void removeGlobalMetric(@NotNull String eventType, @NotNull String metricName);

    void updateAppBackgroundStatus(boolean status);
}
