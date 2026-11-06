package com.google.gson;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface FieldNamingStrategy {
    default List<String> alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    String translateName(Field field);
}
