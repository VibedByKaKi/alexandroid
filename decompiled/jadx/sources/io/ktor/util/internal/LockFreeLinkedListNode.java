package io.ktor.util.internal;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import com.amazon.alexa.enrollment.dialogs.DialogConstants;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import io.ktor.util.InternalAPI;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAPI
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0004BCDEB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000fJ%\u0010\u0019\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0086\bJ-\u0010\u001c\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u000f\u0012\u0004\u0012\u00020\t0\u001eH\u0086\bJ=\u0010\u001f\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u000f\u0012\u0004\u0012\u00020\t0\u001e2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0086\bJ \u0010 \u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0001J\u0012\u0010!\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000fJ&\u0010\"\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000f2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u000f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J'\u0010%\u001a\b\u0012\u0004\u0012\u0002H'0&\"\f\b\u0000\u0010'*\u00060\u0000j\u0002`\u000f2\u0006\u0010\u0018\u001a\u0002H'¢\u0006\u0002\u0010(J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000f0,J\f\u0010-\u001a\u00060\u0000j\u0002`\u000fH\u0002J\u0014\u0010.\u001a\u00020\u00172\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J\u0014\u0010/\u001a\u00020\u00172\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J\b\u00100\u001a\u00020\u0017H\u0001J\u0006\u00101\u001a\u00020\u0017J%\u00102\u001a\u0002032\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0081\bJ\f\u00104\u001a\u00060\u0000j\u0002`\u000fH\u0002J\b\u00105\u001a\u00020\tH\u0016J\u0018\u00106\u001a\u0004\u0018\u0001H'\"\u0006\b\u0000\u0010'\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\rJ,\u00107\u001a\u0004\u0018\u0001H'\"\u0006\b\u0000\u0010'\u0018\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u00020\t0\u001eH\u0086\b¢\u0006\u0002\u00108J\u000e\u00109\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fJ\b\u0010:\u001a\u00020\u0007H\u0002J\b\u0010;\u001a\u00020<H\u0016J(\u0010=\u001a\u00020>2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000f2\u0006\u0010?\u001a\u000203H\u0001J%\u0010@\u001a\u00020\u00172\n\u0010\u0012\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0000¢\u0006\u0002\bAR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006F"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode;", "", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lio/ktor/util/internal/Removed;", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lio/ktor/util/internal/Node;", "getNextNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "prev", "getPrev", "prevNode", "getPrevNode", "addLast", "", "node", "addLastIf", "condition", "Lkotlin/Function0;", "addLastIfPrev", "predicate", "Lkotlin/Function1;", "addLastIfPrevAndIf", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lio/ktor/util/internal/OpDescriptor;", "describeAddLast", "Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", ExifInterface.GPS_DIRECTION_TRUE, "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "describeRemove", "Lio/ktor/util/internal/AtomicDesc;", "describeRemoveFirst", "Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "findHead", "finishAdd", "finishRemove", "helpDelete", "helpRemove", "makeCondAddOp", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "markPrev", BulkOperationType.remove, "removeFirstIfIsInstanceOf", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removed", "toString", "", "tryCondAddNext", "", "condAdd", "validateNode", "validateNode$ktor_utils", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "RemoveFirstDesc", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public class LockFreeLinkedListNode {
    static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
    static final AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
    private static final AtomicReferenceFieldUpdater _removedRef$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J \u0010\u0012\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$J\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J\u0014\u0010\u0017\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u0018H\u0014J \u0010\u0019\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u0005H$R\u001a\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u001b"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/AtomicDesc;", "()V", "affectedNode", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "complete", "", "op", "Lio/ktor/util/internal/AtomicOp;", SendEventResultBundleKeys.FAILURE, "", "affected", "next", "finishOnSuccess", "onPrepare", "prepare", "retry", "", "takeAffectedNode", "Lio/ktor/util/internal/OpDescriptor;", "updatedNext", "PrepareOp", "ktor-utils"}, k = 1, mv = {1, 1, 13})
    @InternalAPI
    public static abstract class AbstractAtomicDesc extends AtomicDesc {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lio/ktor/util/internal/OpDescriptor;", "next", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "op", "Lio/ktor/util/internal/AtomicOp;", DialogConstants.DESC, "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/AtomicOp;Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "perform", "", "affected", "ktor-utils"}, k = 1, mv = {1, 1, 13})
        public static final class PrepareOp extends OpDescriptor {

            @JvmField
            @NotNull
            public final AbstractAtomicDesc desc;

            @JvmField
            @NotNull
            public final LockFreeLinkedListNode next;

            @JvmField
            @NotNull
            public final AtomicOp<LockFreeLinkedListNode> op;

            /* JADX WARN: Multi-variable type inference failed */
            public PrepareOp(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull AtomicOp<? super LockFreeLinkedListNode> atomicOp, @NotNull AbstractAtomicDesc abstractAtomicDesc) {
                lockFreeLinkedListNode.getClass();
                atomicOp.getClass();
                abstractAtomicDesc.getClass();
                this.next = lockFreeLinkedListNode;
                this.op = atomicOp;
                this.desc = abstractAtomicDesc;
            }

            @Override // io.ktor.util.internal.OpDescriptor
            @Nullable
            public Object perform(@Nullable Object affected) {
                Object obj;
                if (affected == null) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                    return null;
                }
                LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) affected;
                Object onPrepare = this.desc.onPrepare(lockFreeLinkedListNode, this.next);
                if (onPrepare == null) {
                    Object obj2 = this.op.isDecided() ? this.next : this.op;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, obj2) && atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == this) {
                    }
                    return null;
                }
                obj = LockFreeLinkedListKt.REMOVE_PREPARED;
                if (onPrepare == obj) {
                    Removed removed = this.next.removed();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, this, removed)) {
                        if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) != this) {
                            return onPrepare;
                        }
                    }
                    lockFreeLinkedListNode.helpDelete();
                    return onPrepare;
                }
                this.op.tryDecide(onPrepare);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LockFreeLinkedListNode._next$FU;
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.next;
                while (!atomicReferenceFieldUpdater3.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2)) {
                    if (atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode) != this) {
                        return onPrepare;
                    }
                }
                return onPrepare;
            }
        }

        @Override // io.ktor.util.internal.AtomicDesc
        public final void complete(@NotNull AtomicOp<?> op, @Nullable Object failure) {
            op.getClass();
            boolean z = failure == null;
            LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                if (z) {
                    Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                    return;
                }
                return;
            }
            LockFreeLinkedListNode queue = getQueue();
            if (queue == null) {
                if (z) {
                    Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                    return;
                }
                return;
            }
            LockFreeLinkedListNode updatedNext = z ? updatedNext(this$0, queue) : queue;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this$0, op, updatedNext)) {
                if (atomicReferenceFieldUpdater.get(this$0) != op) {
                    return;
                }
            }
            if (z) {
                finishOnSuccess(this$0, queue);
            }
        }

        @Nullable
        public Object failure(@NotNull LockFreeLinkedListNode affected, @NotNull Object next) {
            affected.getClass();
            next.getClass();
            return null;
        }

        public abstract void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next);

        @Nullable
        /* renamed from: getAffectedNode */
        public abstract LockFreeLinkedListNode getThis$0();

        @Nullable
        /* renamed from: getOriginalNext */
        public abstract LockFreeLinkedListNode getQueue();

        @Nullable
        public abstract Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next);

        @Override // io.ktor.util.internal.AtomicDesc
        @Nullable
        public final Object prepare(@NotNull AtomicOp<?> op) {
            Object obj;
            op.getClass();
            while (true) {
                LockFreeLinkedListNode takeAffectedNode = takeAffectedNode(op);
                Object obj2 = takeAffectedNode._next;
                if (obj2 == op || op.isDecided()) {
                    return null;
                }
                if (obj2 instanceof OpDescriptor) {
                    ((OpDescriptor) obj2).perform(takeAffectedNode);
                } else {
                    Object failure = failure(takeAffectedNode, obj2);
                    if (failure != null) {
                        return failure;
                    }
                    if (retry(takeAffectedNode, obj2)) {
                        continue;
                    } else {
                        if (obj2 == null) {
                            CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                            return null;
                        }
                        PrepareOp prepareOp = new PrepareOp((LockFreeLinkedListNode) obj2, op, this);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(takeAffectedNode, obj2, prepareOp)) {
                                Object perform = prepareOp.perform(takeAffectedNode);
                                obj = LockFreeLinkedListKt.REMOVE_PREPARED;
                                if (perform != obj) {
                                    return perform;
                                }
                            } else if (atomicReferenceFieldUpdater.get(takeAffectedNode) != obj2) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        public boolean retry(@NotNull LockFreeLinkedListNode affected, @NotNull Object next) {
            affected.getClass();
            next.getClass();
            return false;
        }

        @NotNull
        public LockFreeLinkedListNode takeAffectedNode(@NotNull OpDescriptor op) {
            op.getClass();
            LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                Intrinsics.throwNpe();
            }
            return this$0;
        }

        @NotNull
        public abstract Object updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0019\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J \u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003H\u0014J\"\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003H\u0014J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0013\u001a\u00020\u0015H\u0014J\u0014\u0010\u0018\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J \u0010\u001b\u001a\u00020\u00152\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0002j\u0002`\u0003H\u0014R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\u0006\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001c\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "node", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "_affectedNode", "Lkotlinx/atomicfu/AtomicRef;", "affectedNode", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "finishOnSuccess", "", "affected", "next", "onPrepare", "", "retry", "", "takeAffectedNode", "op", "Lio/ktor/util/internal/OpDescriptor;", "updatedNext", "ktor-utils"}, k = 1, mv = {1, 1, 13})
    public static class AddLastDesc<T extends LockFreeLinkedListNode> extends AbstractAtomicDesc {
        private static final AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(AddLastDesc.class, Object.class, "_affectedNode");
        private volatile Object _affectedNode;

        @JvmField
        @NotNull
        public final T node;

        @JvmField
        @NotNull
        public final LockFreeLinkedListNode queue;

        public AddLastDesc(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode, @NotNull T t) {
            lockFreeLinkedListNode.getClass();
            t.getClass();
            this.queue = lockFreeLinkedListNode;
            this.node = t;
            if (t._next == t && t._prev == t) {
                this._affectedNode = null;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                throw null;
            }
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
            affected.getClass();
            next.getClass();
            this.node.finishAdd(this.queue);
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getAffectedNode */
        public final LockFreeLinkedListNode getThis$0() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getOriginalNext, reason: from getter */
        public final LockFreeLinkedListNode getQueue() {
            return this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
            affected.getClass();
            next.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public boolean retry(@NotNull LockFreeLinkedListNode affected, @NotNull Object next) {
            affected.getClass();
            next.getClass();
            return next != this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public final LockFreeLinkedListNode takeAffectedNode(@NotNull OpDescriptor op) {
            LockFreeLinkedListNode lockFreeLinkedListNode;
            op.getClass();
            while (true) {
                Object obj = this.queue._prev;
                if (obj == null) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                    return null;
                }
                lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                Object obj2 = lockFreeLinkedListNode._next;
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.queue;
                if (obj2 != lockFreeLinkedListNode2 && obj2 != op) {
                    if (obj2 instanceof OpDescriptor) {
                        ((OpDescriptor) obj2).perform(lockFreeLinkedListNode);
                    } else {
                        LockFreeLinkedListNode correctPrev = lockFreeLinkedListNode2.correctPrev(lockFreeLinkedListNode, op);
                        if (correctPrev != null) {
                            return correctPrev;
                        }
                    }
                }
            }
            return lockFreeLinkedListNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public Object updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
            affected.getClass();
            next.getClass();
            T t = this.node;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(t, t, affected) && atomicReferenceFieldUpdater.get(t) == t) {
            }
            T t2 = this.node;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$FU;
            LockFreeLinkedListNode lockFreeLinkedListNode = this.queue;
            while (!atomicReferenceFieldUpdater2.compareAndSet(t2, t2, lockFreeLinkedListNode) && atomicReferenceFieldUpdater2.get(t2) == t2) {
            }
            return this.node;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "newNode", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", SendEventResultBundleKeys.FAILURE, "", "ktor-utils"}, k = 1, mv = {1, 1, 13})
    @PublishedApi
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {

        @JvmField
        @NotNull
        public final LockFreeLinkedListNode newNode;

        @JvmField
        @Nullable
        public LockFreeLinkedListNode oldNext;

        public CondAddOp(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            lockFreeLinkedListNode.getClass();
            this.newNode = lockFreeLinkedListNode;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public void complete(@NotNull LockFreeLinkedListNode affected, @Nullable Object failure) {
            affected.getClass();
            boolean z = failure == null;
            LockFreeLinkedListNode lockFreeLinkedListNode = z ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(affected, this, lockFreeLinkedListNode)) {
                    if (atomicReferenceFieldUpdater.get(affected) != this) {
                        return;
                    }
                }
                if (z) {
                    LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                    LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                    if (lockFreeLinkedListNode3 == null) {
                        Intrinsics.throwNpe();
                    }
                    lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0017, code lost:
    
        r7.markPrev();
        r3 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
        r2 = ((io.ktor.util.internal.Removed) r2).ref;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0024, code lost:
    
        if (r3.compareAndSet(r1, r7, r2) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x002b, code lost:
    
        if (r3.get(r1) == r7) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.ktor.util.internal.LockFreeLinkedListNode correctPrev(io.ktor.util.internal.LockFreeLinkedListNode r7, io.ktor.util.internal.OpDescriptor r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            java.lang.Object r2 = r7._next
            if (r2 != r8) goto L7
            return r7
        L7:
            boolean r3 = r2 instanceof io.ktor.util.internal.OpDescriptor
            if (r3 == 0) goto L11
            io.ktor.util.internal.OpDescriptor r2 = (io.ktor.util.internal.OpDescriptor) r2
            r2.perform(r7)
            goto L2
        L11:
            boolean r3 = r2 instanceof io.ktor.util.internal.Removed
            if (r3 == 0) goto L36
            if (r1 == 0) goto L2f
            r7.markPrev()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU
            io.ktor.util.internal.Removed r2 = (io.ktor.util.internal.Removed) r2
            io.ktor.util.internal.LockFreeLinkedListNode r2 = r2.ref
        L20:
            boolean r4 = r3.compareAndSet(r1, r7, r2)
            if (r4 == 0) goto L27
            goto L2d
        L27:
            java.lang.Object r4 = r3.get(r1)
            if (r4 == r7) goto L20
        L2d:
            r7 = r1
            goto L1
        L2f:
            java.lang.Object r7 = r7._prev
            io.ktor.util.internal.LockFreeLinkedListNode r7 = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(r7)
            goto L2
        L36:
            java.lang.Object r3 = r6._prev
            boolean r4 = r3 instanceof io.ktor.util.internal.Removed
            if (r4 == 0) goto L3d
            return r0
        L3d:
            if (r2 == r6) goto L4f
            if (r2 == 0) goto L48
            r1 = r2
            io.ktor.util.internal.LockFreeLinkedListNode r1 = (io.ktor.util.internal.LockFreeLinkedListNode) r1
            r5 = r1
            r1 = r7
            r7 = r5
            goto L2
        L48:
        */
        //  java.lang.String r6 = "null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */"
        /*
            io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0.m$2(r6)
            r6 = 0
            return r6
        L4f:
            if (r3 != r7) goto L52
            return r0
        L52:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = io.ktor.util.internal.LockFreeLinkedListNode._prev$FU
        L54:
            boolean r4 = r2.compareAndSet(r6, r3, r7)
            if (r4 == 0) goto L61
            java.lang.Object r2 = r7._prev
            boolean r2 = r2 instanceof io.ktor.util.internal.Removed
            if (r2 != 0) goto L2
            return r0
        L61:
            java.lang.Object r4 = r2.get(r6)
            if (r4 == r3) goto L54
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.LockFreeLinkedListNode.correctPrev(io.ktor.util.internal.LockFreeLinkedListNode, io.ktor.util.internal.OpDescriptor):io.ktor.util.internal.LockFreeLinkedListNode");
    }

    private final LockFreeLinkedListNode findHead() {
        LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (!(lockFreeLinkedListNode instanceof LockFreeLinkedListHead)) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (lockFreeLinkedListNode == this) {
                Single$$ExternalSyntheticBUOutline0.m$2("Cannot loop to this while looking for list head");
                return null;
            }
        }
        return lockFreeLinkedListNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdd(LockFreeLinkedListNode next) {
        while (true) {
            Object obj = next._prev;
            if ((obj instanceof Removed) || getNext() != next) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(next, obj, this)) {
                if (atomicReferenceFieldUpdater.get(next) != obj) {
                    break;
                }
            }
            if (getNext() instanceof Removed) {
                if (obj != null) {
                    next.correctPrev((LockFreeLinkedListNode) obj, null);
                    return;
                } else {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                    return;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRemove(LockFreeLinkedListNode next) {
        helpDelete();
        next.correctPrev(LockFreeLinkedListKt.unwrap(this._prev), null);
    }

    private final LockFreeLinkedListNode markPrev() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return ((Removed) obj).ref;
            }
            if (obj == this) {
                lockFreeLinkedListNode = findHead();
            } else {
                if (obj == null) {
                    CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                    return null;
                }
                lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            }
            Removed removed = lockFreeLinkedListNode.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return (LockFreeLinkedListNode) obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.util.internal.LockFreeLinkedListNode] */
    private final <T> T removeFirstIfIsInstanceOf() {
        while (true) {
            Object next = getNext();
            if (next == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return null;
            }
            ?? r0 = (T) ((LockFreeLinkedListNode) next);
            if (r0 == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (r0.remove()) {
                return r0;
            }
            r0.helpDelete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.util.internal.LockFreeLinkedListNode, java.lang.Object] */
    private final <T> T removeFirstIfIsInstanceOfOrPeekIf(Function1<? super T, Boolean> predicate) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        while (true) {
            Object next = getNext();
            if (next == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return null;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue() && !lockFreeLinkedListNode.remove()) {
                lockFreeLinkedListNode.helpDelete();
            }
        }
        return lockFreeLinkedListNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Removed removed() {
        Removed removed = (Removed) this._removedRef;
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        _removedRef$FU.lazySet(this, removed2);
        return removed2;
    }

    public final void addLast(@NotNull LockFreeLinkedListNode node) {
        Object prev;
        node.getClass();
        do {
            prev = getPrev();
            if (prev == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return;
            }
        } while (!((LockFreeLinkedListNode) prev).addNext(node, this));
    }

    public final boolean addLastIf(@NotNull LockFreeLinkedListNode node, @NotNull Function0<Boolean> condition) {
        int tryCondAddNext;
        node.getClass();
        condition.getClass();
        LockFreeLinkedListNode$makeCondAddOp$1 lockFreeLinkedListNode$makeCondAddOp$1 = new LockFreeLinkedListNode$makeCondAddOp$1(condition, node, node);
        do {
            Object prev = getPrev();
            if (prev == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return false;
            }
            tryCondAddNext = ((LockFreeLinkedListNode) prev).tryCondAddNext(node, this, lockFreeLinkedListNode$makeCondAddOp$1);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }

    public final boolean addLastIfPrev(@NotNull LockFreeLinkedListNode node, @NotNull Function1<? super LockFreeLinkedListNode, Boolean> predicate) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        node.getClass();
        predicate.getClass();
        do {
            Object prev = getPrev();
            if (prev == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return false;
            }
            lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNode.addNext(node, this));
        return true;
    }

    public final boolean addLastIfPrevAndIf(@NotNull LockFreeLinkedListNode node, @NotNull Function1<? super LockFreeLinkedListNode, Boolean> predicate, @NotNull Function0<Boolean> condition) {
        int tryCondAddNext;
        node.getClass();
        predicate.getClass();
        condition.getClass();
        LockFreeLinkedListNode$makeCondAddOp$1 lockFreeLinkedListNode$makeCondAddOp$1 = new LockFreeLinkedListNode$makeCondAddOp$1(condition, node, node);
        do {
            Object prev = getPrev();
            if (prev == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return false;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
            tryCondAddNext = lockFreeLinkedListNode.tryCondAddNext(node, this, lockFreeLinkedListNode$makeCondAddOp$1);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }

    @PublishedApi
    public final boolean addNext(@NotNull LockFreeLinkedListNode node, @NotNull LockFreeLinkedListNode next) {
        node.getClass();
        next.getClass();
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, node)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return false;
            }
        }
        node.finishAdd(next);
        return true;
    }

    public final boolean addOneIfEmpty(@NotNull LockFreeLinkedListNode node) {
        node.getClass();
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, this, node)) {
                if (atomicReferenceFieldUpdater.get(this) != this) {
                    break;
                }
            }
            node.finishAdd(this);
            return true;
        }
        return false;
    }

    @NotNull
    public final <T extends LockFreeLinkedListNode> AddLastDesc<T> describeAddLast(@NotNull T node) {
        node.getClass();
        return new AddLastDesc<>(this, node);
    }

    @Nullable
    public AtomicDesc describeRemove() {
        if (isRemoved()) {
            return null;
        }
        return new AbstractAtomicDesc() { // from class: io.ktor.util.internal.LockFreeLinkedListNode$describeRemove$1
            private static final AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode$describeRemove$1.class, Object.class, "_originalNext");
            private volatile Object _originalNext = null;

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            public Object failure(@NotNull LockFreeLinkedListNode affected, @NotNull Object next) {
                affected.getClass();
                next.getClass();
                if (next instanceof Removed) {
                    return LockFreeLinkedListKt.getALREADY_REMOVED();
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
                affected.getClass();
                next.getClass();
                LockFreeLinkedListNode.this.finishRemove(next);
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            /* renamed from: getAffectedNode, reason: from getter */
            public LockFreeLinkedListNode getThis$0() {
                return LockFreeLinkedListNode.this;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            /* renamed from: getOriginalNext */
            public LockFreeLinkedListNode getQueue() {
                return (LockFreeLinkedListNode) this._originalNext;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @Nullable
            public Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
                affected.getClass();
                next.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _originalNext$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, next) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            @NotNull
            public Removed updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
                affected.getClass();
                next.getClass();
                return next.removed();
            }
        };
    }

    @NotNull
    public final RemoveFirstDesc<LockFreeLinkedListNode> describeRemoveFirst() {
        return new RemoveFirstDesc<>(this);
    }

    @NotNull
    public final Object getNext() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    @NotNull
    public final LockFreeLinkedListNode getNextNode() {
        return LockFreeLinkedListKt.unwrap(getNext());
    }

    @NotNull
    public final Object getPrev() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return obj;
            }
            if (obj == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return null;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            if (lockFreeLinkedListNode.getNext() == this) {
                return obj;
            }
            correctPrev(lockFreeLinkedListNode, null);
        }
    }

    @NotNull
    public final LockFreeLinkedListNode getPrevNode() {
        return LockFreeLinkedListKt.unwrap(getPrev());
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0028, code lost:
    
        r0.markPrev();
        r5 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
        r4 = ((io.ktor.util.internal.Removed) r4).ref;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0035, code lost:
    
        if (r5.compareAndSet(r3, r0, r4) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003c, code lost:
    
        if (r5.get(r3) == r0) goto L55;
     */
    @kotlin.PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void helpDelete() {
        /*
            r8 = this;
            io.ktor.util.internal.LockFreeLinkedListNode r0 = r8.markPrev()
            java.lang.Object r1 = r8._next
            if (r1 == 0) goto L6b
            io.ktor.util.internal.Removed r1 = (io.ktor.util.internal.Removed) r1
            io.ktor.util.internal.LockFreeLinkedListNode r1 = r1.ref
            r2 = 0
        Ld:
            r3 = r2
        Le:
            java.lang.Object r4 = r1.getNext()
            boolean r5 = r4 instanceof io.ktor.util.internal.Removed
            if (r5 == 0) goto L1e
            r1.markPrev()
            io.ktor.util.internal.Removed r4 = (io.ktor.util.internal.Removed) r4
            io.ktor.util.internal.LockFreeLinkedListNode r1 = r4.ref
            goto Le
        L1e:
            java.lang.Object r4 = r0.getNext()
            boolean r5 = r4 instanceof io.ktor.util.internal.Removed
            if (r5 == 0) goto L47
            if (r3 == 0) goto L40
            r0.markPrev()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU
            io.ktor.util.internal.Removed r4 = (io.ktor.util.internal.Removed) r4
            io.ktor.util.internal.LockFreeLinkedListNode r4 = r4.ref
        L31:
            boolean r6 = r5.compareAndSet(r3, r0, r4)
            if (r6 == 0) goto L38
            goto L3e
        L38:
            java.lang.Object r6 = r5.get(r3)
            if (r6 == r0) goto L31
        L3e:
            r0 = r3
            goto Ld
        L40:
            java.lang.Object r0 = r0._prev
            io.ktor.util.internal.LockFreeLinkedListNode r0 = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(r0)
            goto Le
        L47:
            if (r4 == r8) goto L5b
            if (r4 == 0) goto L55
            r3 = r4
            io.ktor.util.internal.LockFreeLinkedListNode r3 = (io.ktor.util.internal.LockFreeLinkedListNode) r3
            if (r3 != r1) goto L51
            return
        L51:
            r7 = r3
            r3 = r0
            r0 = r7
            goto Le
        L55:
        */
        //  java.lang.String r8 = "null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */"
        /*
            io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0.m$2(r8)
            return
        L5b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU
        L5d:
            boolean r5 = r4.compareAndSet(r0, r8, r1)
            if (r5 == 0) goto L64
            return
        L64:
            java.lang.Object r5 = r4.get(r0)
            if (r5 == r8) goto L5d
            goto Le
        L6b:
            java.lang.String r8 = "null cannot be cast to non-null type io.ktor.util.internal.Removed"
            io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0.m$2(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.internal.LockFreeLinkedListNode.helpDelete():void");
    }

    public final void helpRemove() {
        Object next = getNext();
        if (!(next instanceof Removed)) {
            next = null;
        }
        Removed removed = (Removed) next;
        if (removed != null) {
            finishRemove(removed.ref);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("Must be invoked on a removed node");
        }
    }

    public final boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    @PublishedApi
    @NotNull
    public final CondAddOp makeCondAddOp(@NotNull LockFreeLinkedListNode node, @NotNull Function0<Boolean> condition) {
        node.getClass();
        condition.getClass();
        return new LockFreeLinkedListNode$makeCondAddOp$1(condition, node, node);
    }

    public boolean remove() {
        while (true) {
            Object next = getNext();
            if ((next instanceof Removed) || next == this) {
                return false;
            }
            if (next == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return false;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            Removed removed = lockFreeLinkedListNode.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, next, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != next) {
                    break;
                }
            }
            finishRemove(lockFreeLinkedListNode);
            return true;
        }
    }

    @Nullable
    public final LockFreeLinkedListNode removeFirstOrNull() {
        while (true) {
            Object next = getNext();
            if (next == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
                return null;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    @PublishedApi
    public final int tryCondAddNext(@NotNull LockFreeLinkedListNode node, @NotNull LockFreeLinkedListNode next, @NotNull CondAddOp condAdd) {
        node.getClass();
        next.getClass();
        condAdd.getClass();
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, condAdd)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return 0;
            }
        }
        return condAdd.perform(this) == null ? 1 : 2;
    }

    public final void validateNode$ktor_utils(@NotNull LockFreeLinkedListNode prev, @NotNull LockFreeLinkedListNode next) {
        prev.getClass();
        next.getClass();
        if (prev != this._prev) {
            Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
        } else {
            if (next == this._next) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0014J \u0010\u0018\u001a\u00020\u00192\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0017\u001a\u00060\u0004j\u0002`\u0005H\u0004J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0017\u001a\u00060\u0004j\u0002`\u0005H\u0004J\u001c\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0004J\u0014\u0010\u001d\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J \u0010 \u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0017\u001a\u00060\u0004j\u0002`\u0005H\u0004J\u0015\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010#R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "_affectedNode", "Lkotlinx/atomicfu/AtomicRef;", "_originalNext", "affectedNode", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "originalNext", "getOriginalNext", "result", "result$annotations", "()V", "getResult", "()Ljava/lang/Object;", SendEventResultBundleKeys.FAILURE, "", "affected", "next", "finishOnSuccess", "", "onPrepare", "retry", "", "takeAffectedNode", "op", "Lio/ktor/util/internal/OpDescriptor;", "updatedNext", "validatePrepared", "node", "(Ljava/lang/Object;)Z", "ktor-utils"}, k = 1, mv = {1, 1, 13})
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {
        private static final AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_affectedNode");
        private static final AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_originalNext");
        private volatile Object _affectedNode;
        private volatile Object _originalNext;

        @JvmField
        @NotNull
        public final LockFreeLinkedListNode queue;

        public RemoveFirstDesc(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            lockFreeLinkedListNode.getClass();
            this.queue = lockFreeLinkedListNode;
            this._affectedNode = null;
            this._originalNext = null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public Object failure(@NotNull LockFreeLinkedListNode affected, @NotNull Object next) {
            affected.getClass();
            next.getClass();
            if (affected == this.queue) {
                return LockFreeLinkedListKt.getLIST_EMPTY();
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void finishOnSuccess(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
            affected.getClass();
            next.getClass();
            affected.finishRemove(next);
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getAffectedNode */
        public final LockFreeLinkedListNode getThis$0() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: getOriginalNext */
        public final LockFreeLinkedListNode getQueue() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        public final T getResult() {
            T t = (T) getThis$0();
            if (t == null) {
                Intrinsics.throwNpe();
            }
            return t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        public final Object onPrepare(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
            Object obj;
            affected.getClass();
            next.getClass();
            if (affected instanceof LockFreeLinkedListHead) {
                Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                return null;
            }
            if (!validatePrepared(affected)) {
                obj = LockFreeLinkedListKt.REMOVE_PREPARED;
                return obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _originalNext$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, next) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final boolean retry(@NotNull LockFreeLinkedListNode affected, @NotNull Object next) {
            affected.getClass();
            next.getClass();
            if (!(next instanceof Removed)) {
                return false;
            }
            affected.helpDelete();
            return true;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public final LockFreeLinkedListNode takeAffectedNode(@NotNull OpDescriptor op) {
            op.getClass();
            Object next = this.queue.getNext();
            if (next != null) {
                return (LockFreeLinkedListNode) next;
            }
            CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type io.ktor.util.internal.Node /* = io.ktor.util.internal.LockFreeLinkedListNode */");
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @NotNull
        public final Object updatedNext(@NotNull LockFreeLinkedListNode affected, @NotNull LockFreeLinkedListNode next) {
            affected.getClass();
            next.getClass();
            return next.removed();
        }

        public boolean validatePrepared(T node) {
            return true;
        }

        public static /* synthetic */ void result$annotations() {
        }
    }
}
