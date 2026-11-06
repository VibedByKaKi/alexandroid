package com.amazon.rtvi.capabilityagent.avs;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.api.compat.migration.sdk.SdkSelectionState;
import com.amazon.alexa.api.compat.migration.sdk.SdkType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.net.nntp.NNTPReply;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"isAssistantSdkActive", "", "assistantSdkGate", "Lkotlin/Function0;", "context", "Landroid/content/Context;", "assistantSdkUpdates", "Lkotlinx/coroutines/flow/Flow;", "RTVIAndroidAlexaAvsSdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActiveSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveSdk.kt\ncom/amazon/rtvi/capabilityagent/avs/ActiveSdkKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,58:1\n47#2:59\n49#2:63\n50#3:60\n55#3:62\n106#4:61\n*S KotlinDebug\n*F\n+ 1 ActiveSdk.kt\ncom/amazon/rtvi/capabilityagent/avs/ActiveSdkKt\n*L\n33#1:59\n33#1:63\n33#1:60\n33#1:62\n33#1:61\n*E\n"})
/* loaded from: classes13.dex */
public final class ActiveSdkKt {
    @NotNull
    public static final Function0<Boolean> assistantSdkGate(@NotNull Context context) {
        context.getClass();
        SdkSelectionState sdkSelectionState = SdkSelectionState.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        sdkSelectionState.initialize(applicationContext);
        return ActiveSdkKt$assistantSdkGate$1.INSTANCE;
    }

    @NotNull
    public static final Flow<Boolean> assistantSdkUpdates() {
        final StateFlow<SdkType> sdkType = SdkSelectionState.INSTANCE.getSdkType();
        return FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1

            /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ActiveSdk.kt\ncom/amazon/rtvi/capabilityagent/avs/ActiveSdkKt\n*L\n1#1,222:1\n48#2:223\n33#3:224\n*E\n"})
            /* renamed from: com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1$2", f = "ActiveSdk.kt", i = {}, l = {NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY}, m = "emit", n = {}, s = {})
                /* renamed from: com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1$2$1 r0 = (com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1$2$1 r0 = new com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L4b
                    L29:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
                        r4 = 0
                        return r4
                    L30:
                        kotlin.ResultKt.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.$this_unsafeFlow
                        com.amazon.alexa.api.compat.migration.sdk.SdkType r5 = (com.amazon.alexa.api.compat.migration.sdk.SdkType) r5
                        com.amazon.alexa.api.compat.migration.sdk.SdkType r6 = com.amazon.alexa.api.compat.migration.sdk.SdkType.ASSISTANT
                        if (r5 != r6) goto L3d
                        r5 = r3
                        goto L3e
                    L3d:
                        r5 = 0
                    L3e:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L4b
                        return r1
                    L4b:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.rtvi.capabilityagent.avs.ActiveSdkKt$assistantSdkUpdates$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        });
    }

    public static final boolean isAssistantSdkActive() {
        return SdkSelectionState.INSTANCE.getSdkType().getValue() == SdkType.ASSISTANT;
    }
}
