package com.amazon.alexa.assistant;

import com.amazon.alexa.assistant.foundation.time.DefaultTimeProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public /* synthetic */ class AssistantBuilder$build$19 extends FunctionReferenceImpl implements Function0<Long> {
    public AssistantBuilder$build$19(Object obj) {
        super(0, obj, DefaultTimeProvider.class, "elapsedRealtimeMillis", "elapsedRealtimeMillis()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((DefaultTimeProvider) this.receiver).elapsedRealtimeMillis());
    }
}
