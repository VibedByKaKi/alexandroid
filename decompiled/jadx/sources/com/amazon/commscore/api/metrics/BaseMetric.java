package com.amazon.commscore.api.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.commscore.api.metrics.BaseMetric;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class BaseMetric<T extends BaseMetric<?>> {
    private final String component;
    private Map<String, Object> customEntries;
    private final String name;
    private final String ownerIdentifier;
    private final String subComponent;

    public BaseMetric(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4) {
        this.name = str;
        this.component = str2;
        this.subComponent = str3;
        this.customEntries = new HashMap();
        this.ownerIdentifier = str4;
    }

    public String getComponent() {
        return this.component;
    }

    public Map<String, Object> getCustomEntries() {
        return this.customEntries;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerIdentifier() {
        return this.ownerIdentifier;
    }

    public String getSubComponent() {
        return this.subComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T setCustomEntries(@Nullable Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        this.customEntries = map;
        return this;
    }

    public BaseMetric(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, "ec2b8c3f-5736-4878-bf6f-70ee753a92b2");
    }
}
