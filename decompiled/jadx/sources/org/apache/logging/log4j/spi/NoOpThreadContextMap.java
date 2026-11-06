package org.apache.logging.log4j.spi;

import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.NullMarked;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NullMarked
/* loaded from: classes11.dex */
public class NoOpThreadContextMap implements ThreadContextMap {
    public static final ThreadContextMap INSTANCE = new NoOpThreadContextMap();

    @Override // org.apache.logging.log4j.spi.ThreadContextMap, org.apache.logging.log4j.util.ReadOnlyStringMap
    public boolean containsKey(String str) {
        return false;
    }

    @Override // org.apache.logging.log4j.spi.ThreadContextMap
    public String get(String str) {
        return null;
    }

    @Override // org.apache.logging.log4j.spi.ThreadContextMap
    public Map<String, String> getCopy() {
        return new HashMap();
    }

    @Override // org.apache.logging.log4j.spi.ThreadContextMap
    public Map<String, String> getImmutableMapOrNull() {
        return null;
    }

    @Override // org.apache.logging.log4j.spi.ThreadContextMap, org.apache.logging.log4j.util.ReadOnlyStringMap
    public boolean isEmpty() {
        return true;
    }

    @Override // org.apache.logging.log4j.spi.ThreadContextMap
    public void clear() {
    }

    @Override // org.apache.logging.log4j.spi.ThreadContextMap
    public void remove(String str) {
    }

    @Override // org.apache.logging.log4j.spi.ThreadContextMap
    public void put(String str, String str2) {
    }
}
