package com.amazon.alexa.assistant.voicechat.detector;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/detector/VadModelRuntime;", "", "load", "", "modelBytes", "", "run", "Lcom/amazon/alexa/assistant/voicechat/detector/VadInferenceResult;", "input", "", "state", "close", "activeBackend", "", "getActiveBackend", "()Ljava/lang/String;", "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface VadModelRuntime {
    void close();

    @Nullable
    String getActiveBackend();

    void load(@NotNull byte[] modelBytes);

    @NotNull
    VadInferenceResult run(@NotNull float[] input, @NotNull float[] state);
}
