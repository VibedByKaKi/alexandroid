package com.amazon.comms.calling.foundation.storage;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.comms.calling.foundation.storage.providers.StorageProvider;
import com.dee.app.metrics.MetricsConstants;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/foundation/storage/StorageManager;", "Lcom/amazon/comms/calling/foundation/storage/providers/StorageProvider;", "storageProvider", "<init>", "(Lcom/amazon/comms/calling/foundation/storage/providers/StorageProvider;)V", MetricsConstants.Method.CACHE_GET, "", "key", "", "defaultValue", MetricsConstants.Method.CACHE_PUT, "", "value", BulkOperationType.remove, MetricsConstants.Method.CACHE_CLEAR, "contains", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getAll", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class StorageManager implements StorageProvider {

    @NotNull
    private final StorageProvider storageProvider;

    @Inject
    public StorageManager(@NotNull StorageProvider storageProvider) {
        storageProvider.getClass();
        this.storageProvider = storageProvider;
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    public void clear() {
        this.storageProvider.clear();
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    @Nullable
    public Boolean contains(@Nullable String key) {
        return this.storageProvider.contains(key);
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    @Nullable
    public Object get(@Nullable String key, @Nullable Object defaultValue) {
        return this.storageProvider.get(key, defaultValue);
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    @Nullable
    public Map<String, ?> getAll() {
        return this.storageProvider.getAll();
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    public void put(@Nullable String key, @NotNull Object value) {
        value.getClass();
        this.storageProvider.put(key, value);
    }

    @Override // com.amazon.comms.calling.foundation.storage.providers.StorageProvider
    public void remove(@Nullable String key) {
        this.storageProvider.remove(key);
    }
}
