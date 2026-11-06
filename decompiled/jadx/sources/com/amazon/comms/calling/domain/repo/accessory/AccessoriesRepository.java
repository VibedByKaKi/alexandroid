package com.amazon.comms.calling.domain.repo.accessory;

import com.amazon.comms.calling.domain.model.pcc.ATCommandType;
import com.amazon.comms.calling.foundation.metrics.providers.CallingMetricsParams;
import com.amazon.comms.calling.infrastructure.AccessoriesEvent;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J2\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/accessory/AccessoriesRepository;", "", "subscribeToAccessories", "", "shouldDowngradeToAudioOnly", "", "isHFPPCCCompliantAccessorySessionAvailable", "isA2DPPCCCompliantAccessorySessionAvailable", "isHFPConnectionAvailable", "isA2DPConnectionAvailable", "forwardATCommand", "atCommand", "Lcom/amazon/comms/calling/domain/model/pcc/ATCommandType;", "(Lcom/amazon/comms/calling/domain/model/pcc/ATCommandType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "areAccessoriesConnected", "getAccessoriesEventChannel", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/infrastructure/AccessoriesEvent;", "recordPCCMetric", ShortcutConstants.METRIC_NAME_KEY, "", "success", "error", "callingMetricsParams", "Lcom/amazon/comms/calling/foundation/metrics/providers/CallingMetricsParams;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface AccessoriesRepository {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void recordPCCMetric$default(AccessoriesRepository accessoriesRepository, String str, boolean z, String str2, CallingMetricsParams callingMetricsParams, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: recordPCCMetric");
                return;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                callingMetricsParams = null;
            }
            accessoriesRepository.recordPCCMetric(str, z, str2, callingMetricsParams);
        }
    }

    boolean areAccessoriesConnected();

    @Nullable
    Object forwardATCommand(@NotNull ATCommandType aTCommandType, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    Flow<AccessoriesEvent> getAccessoriesEventChannel();

    boolean isA2DPConnectionAvailable();

    boolean isA2DPPCCCompliantAccessorySessionAvailable();

    boolean isHFPConnectionAvailable();

    boolean isHFPPCCCompliantAccessorySessionAvailable();

    void recordPCCMetric(@NotNull String metricName, boolean success, @Nullable String error, @Nullable CallingMetricsParams callingMetricsParams);

    boolean shouldDowngradeToAudioOnly();

    void subscribeToAccessories();
}
