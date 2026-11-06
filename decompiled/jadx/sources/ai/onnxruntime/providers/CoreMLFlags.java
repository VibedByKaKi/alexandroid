package ai.onnxruntime.providers;

import ai.onnxruntime.OrtFlags;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum CoreMLFlags implements OrtFlags {
    CPU_ONLY(1),
    ENABLE_ON_SUBGRAPH(2),
    ONLY_ENABLE_DEVICE_WITH_ANE(4),
    ONLY_ALLOW_STATIC_INPUT_SHAPES(8),
    CREATE_MLPROGRAM(16),
    CPU_AND_GPU(32);

    public final int value;

    CoreMLFlags(int i) {
        this.value = i;
    }

    @Override // ai.onnxruntime.OrtFlags
    public int getValue() {
        return this.value;
    }
}
