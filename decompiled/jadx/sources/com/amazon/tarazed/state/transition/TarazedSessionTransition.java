package com.amazon.tarazed.state.transition;

import com.amazon.tarazed.event.EventMetadata;
import com.amazon.tarazed.state.TarazedSessionState;
import com.amazon.tarazed.state.TarazedSessionStateEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u001bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/amazon/tarazed/state/transition/TarazedSessionTransition;", "", "event", "Lcom/amazon/tarazed/state/TarazedSessionStateEvent;", "getEvent", "()Lcom/amazon/tarazed/state/TarazedSessionStateEvent;", "fromState", "Lcom/amazon/tarazed/state/TarazedSessionState;", "getFromState", "()Lcom/amazon/tarazed/state/TarazedSessionState;", "maxTransitionDuration", "", "getMaxTransitionDuration", "()Ljava/lang/Integer;", "onTimeoutEvent", "getOnTimeoutEvent", "toState", "getToState", "onTimeoutCallback", "", "postTransitionHandler", "transitionScope", "Lkotlinx/coroutines/CoroutineScope;", "metadata", "Lcom/amazon/tarazed/event/EventMetadata;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/amazon/tarazed/event/EventMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preTransitionHandler", "(Lcom/amazon/tarazed/event/EventMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface TarazedSessionTransition {
    @NotNull
    TarazedSessionStateEvent getEvent();

    @NotNull
    TarazedSessionState getFromState();

    @Nullable
    Integer getMaxTransitionDuration();

    @Nullable
    TarazedSessionStateEvent getOnTimeoutEvent();

    @NotNull
    TarazedSessionState getToState();

    void onTimeoutCallback();

    @Nullable
    Object postTransitionHandler(@NotNull CoroutineScope coroutineScope, @NotNull EventMetadata eventMetadata, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object preTransitionHandler(@NotNull EventMetadata eventMetadata, @NotNull Continuation<? super Unit> continuation);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Integer getMaxTransitionDuration(@NotNull TarazedSessionTransition tarazedSessionTransition) {
            return null;
        }

        @Nullable
        public static TarazedSessionStateEvent getOnTimeoutEvent(@NotNull TarazedSessionTransition tarazedSessionTransition) {
            return null;
        }

        @Nullable
        public static Object preTransitionHandler(@NotNull TarazedSessionTransition tarazedSessionTransition, @NotNull EventMetadata eventMetadata, @NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        public static void onTimeoutCallback(@NotNull TarazedSessionTransition tarazedSessionTransition) {
        }
    }
}
