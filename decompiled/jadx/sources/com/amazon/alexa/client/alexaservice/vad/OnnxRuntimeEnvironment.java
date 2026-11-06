package com.amazon.alexa.client.alexaservice.vad;

import ai.onnxruntime.OrtEnvironment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class OnnxRuntimeEnvironment {
    static final String DISABLE_TELEMETRY_ENV = "ORT_DISABLE_TELEMETRY";
    private static final TelemetryDisabledProvider<OrtEnvironment> PROVIDER = new TelemetryDisabledProvider<>(new VADModule$$ExternalSyntheticLambda0(), new OnnxRuntimeEnvironment$$ExternalSyntheticLambda1(), new VADModule$$ExternalSyntheticLambda0());
    private static final String TAG = "OnnxRuntimeEnvironment";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static final class TelemetryDisabledProvider<T> {
        private final ThrowingConsumer<T> disableEvents;
        private final ThrowingRunnable disableForProcess;
        private final Supplier<T> environmentSupplier;
        private boolean telemetryDisabled;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface ThrowingConsumer<T> {
            void accept(T t) throws Exception;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface ThrowingRunnable {
            void run() throws Exception;
        }

        public TelemetryDisabledProvider(@NonNull ThrowingRunnable throwingRunnable, @NonNull Supplier<T> supplier, @NonNull ThrowingConsumer<T> throwingConsumer) {
            this.disableForProcess = throwingRunnable;
            this.environmentSupplier = supplier;
            this.disableEvents = throwingConsumer;
        }

        @NonNull
        public synchronized T get() {
            T t;
            if (!this.telemetryDisabled) {
                try {
                    this.disableForProcess.run();
                } catch (Exception | LinkageError e) {
                    Log.w(OnnxRuntimeEnvironment.TAG, "Failed to set ORT_DISABLE_TELEMETRY", e);
                }
            }
            t = this.environmentSupplier.get();
            if (!this.telemetryDisabled) {
                try {
                    this.disableEvents.accept(t);
                } catch (Exception e2) {
                    Log.w(OnnxRuntimeEnvironment.TAG, "Failed to disable ONNX Runtime telemetry events", e2);
                }
                this.telemetryDisabled = true;
            }
            return t;
        }
    }

    private OnnxRuntimeEnvironment() {
    }

    @NonNull
    public static OrtEnvironment get() {
        return PROVIDER.get();
    }
}
