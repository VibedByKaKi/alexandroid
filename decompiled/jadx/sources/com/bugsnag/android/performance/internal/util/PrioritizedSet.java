package com.bugsnag.android.performance.internal.util;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0002\u0010\u0007B\u001d\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010\u000bB\u001b\b\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u001a\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005J \u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0!H\u0086\bø\u0001\u0000J\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u001aR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R@\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r8\u0000@BX\u0081\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Lcom/bugsnag/android/performance/internal/util/PrioritizedSet;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "initialValues", "", "Lcom/bugsnag/android/performance/internal/util/Prioritized;", "(Ljava/util/Collection;)V", "priority", "", "", "(ILjava/util/List;)V", "values", "", "([Lcom/bugsnag/android/performance/internal/util/Prioritized;)V", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/ReentrantLock;", "size", "getSize", "()I", "<set-?>", "getValues$annotations", "getValues", "()[Lcom/bugsnag/android/performance/internal/util/Prioritized;", "[Lcom/bugsnag/android/performance/internal/util/Prioritized;", BulkOperationType.add, "", "element", "addAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "forEach", "", "action", "Lkotlin/Function1;", "isEmpty", "isNotEmpty", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrioritized.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Prioritized.kt\ncom/bugsnag/android/performance/internal/util/PrioritizedSet\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,103:1\n26#2:104\n37#3,2:105\n1#4:107\n12744#5,2:108\n18987#5,2:110\n*S KotlinDebug\n*F\n+ 1 Prioritized.kt\ncom/bugsnag/android/performance/internal/util/PrioritizedSet\n*L\n41#1:104\n43#1:105,2\n53#1:108,2\n71#1:110,2\n*E\n"})
/* loaded from: classes6.dex */
public final class PrioritizedSet<T> {

    @NotNull
    private final ReentrantLock lock;

    @NotNull
    private volatile Prioritized<T>[] values;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PrioritizedSet(int r6, @org.jetbrains.annotations.NotNull java.util.List<? extends T> r7) {
        /*
            r5 = this;
            r7.getClass()
            int r0 = r7.size()
            com.bugsnag.android.performance.internal.util.Prioritized[] r1 = new com.bugsnag.android.performance.internal.util.Prioritized[r0]
            r2 = 0
        La:
            if (r2 >= r0) goto L1a
            com.bugsnag.android.performance.internal.util.Prioritized r3 = new com.bugsnag.android.performance.internal.util.Prioritized
            java.lang.Object r4 = r7.get(r2)
            r3.<init>(r6, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto La
        L1a:
            r6 = r1
            java.lang.Comparable[] r6 = (java.lang.Comparable[]) r6
            kotlin.collections.ArraysKt.sort(r6)
            r5.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.performance.internal.util.PrioritizedSet.<init>(int, java.util.List):void");
    }

    public final boolean add(@NotNull Prioritized<T> element) {
        element.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            for (Prioritized<T> prioritized : this.values) {
                if (Intrinsics.areEqual(prioritized.getValue(), element.getValue())) {
                    return false;
                }
            }
            Prioritized<T>[] prioritizedArr = (Prioritized[]) ArraysKt.plus(this.values, element);
            ArraysKt.sort((Object[]) prioritizedArr);
            this.values = prioritizedArr;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean addAll(@NotNull Collection<Prioritized<T>> elements) {
        elements.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Prioritized<T>[] prioritizedArr = (Prioritized[]) Arrays.copyOf(this.values, this.values.length + elements.size());
            int length = this.values.length;
            Iterator<Prioritized<T>> it2 = elements.iterator();
            while (true) {
                int i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Prioritized<T> next = it2.next();
                Prioritized<T>[] prioritizedArr2 = this.values;
                int length2 = prioritizedArr2.length;
                while (true) {
                    if (i >= length2) {
                        prioritizedArr[length] = next;
                        length++;
                        break;
                    }
                    if (Intrinsics.areEqual(prioritizedArr2[i].getValue(), next.getValue())) {
                        break;
                    }
                    i++;
                }
            }
            if (length == this.values.length) {
                reentrantLock.unlock();
                return false;
            }
            if (length == prioritizedArr.length) {
                ArraysKt.sort((Object[]) prioritizedArr);
                this.values = prioritizedArr;
            } else {
                ArraysKt___ArraysJvmKt.sort((Object[]) prioritizedArr, 0, length);
                this.values = (Prioritized[]) Arrays.copyOf(prioritizedArr, length);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void forEach(@NotNull Function1<? super T, Unit> action) {
        action.getClass();
        for (Prioritized<T> prioritized : getValues()) {
            action.invoke(prioritized.getValue());
        }
    }

    public final int getSize() {
        return this.values.length;
    }

    @NotNull
    public final Prioritized<T>[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.values.length == 0;
    }

    public final boolean isNotEmpty() {
        return !(this.values.length == 0);
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    private PrioritizedSet(Prioritized<T>[] prioritizedArr) {
        this.values = prioritizedArr;
        this.lock = new ReentrantLock();
    }

    public PrioritizedSet() {
        this(new Prioritized[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PrioritizedSet(@org.jetbrains.annotations.NotNull java.util.Collection<com.bugsnag.android.performance.internal.util.Prioritized<T>> r2) {
        /*
            r1 = this;
            r2.getClass()
            r0 = 0
            com.bugsnag.android.performance.internal.util.Prioritized[] r0 = new com.bugsnag.android.performance.internal.util.Prioritized[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            com.bugsnag.android.performance.internal.util.Prioritized[] r2 = (com.bugsnag.android.performance.internal.util.Prioritized[]) r2
            r0 = r2
            java.lang.Comparable[] r0 = (java.lang.Comparable[]) r0
            kotlin.collections.ArraysKt.sort(r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.performance.internal.util.PrioritizedSet.<init>(java.util.Collection):void");
    }
}
