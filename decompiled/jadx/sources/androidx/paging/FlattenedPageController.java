package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PageEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bJ#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e0\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/paging/FlattenedPageController;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "list", "Landroidx/paging/FlattenedPageEventStorage;", JoinPoint.SYNCHRONIZATION_LOCK, "Lkotlinx/coroutines/sync/Mutex;", "maxEventIndex", "", "getCachedEvent", "Landroidx/paging/PageEvent$Insert;", "getStateAsEvents", "", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "record", "", "event", "(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n107#2,10:283\n107#2,8:293\n116#2:306\n115#2:307\n1559#3:301\n1590#3,4:302\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageController\n*L\n128#1:283,10\n138#1:293,8\n138#1:306\n138#1:307\n142#1:301\n142#1:302,4\n*E\n"})
/* loaded from: classes14.dex */
final class FlattenedPageController<T> {

    @NotNull
    private final FlattenedPageEventStorage<T> list = new FlattenedPageEventStorage<>();

    @NotNull
    private final Mutex lock = MutexKt.Mutex$default(false, 1, null);
    private int maxEventIndex = -1;

    @Nullable
    public final PageEvent.Insert<T> getCachedEvent() {
        PageEvent pageEvent = (PageEvent) CollectionsKt.firstOrNull((List) this.list.getAsEvents());
        if (pageEvent != null && (pageEvent instanceof PageEvent.Insert)) {
            PageEvent.Insert<T> insert = (PageEvent.Insert) pageEvent;
            if (insert.getLoadType() == LoadType.REFRESH) {
                return insert;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x004d, B:12:0x006d, B:14:0x0073, B:16:0x007b, B:17:0x0081), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getStateAsEvents(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<? extends kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.paging.FlattenedPageController$getStateAsEvents$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = (androidx.paging.FlattenedPageController$getStateAsEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$getStateAsEvents$1 r0 = new androidx.paging.FlattenedPageController$getStateAsEvents$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.sync.Mutex r7 = (kotlinx.coroutines.sync.Mutex) r7
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            r7 = r0
            goto L4d
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r7)
            r7 = 0
            return r7
        L3b:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.lock
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            androidx.paging.FlattenedPageEventStorage<T> r0 = r7.list     // Catch: java.lang.Throwable -> L7f
            java.util.List r0 = r0.getAsEvents()     // Catch: java.lang.Throwable -> L7f
            int r7 = r7.maxEventIndex     // Catch: java.lang.Throwable -> L7f
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L7f
            int r7 = r7 - r1
            int r7 = r7 + r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7f
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7f
            r2 = 0
        L6d:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L7f
            int r5 = r2 + 1
            if (r2 >= 0) goto L81
            kotlin.collections.CollectionsKt.throwIndexOverflow()     // Catch: java.lang.Throwable -> L7f
            goto L81
        L7f:
            r7 = move-exception
            goto L92
        L81:
            androidx.paging.PageEvent r3 = (androidx.paging.PageEvent) r3     // Catch: java.lang.Throwable -> L7f
            kotlin.collections.IndexedValue r6 = new kotlin.collections.IndexedValue     // Catch: java.lang.Throwable -> L7f
            int r2 = r2 + r7
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7f
            r1.add(r6)     // Catch: java.lang.Throwable -> L7f
            r2 = r5
            goto L6d
        L8e:
            r8.unlock(r4)
            return r1
        L92:
            r8.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.getStateAsEvents(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object record(@org.jetbrains.annotations.NotNull kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.FlattenedPageController$record$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.FlattenedPageController$record$1 r0 = (androidx.paging.FlattenedPageController$record$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.FlattenedPageController$record$1 r0 = new androidx.paging.FlattenedPageController$record$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r6 = r0.L$1
            kotlin.collections.IndexedValue r6 = (kotlin.collections.IndexedValue) r6
            java.lang.Object r0 = r0.L$0
            androidx.paging.FlattenedPageController r0 = (androidx.paging.FlattenedPageController) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r5
            r5 = r0
            goto L52
        L38:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            return r4
        L3e:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.sync.Mutex r7 = r5.lock
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            int r0 = r6.getIndex()     // Catch: java.lang.Throwable -> L6b
            r5.maxEventIndex = r0     // Catch: java.lang.Throwable -> L6b
            androidx.paging.FlattenedPageEventStorage<T> r5 = r5.list     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L6b
            androidx.paging.PageEvent r6 = (androidx.paging.PageEvent) r6     // Catch: java.lang.Throwable -> L6b
            r5.add(r6)     // Catch: java.lang.Throwable -> L6b
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6b
            r7.unlock(r4)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L6b:
            r5 = move-exception
            r7.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlattenedPageController.record(kotlin.collections.IndexedValue, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
