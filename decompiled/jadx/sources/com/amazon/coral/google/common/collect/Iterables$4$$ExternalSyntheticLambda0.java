package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.base.Function;
import com.amazon.coral.google.common.base.Predicate;
import com.amazon.coral.google.common.collect.CollectSpliterators;
import com.amazon.coral.google.common.collect.Collections2;
import com.amazon.coral.google.common.collect.Iterables;
import com.amazon.coral.google.common.collect.Maps;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class Iterables$4$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Iterables$4$$ExternalSyntheticLambda0(Consumer consumer, Function function) {
        this.$r8$classId = 5;
        this.f$1 = consumer;
        this.f$0 = function;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Iterables.AnonymousClass4.lambda$forEach$0((Predicate) this.f$0, (Consumer) this.f$1, obj);
                break;
            case 1:
                ((CollectSpliterators.FlatMapSpliterator) this.f$0).lambda$forEachRemaining$1((Consumer) this.f$1, obj);
                break;
            case 2:
                ((CollectSpliterators.FlatMapSpliteratorOfPrimitive) this.f$0).lambda$forEachRemaining$1(this.f$1, obj);
                break;
            case 3:
                ((Collections2.FilteredCollection) this.f$0).lambda$forEach$0((Consumer) this.f$1, obj);
                break;
            case 4:
                ((Collections2.TransformedCollection) this.f$0).lambda$forEach$0((Consumer) this.f$1, obj);
                break;
            case 5:
                Iterables.AnonymousClass5.lambda$forEach$0((Consumer) this.f$1, (Function) this.f$0, obj);
                break;
            case 6:
                ((Maps.AsMapView) this.f$0).lambda$forEach$0((BiConsumer) this.f$1, obj);
                break;
            default:
                ((Maps.NavigableAsMapView) this.f$0).lambda$forEach$1((BiConsumer) this.f$1, obj);
                break;
        }
    }

    public /* synthetic */ Iterables$4$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
