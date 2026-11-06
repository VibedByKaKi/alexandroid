package com.amazon.comms.calling.domain.usecase;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.model.InCallExperienceEvent;
import com.amazon.comms.calling.domain.repo.InCallExperienceRepository;
import com.amazon.deecomms.calling.api.Result;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.apache.commons.net.nntp.NNTPReply;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/GetInCallExperienceUseCase;", "Lcom/amazon/comms/calling/domain/usecase/FlowUseCase;", "", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "inCallExperienceRepository", "Lcom/amazon/comms/calling/domain/repo/InCallExperienceRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/InCallExperienceRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/deecomms/calling/api/Result;", "parameters", "(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetInCallExperienceUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetInCallExperienceUseCase.kt\ncom/amazon/comms/calling/domain/usecase/GetInCallExperienceUseCase\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,22:1\n47#2:23\n49#2:27\n50#3:24\n55#3:26\n106#4:25\n*S KotlinDebug\n*F\n+ 1 GetInCallExperienceUseCase.kt\ncom/amazon/comms/calling/domain/usecase/GetInCallExperienceUseCase\n*L\n18#1:23\n18#1:27\n18#1:24\n18#1:26\n18#1:25\n*E\n"})
/* loaded from: classes20.dex */
public final class GetInCallExperienceUseCase extends FlowUseCase<Unit, InCallExperienceEvent> {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final InCallExperienceRepository inCallExperienceRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetInCallExperienceUseCase(@NotNull InCallExperienceRepository inCallExperienceRepository, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        inCallExperienceRepository.getClass();
        coroutineDispatcher.getClass();
        this.inCallExperienceRepository = inCallExperienceRepository;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // com.amazon.comms.calling.domain.usecase.FlowUseCase
    @NotNull
    public Flow<Result<InCallExperienceEvent>> execute(@NotNull Unit parameters) {
        parameters.getClass();
        final Flow<InCallExperienceEvent> inCallExperienceEvents = this.inCallExperienceRepository.getInCallExperienceEvents();
        return new Flow<Result.Success<InCallExperienceEvent>>() { // from class: com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GetInCallExperienceUseCase.kt\ncom/amazon/comms/calling/domain/usecase/GetInCallExperienceUseCase\n*L\n1#1,222:1\n48#2:223\n19#3:224\n*E\n"})
            /* renamed from: com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1$2", f = "GetInCallExperienceUseCase.kt", i = {}, l = {NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY}, m = "emit", n = {}, s = {})
                /* renamed from: com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1$2$1 r0 = (com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1$2$1 r0 = new com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L45
                    L29:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
                        r4 = 0
                        return r4
                    L30:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.$this_unsafeFlow
                        com.amazon.comms.calling.domain.model.InCallExperienceEvent r5 = (com.amazon.comms.calling.domain.model.InCallExperienceEvent) r5
                        com.amazon.deecomms.calling.api.Result$Success r6 = new com.amazon.deecomms.calling.api.Result$Success
                        r6.<init>(r5)
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r6, r0)
                        if (r4 != r1) goto L45
                        return r1
                    L45:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.domain.usecase.GetInCallExperienceUseCase$execute$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Result.Success<InCallExperienceEvent>> flowCollector, @NotNull Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }
}
