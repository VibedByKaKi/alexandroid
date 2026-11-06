package com.amazon.alexa.assistant.foundation.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/IntentClassifierMetricsListener;", "", "onModelLoadFailed", "", "reason", "", "onModelLoadLatency", "elapsedMs", "", "onInferenceFailed", "onInferenceLatency", "onConfidenceBucket", "bucket", "NoOp", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface IntentClassifierMetricsListener {
    void onConfidenceBucket(@NotNull String bucket);

    void onInferenceFailed(@NotNull String reason);

    void onInferenceLatency(long elapsedMs);

    void onModelLoadFailed(@NotNull String reason);

    void onModelLoadLatency(long elapsedMs);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/IntentClassifierMetricsListener$NoOp;", "Lcom/amazon/alexa/assistant/foundation/model/IntentClassifierMetricsListener;", "<init>", "()V", "onModelLoadFailed", "", "reason", "", "onModelLoadLatency", "elapsedMs", "", "onInferenceFailed", "onInferenceLatency", "onConfidenceBucket", "bucket", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoOp implements IntentClassifierMetricsListener {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.amazon.alexa.assistant.foundation.model.IntentClassifierMetricsListener
        public void onConfidenceBucket(@NotNull String bucket) {
            bucket.getClass();
        }

        @Override // com.amazon.alexa.assistant.foundation.model.IntentClassifierMetricsListener
        public void onInferenceFailed(@NotNull String reason) {
            reason.getClass();
        }

        @Override // com.amazon.alexa.assistant.foundation.model.IntentClassifierMetricsListener
        public void onModelLoadFailed(@NotNull String reason) {
            reason.getClass();
        }

        @Override // com.amazon.alexa.assistant.foundation.model.IntentClassifierMetricsListener
        public void onInferenceLatency(long elapsedMs) {
        }

        @Override // com.amazon.alexa.assistant.foundation.model.IntentClassifierMetricsListener
        public void onModelLoadLatency(long elapsedMs) {
        }
    }
}
