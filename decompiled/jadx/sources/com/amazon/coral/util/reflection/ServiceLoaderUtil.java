package com.amazon.coral.util.reflection;

import com.amazon.coral.google.common.collect.ImmutableList;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ServiceLoaderUtil {
    private ServiceLoaderUtil() {
    }

    public static <T> Iterable<T> load(Class<T> cls, ClassLoader classLoader) {
        return ImmutableList.builder().addAll((Iterable) ServiceLoader.load(cls, classLoader)).build();
    }
}
