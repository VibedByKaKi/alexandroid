package com.amazon.dee.app.services.metrics.kinesis.event;

import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import io.ktor.client.utils.CacheControl;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H&J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003H&J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0003H&J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H&¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0003H&J\u0012\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H&J\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t¨\u0006%À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisEvent;", "", "eventType", "", "getEventType", "()Ljava/lang/String;", "allAttributes", "", "getAllAttributes", "()Ljava/util/Map;", "allMetrics", "", "getAllMetrics", "allPivots", "getAllPivots", "addAttribute", "", "name", "value", "hasAttribute", "", "attributeName", "getAttribute", "addMetric", "(Ljava/lang/String;Ljava/lang/Double;)V", "hasMetric", ShortcutConstants.METRIC_NAME_KEY, "getMetric", "(Ljava/lang/String;)Ljava/lang/Double;", "addPivot", "hasPivot", "pivotName", "getPivot", "withAttribute", "withMetric", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/amazon/dee/app/services/metrics/kinesis/event/KinesisEvent;", "withPivot", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface KinesisEvent {
    void addAttribute(@NotNull String name, @NotNull String value);

    void addMetric(@NotNull String name, @Nullable Double value);

    void addPivot(@NotNull String name, @NotNull String value);

    @NotNull
    Map<String, String> getAllAttributes();

    @NotNull
    Map<String, Double> getAllMetrics();

    @NotNull
    Map<String, String> getAllPivots();

    @Nullable
    String getAttribute(@NotNull String name);

    @NotNull
    String getEventType();

    @Nullable
    Double getMetric(@NotNull String name);

    @Nullable
    String getPivot(@NotNull String name);

    boolean hasAttribute(@NotNull String attributeName);

    boolean hasMetric(@NotNull String metricName);

    boolean hasPivot(@NotNull String pivotName);

    @NotNull
    KinesisEvent withAttribute(@NotNull String name, @NotNull String value);

    @NotNull
    KinesisEvent withMetric(@NotNull String name, @Nullable Double value);

    @NotNull
    KinesisEvent withPivot(@NotNull String name, @NotNull String value);
}
