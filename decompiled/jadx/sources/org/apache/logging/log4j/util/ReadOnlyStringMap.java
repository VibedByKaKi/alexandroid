package org.apache.logging.log4j.util;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ReadOnlyStringMap extends Serializable {
    boolean containsKey(String str);

    <V> void forEach(BiConsumer<String, ? super V> biConsumer);

    <V, S> void forEach(TriConsumer<String, ? super V, S> triConsumer, S s);

    <V> V getValue(String str);

    boolean isEmpty();

    int size();

    Map<String, String> toMap();
}
