package com.google.common.graph;

import com.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AbstractNetwork$$ExternalSyntheticLambda7 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Network f$0;

    public /* synthetic */ AbstractNetwork$$ExternalSyntheticLambda7(Network network, int i) {
        this.$r8$classId = i;
        this.f$0 = network;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Object lambda$sourceNodeFn$0;
        Object lambda$targetNodeFn$0;
        int i = this.$r8$classId;
        Network network = this.f$0;
        switch (i) {
            case 0:
                return network.incidentNodes(obj);
            case 1:
                lambda$sourceNodeFn$0 = ImmutableNetwork.lambda$sourceNodeFn$0(network, obj);
                return lambda$sourceNodeFn$0;
            default:
                lambda$targetNodeFn$0 = ImmutableNetwork.lambda$targetNodeFn$0(network, obj);
                return lambda$targetNodeFn$0;
        }
    }
}
