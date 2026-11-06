package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Traverser$$ExternalSyntheticLambda0 implements Iterable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Traverser f$0;
    public final /* synthetic */ ImmutableSet f$1;

    public /* synthetic */ Traverser$$ExternalSyntheticLambda0(Traverser traverser, ImmutableSet immutableSet, int i) {
        this.$r8$classId = i;
        this.f$0 = traverser;
        this.f$1 = immutableSet;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator lambda$depthFirstPreOrder$0;
        Iterator lambda$breadthFirst$0;
        Iterator lambda$depthFirstPostOrder$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$depthFirstPreOrder$0 = this.f$0.lambda$depthFirstPreOrder$0(this.f$1);
                return lambda$depthFirstPreOrder$0;
            case 1:
                lambda$breadthFirst$0 = this.f$0.lambda$breadthFirst$0(this.f$1);
                return lambda$breadthFirst$0;
            default:
                lambda$depthFirstPostOrder$0 = this.f$0.lambda$depthFirstPostOrder$0(this.f$1);
                return lambda$depthFirstPostOrder$0;
        }
    }
}
