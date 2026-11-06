package com.google.common.collect;

import com.google.common.collect.CollectSpliterators;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CollectSpliterators.FlatMapSpliterator f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda0(CollectSpliterators.FlatMapSpliterator flatMapSpliterator, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = flatMapSpliterator;
        this.f$1 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$forEachRemaining$0((Consumer) this.f$1, obj);
                break;
            default:
                ((CollectSpliterators.FlatMapSpliteratorOfPrimitive) this.f$0).lambda$forEachRemaining$0(this.f$1, obj);
                break;
        }
    }
}
