package org.apache.commons.lang3.function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FailableFunction$$ExternalSyntheticLambda0 implements FailableFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FailableFunction f$0;
    public final /* synthetic */ FailableFunction f$1;

    public /* synthetic */ FailableFunction$$ExternalSyntheticLambda0(FailableFunction failableFunction, FailableFunction failableFunction2, int i) {
        this.$r8$classId = i;
        this.f$0 = failableFunction;
        this.f$1 = failableFunction2;
    }

    @Override // org.apache.commons.lang3.function.FailableFunction
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return FailableFunction.$r8$lambda$8gHwzN5myLiBMBsGs74SR6Y67VM(obj, this.f$0, this.f$1);
            default:
                return FailableFunction.$r8$lambda$okflFqjUv6SAE5OVSWNwTX3EHNc(obj, this.f$0, this.f$1);
        }
    }
}
