package com.amazon.tarazed.event;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.tarazed.coroutine.dispatcher.DispatcherProvider;
import com.amazon.tarazed.dagger.scopes.LibraryScope;
import expo.modules.interfaces.permissions.PermissionsResponse;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FlowPreview
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\u0012JH\u0010\u0013\u001a\u00020\u000f\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00032$\b\b\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086\b¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/tarazed/event/TarazedEventBus;", "", "tarazedScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/amazon/tarazed/coroutine/dispatcher/DispatcherProvider;)V", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/tarazed/event/TarazedEvent;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "eventsPublisher", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "publish", "Lkotlinx/coroutines/Job;", "event", "resetReplayCache", "", "subscribe", ExifInterface.GPS_DIRECTION_TRUE, PermissionsResponse.SCOPE_KEY, "handler", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@LibraryScope
@SourceDebugExtension({"SMAP\nTarazedEventBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TarazedEventBus.kt\ncom/amazon/tarazed/event/TarazedEventBus\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,66:1\n35#2:67\n20#2:68\n22#2:72\n50#3:69\n55#3:71\n106#4:70\n*S KotlinDebug\n*F\n+ 1 TarazedEventBus.kt\ncom/amazon/tarazed/event/TarazedEventBus\n*L\n54#1:67\n54#1:68\n54#1:72\n54#1:69\n54#1:71\n54#1:70\n*E\n"})
@ExperimentalCoroutinesApi
/* loaded from: classes17.dex */
public final class TarazedEventBus {

    @NotNull
    private final DispatcherProvider dispatchers;

    @NotNull
    private final SharedFlow<TarazedEvent> events;

    @NotNull
    private final MutableSharedFlow<TarazedEvent> eventsPublisher;

    @NotNull
    private final CoroutineScope tarazedScope;

    @Inject
    public TarazedEventBus(@Named("TarazedCoroutineScope") @NotNull CoroutineScope coroutineScope, @NotNull DispatcherProvider dispatcherProvider) {
        coroutineScope.getClass();
        dispatcherProvider.getClass();
        this.tarazedScope = coroutineScope;
        this.dispatchers = dispatcherProvider;
        MutableSharedFlow<TarazedEvent> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.eventsPublisher = MutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @NotNull
    public final SharedFlow<TarazedEvent> getEvents() {
        return this.events;
    }

    @NotNull
    public final Job publish(@NotNull TarazedEvent event) {
        Job launch$default;
        event.getClass();
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.tarazedScope, this.dispatchers.mo23080default(), null, new TarazedEventBus$publish$1(this, event, null), 2, null);
        return launch$default;
    }

    public final void resetReplayCache() {
        this.eventsPublisher.resetReplayCache();
    }

    public final /* synthetic */ <T extends TarazedEvent> Job subscribe(CoroutineScope scope, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> handler) {
        scope.getClass();
        handler.getClass();
        SharedFlow<TarazedEvent> events = getEvents();
        Intrinsics.needClassReification();
        return FlowKt.launchIn(FlowKt.onEach(new TarazedEventBus$subscribe$$inlined$filterIsInstance$1(events), handler), scope);
    }
}
