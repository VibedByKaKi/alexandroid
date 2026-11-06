package com.amazon.photos.discovery.internal.dedupe.filter;

import com.amazon.photos.discovery.model.UnifiedItem;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\b"}, d2 = {"Lcom/amazon/photos/discovery/internal/dedupe/filter/DedupeFilter;", "", "filter", "", "Lcom/amazon/photos/discovery/model/UnifiedItem;", "metricsTag", "", "items", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DedupeFilter {
    @NotNull
    Collection<UnifiedItem> filter(@NotNull String metricsTag, @NotNull Collection<UnifiedItem> items);
}
