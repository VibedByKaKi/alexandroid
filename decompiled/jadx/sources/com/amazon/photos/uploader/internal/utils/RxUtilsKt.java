package com.amazon.photos.uploader.internal.utils;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0004\u001a&\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006\u001a.\u0010\b\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\t\u001a\u00020\u0003\u001a$\u0010\b\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\t\u001a\u00020\u0003\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0004¨\u0006\u000b"}, d2 = {"disposeAndClearAll", "", "Ljava/util/HashMap;", "", "Lio/reactivex/rxjava3/disposables/Disposable;", "Lkotlin/collections/HashMap;", "", "", "disposeAndRemoveById", "requestId", "disposeQuietly", "AndroidPhotosUploader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRxUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxUtils.kt\ncom/amazon/photos/uploader/internal/utils/RxUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1#2:28\n1549#3:29\n1620#3,3:30\n1549#3:33\n1620#3,3:34\n1549#3:37\n1620#3,3:38\n*S KotlinDebug\n*F\n+ 1 RxUtils.kt\ncom/amazon/photos/uploader/internal/utils/RxUtilsKt\n*L\n15#1:29\n15#1:30,3\n20#1:33\n20#1:34,3\n25#1:37\n25#1:38,3\n*E\n"})
/* loaded from: classes5.dex */
public final class RxUtilsKt {
    public static final void disposeAndClearAll(@NotNull Map<Long, List<Disposable>> map) {
        map.getClass();
        Collection<List<Disposable>> values = map.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator<T> it2 = values.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                disposeQuietly((Disposable) it3.next());
                arrayList2.add(Unit.INSTANCE);
            }
            arrayList.add(arrayList2);
        }
        map.clear();
    }

    public static final void disposeAndRemoveById(@NotNull Map<Long, List<Disposable>> map, long j) {
        map.getClass();
        List<Disposable> list = map.get(Long.valueOf(j));
        if (list != null) {
            List<Disposable> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                disposeQuietly((Disposable) it2.next());
                arrayList.add(Unit.INSTANCE);
            }
            map.remove(Long.valueOf(j));
        }
    }

    public static final void disposeQuietly(@NotNull Disposable disposable) {
        disposable.getClass();
        if (disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    public static final void disposeAndRemoveById(@NotNull HashMap<Long, Disposable> hashMap, long j) {
        hashMap.getClass();
        Disposable disposable = hashMap.get(Long.valueOf(j));
        if (disposable != null) {
            disposeQuietly(disposable);
            Unit unit = Unit.INSTANCE;
            hashMap.remove(Long.valueOf(j));
        }
    }

    public static final void disposeAndClearAll(@NotNull HashMap<Long, Disposable> hashMap) {
        hashMap.getClass();
        Collection<Disposable> values = hashMap.values();
        values.getClass();
        Collection<Disposable> collection = values;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (Disposable disposable : collection) {
            disposable.getClass();
            disposeQuietly(disposable);
            arrayList.add(Unit.INSTANCE);
        }
        hashMap.clear();
    }
}
