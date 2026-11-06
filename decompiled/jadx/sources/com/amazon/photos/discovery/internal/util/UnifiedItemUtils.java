package com.amazon.photos.discovery.internal.util;

import com.amazon.photos.discovery.model.UnifiedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\b"}, d2 = {"Lcom/amazon/photos/discovery/internal/util/UnifiedItemUtils;", "", "()V", "getUnifiedIds", "", "", "unifiedItems", "Lcom/amazon/photos/discovery/model/UnifiedItem;", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUnifiedItemUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifiedItemUtils.kt\ncom/amazon/photos/discovery/internal/util/UnifiedItemUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,11:1\n1549#2:12\n1620#2,3:13\n*S KotlinDebug\n*F\n+ 1 UnifiedItemUtils.kt\ncom/amazon/photos/discovery/internal/util/UnifiedItemUtils\n*L\n8#1:12\n8#1:13,3\n*E\n"})
/* loaded from: classes5.dex */
public final class UnifiedItemUtils {

    @NotNull
    public static final UnifiedItemUtils INSTANCE = new UnifiedItemUtils();

    private UnifiedItemUtils() {
    }

    @NotNull
    public final List<Long> getUnifiedIds(@NotNull List<UnifiedItem> unifiedItems) {
        unifiedItems.getClass();
        List<UnifiedItem> list = unifiedItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((UnifiedItem) it2.next()).getId()));
        }
        return arrayList;
    }
}
