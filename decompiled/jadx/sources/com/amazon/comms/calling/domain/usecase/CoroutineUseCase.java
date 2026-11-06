package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.log.CommsLogger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0086B¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0000H¤@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "P", "R", "", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "kotlin.jvm.PlatformType", "Lcom/amazon/comms/log/CommsLogger;", "invoke", "Lcom/amazon/deecomms/calling/api/Result;", "parameters", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class CoroutineUseCase<P, R> {
    private final CommsLogger LOG;

    @NotNull
    private final CoroutineDispatcher coroutineDispatcher;

    public CoroutineUseCase(@NotNull CoroutineDispatcher coroutineDispatcher) {
        coroutineDispatcher.getClass();
        this.coroutineDispatcher = coroutineDispatcher;
        this.LOG = CommsLogger.getLogger(Constants.LOG_TAG, "CoroutineUseCase");
    }

    @Nullable
    public abstract Object execute(P p, @NotNull Continuation<? super R> continuation) throws RuntimeException;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(P r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.amazon.deecomms.calling.api.Result<R>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.comms.calling.domain.usecase.CoroutineUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.comms.calling.domain.usecase.CoroutineUseCase$invoke$1 r0 = (com.amazon.comms.calling.domain.usecase.CoroutineUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.domain.usecase.CoroutineUseCase$invoke$1 r0 = new com.amazon.comms.calling.domain.usecase.CoroutineUseCase$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            com.amazon.comms.calling.domain.usecase.CoroutineUseCase r5 = (com.amazon.comms.calling.domain.usecase.CoroutineUseCase) r5
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L2d
            goto L4c
        L2d:
            r6 = move-exception
            goto L4f
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = r5.coroutineDispatcher     // Catch: java.lang.Exception -> L2d
            com.amazon.comms.calling.domain.usecase.CoroutineUseCase$invoke$2 r2 = new com.amazon.comms.calling.domain.usecase.CoroutineUseCase$invoke$2     // Catch: java.lang.Exception -> L2d
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r5     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)     // Catch: java.lang.Exception -> L2d
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.amazon.deecomms.calling.api.Result r7 = (com.amazon.deecomms.calling.api.Result) r7     // Catch: java.lang.Exception -> L2d
            return r7
        L4f:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L7f
            com.amazon.comms.log.CommsLogger r7 = r5.LOG
            java.lang.Class r5 = r5.getClass()
            kotlin.reflect.KClass r5 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r5)
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r0 = r6.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CancellationException Exception in use case <"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = ">: "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            r7.w(r5)
            goto L96
        L7f:
            com.amazon.comms.log.CommsLogger r5 = r5.LOG
            java.lang.String r7 = r6.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in use case: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r5.w(r7)
        L96:
            com.amazon.deecomms.calling.api.Result$Error r5 = new com.amazon.deecomms.calling.api.Result$Error
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.domain.usecase.CoroutineUseCase.invoke(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
