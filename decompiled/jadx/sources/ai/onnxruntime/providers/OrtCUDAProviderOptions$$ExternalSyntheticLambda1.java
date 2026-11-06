package ai.onnxruntime.providers;

import ai.onnxruntime.OrtProviderOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class OrtCUDAProviderOptions$$ExternalSyntheticLambda1 implements OrtProviderOptions.OrtProviderSupplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OrtCUDAProviderOptions$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // ai.onnxruntime.OrtProviderOptions.OrtProviderSupplier
    public final long create() {
        long lambda$new$0;
        long lambda$new$02;
        switch (this.$r8$classId) {
            case 0:
                lambda$new$0 = OrtCUDAProviderOptions.lambda$new$0();
                return lambda$new$0;
            default:
                lambda$new$02 = OrtTensorRTProviderOptions.lambda$new$0();
                return lambda$new$02;
        }
    }
}
