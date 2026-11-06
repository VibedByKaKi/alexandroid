package com.amazon.alexa.assistant.voicechat.detector;

import ai.onnxruntime.OrtEnvironment;
import android.system.Os;
import com.amazon.alexa.assistant.transport.TransportClientBuilder$$ExternalSyntheticLambda2;
import com.amazon.alexa.pmi.implementation.pmi.Timeline$$ExternalSyntheticLambda0;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/detector/OnnxRuntimeEnvironment;", "", "<init>", "()V", "DISABLE_TELEMETRY_ENV", "", "provider", "Lcom/amazon/alexa/assistant/voicechat/detector/TelemetryDisabledProvider;", "Lai/onnxruntime/OrtEnvironment;", "kotlin.jvm.PlatformType", MetricsConstants.Method.CACHE_GET, "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OnnxRuntimeEnvironment {

    @NotNull
    public static final String DISABLE_TELEMETRY_ENV = "ORT_DISABLE_TELEMETRY";

    @NotNull
    public static final OnnxRuntimeEnvironment INSTANCE = new OnnxRuntimeEnvironment();

    @NotNull
    private static final TelemetryDisabledProvider<OrtEnvironment> provider = new TelemetryDisabledProvider<>(new TransportClientBuilder$$ExternalSyntheticLambda2(16), new TransportClientBuilder$$ExternalSyntheticLambda2(17), new Timeline$$ExternalSyntheticLambda0(16));

    private OnnxRuntimeEnvironment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provider$lambda$0() {
        Os.setenv(DISABLE_TELEMETRY_ENV, "1", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provider$lambda$2(OrtEnvironment ortEnvironment) {
        ortEnvironment.setTelemetry(false);
        return Unit.INSTANCE;
    }

    @NotNull
    public final OrtEnvironment get() {
        OrtEnvironment ortEnvironment = provider.get();
        ortEnvironment.getClass();
        return ortEnvironment;
    }
}
