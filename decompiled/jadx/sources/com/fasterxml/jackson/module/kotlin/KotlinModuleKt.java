package com.fasterxml.jackson.module.kotlin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002¨\u0006\u0003"}, d2 = {"isKotlinClass", "", "Ljava/lang/Class;", "jackson-module-kotlin"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KotlinModuleKt {
    public static final boolean isKotlinClass(@NotNull Class<?> cls) {
        cls.getClass();
        return cls.isAnnotationPresent(Metadata.class);
    }
}
