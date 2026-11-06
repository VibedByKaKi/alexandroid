package com.amazon.alexa.accessoryclient.common.rxipc;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/rxjava3/core/Scheduler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRxIPCClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxIPCClient.kt\ncom/amazon/alexa/accessoryclient/common/rxipc/RxIPCClient$Companion$IPC_WRITE_SCHEDULER$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1#2:323\n*E\n"})
/* loaded from: classes16.dex */
public final class RxIPCClient$Companion$IPC_WRITE_SCHEDULER$2 extends Lambda implements Function0<Scheduler> {
    public static final RxIPCClient$Companion$IPC_WRITE_SCHEDULER$2 INSTANCE = new RxIPCClient$Companion$IPC_WRITE_SCHEDULER$2();

    public RxIPCClient$Companion$IPC_WRITE_SCHEDULER$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "RxIPCClient-write");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Scheduler invoke() {
        Scheduler from = Schedulers.from(Executors.newSingleThreadExecutor(new RxIPCClient$Companion$IPC_WRITE_SCHEDULER$2$$ExternalSyntheticLambda0()));
        from.getClass();
        return from;
    }
}
