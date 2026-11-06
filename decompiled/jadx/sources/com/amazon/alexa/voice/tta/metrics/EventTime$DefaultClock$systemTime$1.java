package com.amazon.alexa.voice.tta.metrics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public /* synthetic */ class EventTime$DefaultClock$systemTime$1 extends FunctionReferenceImpl implements Function0<Long> {
    public static final EventTime$DefaultClock$systemTime$1 INSTANCE = new EventTime$DefaultClock$systemTime$1();

    public EventTime$DefaultClock$systemTime$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
