package com.amazon.comms.calling.infrastructure.extensions;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"applyWakelock", "", "Landroid/content/Context;", "tag", "", "cb", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class WakelockExtKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object applyWakelock(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof com.amazon.comms.calling.infrastructure.extensions.WakelockExtKt$applyWakelock$1
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.comms.calling.infrastructure.extensions.WakelockExtKt$applyWakelock$1 r0 = (com.amazon.comms.calling.infrastructure.extensions.WakelockExtKt$applyWakelock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.infrastructure.extensions.WakelockExtKt$applyWakelock$1 r0 = new com.amazon.comms.calling.infrastructure.extensions.WakelockExtKt$applyWakelock$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            android.os.PowerManager$WakeLock r6 = (android.os.PowerManager.WakeLock) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5c
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r6)
            r6 = 0
            return r6
        L34:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "power"
            java.lang.Object r6 = r6.getSystemService(r9)
            r6.getClass()
            android.os.PowerManager r6 = (android.os.PowerManager) r6
            android.os.PowerManager$WakeLock r6 = r6.newWakeLock(r3, r7)
            boolean r7 = r6.isHeld()
            if (r7 != 0) goto L51
            r4 = 18000(0x4650, double:8.893E-320)
            r6.acquire(r4)
        L51:
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r8.invoke(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r6.release()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.infrastructure.extensions.WakelockExtKt.applyWakelock(android.content.Context, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
