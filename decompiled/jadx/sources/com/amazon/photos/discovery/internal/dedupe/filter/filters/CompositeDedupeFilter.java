package com.amazon.photos.discovery.internal.dedupe.filter.filters;

import com.amazon.photos.discovery.internal.dedupe.filter.DedupeFilter;
import com.amazon.photos.discovery.model.UnifiedItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/photos/discovery/internal/dedupe/filter/filters/CompositeDedupeFilter;", "Lcom/amazon/photos/discovery/internal/dedupe/filter/DedupeFilter;", "filters", "", "(Ljava/util/List;)V", "filter", "", "Lcom/amazon/photos/discovery/model/UnifiedItem;", "metricsTag", "", "items", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCompositeDedupeFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeDedupeFilter.kt\ncom/amazon/photos/discovery/internal/dedupe/filter/filters/CompositeDedupeFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1855#2,2:26\n*S KotlinDebug\n*F\n+ 1 CompositeDedupeFilter.kt\ncom/amazon/photos/discovery/internal/dedupe/filter/filters/CompositeDedupeFilter\n*L\n16#1:26,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CompositeDedupeFilter implements DedupeFilter {

    @NotNull
    private final List<DedupeFilter> filters;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeDedupeFilter(@NotNull List<? extends DedupeFilter> list) {
        list.getClass();
        this.filters = list;
    }

    @Override // com.amazon.photos.discovery.internal.dedupe.filter.DedupeFilter
    @NotNull
    public Collection<UnifiedItem> filter(@NotNull String metricsTag, @NotNull Collection<UnifiedItem> items) {
        metricsTag.getClass();
        items.getClass();
        Iterator<T> it2 = this.filters.iterator();
        while (it2.hasNext()) {
            items = ((DedupeFilter) it2.next()).filter(metricsTag, items);
            if (items.isEmpty()) {
                break;
            }
        }
        return items;
    }
}
