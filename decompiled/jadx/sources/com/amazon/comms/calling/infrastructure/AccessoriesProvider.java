package com.amazon.comms.calling.infrastructure;

import com.amazon.comms.calling.domain.model.pcc.ATCommandType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&R\u0018\u0010\b\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/AccessoriesProvider;", "", "subscribeToAccessories", "", "isInCarAccessoryConnected", "", "areAccessoriesConnected", "isHFPConnectionAvailable", "isA2DPConnectionAvailable", "()Z", "setA2DPConnectionAvailable", "(Z)V", "forwardATCommand", "atCommand", "Lcom/amazon/comms/calling/domain/model/pcc/ATCommandType;", "(Lcom/amazon/comms/calling/domain/model/pcc/ATCommandType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccessoriesEventChannel", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/infrastructure/AccessoriesEvent;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface AccessoriesProvider {
    boolean areAccessoriesConnected();

    @Nullable
    Object forwardATCommand(@NotNull ATCommandType aTCommandType, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    /* renamed from: getAccessoriesEventChannel */
    Flow<AccessoriesEvent> mo20762getAccessoriesEventChannel();

    boolean isA2DPConnectionAvailable();

    boolean isHFPConnectionAvailable();

    boolean isInCarAccessoryConnected();

    void setA2DPConnectionAvailable(boolean z);

    void subscribeToAccessories();
}
