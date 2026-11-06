package com.amazon.alexa.client.alexaservice.vad;

import ai.onnxruntime.OrtEnvironment;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class OnnxRuntimeEnvironment$$ExternalSyntheticLambda1 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return OrtEnvironment.getEnvironment();
    }
}
