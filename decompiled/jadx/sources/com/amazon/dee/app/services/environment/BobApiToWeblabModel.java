package com.amazon.dee.app.services.environment;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003R*\u0010\u0007\u001a\u001e\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00040\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/dee/app/services/environment/BobApiToWeblabModel;", "", "mappings", "", "", "<init>", "(Ljava/util/Map;)V", "backingMap", "Ljava/util/concurrent/ConcurrentHashMap;", "kotlin.jvm.PlatformType", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BobApiToWeblabModel {

    @NotNull
    private final ConcurrentHashMap<String, String> backingMap;

    public BobApiToWeblabModel(@NotNull Map<String, String> map) {
        map.getClass();
        this.backingMap = new ConcurrentHashMap<>(map);
    }

    @NotNull
    public final Map<String, String> mappings() {
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(this.backingMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BobApiToWeblabModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BobApiToWeblabModel(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
