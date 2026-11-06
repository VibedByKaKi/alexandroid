package com.amazon.comms.calling.data.dataSource;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/InitiateCallDataSource;", "", "initiateCallEventsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;", "update", "", "event", "(Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface InitiateCallDataSource {
    @NotNull
    Flow<InitiateCallEvent> initiateCallEventsFlow();

    @Nullable
    Object update(@NotNull InitiateCallEvent initiateCallEvent, @NotNull Continuation<? super Unit> continuation);
}
