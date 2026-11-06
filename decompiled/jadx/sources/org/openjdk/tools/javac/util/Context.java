package org.openjdk.tools.javac.util;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Context {
    protected final Map<Key<?>, Object> ht = new HashMap();
    private final Map<Key<?>, Factory<?>> ft = new HashMap();
    private final Map<Class<?>, Key<?>> kt = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory<T> {
        T make(Context context);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Key<T> {
    }

    private static void checkState(Map<?, ?> map) {
        if (map != null) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    public void dump() {
        Iterator<Object> it2 = this.ht.values().iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            System.err.println(next == null ? null : next.getClass());
        }
    }

    public <T> T get(Key<T> key) {
        checkState(this.ht);
        Object obj = this.ht.get(key);
        if (obj instanceof Factory) {
            obj = ((Factory) obj).make(this);
            if (obj instanceof Factory) {
                Buffer$$ExternalSyntheticBUOutline0.m((Object) "T extends Context.Factory");
                return null;
            }
            Assert.check(this.ht.get(key) == obj);
        }
        return (T) uncheckedCast(obj);
    }

    public <T> Key<T> key(Class<T> cls) {
        checkState(this.kt);
        Key<T> key = (Key) uncheckedCast(this.kt.get(cls));
        if (key != null) {
            return key;
        }
        Key<T> key2 = new Key<>();
        this.kt.put(cls, key2);
        return key2;
    }

    public <T> void put(Key<T> key, T t) {
        if (t instanceof Factory) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "T extends Context.Factory");
            return;
        }
        checkState(this.ht);
        Object put = this.ht.put(key, t);
        if (put == null || (put instanceof Factory) || put == t || t == null) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m((Object) "duplicate context value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T uncheckedCast(Object obj) {
        return obj;
    }

    public <T> void put(Key<T> key, Factory<T> factory) {
        checkState(this.ht);
        if (this.ht.put(key, factory) == null) {
            checkState(this.ft);
            this.ft.put(key, factory);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) "duplicate context value");
        }
    }

    public <T> void put(Class<T> cls, T t) {
        put((Key<Key<T>>) key(cls), (Key<T>) t);
    }

    public <T> void put(Class<T> cls, Factory<T> factory) {
        put((Key) key(cls), (Factory) factory);
    }

    public <T> T get(Class<T> cls) {
        return (T) get(key(cls));
    }
}
