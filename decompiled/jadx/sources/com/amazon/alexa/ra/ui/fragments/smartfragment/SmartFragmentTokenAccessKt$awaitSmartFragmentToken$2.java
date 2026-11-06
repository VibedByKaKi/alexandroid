package com.amazon.alexa.ra.ui.fragments.smartfragment;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentTokenAccessKt$awaitSmartFragmentToken$2", f = "SmartFragmentTokenAccess.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes19.dex */
public final class SmartFragmentTokenAccessKt$awaitSmartFragmentToken$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    public SmartFragmentTokenAccessKt$awaitSmartFragmentToken$2(Continuation<? super SmartFragmentTokenAccessKt$awaitSmartFragmentToken$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartFragmentTokenAccessKt$awaitSmartFragmentToken$2 smartFragmentTokenAccessKt$awaitSmartFragmentToken$2 = new SmartFragmentTokenAccessKt$awaitSmartFragmentToken$2(continuation);
        smartFragmentTokenAccessKt$awaitSmartFragmentToken$2.Z$0 = ((Boolean) obj).booleanValue();
        return smartFragmentTokenAccessKt$awaitSmartFragmentToken$2;
    }

    public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
        return ((SmartFragmentTokenAccessKt$awaitSmartFragmentToken$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.Z$0);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }
}
