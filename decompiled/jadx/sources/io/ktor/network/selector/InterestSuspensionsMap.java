package io.ktor.network.selector;

import androidx.room.Room$$ExternalSyntheticBUOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import io.ktor.util.InternalAPI;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAPI
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J0\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u001d\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0016H\u0086\bJ.\u0010\u0011\u001a\u00020\u00052#\u0010\u0014\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b\u0016H\u0086\bJ\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002¨\u0006\u001d"}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap;", "", "()V", "acceptHandlerReference", "Lkotlinx/coroutines/CancellableContinuation;", "", "acceptHandlerReference$annotations", "connectHandlerReference", "connectHandlerReference$annotations", "readHandlerReference", "readHandlerReference$annotations", "writeHandlerReference", "writeHandlerReference$annotations", "addSuspension", "interest", "Lio/ktor/network/selector/SelectInterest;", "continuation", "invokeForEachPresent", "readyOps", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/Function2;", "removeSuspension", "interestOrdinal", "toString", "", "Companion", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class InterestSuspensionsMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicReferenceFieldUpdater<InterestSuspensionsMap, CancellableContinuation<Unit>>[] updaters;
    private volatile CancellableContinuation<? super Unit> acceptHandlerReference;
    private volatile CancellableContinuation<? super Unit> connectHandlerReference;
    private volatile CancellableContinuation<? super Unit> readHandlerReference;
    private volatile CancellableContinuation<? super Unit> writeHandlerReference;

    static {
        SelectInterest[] allInterests = SelectInterest.INSTANCE.getAllInterests();
        ArrayList arrayList = new ArrayList(allInterests.length);
        for (SelectInterest selectInterest : allInterests) {
            StringBuilder sb = new StringBuilder();
            String name = selectInterest.name();
            if (name == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type java.lang.String");
                return;
            }
            String lowerCase = name.toLowerCase();
            lowerCase.getClass();
            sb.append(lowerCase);
            sb.append("HandlerReference");
            AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(InterestSuspensionsMap.class, CancellableContinuation.class, sb.toString());
            if (newUpdater == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
                return;
            }
            arrayList.add(newUpdater);
        }
        Object[] array = arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
        if (array != null) {
            updaters = (AtomicReferenceFieldUpdater[]) array;
        } else {
            CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final void addSuspension(@NotNull SelectInterest interest, @NotNull CancellableContinuation<? super Unit> continuation) {
        interest.getClass();
        continuation.getClass();
        AtomicReferenceFieldUpdater updater = INSTANCE.updater(interest);
        while (!updater.compareAndSet(this, null, continuation)) {
            if (updater.get(this) != null) {
                Room$$ExternalSyntheticBUOutline0.m$2("Handler for ", interest.name(), " is already registered");
                return;
            }
        }
    }

    public final void invokeForEachPresent(int readyOps, @NotNull Function1<? super CancellableContinuation<? super Unit>, Unit> block) {
        CancellableContinuation<Unit> removeSuspension;
        block.getClass();
        int[] flags = SelectInterest.INSTANCE.getFlags();
        int length = flags.length;
        for (int i = 0; i < length; i++) {
            if ((flags[i] & readyOps) != 0 && (removeSuspension = removeSuspension(i)) != null) {
                block.invoke(removeSuspension);
            }
        }
    }

    @Nullable
    public final CancellableContinuation<Unit> removeSuspension(@NotNull SelectInterest interest) {
        interest.getClass();
        return (CancellableContinuation) INSTANCE.updater(interest).getAndSet(this, null);
    }

    @NotNull
    public String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00052\u0006\u0010\f\u001a\u00020\rH\u0002R0\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00050\u0004X\u0082\u0004¢\u0006\n\n\u0002\u0010\n\u0012\u0004\b\t\u0010\u0002¨\u0006\u000e"}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap$Companion;", "", "()V", "updaters", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lio/ktor/network/selector/InterestSuspensionsMap;", "Lkotlinx/coroutines/CancellableContinuation;", "", "updaters$annotations", "[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "updater", "interest", "Lio/ktor/network/selector/SelectInterest;", "ktor-network"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AtomicReferenceFieldUpdater<InterestSuspensionsMap, CancellableContinuation<Unit>> updater(SelectInterest interest) {
            return InterestSuspensionsMap.updaters[interest.ordinal()];
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void updaters$annotations() {
        }
    }

    private static /* synthetic */ void acceptHandlerReference$annotations() {
    }

    private static /* synthetic */ void connectHandlerReference$annotations() {
    }

    private static /* synthetic */ void readHandlerReference$annotations() {
    }

    private static /* synthetic */ void writeHandlerReference$annotations() {
    }

    @Nullable
    public final CancellableContinuation<Unit> removeSuspension(int interestOrdinal) {
        return updaters[interestOrdinal].getAndSet(this, null);
    }

    public final void invokeForEachPresent(@NotNull Function2<? super CancellableContinuation<? super Unit>, ? super SelectInterest, Unit> block) {
        block.getClass();
        for (SelectInterest selectInterest : SelectInterest.INSTANCE.getAllInterests()) {
            CancellableContinuation<Unit> removeSuspension = removeSuspension(selectInterest);
            if (removeSuspension != null) {
                block.invoke(removeSuspension, selectInterest);
            }
        }
    }
}
