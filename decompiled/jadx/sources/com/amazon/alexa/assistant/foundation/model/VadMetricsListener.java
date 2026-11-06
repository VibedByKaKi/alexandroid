package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/VadMetricsListener;", "", "onInitializationLatency", "", "elapsedMs", "", SmartFragmentContent.RUNTIME, "", "onStartFailed", "reason", "onModelFileNotFound", "onFailedToLoadModel", "onProcessingError", "NoOp", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VadMetricsListener {
    void onFailedToLoadModel();

    void onInitializationLatency(long elapsedMs, @Nullable String runtime);

    void onModelFileNotFound();

    void onProcessingError(@Nullable String runtime);

    void onStartFailed(@NotNull String reason);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/VadMetricsListener$NoOp;", "Lcom/amazon/alexa/assistant/foundation/model/VadMetricsListener;", "<init>", "()V", "onInitializationLatency", "", "elapsedMs", "", SmartFragmentContent.RUNTIME, "", "onStartFailed", "reason", "onModelFileNotFound", "onFailedToLoadModel", "onProcessingError", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoOp implements VadMetricsListener {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.amazon.alexa.assistant.foundation.model.VadMetricsListener
        public void onStartFailed(@NotNull String reason) {
            reason.getClass();
        }

        @Override // com.amazon.alexa.assistant.foundation.model.VadMetricsListener
        public void onFailedToLoadModel() {
        }

        @Override // com.amazon.alexa.assistant.foundation.model.VadMetricsListener
        public void onModelFileNotFound() {
        }

        @Override // com.amazon.alexa.assistant.foundation.model.VadMetricsListener
        public void onProcessingError(@Nullable String runtime) {
        }

        @Override // com.amazon.alexa.assistant.foundation.model.VadMetricsListener
        public void onInitializationLatency(long elapsedMs, @Nullable String runtime) {
        }
    }
}
