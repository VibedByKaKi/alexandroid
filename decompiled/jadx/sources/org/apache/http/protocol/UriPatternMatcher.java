package org.apache.http.protocol;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes11.dex */
public class UriPatternMatcher<T> {
    private final Map<String, T> map = new LinkedHashMap();

    public synchronized Set<Map.Entry<String, T>> entrySet() {
        return new HashSet(this.map.entrySet());
    }

    @Deprecated
    public synchronized Map<String, T> getObjects() {
        return this.map;
    }

    public synchronized T lookup(String str) {
        T t;
        try {
            Args.notNull(str, "Request path");
            t = this.map.get(str);
            if (t == null) {
                String str2 = null;
                for (String str3 : this.map.keySet()) {
                    if (matchUriRequestPattern(str3, str)) {
                        if (str2 != null) {
                            if (str2.length() >= str3.length()) {
                                if (str2.length() == str3.length() && str3.endsWith("*")) {
                                }
                            }
                        }
                        t = this.map.get(str3);
                        str2 = str3;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return t;
    }

    public boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals("*")) {
            return true;
        }
        return (str.endsWith("*") && str2.startsWith(str.substring(0, str.length() - 1))) || (str.startsWith("*") && str2.endsWith(str.substring(1, str.length())));
    }

    public synchronized void register(String str, T t) {
        Args.notNull(str, "URI request pattern");
        this.map.put(str, t);
    }

    @Deprecated
    public synchronized void setHandlers(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.map.clear();
        this.map.putAll(map);
    }

    @Deprecated
    public synchronized void setObjects(Map<String, T> map) {
        Args.notNull(map, "Map of handlers");
        this.map.clear();
        this.map.putAll(map);
    }

    public String toString() {
        return this.map.toString();
    }

    public synchronized void unregister(String str) {
        if (str == null) {
            return;
        }
        this.map.remove(str);
    }
}
