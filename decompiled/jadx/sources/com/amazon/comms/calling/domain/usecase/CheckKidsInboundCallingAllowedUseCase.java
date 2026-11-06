package com.amazon.comms.calling.domain.usecase;

import android.content.Context;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.dependency.IoDispatcher;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
import com.amazon.comms.calling.foundation.metrics.MetricsManager;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/CheckKidsInboundCallingAllowedUseCase;", "", "context", "Landroid/content/Context;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "identityServiceProvider", "Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;", "metricsManager", "Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lcom/amazon/comms/calling/data/util/Utils;Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "execute", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CheckKidsInboundCallingAllowedUseCase {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CheckKidsInboundCallingAllowedUseCase.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final Context context;

    @NotNull
    private final IdentityServiceProvider identityServiceProvider;

    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    @NotNull
    private final MetricsManager metricsManager;

    @NotNull
    private final Utils utils;

    @Inject
    public CheckKidsInboundCallingAllowedUseCase(@NotNull Context context, @NotNull Utils utils, @NotNull IdentityServiceProvider identityServiceProvider, @NotNull MetricsManager metricsManager, @IoDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        context.getClass();
        utils.getClass();
        identityServiceProvider.getClass();
        metricsManager.getClass();
        coroutineDispatcher.getClass();
        this.context = context;
        this.utils = utils;
        this.identityServiceProvider = identityServiceProvider;
        this.metricsManager = metricsManager;
        this.ioDispatcher = coroutineDispatcher;
        this.LOG = new CallingLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase$execute$1
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase$execute$1 r0 = (com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase$execute$1 r0 = new com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase$execute$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase r8 = (com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L57
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r8)
            r8 = 0
            return r8
        L34:
            kotlin.ResultKt.throwOnFailure(r9)
            com.amazon.comms.calling.data.util.Utils r9 = r8.utils
            boolean r9 = r9.isFireOS()
            if (r9 != 0) goto L44
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r8
        L44:
            kotlinx.coroutines.CoroutineDispatcher r9 = r8.ioDispatcher
            com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase$execute$isAllowed$1 r2 = new com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase$execute$isAllowed$1
            r4 = 0
            r2.<init>(r8, r4)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L73
            com.amazon.comms.log.CommsLogger r0 = r8.getLOG()
            java.lang.String r1 = "Amazon Kids has not granted inbound calling for this child profile"
            r0.i(r1)
            com.amazon.comms.calling.foundation.metrics.MetricsManager r2 = r8.metricsManager
            r6 = 6
            r7 = 0
            java.lang.String r3 = "comms.call.kids.inbound.calling.blocked"
            r4 = 0
            r5 = 0
            com.amazon.comms.calling.foundation.metrics.MetricsManager.DefaultImpls.recordCounterMetric$default(r2, r3, r4, r5, r6, r7)
        L73:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.domain.usecase.CheckKidsInboundCallingAllowedUseCase.execute(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
