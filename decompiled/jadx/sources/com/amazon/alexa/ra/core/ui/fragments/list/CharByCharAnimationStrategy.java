package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00050\rH\u0096@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/list/CharByCharAnimationStrategy;", "Lcom/amazon/alexa/ra/core/ui/fragments/list/AnimationStrategy;", "<init>", "()V", "animate", "", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "finalText", "", "duration", "", "onTextUpdated", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedText", "(ILjava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CharByCharAnimationStrategy implements AnimationStrategy {
    public static final int $stable = 0;

    @NotNull
    public static final CharByCharAnimationStrategy INSTANCE = new CharByCharAnimationStrategy();

    private CharByCharAnimationStrategy() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:10:0x0067). Please report as a decompilation issue!!! */
    @Override // com.amazon.alexa.ra.core.ui.fragments.list.AnimationStrategy
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object animate(int r5, @org.jetbrains.annotations.NotNull java.lang.String r6, long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof com.amazon.alexa.ra.core.ui.fragments.list.CharByCharAnimationStrategy$animate$1
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.alexa.ra.core.ui.fragments.list.CharByCharAnimationStrategy$animate$1 r0 = (com.amazon.alexa.ra.core.ui.fragments.list.CharByCharAnimationStrategy$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.ra.core.ui.fragments.list.CharByCharAnimationStrategy$animate$1 r0 = new com.amazon.alexa.ra.core.ui.fragments.list.CharByCharAnimationStrategy$animate$1
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L38
            int r5 = r0.I$1
            int r6 = r0.I$0
            long r7 = r0.J$0
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r1 = r0.L$0
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r4)
            r4 = r5
            goto L67
        L38:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L3f:
            kotlin.ResultKt.throwOnFailure(r4)
            int r4 = r6.length()
        L46:
            if (r5 >= r4) goto L6b
            int r1 = r5 + 1
            r3 = 0
            java.lang.String r1 = r6.substring(r3, r1)
            r9.invoke(r1)
            r0.L$0 = r6
            r0.L$1 = r9
            r0.J$0 = r7
            r0.I$0 = r5
            r0.I$1 = r4
            r0.label = r2
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r7, r0)
            if (r1 != r10) goto L65
            return r10
        L65:
            r1 = r6
            r6 = r5
        L67:
            int r5 = r6 + 1
            r6 = r1
            goto L46
        L6b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.fragments.list.CharByCharAnimationStrategy.animate(int, java.lang.String, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
