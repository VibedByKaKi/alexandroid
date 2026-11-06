package com.amazon.alexa.assistant.voicechat.detector;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/detector/VadInferenceResult;", "", "probability", "", "updatedState", "", "<init>", "(F[F)V", "getProbability", "()F", "getUpdatedState", "()[F", "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VadInferenceResult {
    private final float probability;

    @NotNull
    private final float[] updatedState;

    public VadInferenceResult(float f, @NotNull float[] fArr) {
        fArr.getClass();
        this.probability = f;
        this.updatedState = fArr;
    }

    public final float getProbability() {
        return this.probability;
    }

    @NotNull
    public final float[] getUpdatedState() {
        return this.updatedState;
    }
}
