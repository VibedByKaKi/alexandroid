package com.amazon.alexa.ra.features.featurecheck;

import com.amazon.alexa.ra.core.features.featurecheck.FeatureState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/amazon/alexa/ra/core/features/featurecheck/FeatureState;", "allEnabled", "", "flagState"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.features.featurecheck.CompositeFeatureRule$featureState$1", f = "FeatureFlag.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes18.dex */
public final class CompositeFeatureRule$featureState$1 extends SuspendLambda implements Function3<Boolean, FeatureState, Continuation<? super FeatureState>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public CompositeFeatureRule$featureState$1(Continuation<? super CompositeFeatureRule$featureState$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(boolean z, FeatureState featureState, Continuation<? super FeatureState> continuation) {
        CompositeFeatureRule$featureState$1 compositeFeatureRule$featureState$1 = new CompositeFeatureRule$featureState$1(continuation);
        compositeFeatureRule$featureState$1.Z$0 = z;
        compositeFeatureRule$featureState$1.L$0 = featureState;
        return compositeFeatureRule$featureState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.Z$0 ? (FeatureState) this.L$0 : FeatureState.Disabled.INSTANCE;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, FeatureState featureState, Continuation<? super FeatureState> continuation) {
        return invoke(bool.booleanValue(), featureState, continuation);
    }
}
