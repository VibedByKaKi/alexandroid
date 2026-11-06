package com.mapbox.common.module;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/module/NetworkIdGenerator;", "", "()V", "counter", "Ljava/util/concurrent/atomic/AtomicLong;", "newId", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class NetworkIdGenerator {

    @NotNull
    public static final NetworkIdGenerator INSTANCE = new NetworkIdGenerator();

    @NotNull
    private static final AtomicLong counter = new AtomicLong(0);

    private NetworkIdGenerator() {
    }

    public final long newId() {
        return counter.incrementAndGet();
    }
}
