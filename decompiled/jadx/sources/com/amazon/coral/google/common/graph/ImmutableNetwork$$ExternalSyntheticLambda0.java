package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class ImmutableNetwork$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Network f$0;

    public /* synthetic */ ImmutableNetwork$$ExternalSyntheticLambda0(Network network, int i) {
        this.$r8$classId = i;
        this.f$0 = network;
    }

    @Override // com.amazon.coral.google.common.base.Function, java.util.function.Function
    public final Object apply(Object obj) {
        Object lambda$sourceNodeFn$0;
        Object lambda$targetNodeFn$1;
        int i = this.$r8$classId;
        Network network = this.f$0;
        switch (i) {
            case 0:
                lambda$sourceNodeFn$0 = ImmutableNetwork.lambda$sourceNodeFn$0(network, obj);
                return lambda$sourceNodeFn$0;
            default:
                lambda$targetNodeFn$1 = ImmutableNetwork.lambda$targetNodeFn$1(network, obj);
                return lambda$targetNodeFn$1;
        }
    }
}
