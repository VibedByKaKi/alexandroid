package com.amazon.dee.app.services.datastore;

import com.dee.app.metrics.MetricsConstants;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/datastore/DataStoreService;", "", "retrieveValue", "", "key", "storeValue", "", "value", MetricsConstants.Method.CACHE_CLEAR, CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DataStoreService {
    void clear();

    @Nullable
    String retrieveValue(@NotNull String key);

    void storeValue(@NotNull String key, @NotNull String value);
}
