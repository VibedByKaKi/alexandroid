package org.apache.commons.lang3.builder;

import java.lang.reflect.Field;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class Reflection {
    public static Object getUnchecked(Field field, Object obj) {
        try {
            Objects.requireNonNull(field, "field");
            return field.get(obj);
        } catch (IllegalAccessException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }
}
