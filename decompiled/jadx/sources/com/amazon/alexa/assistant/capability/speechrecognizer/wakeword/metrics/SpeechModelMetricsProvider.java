package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.metrics;

import com.amazon.alexa.assistant.foundation.metric.model.MetricMetadata;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\n\u001a\u00020\u0003H&J\u0014\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/metrics/SpeechModelMetricsProvider;", "", "readFromMemoryAttempted", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "readFromMemoryFailed", "error", "", "systemLocaleChanged", "locale", "systemLocaleModelUpdateFailed", "downloadSaveAttempted", "downloadSaveFailed", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SpeechModelMetricsProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ MetricMetadata downloadSaveFailed$default(SpeechModelMetricsProvider speechModelMetricsProvider, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: downloadSaveFailed");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return speechModelMetricsProvider.downloadSaveFailed(str);
        }

        public static /* synthetic */ MetricMetadata readFromMemoryFailed$default(SpeechModelMetricsProvider speechModelMetricsProvider, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: readFromMemoryFailed");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return speechModelMetricsProvider.readFromMemoryFailed(str);
        }

        public static /* synthetic */ MetricMetadata systemLocaleModelUpdateFailed$default(SpeechModelMetricsProvider speechModelMetricsProvider, String str, String str2, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: systemLocaleModelUpdateFailed");
                return null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return speechModelMetricsProvider.systemLocaleModelUpdateFailed(str, str2);
        }
    }

    @NotNull
    MetricMetadata downloadSaveAttempted();

    @NotNull
    MetricMetadata downloadSaveFailed(@Nullable String error);

    @NotNull
    MetricMetadata readFromMemoryAttempted();

    @NotNull
    MetricMetadata readFromMemoryFailed(@Nullable String error);

    @NotNull
    MetricMetadata systemLocaleChanged(@NotNull String locale);

    @NotNull
    MetricMetadata systemLocaleModelUpdateFailed(@NotNull String locale, @Nullable String error);
}
