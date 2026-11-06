package com.amazon.alexa.assistant.voicechat.detector;

import com.amazon.alexa.assistant.foundation.model.VadMetricsListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public /* synthetic */ class SileroVadModel$initialize$bytes$2 extends FunctionReferenceImpl implements Function0<Unit> {
    public SileroVadModel$initialize$bytes$2(Object obj) {
        super(0, obj, VadMetricsListener.class, "onFailedToLoadModel", "onFailedToLoadModel()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VadMetricsListener) this.receiver).onFailedToLoadModel();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
