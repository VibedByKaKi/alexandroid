package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.JsonDeserializer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"asSingletonDeserializer", "Lcom/fasterxml/jackson/module/kotlin/KotlinObjectSingletonDeserializer;", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "singleton", "", "jackson-module-kotlin"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KotlinObjectSingletonDeserializerKt {
    @NotNull
    public static final KotlinObjectSingletonDeserializer asSingletonDeserializer(@NotNull JsonDeserializer<?> jsonDeserializer, @NotNull Object obj) {
        jsonDeserializer.getClass();
        obj.getClass();
        return new KotlinObjectSingletonDeserializer(obj, jsonDeserializer);
    }
}
