package org.apache.logging.log4j.spi;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ObjectThreadContextMap extends CleanableThreadContextMap {
    <V> V getValue(String str);

    <V> void putAllValues(Map<String, V> map);

    <V> void putValue(String str, V v);
}
