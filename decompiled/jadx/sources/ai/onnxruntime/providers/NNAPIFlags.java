package ai.onnxruntime.providers;

import ai.onnxruntime.OrtFlags;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum NNAPIFlags implements OrtFlags {
    USE_FP16(1),
    USE_NCHW(2),
    CPU_DISABLED(4),
    CPU_ONLY(8);

    public final int value;

    NNAPIFlags(int i) {
        this.value = i;
    }

    @Override // ai.onnxruntime.OrtFlags
    public int getValue() {
        return this.value;
    }
}
