package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.metrics;

import com.amazon.alexa.assistant.foundation.metric.model.MetricMetadata;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\u0003H&J\u0014\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0014\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0014\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/metrics/WakeWordRecognizerMetricsProvider;", "", "getWakeWordModelAttempted", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "getWakeWordModelSuccess", "modelVersion", "", "getWakeWordModelFailed", "error", "pryonLiteSetupAttempted", "pryonLiteSetupFailed", "prepareWakeWordAudioSessionAttempted", "prepareWakeWordAudioSessionFailed", "wakeWordDetected", "wakeWord", "wakeWordDetectedValid", "wakeWordDetectedWithEmptyMetadata", "wakeWordDetectedDisabledWakeWord", "wakeWordDetectedFailBadCircularBuffer", "reason", "notEnoughPrerollInsufficientStartIndex", "notEnoughPrerollInsufficientBytesFromTracker", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WakeWordRecognizerMetricsProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ MetricMetadata getWakeWordModelFailed$default(WakeWordRecognizerMetricsProvider wakeWordRecognizerMetricsProvider, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: getWakeWordModelFailed");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return wakeWordRecognizerMetricsProvider.getWakeWordModelFailed(str);
        }

        public static /* synthetic */ MetricMetadata getWakeWordModelSuccess$default(WakeWordRecognizerMetricsProvider wakeWordRecognizerMetricsProvider, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: getWakeWordModelSuccess");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return wakeWordRecognizerMetricsProvider.getWakeWordModelSuccess(str);
        }

        public static /* synthetic */ MetricMetadata prepareWakeWordAudioSessionFailed$default(WakeWordRecognizerMetricsProvider wakeWordRecognizerMetricsProvider, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: prepareWakeWordAudioSessionFailed");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return wakeWordRecognizerMetricsProvider.prepareWakeWordAudioSessionFailed(str);
        }

        public static /* synthetic */ MetricMetadata pryonLiteSetupFailed$default(WakeWordRecognizerMetricsProvider wakeWordRecognizerMetricsProvider, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: pryonLiteSetupFailed");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return wakeWordRecognizerMetricsProvider.pryonLiteSetupFailed(str);
        }

        public static /* synthetic */ MetricMetadata wakeWordDetectedFailBadCircularBuffer$default(WakeWordRecognizerMetricsProvider wakeWordRecognizerMetricsProvider, String str, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: wakeWordDetectedFailBadCircularBuffer");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return wakeWordRecognizerMetricsProvider.wakeWordDetectedFailBadCircularBuffer(str);
        }
    }

    @NotNull
    MetricMetadata getWakeWordModelAttempted();

    @NotNull
    MetricMetadata getWakeWordModelFailed(@Nullable String error);

    @NotNull
    MetricMetadata getWakeWordModelSuccess(@Nullable String modelVersion);

    @NotNull
    MetricMetadata notEnoughPrerollInsufficientBytesFromTracker();

    @NotNull
    MetricMetadata notEnoughPrerollInsufficientStartIndex();

    @NotNull
    MetricMetadata prepareWakeWordAudioSessionAttempted();

    @NotNull
    MetricMetadata prepareWakeWordAudioSessionFailed(@Nullable String error);

    @NotNull
    MetricMetadata pryonLiteSetupAttempted();

    @NotNull
    MetricMetadata pryonLiteSetupFailed(@Nullable String error);

    @NotNull
    MetricMetadata wakeWordDetected(@NotNull String wakeWord);

    @NotNull
    MetricMetadata wakeWordDetectedDisabledWakeWord(@NotNull String wakeWord);

    @NotNull
    MetricMetadata wakeWordDetectedFailBadCircularBuffer(@Nullable String reason);

    @NotNull
    MetricMetadata wakeWordDetectedValid(@NotNull String wakeWord);

    @NotNull
    MetricMetadata wakeWordDetectedWithEmptyMetadata(@NotNull String wakeWord);
}
