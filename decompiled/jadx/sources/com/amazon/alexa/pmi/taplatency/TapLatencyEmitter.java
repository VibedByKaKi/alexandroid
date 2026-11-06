package com.amazon.alexa.pmi.taplatency;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J0\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J2\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/pmi/taplatency/TapLatencyEmitter;", "", "recordDuration", "", "surface", "Lcom/amazon/alexa/pmi/taplatency/TapSurface;", "metric", "Lcom/amazon/alexa/pmi/taplatency/TapMetric;", "renderType", "Lcom/amazon/alexa/pmi/taplatency/TapRenderType;", "durationMs", "", "recordNoRender", "recordAttributedDuration", "eventName", "", "recordSuperseded", "recordCappedDuration", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface TapLatencyEmitter {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void recordAttributedDuration(@NotNull TapLatencyEmitter tapLatencyEmitter, @NotNull TapSurface tapSurface, @NotNull TapMetric tapMetric, @NotNull TapRenderType tapRenderType, long j, @NotNull String str) {
            tapSurface.getClass();
            tapMetric.getClass();
            tapRenderType.getClass();
            str.getClass();
            tapLatencyEmitter.recordDuration(tapSurface, tapMetric, tapRenderType, j);
        }

        public static void recordCappedDuration(@NotNull TapLatencyEmitter tapLatencyEmitter, @NotNull TapSurface tapSurface, @NotNull TapMetric tapMetric, @NotNull TapRenderType tapRenderType, long j, @Nullable String str) {
            tapSurface.getClass();
            tapMetric.getClass();
            tapRenderType.getClass();
        }

        public static void recordSuperseded(@NotNull TapLatencyEmitter tapLatencyEmitter, @NotNull TapSurface tapSurface, @NotNull TapMetric tapMetric, @NotNull TapRenderType tapRenderType) {
            tapSurface.getClass();
            tapMetric.getClass();
            tapRenderType.getClass();
        }
    }

    void recordAttributedDuration(@NotNull TapSurface surface, @NotNull TapMetric metric, @NotNull TapRenderType renderType, long durationMs, @NotNull String eventName);

    void recordCappedDuration(@NotNull TapSurface surface, @NotNull TapMetric metric, @NotNull TapRenderType renderType, long durationMs, @Nullable String eventName);

    void recordDuration(@NotNull TapSurface surface, @NotNull TapMetric metric, @NotNull TapRenderType renderType, long durationMs);

    void recordNoRender(@NotNull TapSurface surface, @NotNull TapMetric metric, @NotNull TapRenderType renderType);

    void recordSuperseded(@NotNull TapSurface surface, @NotNull TapMetric metric, @NotNull TapRenderType renderType);
}
