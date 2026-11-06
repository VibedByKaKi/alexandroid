package com.amazon.coral.metrics;

import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.mapbox.common.HttpHeaders;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public final class PeriodicMetricsRegistrar {
    private PeriodicMetricsRegistrar() {
    }

    public static void register(Consumer<Metrics> consumer) {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodType methodType = MethodType.methodType((Class<?>) Void.TYPE, (Class<?>) Metrics.class);
            Class<?> cls = Class.forName("com.amazon.coral.monitoring.PeriodicMetrics");
            cls.getMethod(MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, cls).invoke(null, (Object) LambdaMetafactory.metafactory(lookup, "emit", MethodType.methodType(cls, (Class<?>) Consumer.class), methodType, lookup.unreflect(Consumer.class.getDeclaredMethod(HttpHeaders.ACCEPT, Object.class)), methodType).getTarget().invoke(consumer));
        } catch (Throwable unused) {
        }
    }
}
