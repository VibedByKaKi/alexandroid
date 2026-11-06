package org.apache.logging.log4j.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface StringMap extends ReadOnlyStringMap {
    void clear();

    boolean equals(Object obj);

    void freeze();

    int hashCode();

    boolean isFrozen();

    void putAll(ReadOnlyStringMap readOnlyStringMap);

    void putValue(String str, Object obj);

    void remove(String str);
}
