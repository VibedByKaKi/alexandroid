package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.domain.model.InCallExperienceEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/InCallExperienceRepository;", "", "checkIfRttEnabled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInCallExperienceEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "updateOptInPreference", "", "isOptedIn", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface InCallExperienceRepository {
    @Nullable
    Object checkIfRttEnabled(@NotNull Continuation<? super Boolean> continuation);

    @NotNull
    Flow<InCallExperienceEvent> getInCallExperienceEvents();

    @Nullable
    Object updateOptInPreference(boolean z, @NotNull Continuation<? super Unit> continuation);
}
