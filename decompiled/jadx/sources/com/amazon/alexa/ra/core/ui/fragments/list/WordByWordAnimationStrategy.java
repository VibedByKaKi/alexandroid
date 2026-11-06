package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\u000fH\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/list/WordByWordAnimationStrategy;", "Lcom/amazon/alexa/ra/core/ui/fragments/list/AnimationStrategy;", "<init>", "()V", "delimiter", "Lkotlin/text/Regex;", "animate", "", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "finalText", "", "duration", "", "onTextUpdated", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedText", "(ILjava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class WordByWordAnimationStrategy implements AnimationStrategy {

    @NotNull
    public static final WordByWordAnimationStrategy INSTANCE = new WordByWordAnimationStrategy();

    @NotNull
    private static final Regex delimiter = new Regex("\\s+");
    public static final int $stable = 8;

    private WordByWordAnimationStrategy() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.amazon.alexa.ra.core.ui.fragments.list.AnimationStrategy
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object animate(int r6, @org.jetbrains.annotations.NotNull java.lang.String r7, long r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof com.amazon.alexa.ra.core.ui.fragments.list.WordByWordAnimationStrategy$animate$1
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.alexa.ra.core.ui.fragments.list.WordByWordAnimationStrategy$animate$1 r0 = (com.amazon.alexa.ra.core.ui.fragments.list.WordByWordAnimationStrategy$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.ra.core.ui.fragments.list.WordByWordAnimationStrategy$animate$1 r0 = new com.amazon.alexa.ra.core.ui.fragments.list.WordByWordAnimationStrategy$animate$1
            r0.<init>(r5, r11)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 != r2) goto L39
            int r6 = r0.I$0
            long r7 = r0.J$0
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r5)
            r4 = r10
            r10 = r9
            r8 = r7
            r7 = r4
            goto L43
        L39:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L40:
            kotlin.ResultKt.throwOnFailure(r5)
        L43:
            int r5 = r7.length()
            if (r6 >= r5) goto L86
            kotlin.text.Regex r5 = com.amazon.alexa.ra.core.ui.fragments.list.WordByWordAnimationStrategy.delimiter
            kotlin.text.MatchResult r5 = r5.find(r7, r6)
            if (r5 == 0) goto L5d
            kotlin.ranges.IntRange r5 = r5.getRange()
            if (r5 == 0) goto L5d
            int r5 = r5.getLast()
            int r5 = r5 + r2
            goto L61
        L5d:
            int r5 = r7.length()
        L61:
            int r6 = r7.length()
            if (r5 >= r6) goto L70
            r6 = 0
            java.lang.String r6 = r7.substring(r6, r5)
            r10.invoke(r6)
            goto L73
        L70:
            r10.invoke(r7)
        L73:
            r0.L$0 = r7
            r0.L$1 = r10
            r0.J$0 = r8
            r0.I$0 = r5
            r0.label = r2
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r8, r0)
            if (r6 != r11) goto L84
            return r11
        L84:
            r6 = r5
            goto L43
        L86:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.ui.fragments.list.WordByWordAnimationStrategy.animate(int, java.lang.String, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
