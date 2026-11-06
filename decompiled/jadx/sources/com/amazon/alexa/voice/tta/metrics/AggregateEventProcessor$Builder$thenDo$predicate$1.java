package com.amazon.alexa.voice.tta.metrics;

import com.amazon.alexa.voice.ui.tta.metrics.TtaEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes19.dex */
public final class AggregateEventProcessor$Builder$thenDo$predicate$1<T> implements Function1<T, Boolean> {
    public static final AggregateEventProcessor$Builder$thenDo$predicate$1 INSTANCE = new AggregateEventProcessor$Builder$thenDo$predicate$1();

    /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(TtaEvent ttaEvent) {
        ttaEvent.getClass();
        return Boolean.TRUE;
    }
}
