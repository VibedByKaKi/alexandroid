package com.amazon.comms.calling.foundation.storage.providers;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0001H&J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\n\u001a\u00020\u0007H&J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0002\b\u0003\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/foundation/storage/providers/StorageProvider;", "", MetricsConstants.Method.CACHE_GET, "key", "", "defaultValue", MetricsConstants.Method.CACHE_PUT, "", "value", BulkOperationType.remove, MetricsConstants.Method.CACHE_CLEAR, "contains", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getAll", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface StorageProvider {
    void clear();

    @Nullable
    Boolean contains(@Nullable String key);

    @Nullable
    Object get(@Nullable String key, @Nullable Object defaultValue);

    @Nullable
    Map<String, ?> getAll();

    void put(@Nullable String key, @NotNull Object value);

    void remove(@Nullable String key);
}
